package exercises.Core.assignment_6_nestedForLoop_level_extraSpicy;

/**
 * @author esalkan
 */
public class Question_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Write a Java program to print the following pattern

		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5
		// 1 2 3 4 5 6
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 7; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
