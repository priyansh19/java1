
public class Commandlinecalculator {
	public static void main(String[] args){
		int a , b , c;
		System.out.println("Enter two no.: ");
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println(a+" "+b);
		System.out.println("Enter the operation u want to perform:");	
		System.out.println("---------------------------------------");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplcation");
		System.out.println("4. Division");
		System.out.println("---------------------------------------");
		c=Integer.parseInt(args[2]);
		switch (c) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			
		}
	}

}
