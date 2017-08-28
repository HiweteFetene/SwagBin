/**
 * This class is the framework of a doublylinkedlist
 * @author Miral
 *
 * @param <T>
 */
public class DoublyLinkedList<T> extends LinkedList<T> {
	
	/**This variable holds the tail node of the list**/
	LinkedListNode<T> tail;
	
	/**
	 * Insert a new node with data at the head of the list.
	 */
	public void insertFirst( T data ){
		
		DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<T>();
		newNode.setData(data);
		
		if(head == null){
		head=newNode;
		}
		
		else{
			
		((DoublyLinkedListNode<T>) head).setPrev(newNode);
		newNode.setNext(head);
		head=newNode;	
		}
		
		if(tail==null){
			 tail = newNode;
		 }

		
	}
	
	/**
	 * Insert a new node with data at the end of the list.
	 */
	public void insertLast( T data){
		
		DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<T>();
		
		newNode.setData(data);

		if(head==null){
			head =newNode;
			tail = newNode;
		}

		else{
			newNode.setPrev(tail);
			newNode.setNext(null);
			tail.setNext(newNode);
			tail = newNode;
		}
			
		
	}
	
	/**
	 * Insert a new node with data after currentNode
	 */
	public void insertAfter( LinkedListNode<T> currentNode, T data ){

		DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<T>();
		newNode.setData(data);
		newNode.setPrev(currentNode);
		
		if(currentNode != getLastNode()){
		newNode.setNext(currentNode.getNext());
		}
		else{
			newNode.setNext(null);
			tail = newNode;
		}
		currentNode.setNext(newNode);

	}
	
	/**
	 * Remove the last node
	 */
	public void deleteLast(){

		DoublyLinkedListNode<T> tempNode = (DoublyLinkedListNode<T>) head;

		if(tempNode != null){

			if(tempNode.getNext()==null){
				tempNode.setData(null);
				head=null;
				tail=null;
			}

			else{

				while(tempNode.getNext().getNext() != null){
					tempNode = (DoublyLinkedListNode<T>) tempNode.getNext();
				}

				tempNode.setNext(null);
				tail= tempNode;
			}
		}

	}
	
	
	/**
	 * Return a backward traversal string representation of the list.
	 */
	public String backwardString(){

		DoublyLinkedListNode<T> tempNode = new DoublyLinkedListNode<T>();
		tempNode = (DoublyLinkedListNode<T>) tail;

		String output = "";

		if(tempNode == null){
			output += "";
		}

		while(tempNode != null){

			output += tempNode.getData().toString();

			if(tempNode.getPrev() != null){
				output += " -> ";
			}

			tempNode = (DoublyLinkedListNode<T>) tempNode.getPrev();
		}

		return output;

	}
	
	
	
	/**
	 * Remove node following currentNode
	 * If no node exists (i.e., currentNode is the tail), do nothing
	 */
	public void deleteNext( DoublyLinkedListNode<T> currentNode ){

		if(currentNode.getNext().getNext() != null){
			currentNode.setNext(currentNode.getNext().getNext());
			((DoublyLinkedListNode<T>) currentNode.getNext().getNext()).setPrev(currentNode);
		}
		
		else{
			deleteLast();
		}

	}
	
	/**
	 * Remove the node passed into the parameter
	 * @param currentNode
	 */
	public void delete( DoublyLinkedListNode<T> currentNode ){
		
		if(currentNode == head){
			deleteFirst();
		}

		if(currentNode.getNext() != null){
			
			((DoublyLinkedListNode<T>) currentNode.getNext()).setPrev(currentNode.getPrev());
					
		}
		
		if(currentNode.getPrev() != null){
			currentNode.getPrev().setNext(currentNode.getNext());
		}
		

	}


	
	/**
	 * Delete the node at the head of the list
	 */
	public void deleteFirst()
		{	
			if ( head != null)
			{
				if ( head.getNext() == null)
				{
					head=null;
					tail=null;
				}
				
				else
				{
					DoublyLinkedListNode<T> tempNode = new DoublyLinkedListNode<T>();
				
					tempNode = (DoublyLinkedListNode<T>) head;
				
					head = head.getNext();
				
					((DoublyLinkedListNode<T>) head).setPrev(null);			
				}
			
			}	 
			
		}


}
