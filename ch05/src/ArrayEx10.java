import java.util.Arrays;

public class ArrayEx10 {
	public static void main(String[] args) {
		int[] num = new int[10];
		num = new int[]{1,3,4,4,2,1,3,8,4,3};
//		for (int i = 0; i < num.length; i++) {
//			num[i] = (int) (Math.random() * 10);
//			System.out.print(num[i] + " ");
//			System.out.printf("num[%d] = %d%n",i,num[i]);		
//		}
		System.out.println("정렬할 숫자"+Arrays.toString(num));
		
		
		int tmp = 0;

		for (int i = 0; i < num.length-1; i++) {
			boolean changed = false;
			for(int j=0; j<num.length-1-i; j++) {
				if (num[i] > num[j+1]) {
					tmp = num[i];
					num[i] = num[j+1];
					num[j+1] = tmp;
					changed = true;
				}
			}
			if(changed==true)
			System.out.println("정렬중"+Arrays.toString(num));
			
			
		}
		
	}
}
