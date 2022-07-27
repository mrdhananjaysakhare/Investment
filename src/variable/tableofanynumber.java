package variable;

import java.util.Scanner;

public class tableofanynumber {
	public static void main(String[] args) {
		  System.out.println("Enter number");
		Scanner scan=new Scanner(System.in);
	     int a=scan.nextInt();
   
for(int i=1;i<=10;i++) {
	
	int count;
	count=a*i;
	System.out.println(count);
	
}
}
}
