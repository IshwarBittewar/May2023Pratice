package String;

import java.util.Scanner;

public class MethodOfString {

	public static void main(String[] args) {
		
		MethodOfString ms= new MethodOfString();
		ms.methodsofString();
//		Creation of String
//		String []name = {"ishwar"};
//		String name1 =new String("ishwar");
//		
	}
	public void methodsofString() {
//		String[] name= {"qwe","ert","tyt","yhj"};
//		System.out.println(name.length);
		
		String name="ishwarbittewar";
		String name1= "ishwarBittewar";
		System.out.println(name.length());
		
		System.out.println(name.charAt(0));
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.equals(name1));
		
		System.out.println(name.equalsIgnoreCase(name1));
		
//		System.out.println(name.replace("war", "raw"));
//		System.out.println(name.replaceAll(name, name1));
		
		System.out.println(name.substring(6, 14));
		System.out.println(name.indexOf("r"));
		String name3="ishwar Bittewar";
		
		String []newname= name3.split(" ");
		for (int i=0; i<newname.length; i++) {
			System.out.println(newname[i]);
		}
		
		
		
	}
	
	public static void demo111() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int num=sc.nextInt();
		
		int fact;
		
		
	}
	
	
}
