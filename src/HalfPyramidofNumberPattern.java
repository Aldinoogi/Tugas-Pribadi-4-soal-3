
public class HalfPyramidofNumberPattern {
	public static void main (String[]args) {
		int row;
		int max_row = 5 ;
		int number;

		for (row = 1; row <= max_row; row++) {
			for (number = 1; number<=row; number++) {
				System.out.print (number+" ");
			}

			System.out.println();
		}
	}
}