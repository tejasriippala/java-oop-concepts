import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Hary");//0
		names.add("Kumar");//1
		names.add("Raj");//2
		names.add("Jhon");//3		
		names.add("Anil");//4
		names.add("Steve");//5
		names.add("Raj");//6		
		names.add("Archana");//7
		
		Collections.sort(names);	

		for (String str : names) {
			System.out.println(str);			
		}



//		ArrayList<String> names2 = new ArrayList<>();
//		
//		names2.add("Anil");
//		names2.add("Steve");
//		names2.add("Kumar");
//		names2.add("Raj");		
//		names2.add("Archana");
//		
///		Iterator<String> iterator = names.iterator();
//		
//		while (iterator.hasNext()) {
//			String str = iterator.next();
//			System.out.println(str);
//		}
		
	//	System.out.println(names.containsAll(names2));
		
		//names.retainAll(names2);
		
		//names.addAll(names2);
		
		//names.removeAll(names2);
		
//		for (String str : names) {
//			System.out.println(str);			
//		}

		
		//System.out.println(names.size());
		
//		String[] namesArr = new String[names.size()];
//		
//		names.toArray(namesArr);
//		
//		for (String str : namesArr) {
//			System.out.println(str);
//		}
		
//		Object[] objsArr = names.toArray();
//		
//		for (Object obj : objsArr) {
//			String str = (String)obj;
//			System.out.println(str);
//		}
		
//		System.out.println(names.contains("Raj"));
		
		//System.out.println(names.size());
		

	}

}
