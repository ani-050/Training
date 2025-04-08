package comparator;

import java.util.Comparator;

public class SortByPrice implements Comparator{
	
	@Override
	public int compare(Object o1,Object o2) {
		Book i1=(Book) o1;
		Book i2=(Book) o2;
		return Double.compare(i1.price,i2.price);
	}

}
