import java.util.*;

public class binarySearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int data = sc.nextInt();

		int i = 0;
		int j = arr.length - 1;

		while (i <= j) {
			int mid = (i + j) / 2;
			
			if (data < arr[mid]) {
				j = mid - 1;
			} else if (data > arr[mid]) {
				i = mid + 1;
			} else {
				System.out.println(mid);
				break;
			}
		}
		System.out.println(-1);
	}
}
