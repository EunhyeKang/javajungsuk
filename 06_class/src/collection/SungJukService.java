package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> list; //이 문장을 고치지 마세요
	
//	list = new ArrayList<SungJukDTO>(); //필드에서는 일을 할 수 없다. 
	//선언만 가능하고 일은 메서드 안으로 들어가자~
	
	Scanner scan = new Scanner(System.in);
	
	
	public SungJukService() {
		list = new ArrayList<SungJukDTO>();
		// TODO Auto-generated constructor stub
	}
	
	void menu() {
		//menu()
		//*****************
		//   1. 입력
		//   2. 출력
		//   3. 검색
		//   4. 삭제
		//   6. 끝
		//*****************
		//   번호 : 8
		//1~6중에 선택하세요
		//	
		int num=0;
		
		
		while(true) {
			
			
			System.out.println();
			System.out.println("*********************");
			System.out.println("  1. 입력");
			System.out.println("  2. 출력");
			System.out.println("  3. 검색");
			System.out.println("  4. 삭제");
			System.out.println("  5. 끝");
			System.out.println("*********************");
			System.out.print("   번호 선택 : ");
			num = scan.nextInt();
			System.out.println();
			if(num<1||num>6) { System.out.println("다시 입력하세요(1~6)"); continue; }
			if(num == 1) insertArticle();
			if(num == 2) printArticle();
			if(num == 3) searchArticle();
			if(num == 4) deleteArticle();
			if(num == 5) break;
		
		}
			
			
	}
	
		void insertArticle(){
		//[1번인 경우] - insertArticle(), 생성자를 이용
		//번호 입력 :
		//이름 입력 :
		//국어 입력 :
		//영어 입력 :
		//수학 입력 :
		//
		//데이터를 저장하였습니다
		int no;
		String name;
		int kor;
		int eng;
		int math;
		int tot;
		double avg;
		
	
			
		System.out.print("번호 입력 : ");
		no = scan.nextInt();
		
//		for(int i=0; i<list.size(); i++) {
////			System.out.println(list.get(i).getNo());
//			if(no == list.get(i).getNo()) {
//				System.out.println("중복된 번호입니다.");
//			}
//		}
		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("국어 입력 : ");
		kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		math = scan.nextInt();
		
		list.add(new SungJukDTO(no,name,kor,eng,math));
	

	}
	
	
	void printArticle(){
		//[2번인 경우] - printArticle()
		//번호      이름      국어      영어      수학      총점      평균
		//15      홍길동   90      92      91      xxx      xx.xx
		//30      또치      85      92      100      xxx      xx.xx
		//
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
//			System.out.println(list.get(i).getNo()+"\t"+
//								list.get(i).getName()+"\t"+
//								list.get(i).getKor()+"\t"+
//								list.get(i).getEng()+"\t"+
//								list.get(i).getMath()+"\t"+
//								list.get(i).getTot()+"\t"+
//								list.get(i).getAvg());
//		
//		}
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO dto : list) {
			System.out.println(dto);
		}
		
	}
	
	void searchArticle() {
		//[3번인 경우] - searchArticle()
		//검색 할 이름 입력 : 코난
		//찾고자 하는 이름이 없습니다
		//
		//검색 할 이름 입력 : 홍길동
		//번호      이름      국어      영어      수학      총점      평균
		//15      홍길동   90      92      91      xxx      xx.xx
		//16      홍길동   89      45      78      xxx      xx.xx
		System.out.print("검색할 이름 입력 : ");
		String name = scan.next();
		
		
//		for(int i=0; i<list.size();i++) {
//			if(name.equals(list.get(i).getName())) {
//				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
//				System.out.println(list.get(i).getNo()+"\t"+
//									list.get(i).getName()+"\t"+
//									list.get(i).getKor()+"\t"+
//									list.get(i).getEng()+"\t"+
//									list.get(i).getMath()+"\t"+
//									list.get(i).getTot()+"\t"+
//									list.get(i).getAvg());
//			}// if	
//			else {
//				System.out.println("찾고자 하는 이름이 없습니다.");
//			}
//		}// for
		
		for(SungJukDTO dto : list) {
			if(dto.getName().equals(name)) {
				System.out.println(dto);
			}
			
			
		}
		
		
		
		
		
		
	}
	
	void deleteArticle() {
		//[4번인 경우] - deleteArticle() - 똑같은 이름이 있으면 모두 삭제
		//삭제 할 이름 입력 : 홍길동
		//
		//데이터를 삭제하였습니다
		System.out.print("삭제할 이름 입력 : ");
		String name = scan.next();
		
		
		Iterator<SungJukDTO> it = list.iterator();
		
		int count=0;
		while(it.hasNext()) {
			if(it.next().getName().equals(name)) {
				it.remove();
				count++;
			}
			
			
		}
		
		System.out.println("데이터를 "+count+"개 삭제하였습니다.");
	}
	
	
	
	
	
	
	
	
}

//
//
//[문제] 성적관리 프로그램
//1. 번호(no), 이름(name), 국어(kor), 영어(eng), 수학(math)점수를 입력하여 총점(tot)과 평균(avg)을 구하시오
//2. 평균은 소수이하 2째자리까지 출력
//   소수이하 자리값이 0이면 출력하지 않는다
//   ex) 92.000 → 92로 출력하시오
//3. 번호는 중복되지 않게 입력한다
//4. 이름은 중복되어도 된다 (똑같은 이름을 입력하세요)
//
//[실행결과]
//menu()
//*****************
//   1. 입력
//   2. 출력
//   3. 검색
//   4. 삭제
//   6. 끝
//*****************
//   번호 : 8
//1~6중에 선택하세요
//
//[1번인 경우] - insertArticle(), 생성자를 이용
//번호 입력 :
//이름 입력 :
//국어 입력 :
//영어 입력 :
//수학 입력 :
//
//데이터를 저장하였습니다
//
//[2번인 경우] - printArticle()
//번호      이름      국어      영어      수학      총점      평균
//15      홍길동   90      92      91      xxx      xx.xx
//30      또치      85      92      100      xxx      xx.xx
//
//[3번인 경우] - searchArticle()
//검색 할 이름 입력 : 코난
//찾고자 하는 이름이 없습니다
//
//검색 할 이름 입력 : 홍길동
//번호      이름      국어      영어      수학      총점      평균
//15      홍길동   90      92      91      xxx      xx.xx
//16      홍길동   89      45      78      xxx      xx.xx
//
//[4번인 경우] - deleteArticle() - 똑같은 이름이 있으면 모두 삭제
//삭제 할 이름 입력 : 홍길동
//
//데이터를 삭제하였습니다
