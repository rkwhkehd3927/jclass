package j0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	
	ArrayList<Stu> list = new ArrayList<Stu>();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	Scanner scan = new Scanner(System.in);
	int choice=0, temp=0, count=0;
	int no=0,kor=0,eng=0,math=0,total=0,rank=0;
	String name = "";
	double avg = 0;

	// 파일 읽어오기
	void fileRead() throws Exception {
		FileReader fr = new FileReader("c:/save/studata.txt");
		BufferedReader br= new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			String[] str = line.split(",");
			// 가져온 데이터를 변수 저장
			no = Integer.parseInt(str[0]);
			name = str[1];
			kor = Integer.parseInt(str[2]);
			eng = Integer.parseInt(str[3]);
			math = Integer.parseInt(str[4]);
			total = Integer.parseInt(str[5]);
			avg = Double.parseDouble(str[6]);
			rank = Integer.parseInt(str[7]);
			list.add(new Stu(no,name,kor,eng,math,total,avg,rank));
		}
		
		br.close();
		fr.close();
		
	}
	
	// 학생 성적 입력
	void inputStu() {
		System.out.println("                          [ 학생성적입력 ]");
		System.out.println("----------------------------------------------------------------");
	
		// 입력
		while(true) {
			count = list.size();
			System.out.printf("%d번째 학생의 이름을 입력하세요. (0.이전페이지로 이동)",count+1);
			no = count+1;
			name = scan.next(); // 이름 입력
			if (name.equals("0")) {
	            break; // 0을 입력하면 이전 페이지로 이동
			}
			System.out.println("국어 성적을 입력하세요. >> ");
			kor = scan.nextInt();
			System.out.println("영어 성적을 입력하세요. >> ");
			eng = scan.nextInt();
			System.out.println("수학 성적을 입력하세요. >> ");
			math = scan.nextInt();
			list.add(new Stu(no,name,kor,eng,math,total,avg,rank));
			
			System.out.printf("학생정보: %d,%s,%d,%d,%d,%d,%.2f,%d\n",list.get(count).getNo(),list.get(count).getName()
					,list.get(count).getKor(),list.get(count).getEng(),list.get(count).getMath()
					,list.get(count).getTotal(),list.get(count).getAvg(),list.get(count).getRank());
			System.out.printf("%d번째 학생이 저장되었습니다.",count+1);
			
		}
		
	}
	
	
	// list 파일 출력
	void listPrint() {
		System.out.println("                                   [ 학생성적출력 ]");
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
			
		}
		count = list.size();
		System.out.println("학생수? count: "+count);
		
	}
	
	// 학생 데이터 삭제
	void deleteStu() { 
		System.out.println("                                   [ 학생성적삭제 ]");
		System.out.println("삭제할 학생 이름 입력 >> ");
		System.out.println("----------------------------------------------------------------");
		String search = scan.next(); // 입력한 학생 이름
		
		// name 배열
		temp = 0;
		int searchNo = 0;
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(search.equals(s.getName())) {
				searchNo = i; // 위치값
				temp = 1;
			}
		}
		if(temp==0) {
			System.out.println("입력한 학생을 찾지 못했습니다.");
		} else {
			System.out.printf("%s 학생을 찾았습니다. 삭제하시겠습니까?",search);
			System.out.println("1.삭제, 0.취소");
			System.out.println("원하는 번호를 입력하세요. >> ");
			System.out.println("--------------------------------------");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				list.remove(searchNo);
				System.out.printf("%s 학생의 데이터를 삭제했습니다.\n",search);
				break;
			case 0:
				System.out.println("삭제를 취소했습니다.");
				break;
			
			}
		}
	
	}
	
	
	// 파일 저장
	void saveFile() {
		System.out.println("[ 학생성적리스트 파일 저장 ]");
		try {
			FileWriter fw = new FileWriter("c:/save2/newStu.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0;i<list.size();i++) {
				Stu s = list.get(i); // Stu 객체 1개 가져오기
				String str = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n",
						s.getNo(),s.getName(),s.getKor(),s.getEng(),
						s.getMath(),s.getTotal(),s.getAvg(),
						s.getRank());
				bw.write(str);
			}
			bw.close();
			fw.close();
		} catch (Exception e) {e.printStackTrace();}
	System.out.println("파일 저장 완료!");	
	}
}
