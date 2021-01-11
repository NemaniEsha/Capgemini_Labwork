/**
 * Create a method that accepts a String and checks if it is a positive string.
 * @author esha
 *
 */
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String st=new String();
		st=sc.next();
		int len=st.length();
		System.out.println(checkString(st,len));

	}
	public static  boolean checkString(String st, int len)
	{
		char [] ch=st.toCharArray();
		for(int i=0;i<len-1;i++)
		{
			if(ch[i]>ch[i+1])
				return false;
		}
		return true;
	}

}
