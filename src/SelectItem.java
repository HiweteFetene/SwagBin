public class SelectItem {

	
	DonateItem model;
	
	public SelectItem(DonateItem donateClass){
		model = donateClass;
	}

	public String getItemName(DoublyLinkedListNode<ItemDonated> item) {
		return item.getData().getName();
	}

	public String getItemOwner(DoublyLinkedListNode<ItemDonated> item) {
		return item.getData().getOwnerName();
	}

	public String getItemDescription(DoublyLinkedListNode<ItemDonated> item) {
		return item.getData().getDescription();
	}

	public String getItemContact(DoublyLinkedListNode<ItemDonated> item) {
		return item.getData().getOwnerContactInfo();
	}

	public String getItemCategory(DoublyLinkedListNode<ItemDonated> item) {
		return item.getData().getCategory();
	}

	public String getItemTime(DoublyLinkedListNode<ItemDonated> item) {
		return item.getData().getMeetingTime();
	}



	
	public void deleteItem(String name, String itemType){


		if(itemType.equals("Jacket")){

			DoublyLinkedListNode<ItemDonated> currentNode = (DoublyLinkedListNode<ItemDonated>) model.getJacketList().head;

			if(currentNode == model.getJacketList().head ){

				String currentData = currentNode.getData().getName();
				if (name.compareTo(currentData) == 0) {

					model.getJacketList().delete(currentNode);
				}

			}

			if(currentNode == null) {

				System.out.println("NULL");
				
			}

			while (currentNode.getNext() != null) {
				String currentData = currentNode.getData().getName();
				System.out.println("Current data " + currentData);

				if (name.compareTo(currentData) == 0) {

					model.getJacketList().delete(currentNode);
				}



			}

			if(itemType.equals("Scarf")){

				DoublyLinkedListNode<ItemDonated> currentNode2 = (DoublyLinkedListNode<ItemDonated>) model.getScarfList().head;

				if(currentNode2 == model.getScarfList().head ){

					String currentData2 = currentNode2.getData().getName();
					if (name.compareTo(currentData2) == 0) {

						model.getScarfList().delete(currentNode2);
					}

				}

				if (currentNode2 == null) {
					System.out.println("NULL");
				}

				while (currentNode2.getNext() != null) {
					String currentData2 = currentNode2.getData().getName();
					if (name.compareTo(currentData2) == 0) {

						model.getScarfList().delete(currentNode2);
					}
				}

			}

		}
		

	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public DoublyLinkedListNode<ItemDonated> findItem(String name, String itemType){


		if(itemType.equals("Jacket")){

			DoublyLinkedListNode<ItemDonated> currentNode = (DoublyLinkedListNode<ItemDonated>) model.getJacketList().head;

			if(currentNode == model.getJacketList().head ){

				String currentData = currentNode.getData().getName();
				if (name.compareTo(currentData) == 0) {

					return currentNode;
				}

			}

			if(currentNode == null) {

				System.out.println("NULL");
				return null;
			}

			while (currentNode.getNext() != null) {
				String currentData = currentNode.getData().getName();
				System.out.println("Current data " + currentData);

				if (name.compareTo(currentData) == 0) {

					return currentNode;
				}



			}

			if(itemType.equals("Scarf")){

				DoublyLinkedListNode<ItemDonated> currentNode2 = (DoublyLinkedListNode<ItemDonated>) model.getScarfList().head;

				if(currentNode2 == model.getScarfList().head ){

					String currentData2 = currentNode2.getData().getName();
					if (name.compareTo(currentData2) == 0) {

						return currentNode2;
					}

				}

				if (currentNode2 == null) {
					return null;
				}

				while (currentNode2.getNext() != null) {
					String currentData2 = currentNode2.getData().getName();
					if (name.compareTo(currentData2) == 0) {

						return currentNode2;
					}
				}

			}

		}
		return null;

	}
	
}

