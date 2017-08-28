
public class NewItem {
	
	
	DoublyLinkedList<ItemDonated> allObjects = new DoublyLinkedList<ItemDonated>();
	
	public void createObject(){
		
		ItemDonated item = new ItemDonated();
		allObjects.insertLast(item);
		
	}
	
	
}
