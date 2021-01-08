/**
 * Create a method which accepts an integer array, reverse the numbers in the 
 * array and returns the resulting array in sorted order
 * @author esha
 *
 */
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number of terms in array");
		int num=sc.nextInt();
		int []arr= new int[num];
		System.out.println("enter array elements");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		getSorted(arr);

	}
	public static void getSorted(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=reverse(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static int reverse(int num)
	{
		int m,rev=0;
		while(num>0)
		{
			m=num%10;
			rev=rev*10+m;
			num=num/10;
		}
		return rev;
	}

}
