package QueueImplementation_CircularArray;
/*
 * FIFO principle
 * 
 * queue with array circular fashion is implemneted using the modulo operator(%)
 * when we dequeue an element and want to advance the front index, we use the arithmetic 
 * f = (f+1)% N
 */

public class QueueImplementation<T> implements Queue<T>{
	private int f = 0;
	private int size = 0;
	private final static int CAPACITY = 1000;
	T []data;
	/*
	 * @constructs queue with default value CAPACITY.
	 */
	public QueueImplementation(){
	this(CAPACITY);
	}
	/*
	 * @constructs queue with user defined value
	 */
	
	public QueueImplementation(int val){
		data = (T[]) new Object[val];		//safe cating, compiler might give a warnning
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	//returns first element in a queue
	@Override
	public T first() {
		if(isEmpty())
			return null;
		return data[f];
	}

	//adds element to queue
	@Override
	public void enqueue(T val) throws IllegalStateException {
		if(size == data.length) throw new IllegalStateException("QUEUE IS FULL");
		int indexof = (f + size)% data.length;
		data[indexof] = val;
		size++;
	}

	/*
	 *removes and returns first element in the queue
	 *when an element is removed from the queue, is position is left empty thus we set to reference to null
	 *for gabge collection.
	 *the next element is the advanced as the first element in the queue 
	 */
	@Override
	public T dequeue() {
		if(isEmpty())
			return null;
		T val = data[f];
		data[f] = null;		//dereference for garbageCollection
		f = (f+1)%data.length;	//add 1 to current first index modulus array length to reference the next element as first
		size --;
		return val;
	}

}
