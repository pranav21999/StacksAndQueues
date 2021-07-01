package ds;

public class MainQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue=new Queue();
		queue.enque(15);
		queue.enque(16);
		queue.enque(17);
		queue.print();
		queue.dequeue();
		queue.print();
	}
}
