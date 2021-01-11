/**
 * Create a class containing a method to create the mirror image of a String.
 * @author esha
 *
 */
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String st=new String();
		st=sc.next();
		System.out.println(st+"|"+getImage(st));
		

	}
	public static String getImage(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		StringBuffer sbb=sb.reverse();
		return sbb.toString();
		
	}

}
