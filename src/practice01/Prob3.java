package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner( System.in  );

		while( true ) {
			System.out.print( "수를 입력하시오 : " );
			int number = scanner.nextInt();

			int sum = 0;
			for( int i = 1; i <= number; i++ ) {
				if( ( number % 2 == 0  && i % 2 == 0)  ||
					( number % 2 != 0   && i % 2 != 0 ) ) {
					sum += i;
				}
			}
			
			System.out.println( "결과값 : " + sum );
		}
	}
}