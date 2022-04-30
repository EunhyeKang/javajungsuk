package exception;

public class MakeException extends Exception{ //개발자가 만든 Exception 클래스
	private String errorMsg;
	
	public MakeException() { //기본생성자

	}

	public MakeException(String errorMsg) { //메세지를 받는 생성자
		super();
		this.errorMsg = errorMsg;
	}

	@Override
		public String toString() {
			return super.toString();   //에러메세지를 리턴시켜서 보내주면 된다.
		}
	
}


//MakeException is a Exception

//괄호안에 메세지가 ㄷ르어올때도 있고 안들어올때도 있으니까
// 