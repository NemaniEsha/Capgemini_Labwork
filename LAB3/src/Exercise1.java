/**
 * Java program that reads a line of integers and then displays each integer and the sum of all integers. 
 * @author esha
 *
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		StringTokenizer st=new StringTokenizer("6 3 9 2 0 4");
		while(st.hasMoreTokens())
		{
			int n=Integer.parseInt(st.nextToken());
			sum=sum+n;
			
		}
		System.out.println("Sum is "+ sum);
		
	}

}
