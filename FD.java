package day0102;

public class FD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int a;
		int b;
		for(i=1;i<=4;i++) {
			for(a=1;a<4-i; a--) {
				System.out.print("b");
			}
			
			for(b=0;b<i*2-1;b++) {
				System.out.print("*");
			}
		}
	}

}
