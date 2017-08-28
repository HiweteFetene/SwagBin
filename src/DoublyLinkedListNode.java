
public class DoublyLinkedListNode<T> extends LinkedListNode<T>{
	
	private LinkedListNode<T> prev;
	
	/**
	 * Set the previous pointer to passed node.
	 */
	public void setPrev( LinkedListNode<T> node ){
		prev=node;
	}
	
	/**
	 * Get (pointer to) previous node.
	 */
	public LinkedListNode<T> getPrev(){
		return prev;
	}


}




