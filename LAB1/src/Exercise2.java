/**
 * Display a traffic signal indicating Stop, ready and go based on the light selected 
 * @author esha
 *
 */
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		do
		{
		System.out.println("1.Red 2.Yellow 3. Green");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1: System.out.println("STOP");
		 		break;
		case 2: System.out.println("READY");
				break;
		case 3: System.out.println("GO");
				break;
		default: System.out.println("enter valid choice");
		 		break;
		
		}
		//System.out.println("Do you want to continue y/n");
		// choice=sc.next();
		
		}while(true);
	}

}
