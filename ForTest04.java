package day0102;

public class ForTest04 {

	public static void main(String[] args) {
		int sum=0; //지역변수
		for(int i = 1; i<=10; i++) {
			if(i%2==0)
				continue;
			//홀수만
			
			sum=sum+i;
		}
		System.out.print(sum);
	}

}
