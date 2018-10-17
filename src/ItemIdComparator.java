import java.util.Comparator;

public class ItemIdComparator implements Comparator<Item>{
	
	@Override
	public int compare(Item i1, Item i2) {
		
		if(i1.getId() > i2.getId()) {
			return 1;
		}else if(i1.getId() < i2.getId()) {
			return -1;
		}
		return 0;
	}

}
