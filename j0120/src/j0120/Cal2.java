package j0120;

import java.util.Scanner;

public class Cal2 {
	String[] strPrint() {
		String[] name = new String[3];
		Scanner scan = new Scanner(System.in);
//		String name = "";
		for(int i=0;i<name.length;i++) {
			System.out.println("이름을 입력하세요. >> ");
			name[i] = scan.next();
		}
		return name;
	}

}
