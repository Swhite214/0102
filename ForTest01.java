package day0102;

public class ForTest01 {
	public static void main(String[] args) {
		//사이클이 정해준 반복문의 경우
		//초기값, 조건식, 증감
		//for(초기값;증감식;증감){}
		for(int i = 0; i<=10; ++i) { //for(;;) 이건 무한루프임 //i++ ++i 둘다 크게 신경안씀
			System.out.println("i=" +i);
		}
	}
}
