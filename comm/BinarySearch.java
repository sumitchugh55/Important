package comm;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int search = 90;
		int li = 0;
		int hi = arr.length - 1;
		int mid = (li + hi) / 2;
		while (li <= hi) {
			if (arr[mid] == search) {
				System.out.println("the element found at index" + mid);
				break;
			} 
			else if (arr[mid] < search) {
				li = mid + 1;
			} 
			else {
				hi = mid - 1;} 
			mid = (li + hi) / 2;
		}

		if (li > hi) {
			System.out.println("Element not found");
		}
	}

}
