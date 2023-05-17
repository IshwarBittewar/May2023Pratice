package loops;

public class ForWhileDowhile {
	public static void main(String[] args) {
		ForWhileDowhile ff= new ForWhileDowhile();
		ff.forloop();
		System.out.println("********");
		ff.whileloop();
		ff.dowhile();
	}
	public void forloop() {
		
		for(int i=2; i<=31; i=i+2) {
		System.out.println(i);
	}
	}
public void whileloop() {
	int c=0;
	while(c<=9) {
		System.out.println(c);
		c++;
	}
	}

public void dowhile() {
	
	int i=2;
	do {System.out.println(i);
		i++;
	}
	while(i<=10);
}
}
