import java.util.Scanner;

public class duplicate {
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("String value:");
	String orig = scan.nextLine();
	String rev="";
	int l = orig.length();
	for (int i=l-1; i>=0; i--){	
		rev = rev + orig.charAt(i);
	}
	if (orig.equals(rev)){
	System.out.println("Palindrome");}
	else {System.out.println("No Palindrome");}
	
}
}

