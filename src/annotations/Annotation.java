package annotations;

import java.util.ArrayList;

public class Annotation {
	
	@SuppressWarnings({ "removal", "rawtypes" })
	public static void main(String[] args) {
		
		//@SuppressWarnings("rawtypes")
		ArrayList a=new ArrayList();
		
		//@SuppressWarnings("removal")
		Integer i=new Integer(10);
	}

}
