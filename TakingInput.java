import java.util.Scanner;

public class TakingInput {
	
	public static void main(String[] args) {
		System.out.println("Taking Input From the User");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number1");
		int a = sc.nextInt();
		System.out.println("Enter the Number2");
		float b=sc.nextFloat();
		float sum=a+b;
		System.out.print(sum);
		boolean b1 = sc.hasNextInt();
		System.out.print(b1);
		
	}

}
