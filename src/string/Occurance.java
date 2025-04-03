package string;

public class Occurance {
	
	public static void main(String[] args) {
		String s="malayalam";
		char c='a';
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			if(c==s.charAt(i))
				count++;
		}
		System.out.println(count);
	}

}
