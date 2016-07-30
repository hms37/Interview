import java.util.Scanner;

public class repalindrome {
	public static void main(String args[]){
		
		Scanner scan= new Scanner(System.in);
		String orig = scan.nextLine();
		scan.close();
		int n= orig.length();
		int matchcount=n/2;
		int i,j;
		char[] temp = orig.toCharArray();
		orig.replace(" ", "");
		orig.trim();
		if (orig ==null || orig.isEmpty())
		{
			
			return;
		}
		for(i=0; i<n; i++){
			for(j=0; j<n; j++){
				if( i!=j && temp[i] != '_' && temp[j] != '_' && temp[i]==temp[j] ){
					temp[i]='_';
					temp[j]='_' ;
					matchcount--;
				}
			}
			
		}
		if (matchcount==0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}


}
