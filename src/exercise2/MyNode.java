package exercise2;

public class MyNode<E>
{
	private E element;
	private MyNode<E> next;
	private MyNode<E> prev;
	
	public E getElement() {
		return element;
	}
	public void setElement(E item) {
		element = item;
	}
	
	public void setNext(MyNode<E> obj) {
		next = obj;
	}
	
	public MyNode<E> getNext(){
		return next;
	}
	
	public void setPrev(MyNode<E> obj) {
		prev = obj;
	}
	
	public MyNode<E> getPrev(){
		return prev;
	}

}
