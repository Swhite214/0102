package day0102;

public class WhileTest01 {
	
	public static void main(String[] args) {
		//if(조건식) {}
		//while(조건식){}
		//ture일 경우 {실행구간}을 실행하고 조건을 확인
		//false 일 경우 종료
		//순차적으로 카운트되는 것을 index라고한다
		int i= 0;
		while(i<3) {
			System.out.println("안녕하세요");
			//무한루프 즉 무한루프를 제거할 무언가가 필요함
			i++;//몇회전할시 결정자가 꼭필요함 즉 반복문에는 초기값 조건식 증감문 이순서대로 필요함
		}
	}
}
