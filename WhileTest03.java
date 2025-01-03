package day0102;

public class WhileTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 100 숫자중에 홀수만 출력
		int a=1;
		
		while(a<=100) {
			System.out.println(a);
			a+=2;
		}
		//while(a <= 100){
		// if(i%2==0){//위치에따라 증감문은 달라짐
		// i++; 혹은 break;를 만나면 탈출할수있음
		//continue; 컨틴유를 만나면 이시점에서 바로 조건식부분으로 감
		//}
		// System.out.println(i)
		//
		//}
	}

}
