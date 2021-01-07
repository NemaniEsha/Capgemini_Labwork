
/**
 * Create a method to check if a number is a power of two or not
 * @author esha
 *
 */


import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		System.out.println(powerOf2(num));

	}
	public  static boolean powerOf2(int number){
		  if(number<=0){
		   return false;
		  }
		   
		  while(number > 1){
		   if(number % 2 != 0){
		    return false;
		   }
		   number = number / 2;
		  }
		  return true;
		 }

}
