package day0102;
import java.util.Scanner;

public class DoWhileTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        
        for(int i=0; i<1; i++){
            answer += number % 100;
            answer= answer+ (number/100000000)+(number/1000000)+(number/10000)+(number/100);
        }

        System.out.println(answer);
		
	}

}
