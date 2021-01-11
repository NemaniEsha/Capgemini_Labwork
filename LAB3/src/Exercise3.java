/**
 * Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
 * @author esha
 *
 */


import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String st=new String();
		st=sc.next();
		System.out.println(alterString(st));

	}
	public static String alterString(String st)
	{
	   StringBuilder stt=new StringBuilder("");
		char[]  ch=st.toCharArray();
	   int len=ch.length;
	   char c;
	   for(int i=0;i<len;i++)
	   {
		   if(st.charAt(i)!='a' && st.charAt(i)!='e'&& st.charAt(i)!='i' && st.charAt(i)!='o' && st.charAt(i)!='u')
		   {
			   c=(char)(ch[i]+1);
			   System.out.print(c);
		   }
		   else
		   {
			   c=ch[i];
			   System.out.print(c);
		   }
			  
	   }
	   return stt.toString();
	}

}
