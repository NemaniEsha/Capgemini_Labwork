
 /**
 * Display sum of cubes of a n digit number
 * @author esha
 *
 */
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		while(n>0)
		{
			m=n%10;
			sum=sum+(m*m*m);
			n=n/10;
		}
		System.out.println("Sum of cubes of the digits is "+ sum);

	}

}
