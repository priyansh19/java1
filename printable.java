
public interface printable {
  double pi = 3.14 ;
  public void show();
}
class test implements printable{
	public void show() {
		System.out.println("The value of pi is " +pi );
	}
	public static void main(String args[]) {
		test t1 = new test();
		
		System.out.println("The value of pi is:" +pi );
	}
}