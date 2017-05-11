package sum;

/*
 * Bijon Mathew
 * 6 May 2017
 */

public class IsOneOrSum {

	public static boolean isOneOrSum(int a, int b) {

		if (a == 10 || b == 10) {
			return true;

		} else if ((a + b) == 10) {
			return true;

		} else {
			return false;
		}
	}

	// Test 1
	public static void main(String[] args) {
		{

			int a = 9;
			int b = 10;
			boolean c = IsOneOrSum.isOneOrSum(a, b);

			if (c == true) {
				System.out.println("Test Passes");

			} else {
				System.out.println("Test failed ");
			}
		}
		{
			// Test 2
			int a = 9;
			int b = 9;
			boolean c = IsOneOrSum.isOneOrSum(a, b);

			if (c == false) {
				System.out.println("Test Passes");

			} else {
				System.out.println("Test failed ");
			}
		}
		{
			// Test 3
			int a = 9;
			int b = 1;
			boolean c = IsOneOrSum.isOneOrSum(a, b);

			if (c == true) {
				System.out.println("Test Passes");

			} else {
				System.out.println("Test failed ");
			}

		}

	}
}
