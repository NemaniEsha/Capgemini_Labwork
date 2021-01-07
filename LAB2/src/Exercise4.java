

/**
 * Create a method which accepts an integer array and removes all 
 * the duplicates in the array. Return the resulting array in descending order
 * @author esha
 *
 */
import java.util.Scanner;
public class Exercise4 {

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
		

		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		modifyArray(arr);
	}
	public static void modifyArray(int arr[]){   
        int[] temp = new int[20];  
        int j = 0;  
        for (int i=0; i<arr.length-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[arr.length-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i]; 
            System.out.print(arr[i]+" ");
        }  
          
    }  
}
