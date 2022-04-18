package array_1;

public class ArrayTest2 {
	public static void main(String[] args) {
//		String [] strArr = new String[3];
//		String [] strArr2 = {"one","two","three"};
//		String [] strArr3 = new String[] {};
		
		for(String data : args)
			System.out.println(data);
		
		System.out.println();
		
		System.out.println("args[0]="+args[0]);
		System.out.println("args[1]="+args[1]);
		System.out.println("args[2]="+args[2]);
		System.out.println();
		
		
		for(int i=0; i<args.length; i++) {
			System.out.printf("args[%d]=%s%n",i,args[i]);
			System.out.printf("args[%d]의 문자열의 크기 = %d%n",i,args[i].length());
			System.out.printf("args[%d]의 첫번째문자 : %s%n",i,args[i].charAt(0));
			System.out.println();
		}
		System.out.println();
		
		System.out.println("단어마다 문자출력");
		for(int i=0; i<args.length; i++) {
			for(int j=0; j<args[i].length(); j++) {
				System.out.printf("args[%d] : %s", j, args[i].charAt(j));
				System.out.println();
			}
		System.out.println();
		}
		
		System.out.println();
		// 확장for
		for(String data : args) {
			System.out.println(data);
			System.out.println("문자열크기="+data.length());
			System.out.println("첫번째글자="+data.charAt(0));
			System.out.println();
		}
		System.out.println();
	}
}
