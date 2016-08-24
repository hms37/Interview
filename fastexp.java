import java.util.Scanner;

public class fastexp {
	 int power(int x,int y){
		if (y==0){
		return 1;
		}
		int temp = (int)Math.pow(x,y/2);
		if (y%2==0){
			return temp*temp;
		}
		else {
			return x*temp*temp;
		}
	}
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter x:");
	System.out.println("Enter y:");
	int x = scan.nextInt();
	int y = scan.nextInt();
	fastexp exp = new fastexp();
    System.out.println(exp.power(x, y));
}
}
