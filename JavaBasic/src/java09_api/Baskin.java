package java09_api;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Baskin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
//		int user = sc.nextInt(); //유저가 입력하는 숫자
		int com; //랜덤 숫자
		int num = 1;
		
		com = ran.nextInt(3) + 1;
		System.out.println(com);
		for(int i=0; i<com; i++) {
			System.out.println(num++);
		
		}
		
		System.out.println();
		
	}
}
