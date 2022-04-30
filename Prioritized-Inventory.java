/** Design a priority queue that prioritizes food that is about to go bad */

/** This queue will be the Inventory list that keeps track of perishable food */
public class PriorityQueue<Food> {
	private Heap<Food> fifoHeap;
	
	/**Default Constructor */
	public PriorityQueue() {
		fifoHeap = new Heap<Food>();
	}
	
	/** Constructor that accepts a Comparator as a parameter */
	public PriorityQueue(java.util.Comparator<Food> c) {
		fifoHeap = new Heap<Food>(c);
	}
	
	/** Add a new object to the queue */
	public void enqueue(Food newObject) {
		fifoHeap.add(newObject);
	}
	
	/** Return and Remove Highest priority item */
	public Food dequeue() {
		return fifoHeap.remove();
	}
	
	/** Returns number of elements in the queue */
	public int getSize() {
		return fifoHeap.getSize();
	}
	
	
	//TODO implement next3 and next5 to print the next few items in the queue
	
	
	@Override
	public String toString() {
		//TODO fix this
		return fifoHeap.toString();
	}
}
