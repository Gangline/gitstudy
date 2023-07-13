package java09_api;

import java.util.Random;
import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		Random com = new Random();
		
		//컴퓨터 1~50 랜덤
		int num = com.nextInt(50) + 1;
		System.out.println(num);
		System.out.println("---------------");
		int i;
		
			for( i=0; i<7; i++) {
				int j  = user.nextInt();
				if(num<j) {
					System.out.println("UP");
				}if(num>j ) {
					System.out.println("DOWN");
				}if(j==num) {
					System.out.println("Uswer Win");
					break;
				}
			}
			if(i==7) {
				System.out.println("Com WIn : 컴퓨터의 숫자는 " + num);
			}
		}
		
}
