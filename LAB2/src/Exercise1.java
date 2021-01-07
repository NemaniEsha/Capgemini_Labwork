/**
 * Create a method which accepts an array of integer elements and 
 * return the second smallest element in the array
 * @author esha
 *
 */
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of array elements");
		int num=sc.nextInt();
		int []arr = new int[num];
		System.out.println("Enter array elements");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		int second=getSecondSmallest(arr);
		System.out.println("Second smallest element is"+ second);
		
	}
	public static int getSecondSmallest(int arr[])
	{ 
		int smallest=arr[0];
		int secondsmallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				secondsmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]>smallest && arr[i]<secondsmallest)
			{
				secondsmallest=arr[i];
			}
		}
		return secondsmallest;
		
	}
	
}
