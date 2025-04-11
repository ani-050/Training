package hashMap;

public class HashMapDriver {
	
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(1, "ani");
		map.put(2, "deep");
		map.put(3, "bhaskar");
		map.put(4, "somrik");
		map.put(5, "bhargabh");
		map.display();
		System.out.println(map.size());
		System.out.println(map.contains(4));
	}

}
