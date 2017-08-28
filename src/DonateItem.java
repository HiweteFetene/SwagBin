
public class DonateItem {
	
	
	
	private ItemDonated currentItem; 
	private DoublyLinkedList<ItemDonated> jacketList = new DoublyLinkedList<ItemDonated>();
	private DoublyLinkedList<ItemDonated> scarfList = new DoublyLinkedList<ItemDonated>();
	
	public void getCurrentItem(NewItem newItemClass){
		currentItem = newItemClass.allObjects.getLast();
	}
	
	public DoublyLinkedList<ItemDonated> getJacketList(){
		return jacketList;
	}
	
	public DoublyLinkedList<ItemDonated> getScarfList(){
		return scarfList;
	}

	public String getMeetingTime() {
		return currentItem.getMeetingTime();
	}

	public void setMeetingTime(String meetingTime) {
		currentItem.setMeetingTime(meetingTime);
	}
	
	public void setDescription(String description) {
		currentItem.setDescription(description);
	}

	
	public void setName(String name) {
		currentItem.setName(name);
	}

	

	public void setOwnerContactInfo(String ownerContactInfo) {
		currentItem.setOwnerContactInfo(ownerContactInfo);
	}

	

	public void setCategory(String category) {
		currentItem.setCategory(category);
		
		if(category.equals("Jacket")){
			
			jacketList.insertFirst(currentItem);
			
		}
		
		if(category.equals("Scarf")){
			
			scarfList.insertFirst(currentItem);
			
		}
		
		
		
	}
	
	
	
	
}
