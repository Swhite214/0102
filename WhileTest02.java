package day0102;

public class WhileTest02 {
	
	public static void main(String[] args) {
		
		//5까지 출력해보아요 반복문 아닌버전
		int a=1;
		System.out.println(a);a++; // a=1
		System.out.println(a);a++; //
		System.out.println(a);a++; //
		System.out.println(a);a++; // ......
		System.out.println(a);
		
		//반복문 버전
		int i =1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
	}
}
