package j0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ja0124_06 {

	public static void main(String[] args) {
		ArrayList<Stu> list = new ArrayList<Stu>();
		list.add(new Stu("홍길동",100,100,99));
		list.add(new Stu("유관순",90,90,99));
		list.add(new Stu("이순신",80,80,99));
		
		
		// list 파일에 들어있는 내용을 stu.txt 에 저장
		// 1,홍길동,100,100,100,300,100.0,0 이런 식으로 저장
		// 들어가 있는 3명의 학생성적을 stu.txt 파일에 저장
		
		try {
			FileWriter fw = new FileWriter("c:/save2/stu.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0;i<list.size();i++) {
				list.get(i); // Stu 객체 1개 가져오기
				String str = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n",list.get(i).getNo(),
						list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),
						list.get(i).getMath(),list.get(i).getTotal(),list.get(i).getAvg(),
						list.get(i).getRank());
				bw.write(str);
			}
			bw.close();
			fw.close();
		} catch (Exception e) {e.printStackTrace();}
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		// save2 폴더에 stu.txt로 아래의 글 저장
//		String[] str = new String[4];
//		str[0] = "1,홍길동,100,100,99";
//		str[1] = "2,유관순,90,90,99";
//		str[2] = "3,이순신,80,80,99";
		
		// 파일 (입력)저장
//		try {
//			FileWriter fw = new FileWriter("c:/save2/stu.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			for(int i=0;i<str.length;i++) {
//				bw.write(str[i]+"\r\n");
//			}
//			bw.close();
//			fw.close();
//		} catch (Exception e) {e.printStackTrace();}
		
//		str[3] = "4,강감찬,70,70,70";
		
//		try {
//			FileWriter fw = new FileWriter("c:/save2/stu.txt",true); // 뒤에 true 를 넣으면 덮어쓰기가 아닌 이어쓰기 가능 (false는 덮어쓰기)
//			BufferedWriter bw = new BufferedWriter(fw);
//			for(int i=3;i<4;i++) {
//				bw.write(str[i]+"\r\n");
//			}
//			bw.close();
//			fw.close();
//		} catch (Exception e) {e.printStackTrace();}
		
		
		// 파일 (출력)불러오기
//		try {
//			FileReader fr = new FileReader("c:/save2/stu.txt");
//			BufferedReader br = new BufferedReader(fr); // 1줄 씩 가져오기
//			while(true) {
//				String line = br.readLine();
//				if(line == null) break;
//				System.out.println(line);
//			}
//		} catch (Exception e) {e.printStackTrace();}
//		
		
		
		

	}

}
