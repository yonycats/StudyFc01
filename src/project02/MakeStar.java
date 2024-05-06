package project02;

public class MakeStar {
	public static void main(String[] args) {
		
		/* 1. 5층짜리 별 만들기
		 * 왼쪽 정렬
		 * 1씩 증가
		 * while 반복문 활용
		 */
		int size1 = 5;
		int floor1 = 1;
		
		while (floor1 <= size1) {
			
			for (int i=0; i<floor1; i++) {
				System.out.print("*");
			}
			System.out.println();
			floor1++;
		}
		
		System.out.println();
		/* 2. 5층짜리 별 만들기
		 * 중앙 정렬
		 * 2씩 증가
		 * for 반복문 활용
		 */
		int size2 = 5;
		int floor2 = 1;
		
		for (int i=floor2; i<=size2; i++) {
			for (int j=size2-i; j>0; j--) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		/* 2. 5층짜리 별 만들기
		 * 오른쪽 정렬
		 * 1씩 증가
		 * for 반복문 활용
		 */
		
		int floor3 = 5;
		
		for (int i=1; i<=floor3; i++) {
			for (int j=floor3-i; j>0; j--) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i*2-1; k+=2) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
