package array_1;

public class ArrayTest {
	public static void main(String[] args) {
		
		/*
		 자료형 [] 배열명 = new 자료형 [개수];
		int [] arr = new int[5];
		int [] arr = { 1,2,3,4,5};
		int [] arr = new int[]{1,2,3,4,5};
		 */
		
		int[] arr; //배열명
		arr = new int[5];
		System.out.println("배열명 : "+arr);
		
		arr[0] = 25;
		arr[1] = 34;
		arr[2] = 31;
		arr[3] = 64;
		arr[4] = 14;
		
		System.out.println("배열 크기 = "+arr.length);
		
		
		for(int i=0; i<arr.length; i++){
			System.out.printf("arr[%d]=%d",i,arr[i]);
			System.out.println();
		}
		System.out.println();
		
		
		//거꾸로 출력
		System.out.printf("거꾸로출력%n");
		for(int i=arr.length-1; i>=0; i--){
			System.out.printf("arr[%d]=%d",i,arr[i]);
			System.out.println();
		}
		System.out.println();
		
		//짝수데이터 출력
		System.out.printf("짝수데이터%n");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0)
				System.out.printf("arr[%d]=%d%n",i,arr[i]);
		}
		System.out.println();
		
		//확장 for문  향상된 for문
		System.out.println("확장for문");//출력할때 주로 사용한다.
		for(int data : arr) //데이터가 있을때 출력한다.
			System.out.println(data);
		
		
		
	}
}
