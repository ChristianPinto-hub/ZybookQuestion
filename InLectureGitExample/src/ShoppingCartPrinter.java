import java.util.Scanner;

public class ShoppingCartPrinter {

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
	scnr.nextLine();
	
	System.out.println("Item 2");
	ItemToPurchase secondItem = new ItemToPurchase();
	System.out.println("Enter the item name:");
	secondItem.setItemName(scnr.nextLine());
	System.out.println("Enter the price:");
	secondItem.setItemPrice(scnr.nextInt());
	System.out.println("Enter the item quantity:");
	secondItem.setItemQuantity(scnr.nextInt());
	
	System.out.println("TOTAL COST");
	System.out.println(firstItem.getItemName() + " " 
		+ firstItem.getItemQuantity() + " @ $" 
		+ firstItem.getItemPrice() + " = $" 
		+ (firstItem.getItemQuantity() * firstItem.getItemPrice()));
	System.out.println(secondItem.getItemName() + " " 
		+ secondItem.getItemQuantity() + " @ $" 
		+ secondItem.getItemPrice() + " = $" 
		+ (secondItem.getItemQuantity() * secondItem.getItemPrice()));
	System.out.println();
	System.out.println("Total: $" 
	+ ((firstItem.getItemQuantity() * firstItem.getItemPrice())
	+ (secondItem.getItemQuantity() * secondItem.getItemPrice())));
	
    }
    
}
