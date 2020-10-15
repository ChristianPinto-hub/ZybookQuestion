import java.util.Scanner;
public class ItemToPurchase {

    String itemName; 
    int itemPrice; 
    int itemQuantity;
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public int getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
    public int getItemQuantity() {
        return itemQuantity;
    }
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    } 
    
    public static void main(String[] args) {
	
	Scanner scnr = new Scanner(System.in);
	System.out.println("Item 1");
	ItemToPurchase firstItem = new ItemToPurchase();
	System.out.println("Enter the item name:");
	firstItem.setItemName(scnr.nextLine());
	System.out.println("Enter the price:");
	firstItem.setItemPrice(scnr.nextInt());
	System.out.println("Enter the item quantity:");
	firstItem.setItemQuantity(scnr.nextInt());
	
    }
    
}
