package _interface;

public class ExaminationMain {

}

//
//[문제] 사지선다형으로 입력된 답안지를 채점하는 프로그램을 작성하시오
//- 총 문제수는 5문제이다
//- 이름과 5개의 답을 입력하여 OX로 채점하시오
//- 점수는 1문제당 20점이다.
//
//클래스    : ExaminationDTO.java 

//필드      : String name
//           String dap
//           char[] ox ---------------함정부분
//           score
//           public static final String JUNG = "11111"; - 정답
//메소드    : 생성자, compare(),  setter / getter
//           compare() - 비교


//인터페이스 : ExaminationService.java
//추상메소드 : 
//           insertArticle()
//			 printAriticle()

//클래스 ExaminationServiceImpl.java




//[실행결과]
//인원수 입력 : 3  --------XXXXXXXXXXXXXXXXXXXXXXXXXXx

//*menu() 함수. ArrayList 하기

//
//이름 입력 : 홍길동
//답 입력 : 14123
//
//이름 입력 : 코난
//답 입력 : 11111
//
//이름 입력 : 또치
//답 입력 : 13242
//
//이름      1 2 3 4 5   점수
//홍길동   O X O X X   40
//코난      O O O O O   100
//또치      O X X X X   20