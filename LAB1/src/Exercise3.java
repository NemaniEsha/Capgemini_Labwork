/**
 * To print fibonacci series
 * @author esha
 *
 */


import java.util.Scanner;

public class Exercise3 {

	static int fibo(int num){
	      int first = 0, second = 1, temp;
	      if (num == 0)
	      return first;
	      if (num == 1)
	      return second;
	      for (int i = 2; i <= num; i++){
	         temp = first + second;
	         System.out.println(temp);
	         first = second;
	         second = temp;
	      }  
	      return second;
	   }
	   public static void main(String args[]){
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter nth number");
	      int num=sc.nextInt();
	      System.out.print("The  fibonacci series is : ");
	      System.out.println(fibo(num));
	   }

}
