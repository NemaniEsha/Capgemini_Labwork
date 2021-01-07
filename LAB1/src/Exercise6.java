/**
 * Create a class with a method to find the difference between the sum of the squares 
 * and the square of the sum of the first n natural numbers.
 * @author esha
 *
 */

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int difference=calculateDifference(num);
		System.out.println("Difference: "+ difference);

	}
	public static int calculateDifference(int num)
	{
		int sum1=0,sum2=0;
		for(int i=1;i<=num;i++)
		{
			sum1=sum1+i;
			sum2=sum2+(i*i);
		}
		sum1*=sum1;
		return (sum1-sum2);
	}

}
