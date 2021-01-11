
/**
 * Create a method that accepts a number and modifies it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. 
 * The digit in the units place can be left as it is. 
 * @author esha
 *
 */
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String st=new String();
		st=sc.next();
		int len=st.length();
		modifyString(st,len);

	}
	public static int modifyString(String st, int len)
	{
		char [] ch=st.toCharArray();
		int [] stt=new int[10];
		for(int i=0;i<len-1;i++)
		{
			stt[i]=Math.abs(ch[i]-ch[i+1]);
			System.out.print(stt[i]);
		}
		return 0;
	}

}
