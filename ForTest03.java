package day0102;

public class ForTest03 {

	public static void main(String[] args) {
		//3의 배수만 구해보아요
		for(int i=0; i<=100; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
				}
		
		int sum=0;//이 변수는 main메서드 안까지 스코프가 닿음 지역변수 초기화 해야 사용가능
		for(int a=1; a<=100; a++) {
			sum=sum+a;
		}
		System.out.println(sum); //for문밖에해야됨 아니면 100번됨
	
		int cnt=0;
		int ad=0;
		for(int b=2; b<=100; b++) {
			cnt=0;//cnt를 매번 리셋하지않으면 cnt가 초기화 되지않아 2만 나옴
			for(int c=1; c<=100; c++) {
				if(b%c==0) {
					cnt++;
				}	
		}
			if(cnt==2) {
				ad=ad+b;
			}
		}
		System.out.print(ad+1);
	}
}