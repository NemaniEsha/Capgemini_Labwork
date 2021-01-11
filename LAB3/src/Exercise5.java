

/**
 * Java program that displays the number of characters, lines and words in a text 
 * @author esha
 *
 */
import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String st=new String();
		st=sc.nextLine();
		int len=st.length();
		String [] words=st.split("[ ,.]+");
		String [] lines =st.split("[\r\n]");
		System.out.println("Characters:"+len+" Words:"+words.length+" lines:"+lines.length);

	}

}
