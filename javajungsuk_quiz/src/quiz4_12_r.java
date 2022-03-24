
public class quiz4_12_r {
	public static void main(String[] args) {
		for (int i = 2; i <= 8; i += 3) {
			for (int j = 1; j <= 3; j++) {
				System.out.printf("%d*%d=%d \t", i, j, i * j);
				System.out.printf("%d*%d=%d \t", i + 1, j, (i + 1) * j);

//			10단이 출력되지 않도록 조건식.. 10단이 출력 될 것 같으면 개행을, 10단 이전이라면 똑같이 출력
				if (i + 2 <= 9)
					System.out.printf("%d*%d=%d%n", i + 2, j, (i + 2) * j);
				else
					System.out.printf("%n");
			} // end of for
			System.out.println();
		}
	}
}
