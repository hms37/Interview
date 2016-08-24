import java.util.Scanner;

public class prime {
	 
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
			 
			 for(int i=2; i<n+1; i++){
				 int counter =0;
				 for ( int n1=i; n1>=1; n1--)
				 {
					if (i%n1==0){
						counter= counter+1;
					}
				 }
				 
				 if (counter==2){System.out.println(i);}
			 }
			
		}
		
		
	}


