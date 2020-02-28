package basicWebAppInMaven.maven;

public class App {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 4, 7, 8, 9, 0, 6 };
		String res = formatPhoneNumber(arr);
		System.out.println("res  :" + res);
	}

	public static String formatPhoneNumber(int[] nums) {
		int[] arr = nums;
		if (arr.length != 10) {
			return "false";
		} else {
			String final_result = null;
			String result = "(";
			for (int i = 0; i < arr.length; i++) {

				if (i < 3) {
					result = result + arr[i];
					// System.out.println("result :"+result);
				} else if (i == 3) {
					result = result + ") ";
					final_result = result + arr[i];
					// System.out.println("final_result 1 :"+final_result);
				}

				else if (i < 6) {

					final_result = final_result + arr[i];

					System.out.println("final_result  :" + final_result);

				} else if (i == 6) {
					final_result = final_result + "-";
					final_result = final_result + arr[i];
					// System.out.println("final_result 1 :"+final_result);
				} else {
					final_result = final_result + arr[i];
					// System.out.println("final_result :"+final_result);
					
				}
				
			}
			String s = "abc";
			String sb = new String("abc");

			System.out.println(" check  :" + (s == sb));
			System.out.println("equals :"+s.equals(sb));
//return final_result;
			return String.format("(%d%d%d) %d%d%d-%d%d%d%d", nums[0], nums[1], nums[2], nums[3], nums[4], nums[5],
					nums[6], nums[7], nums[8], nums[9]);
		}
	}

}
