package App;

import QueueImplementation_CircularArray.QueueImplementation;

public class Application {

	public static void main(String[] args) {
		QueueImplementation<Integer> queue = new QueueImplementation<Integer>(4);
		Integer a=1,b=2,c=3,d=4,e=5;
		
		System.out.println("current size : "+queue.size());
		System.out.println("check  : "+queue.isEmpty());
		queue.enqueue(a);
		System.out.println("current size : "+queue.size());
		System.out.println("check  : "+queue.isEmpty());
		queue.enqueue(b);
		queue.enqueue(c);
		queue.enqueue(d);
		
		System.out.println("first element  : "+queue.first());
		System.out.println("current size : "+queue.size());
		System.out.println("check  : "+queue.isEmpty());
		
		System.out.println("removed element  : "+ queue.dequeue());
		queue.enqueue(e);
		System.out.println("first element  : "+queue.first());
		System.out.println("current size : "+queue.size());
		
	}
}
