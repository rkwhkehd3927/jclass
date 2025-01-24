package j0124;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ja0124_04 {

	public static void main(String[] args) throws Exception{ // throws Exception 이걸 붙이면 try catch문 필요X
		
		// 파일에 있는 글자를 읽고 출력 ---------------------------
		// 글을 가져와서 출력하는 기본형태
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//			int read = 0;
//			while((read=fis.read()) != -1) { // != -1 : 읽을데이터가 있으면
//				System.out.println((char)read);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		// 파일을 읽고(입력) 데이터 출력
//		byte[] b = new byte[1024];
//		FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//		fis.read(b);
//		System.out.println(new String(b));
		
		// 글을 파일에 저장 (주로 파일을 복사할 때 사용 )--------------------------------------------
		File f = new File("c:/save2");
		if(!f.exists()) { // 폴더 하나 생성
			f.mkdirs(); // c:/save2/aaa/ mkdir - c:/save2/aaa/
		}
		
		FileInputStream fis = new FileInputStream("c:/save/rose.jpg"); // 읽기(입력)
		FileOutputStream fos = new FileOutputStream("c:/save2/rose2.jpg"); // 출력
		while(true) {
			int read = fis.read();
			if(read==-1) break;
			fos.write(read);
		}
		fis.close();
		fos.close();
		
		System.out.println("이미지 복사 프로그램 종료");
	}

}
