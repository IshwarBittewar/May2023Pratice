package Array;

public class logicalprogram {
public static void main(String[] args) {
	logicalprogram lp =new logicalprogram();
	lp.duplicatearray();
	
	
}

public void duplicatearray() {
	
	int []ii= {3,4,5,6,7,8,3,7};
	
	for(int i=0; i<ii.length; i++ ) {
		
	for(int j=i+1; j<ii.length; j++) {
		
		if(ii[i]==ii[j]) {
			System.out.println(ii[i]);
		}
	}
	}
	
	
}
}
