/**
 * Create a class with a method which can calculate the sum of first n natural 
 * numbers which are divisible by 3 or 5. 
 * @author esha
 *
 */

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int s=calculateSum(num);
		System.out.println("Sum of first"+ num +"natural numbers divisible by 3 or 5 is "+ s);

	}
	public static int calculateSum(int num)
	{
		int sum=0;
		for(int i=0;i<num;i++)
		{
			if(i%3==0||i%5==0)
			{
				sum=sum+i;
			}
			
		}
		return sum;
	}

}
