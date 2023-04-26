package StringQuestions;

public class MaximumRepeatedCharacter {
	public static void main(String[] args) {
		String s = "abbc";
		int count=0;
		int arr[] = new int[127];
		int max = -1;
		char c = ' ';
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)] = arr[s.charAt(i)] + 1;

		}

		for (int i = 0; i < s.length(); i++) {
			if (max < arr[s.charAt(i)]) {
				max = arr[s.charAt(i)];
				c = s.charAt(i);
				count++;

			}

		} 
		System.out.println(c+""+count);

	}

}
