
public class threedigitcombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Enter three integers from 0-9 :");
		a= Integer.parseInt(args[0]);
		b= Integer.parseInt(args[1]);
		c= Integer.parseInt(args[2]);
		int[] intArray = new int[]{a,b,c};
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<i+1;j++) {
				j++;
				for(int k=0;k<j+1;k++) {
					k=j+1;
					System.out.println(intArray[k]);
					System.out.println(intArray[j]);
					System.out.println(intArray[i]);
				}
			}
			System.out.println(" ");
		}
		
		

	}

}
