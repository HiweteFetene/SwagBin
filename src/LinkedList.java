
public class LinkedList<T> {

	LinkedListNode<T> head;

	/**
	 * Get data stored in head node of list.
	 */
	public T getFirst(){

		return head.getData();
	}

	/**
	 * Get the head node of the list.
	 */
	public LinkedListNode<T> getFirstNode(){
		return head;
	}

	/**
	 * Get data stored in last node of list.
	 */
	public T getLast(){

		return getLastNode().getData();

	}

	/**
	 * Get the tail node of the list.
	 */
	public LinkedListNode<T> getLastNode(){


		LinkedListNode<T> tempNode = head;

		if(head==null){
			return null;
		}

		while(tempNode.getNext()!= null){

			tempNode = tempNode.getNext();

		}

		return tempNode;    

	}

	/**
	 * Insert a new node with data at the head of the list.
	 */
	public void insertFirst( T data ){

		LinkedListNode<T> newNode = new LinkedListNode<T>();
		newNode.setData(data);
		newNode.setNext(head);
		head=newNode;


	}

	/**
	 * Insert a new node with data after currentNode
	 */
	public void insertAfter( LinkedListNode<T> currentNode, T data ){

		LinkedListNode<T> newNode = new LinkedListNode<T>();
		newNode.setData(data);
		newNode.setNext(currentNode.getNext());
		currentNode.setNext(newNode);

	}

	/**
	 * Insert a new node with data at the end of the list.
	 */
	public void insertLast( T data ){

		LinkedListNode<T> newNode = new LinkedListNode<T>();
		newNode.setData(data);

		if(head==null){
			head =newNode;
		}

		else{
			getLastNode().setNext(newNode);
		}
	}

	/**
	 * Remove the first node
	 */
	public void deleteFirst(){

		head = head.getNext();

	}

	/**
	 * Remove the last node
	 */
	public void deleteLast(){

		LinkedListNode<T> tempNode = head;

		if(tempNode != null){

			if(tempNode.getNext()==null){
				tempNode.setData(null);
			}

			else{

				while(tempNode.getNext().getNext() != null){
					tempNode = tempNode.getNext();
				}

				tempNode.setNext(null);
			}
		}


	}

	/**
	 * Remove node following currentNode
	 * If no node exists (i.e., currentNode is the tail), do nothing
	 */
	public void deleteNext( LinkedListNode<T> currentNode ){

		if(currentNode.getNext().getNext() != null){
			currentNode.setNext(currentNode.getNext().getNext());

		}
		else{
			deleteLast();
		}

	}
	
	

	/**
	 * Return the number of nodes in this list.
	 */
	public int size(){

		int numNodes =0;

		LinkedListNode<T> tempNode = head;

		while(tempNode!= null){

			tempNode = tempNode.getNext();
			numNodes++;

		}

		return numNodes;


	}

	/**
	 * Check if list is empty.
	 * @return true if list contains no items.
	 */
	public boolean isEmpty(){

		if(head != null){
			return false;
		}

		return true;

	}

	/**
	 * Return a String representation of the list.
	 */
	public String toString(){

		LinkedListNode<T> tempNode = new LinkedListNode<T>();
		tempNode = head;

		String output = "";

		if(tempNode == null){
			output += "";
		}

		while(tempNode != null){

			output += tempNode.getData().toString();

			if(tempNode.getNext() != null){
				output += " -> ";
			}

			tempNode = tempNode.getNext();
		}

		return output;

	}

}
