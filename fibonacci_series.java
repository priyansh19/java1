import java.util.Scanner;
public class fibonacci_series {
	
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int temp = 0;
		System.out.println("Enter the number to which u want to print your fiboncci series:");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		if(x==0) {
			System.out.println("Nothing to be printed ...(-)");
		}
		else {
		System.out.println(first);
		System.out.println(second);
		
		for (int i =0 ; i<x ; i++) {
			temp=first+second;
			System.out.println(temp);
			first=second;
			second=temp;
			}
		}
	}
}
