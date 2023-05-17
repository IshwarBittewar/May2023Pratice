package FinalFinallyFinalize;

public class Finally {
public static void main(String[] args) {
	Finally ff =new Finally();
	ff.finallymethod();
}

public void finallymethod() {
	
	try {
		int i=1/0;
	System.out.println(i);
	}
	catch (Exception e) {
		System.out.println("catch block excuted");
	}
	}
}
