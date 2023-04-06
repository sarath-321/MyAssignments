package week1.day2;

/*Assignment:1
=========
Create class as Tab
Create a method as tabPrice with input argument as int tabPrice and add return type
Create a method tabBrand(String brandName)with return type as string
Create object for the tab class and call the methods and print in console to verify it*/

public class Tab {

	public int tabPrice(int tabPrice) {
		return tabPrice;

	}

	public String tabBrand(String brandName) {
		return brandName;

	}

	public static void main(String[] args) {

		Tab tab = new Tab();
		int price = tab.tabPrice(25000);
		System.out.println("Tab Price :" + price);

		String name = tab.tabBrand("SAMSUNG");
		System.out.println("Tab Brand Name :" + name);
	}
}
