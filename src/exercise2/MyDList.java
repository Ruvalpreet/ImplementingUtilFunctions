package exercise2;

public class MyDList<E>
{

	private MyNode<E> head;
	private MyNode<E> tail;
	private int size;
	
	public MyDList() {
		
	}
	
	public void addFirst(E item) {
		
		if(head == null) {
			head = new MyNode<E>();
			head.setElement(item);
			
		}
		else {
			MyNode<E> origin = head;
			
			head =  new MyNode<E>();
			
			head.setNext(origin);
			head.setElement(item);
			head.getNext().setPrev(head);
			System.out.println(head.getNext().getPrev().getElement());
		}
		size++;
//		System.out.println(head.getElement());
	}
	
	public void addLast(E item) {
		if(tail == null) {
			tail = new MyNode<E>();
			tail.setElement(item);
			MyNode<E> test = head;
			while(test.getNext() != null) {
				test = test.getNext();
			}
			test.setNext(tail);
		}
		else {
			MyNode<E> newNode = new MyNode<E>();
			newNode.setPrev(tail);
			newNode.setElement(item);
			tail.setNext(newNode);
			tail = newNode;
		}
		size++;
	}
	
	public E removeFirst() {
		MyNode<E> bruh = head;
		head = head.getNext();
		head.setPrev(null);
		size--;
		return bruh.getElement();
	}
	
	public E removeLast() {
		MyNode<E> bruh = tail;
		tail = tail.getPrev();
		tail.setNext(null);
		size--;
		return bruh.getElement();
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if (tail == null && head == null) {
			return true;
		}
		return false;
	}
	
	public MyNode<E> getHead(){
		return head;
	}
	public MyNode<E> getTail(){
		return tail;
	}
}
