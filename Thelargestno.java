import java.util.Scanner;
public class Thelargestno {
	public static void main(String[] args)
	{
		System.out.println("Enter three integers :");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a = input.nextInt();
		int j = input.nextInt();
		if(a>n && a>j) {
			System.out.println("2'nd no. is greater");
		}
		else if(n>a && n>j)
		{
			System.out.println("1'st no. is greater");
		}
		else
		{
			System.out.println("3'rd no. is greater");
		}
		
	}

}
