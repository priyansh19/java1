import java.util.Arrays;
import java.util.Formatter;
public class marks {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[];
		array = new int[10];
		System.out.println("Enter the marks of 10 students :");
		for(int i=0; i<10 ; i++) {
			array[i] = Integer.parseInt(args[i]);
		}
		System.out.println("You have entered :");
		for(int i=0; i<10 ; i++) {
			System.out.println(array[i]);
			System.out.println(" ");
		}
		Arrays.sort(array);
		System.out.println("after sorting them in accending order :");
		System.out.printf("Sorted Array : %s", Arrays.toString(array));
		System.out.println(" ");
		for(int i=0; i<10 ; i++) {
			if(array[i]>=40 && array[i]<=50) {
				System.out.format("%32s%10d","PASS",array[i]);
				System.out.println(" ");
			}
			if(array[i]>=51 && array[i]<=75) {
				System.out.format("%32s%10d","MERIT",array[i]);
				System.out.println(" ");
			}
			if(array[i]>75) {
				System.out.format("%32s%10d","DISTINCTION",array[i]);
				System.out.println(" ");
			}
		}
	}
	
	

}
