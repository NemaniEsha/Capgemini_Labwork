/**
 * Create a method that can accept an array of String objects and sort in alphabetical order. The elements in the left half should be completely in uppercase 
 * and the elements in the right half should be completely in lower case. 
 * Return the resulting array.
 * @author esha
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of string objects");
		int num=sc.nextInt();
		String arr[]= new String[num];
		System.out.println("enter string objects");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println(sortStrings(arr));
		

	}
	public static String sortStrings( String arr[])
	{
		Arrays.sort(arr);
		for(int i=0;i<=(arr.length)/2;i++)
		{
			arr[i]=arr[i].toUpperCase();
		}
		return Arrays.toString(arr);
		
	}

}
