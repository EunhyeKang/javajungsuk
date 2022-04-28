package _interface;

public class ExaminationDTO {
	private String name;
	private String dap;
	private char[] ox;//---------------함정부분  // private char[] ox = new char[5];바로 선언 or 생성자에서 
	private int score;
	public static final String JUNG = "11111"; //-정답

	
	public ExaminationDTO() {
		ox = new char[5];
	}
	
	public void compare() {
		//   compare() - 비교
		for(int i=0; i<ox.length; i++) {
			
			if(dap.charAt(i) == JUNG.charAt(i)) {
				ox[i] = 'O';
				score +=20;
			}
			else {
				ox[i] = 'X';
			}
		}
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDap() {
		return dap;
	}

	public void setDap(String dap) {
		this.dap = dap;
	}

	public char[] getOx() {
		return ox;
	}

	public void setOx(char[] ox) {
		this.ox = ox;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public static String getJung() {
		return JUNG;
	}
	

	
}
