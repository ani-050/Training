package exception;

public class BoxUnbox {
	public static void main(String[] args) {
		//boxing
		int i=9;
		Integer i1=new Integer(i);
		Integer i2=Integer.valueOf(i);
		Integer i3=i;
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		//unboxing
		Integer n=new Integer(8);
		int n1=n.intValue();
		int n2=n;
		System.out.println(n);
		System.out.println(n1);
		System.out.println(n2);
	}

}
