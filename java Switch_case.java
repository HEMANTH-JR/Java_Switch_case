import java.util.Scanner;
public class Main{
	public static void main(String[] args ) {
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		
		switch (month) {

		case 1:
			System.out.println("january");
			System.out.println("31 days");
			break;
			
		case 2:
			System.out.println("february");
			System.out.println("28 days");
			break;
			
		case 3:
			System.out.println("march");
			System.out.println("31 days");
			break;
		case 4:
			System.out.println("april");
			System.out.println("30 days");
			break;
			
		case 5:
			System.out.println("may");
			System.out.println("31 days");
			break;
			
		case 6:
			System.out.println("june");
			System.out.println("30 days");
			break;
			
		case 7:
			System.out.println("july");
			System.out.println("31 days");
			break;
			
		case 8:
			System.out.println("august");
			System.out.println("31 days");
			break;
			
		case 9:
			System.out.println("september");
			System.out.println("30 days");
			break;
			
		case 10:
			System.out.println("october");
			System.out.println("31 days");
			break;
			
		case 11:
			System.out.println("nevember");
			System.out.println("30 days");
			break;
			
		case 12:
			System.out.println("december");
			System.out.println("31 days");
			break;
			
		default:
			System.out.println("Invalid_month");
			
		}
		
	}
}