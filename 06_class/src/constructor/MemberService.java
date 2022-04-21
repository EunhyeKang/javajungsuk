package constructor;

import java.util.Scanner;

public class MemberService {
	
	private MemberDTO[] ar = new MemberDTO[5];
	Scanner scan = new Scanner(System.in);
	int count;
	
	public void menu() {
		int num=0;
		
		while(true) {
			System.out.println();
			System.out.println("*********************");
			System.out.println("  1. 가입");
			System.out.println("  2. 출력");
			System.out.println("  3. 수정");
			System.out.println("  4. 탈퇴");
			System.out.println("  5. 끝내기");
			System.out.println("*********************");
			System.out.print("   번호 선택 : ");
			num = scan.nextInt();
			System.out.println();
			
			if(num == 1) insertMember();
			if(num == 2) list();
			if(num == 3) updateMember();
			if(num == 4) deleteMember();
			if(num == 5) break;
		}//while
		System.out.println("프로그램을 종료합니다.");
	}//menu()
	
	public void insertMember() {
		
		String name;
		int age;
		String phone;
		String address;
		
		
		if(count==5) {
			System.out.println("정원초과");
		}
		
		for(int i=0; i<ar.length; i++) {//빈목록인지
			
			if(ar[i]==null) {
	
				ar[i] = new MemberDTO();
				
				System.out.print("이름입력 : ");
				name = scan.next();
				System.out.print("나이입력 : ");
				age = scan.nextInt();
				System.out.print("핸드폰입력 : ");
				phone = scan.next();
				System.out.print("주소입력 : ");
				address = scan.next();
				
				ar[i] = new MemberDTO(name,age,phone,address);
				
				count++;
				System.out.printf("등록 완료 %d자리 남았습니다.", ar.length-count);
				break;
			}
			
		}//for
		
		
	}
	
	public void list() {
		
		System.out.println("이름\t나이\t핸드폰\t주소");
		for(int i=0; i<ar.length; i++) {//빈목록인지
			if(ar[i]!=null) {
				System.out.printf("%s\t%d\t%s\t%s\t",ar[i].getName(),ar[i].getAge(),ar[i].getPhone(),ar[i].getAddress());		
				System.out.println();
			}
		}		
	}
	
	public void updateMember() { //수정할땐 setter
		String phNum="";
		//전화번호로비교
		
		System.out.print("핸드폰번호? : ");
		phNum = scan.next();
		for(int i=0; i<ar.length; i++) {
			if(ar[i]!=null)
				if(ar[i].getPhone().equals(phNum)) {

					System.out.print("수정할 이름입력 : ");
					ar[i].setName(scan.next());
					System.out.print("수정할 나이입력 : ");
					ar[i].setAge(scan.nextInt());
					System.out.print("수정할 핸드폰입력 : ");
					ar[i].setPhone(scan.next());
					System.out.print("수정할 주소입력 : ");
					ar[i].setAddress(scan.next());
					count++;
					System.out.println("수정 완료");
				}//if equals
		}//for i
		
	}
	
	public void deleteMember() {
		String phNum="";
		//전화번호로비교
		
		System.out.print("핸드폰번호? : ");
		phNum = scan.next();
		for(int i=0; i<ar.length; i++) {
			if(ar[i]!=null)
				if(ar[i].getPhone().equals(phNum)) {
					ar[i] = null;
					count--;
					System.out.println("삭제 완료");
				}//if equals
		}//for i
		
	}
	
	
}





/*
[문제] 회원관리 프로그램
클럽의 회원관리 프로그램 작성하려고 한다.
여기는 코로나로 인한 폐쇄적인 모임으로 회원은 총 5명으로 한다. (객체배열)
회원의 정보는 이름(name), 나이(age), 핸드폰(콜), 주소(address)로 설정한다.
회원 가입, 출력, 수정, 탈퇴 프로그램을 작성하시오.

menu()
*************
   1. 가입
   2. 출력
   3. 수정
   4. 탈퇴
   5. 끝내기
*************
  번호 : 
  
  
1번 가입을 눌렀을 때 처리 - insertMember()
이름 입력 : 
나이 입력 :    
핸드폰 입력 : 
주소 입력 : 

등록 완료..4자리 남았습니다
-----------
만약에 5명이 다 차면 "정원 초과"라고 메세지 띄운다.  


2번 출력을 눌렀을 때 처리 - list()
→ 총 5명중에서 등록된 회원만 보여준다

이름      나이      핸드폰      주소


3번 수정을 눌렀을 때 처리 - updateMember()
→ 회원이 없을 때
핸드폰 번호 입력 : 010-123-1234
찾고자 하는 회원이 없습니다

-------------------------------
→ 회원이 있을 때
핸드폰 번호 입력 : 010-123-1234

이름      나이      핸드폰         주소
홍길동   25      010-123-1234   서울

수정 할 이름 입력 : 
수정 할 나이 입력 :    
수정 할 핸드폰 입력 : 
수정 할 주소 입력 :

수정 완료


4번 삭제를 눌렀을 때 처리 - deleteMember()
→ 회원이 없을 때
핸드폰 번호 입력 : 010-123-1234
찾고자 하는 회원이 없습니다

-------------------------------
→ 회원이 있을 때
핸드폰 번호 입력 : 010-123-1234

삭제 완료
*/
