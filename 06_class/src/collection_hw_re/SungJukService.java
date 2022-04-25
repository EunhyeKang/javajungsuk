package collection_hw_re;

import java.util.ArrayList; //java.util
import java.util.Iterator;
import java.util.Scanner;


public class SungJukService {
	private ArrayList<SungJukDTO> list; //이 문장을 고치지 마세요.
	Scanner scan = new Scanner(System.in);
	
	
	public SungJukService() {//**************************************************
		list = new ArrayList<SungJukDTO>();
	} // 클래스 생성과 동시에 list도 만들어주기.
	
	
	public void menu() {
		while(true) {
			
			int num;
			
			System.out.println();
			System.out.println("*********************");
			System.out.println("  1. 입력");
			System.out.println("  2. 출력");
			System.out.println("  3. 검색");
			System.out.println("  4. 삭제");
			
			System.out.println("  6. 끝");
			System.out.println("*********************");
			System.out.print("   번호 선택 : ");
			
			num=scan.nextInt();
			
			if(num<1||num>6) { System.out.println("다시 입력하세요(1~6)"); continue; }
			if(num == 1) insertArticle();
			if(num == 2) printArticle();
			if(num == 3) searchArticle();
			if(num == 4) deleteArticle();

			if(num == 6) break;
		}
	}

	
	public void insertArticle() {
		
		int no;
		String name;
		int kor;
		int eng;
		int math;
	
	
		System.out.print("번호 입력 : ");
		no = scan.nextInt();
		
//			for(int i=0; i<list.size(); i++) {
//				System.out.println(list.get(i).getNo());
//				if(no == list.get(i).getNo()) {
//					System.out.println("중복된 번호입니다.");
//				}
//			}
		
		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("국어 입력 : ");
		kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		math = scan.nextInt();
		
//		list.add(new SungJukDTO(no,name,kor,eng,math));
		SungJukDTO dto = new SungJukDTO(no, name, kor, eng, math);
		dto.calc();
		list.add(dto); //보관 (주소를보관)
//		System.out.println("insertArticle() list = "+dto);
		
		
	}
	
	public void printArticle() {

		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		
//		for(int i=0; i<list.size(); i++) {
//			
//			System.out.println(list.get(i).getNo()+"\t"+
//								list.get(i).getName()+"\t"+
//								list.get(i).getKor()+"\t"+
//								list.get(i).getEng()+"\t"+
//								list.get(i).getMath()+"\t"+
//								list.get(i).getTot()+"\t"+
//								list.get(i).getAvg());
//		}
		
		
		
//		for(SungJukDTO dto : list) {
//			System.out.println(dto);
//			
//			System.out.println(dto.getNo()+"\t"+
//					dto.getName()+"\t"+
//					dto.getKor()+"\t"+
//					dto.getEng()+"\t"+
//					dto.getMath()+"\t"+
//					dto.getTot()+"\t"+
//					dto.getAvg());
//		}
//		
//		System.out.println();
		
		
		
		for(SungJukDTO dto : list) { //toString이용해서
			System.out.println(dto); //주소찍어랑
		
		}
		
	}
	
	
	public void searchArticle() {
		
		System.out.print("검색할 이름 입력 : ");
		String name = scan.next();
		int sw = 0;

		
		for(SungJukDTO dto : list) {
			if(dto.getName().equals(name)) {
				if(sw == 0) System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(dto);
				sw = 1;
			}
		}//for
		
		if(sw == 0) System.out.println("찾고자 하는 이름이 없습니다.");
	}

	
	public void deleteArticle() {

		System.out.print("삭제할 이름 입력 : ");
		String name = scan.next();
		
		int count = 0;
		
		Iterator<SungJukDTO> it = list.iterator(); // java.util
		while(it.hasNext()) { //항목이 있으면 true, 없으면 false;
			SungJukDTO dto = it.next();// it가 가리키는 곳의 항목을 꺼내서 보관하고 it는 다음으로 이동한다.
										//Iterator는 일회용이다
			
			if(dto.getName().equals(name)) {
				it.remove(); //it가 가리키는 곳의 항목을 지우는게 아니라
							// 아까 꺼내놓은 dto를 지운다.
				//가리킨상태에서 항목이있으면 데이터를 꺼내놓고 자기는 다음위치로 이동한다.
				//지울땐 이미 움직인 다음 위치에 서 지우는게 아니라 그 전에 있는걸 지운다.
			count ++;
			}//if
		}//while
		
		if(count == 0) {
			System.out.println("삭제하고자 하는 이름이 없습니다.");
			
		}
		else {
			System.out.println("데이터를 "+count+"건 삭제하였습니다.");
		}
		
		
		
		
		//////이렇게하면 찌꺼기가 남게 된다. 
		//인덱스0을 삭제시키면 나머지것들의 인덱스가 다시 0 으로 세팅된다.
//		for(int i=0; i<list.size();i++) {
//			if(name.equals(list.get(i).getName())) {
//				list.remove(i);
//				if(i == list.size())System.out.println("데이터를 삭제하였습니다.");
//			}//if
//		}// for
//		
//		System.out.println("데이터를 삭제하였습니다.");
		
		
		
//		//리스트의 크기가 바뀌니까 바로 에러나버린다.
//		for(SungJukDTO dto : list) {
//			if(dto.getName().equals(name)) {
//				list.remove(dto); // list안의 항목을 제거.
//			}
//		}//for
		
		
	
	
	
	
	
	
	}	
	
}

	