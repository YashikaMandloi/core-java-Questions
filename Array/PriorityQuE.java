package QueueInterfaceDemo;

	import java.util.PriorityQueue;

	public class PriorityQuE {

		public static void main(String[] args) {
			PriorityQueue<String> q = new PriorityQueue<>();
			q.add("C");
			q.add("C++");
			q.add("Java");
			q.add("Python");
			q.add("PHP");
			
			System.out.println(q);
			
			q.offer("SQL");
			System.out.println(q);
			q.remove();
			System.out.println(q);
			q.remove();
			System.out.println(q);
			System.out.println("the front element is : "+q.element());
	System.out.println("the front element is : "+q.peek());
			q.clear();
			System.out.println(q);
			//System.out.println("the front element is : "+q.element());
			System.out.println("the front element is : "+q.peek());
			//q.remove();
			System.out.println(q.poll());
		}
	}
	

