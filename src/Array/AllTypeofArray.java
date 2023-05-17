package Array;
import java.util.Arrays;
public class AllTypeofArray {

	public static void main(String[] args) {
		
		int ii[]=new int[5];
		ii[0]=34;
		ii[4]=45;
//		ii[5]=34;
		
		AllTypeofArray aa =new AllTypeofArray();
//		aa.objectarry();
		aa.readarray();
		
//		AllTypeofArray.booleanarray();
		System.out.println(ii.length);
		System.out.println(ii[0]);
		for(int i=0; i<ii.length; i++) {
			System.out.println(ii[i]);
		}
		
	}
	public static void booleanarray() {
		boolean bo[]=new boolean[2];
		bo[0]=true;
		bo[1]=false;
		System.out.println(bo[0]+ " "+bo[1]+ " "+bo.length);
		
	}
	public void objectarry() {
		
		Object []oo= new Object [5];
		oo[0]=true;
		oo[1]=45.55f;
		oo[2]='@';
		oo[3]=45;
		oo[4]=1234567890l;
		
		System.out.println(oo.length);
		System.out.println("####");
		
		for(int i=0; i<oo.length; i++) {
			System.out.println(oo[i]);
		}
	}
	
	public void readarray() {
		int []ab= {1,3,4,5,6,7,967,90,0};
		System.out.println(ab.length+" this is length");
		Arrays.sort(ab);;
		for(int i=0; i<ab.length; i++) {
			System.out.println(ab[i]);
		}
		
//		reverse the array
//		for(int j=ab.length-1; j>=0; j--) {
//			System.out.println(ab[j]);
//		}
	}
	
	
}
