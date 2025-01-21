package jjjcard;

import java.util.Scanner;

public class Ja0121_04_2 {

	public static void main(String[] args) {
		// 카드 게임, 실행
		// 컴퓨터에서 랜덤으로 한장을 뽑고, 내가 1-52 중에 1개를 뽑아서
		// Spade, Diamond, Heart, Clover
		// shape이 같으면 숫자가 높은 사람이 승리해서 100만원을 지급하는 프로그램 구현
		
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck();
		d.input();
		d.print(8);

	}

}

