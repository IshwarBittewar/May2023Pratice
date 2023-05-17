package ScannerClass;

import java.util.Scanner;

public class ScannerClass {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	
	String name=scan.nextLine();
	
	System.out.println(name);
	
	for(int i=name.length()-1; i>=0; i--) {
		
		System.out.print(name.charAt(i));
	}
	System.out.println();
	String rev="";
	
	for(int j=name.length()-1; j>=0; j--) {
		
		rev=rev+name.charAt(j);
	}
	System.out.println(rev);
}
}
