
public class Main {

	public static void main(String[] args) {
		int[][] array3to2 = { { 1, 2, 3 }, { 4, 5, 6 } };
		ArrayOperations.printCorners(array3to2);

		int[][] array3to1 = { { 1, 2, 3 } };
		ArrayOperations.printCorners(array3to1);
	}
}

class ArrayOperations {
	public static void printCorners(int[][] arr) {
		final int lastPositionOfFirstRow = arr[0].length - 1;
		final int lastRowPosition = arr.length - 1;
		final int lastPositionOfLastRow = arr[lastRowPosition].length - 1;

		System.out.printf("%d %d\n%d %d", arr[0][0], arr[0][lastPositionOfFirstRow],
				arr[lastRowPosition][0], arr[lastRowPosition][lastPositionOfLastRow]);
	}
}
