import java.util.ArrayList;
import java.util.Collections;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Item> items = new ArrayList<>();		
		
		items.add(new Item(103,"BlackBerry", 250));
		items.add(new Item(101,"iPhone", 200));
		items.add(new Item(104,"Note5", 210));		
		items.add(new Item(102,"Edge", 150));
		
		//Collections.sort(items);
		
		//Collections.sort(items,new ItemPriceComparator());
		
		Collections.sort(items,new ItemIdComparator());
		
		for (Item item : items) {
			System.out.println(item);
		}

	}

}
