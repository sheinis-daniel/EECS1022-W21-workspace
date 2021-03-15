//Beseyata DeShmaya
package model;

public class VendingMachine {
	String status = "Empty VM Started";
	
	int[] stock = new int[4];

	public String checkStatus() {
		return status;
	}

	public String checkStock(String item) {
		int index = getIndexForItem(item);
		if (index == -1)
			return "Invalid product: " + item;
		return item + " (" + stock[index] + ")";
	}

	public String checkStock() {
		return "Stock: "+checkStock("Coke") + ", " + checkStock("Orange Juice") + ", " + checkStock("Kitkat Chunky Bar") + ", "
				+ checkStock("Lay's Classic Chips");
	}

	public void add(String item, int quantity) {
		int index = getIndexForItem(item);
		if(index==-1)
			status = "Invalid product: "+item;
		else {
			stock[index]+=quantity;
			status = "Product added: "+item+" ("+quantity+")";
		}

	}

	public void dispense(String item, int quantity) {
		int index = getIndexForItem(item);
		if(index==-1)
			status = "Invalid product: "+item;
		else {
			stock[index]-=quantity;
			status = "Product removed: "+item+" ("+quantity+")";
		}

	}

	private int getIndexForItem(String item) {
		if (item.equals("Coke"))
			return 0;
		if (item.equals("Orange Juice"))
			return 1;
		if (item.equals("Kitkat Chunky Bar"))
			return 2;
		if (item.equals("Lay's Classic Chips"))
			return 3;
		return -1;
	}

}
