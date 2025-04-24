package annotations;

import java.util.ArrayList;

import annotations.MyAnnotation.MyAnnotations;

public class Driver {
	@MyAnnotations(value2 = "jh   ")
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		Integer i=new Integer(10);
	}

}
