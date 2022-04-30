package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain  {
	public static void main(String[] args) throws IOException {// 오버라이드된곳은 try catch 안먹힘 ??
		
		if(args.length >=1 ) //유효성검사
		System.out.println("args[0] = " + args[0]); //데이터없이 찍어서 에러. 
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			System.out.print("정수 입력 : ");
//			int data = br.read(); // 1개 문자
			
			int a = Integer.parseInt(br.readLine());   //여기서 문자들어가면 에러뜸 실행시 에러임. trycatch다 필요없음
														// 논리적으로 막자.
			
			
			
			
			System.out.print("정수 입력 : ");
			int b = Integer.parseInt(br.readLine());   
			
			System.out.println(a + "/" +b +"=" + a/b);
			
			
			
		}catch(IOException e) {
			e.printStackTrace(); //에러메세지 출력해주세요.
		}catch(NumberFormatException e) {
			System.out.println("숫자 형식만 입력하세요. !!");
		}catch(ArithmeticException e) {  //에러를 막은건 아니고 메세지만 사용자친화적으로 출력해준것임.
			System.out.println("0으로 나눌수없습니다.");
		}finally { // 무조건수행하세요. 
			System.out.println("error가 있건 없건 무조건 실행!!");
		}
		
		
		
		
		
		
		
	}
}


//실행에러는 개발자잘못
//컴파일 에러는 처리해줘야함


//실행시 에러는 로직으로 막아버려야한다.