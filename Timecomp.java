import java.util.Scanner;

public class Timecomp 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter seconds : ");
		int seconds = in.nextInt(); 
		int hours = seconds / 3600;
		int minutes = (seconds % 3600) / 60;
		int second = seconds % 60;

		System.out.print(hours + "hours  " + minutes +"Minutes  " + second +"seconds");
	}  
}