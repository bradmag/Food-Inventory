public abstract class Food implements IsEddible, Comparable<Food> {
	private int daysTillEXP; //Days until the food expires
	
	/** returns number of days until the food expires */
	public int getEXP(){ 
		return this.daysTillEXP;
	}
	
	/** Set number of days until food expires */
	public void setEXP(int exp) {
		this.daysTillEXP = exp;
	}
	
	@Override /**returns Positive 1  if expires sooner, return -1 if expires after*/
	public int compareTo(Food o) {
		if(getEXP() < o.getEXP())
			return 1;
		else if (getEXP() > o.getEXP())
			return -1;
		else
			return 0;	
	}
}
