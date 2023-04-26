package array;

public class Kthlargest {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 6,4 };
		int k = 2;

		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {

				if (ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}

			}
			if (i == k - 1) {
				System.out.println("the" + k + "largest element is" + ar[i]);
				break;

			}
		}
			System.out.println("....");
			for(int i=0;i<ar.length;i++) {
				System.out.println(ar[i]);
			}

		}

	}


