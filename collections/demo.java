package project1;
import java.util.*;
public class demo {

	public static void main(String[] args) {
      //Creating an object for my list
		List list1=new ArrayList<>();
		list1.add(1);
		list1.add(3);
		list1.add(4);
		System.out.println(list1.get(2));
		/*remove form the list*/
		System.out.println(list1.remove(1));
		//linkedlist//
		List num=new LinkedList<>();
		num.add(1);
		num.add(3);
		num.add(4);
		System.out.println(num);
		System.out.println(num.get(1));
		System.out.println(num.remove(0));
		/*array list*/
		ArrayList <String> list2=new ArrayList<>();
		list2.add("Java");
		list2.add("Python");
		list2.add("Javascript");
		list2.add("Html");
		System.out.println(list2);
		Vector<String> num1=new Vector<>();
		num1.add("sb");
		num1.add("su");
		num1.add("bs");
		num1.add("sr");
		System.out.println(num1);
		/*iterator*/
		Iterator<String> it=num1.iterator();
		System.out.println("Elements");
		while(it.hasNext()) {
			System.out.println(it.next());
			/*set*/
			HashSet<String> set=new HashSet<String>();
			set.add("Suni");
			set.add("Bhavani");
			set.add("venky");
			set.add("Veda");
			//HashMap
			Map<String, Integer> map=new HashMap<>();
			//Inserting values to the map
			map.put("Rambo", 30);
			map.put("Lucky", 49 );
			map.put("Varun", 57);
			System.out.println(map.get("Rambo"));
			System.out.println(map.keySet());
			System.out.println(map.entrySet());
			System.out.println(map.values());
			HashMap<String,Integer>languages=new HashMap<>();
			languages.put("Vijay", 33);
			languages.put("Vamsi", 24);
			languages.put("Krishna", 26);
			System.out.println(languages.get("Vamsi"));
			System.out.println(languages.keySet());
			System.out.println(languages.values());
			System.out.println(languages.entrySet());
			Map<String, Integer>mp1=new TreeMap<>();
			mp1.put("Arjun",35);
			mp1.put("Surya",27);
			mp1.put("Akhil",29);
			mp1.put("Yash",30);
			System.out.println(mp1.get("Yash"));
			System.out.println(mp1.entrySet());
			System.out.println(mp1.remove("Akhil"));
			System.out.println(mp1.keySet());
			System.out.println(mp1.values());
		}
		
	}

}
