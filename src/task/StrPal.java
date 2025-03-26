package task;

public class StrPal {
	
	public static int fun(String s,int left,int right) {
		int count=0;
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
			count++;
			left--;
			right++;
		}
		return count;
	}
	
	public static int count(String s) {
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			
				count +=fun(s,i,i);
			
				count +=fun(s,i,i+1);
		}
		return count;
	}
	public static void main(String[] args) {
		int count=count("aba");
		System.out.println(count);
	}

}
