package loops;

import AccessSpecifiers.AccessSpecifers;
import AccessSpecifiers.Default;
import AccessSpecifiers.Protected;
import AccessSpecifiers.Private;

public class controlstatement {

	public static void main(String[] args) {
		controlstatement.ifelse();
		AccessSpecifers.publicaccess();
//		Default.defaultaccess();
		Protected.protectedaccess();
		
	}
	
	public static void ifelse() {
		int ii=33;
		if(ii<=3) {
			for (int i=3; i<=15; i=i+3) {
				System.out.println(i);
			}
		}
		else {
			System.out.println("not strated");
		}
	}
}
