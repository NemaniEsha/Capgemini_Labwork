/**
 * Create a method to accept date and print the duration in days, months and years with regards to current system date.
 * @author esha
 *
 */
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Exercise7 {

	  public static void Duration(String a)
      {
	   LocalDate date=LocalDate.now();
	
	   DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	   
	   LocalDate d=LocalDate.parse(a,formatter);
	  
	   Period p=Period.between(d, date);
	   int count1=Math.abs(p.getYears());
	   int count2=Math.abs(p.getMonths());
	   int count3=Math.abs(p.getDays());
	   System.out.println("Years:"+count1);
	   System.out.println("Months:"+count2);
	   System.out.println("Days:"+count3);
      }
	  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date in dd-mm-yyyy format:");
		String s=sc.nextLine();
		Duration(s);
		
	}
}

