package methods;

import java.util.*;
import java.util.Map.Entry;

public class PM {

	public static void main(String[] args) {

	//	int[] arr = { 1, 4, 4, 4, 5, 3, 1, 1, 1, 1 };

		// System.out.println(Arrays.toString(breakingRecords(arr)));

		// System.out.println(migratoryBirds(arr));

		List<Integer> bill = new ArrayList<Integer>();
		bill.add(3);
		bill.add(10);
		bill.add(2);
		bill.add(9);

		// bonAppetit(bill, 1, 7);

		// System.out.println(pageCount(6, 2));

//		System.out.println("isBalanced : " + balencingParentheses("())"));

//		System.out.println(minimumNumber(11, "goxg"));

//		int[] arr1 = {3,1};
//		int[] arr2 = {5,2,8};
//
//		System.out.println(getMoneySpent(arr1, arr2, 10));
		
		
//		int[] arr = {4,2,3};
//		System.out.println(checkPossibility(arr));
		int[] arr = {2,3,4};
		System.out.println(Arrays.toString(twoSum(arr, 5)));
	}
	
	
	
	
	
	
	
	
	 public static int[] twoSum(int[] numbers, int target) {
	     
		 int[] result = new int[2];
		 int j = 1;
		 
		 Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		 
		 for(int i : numbers) {
			 
			 if(!map.containsKey(target - i)) {
				 map.put(i, j++);
			 }else {
				 result[1] = j;
				 result[0] = map.get(target-i);
			 }
		 }
		 
		 return result;
	    }
	 
	 
	  public static boolean checkPossibility(int[] nums) {
	        int count = 1;
	        
	        for(int i = 0; i < nums.length-1; i++){
	            
	            if(nums[i] <= nums[i+1]){
	                count++;
	            }else{
	                if(nums[i] > nums[i+1] && i == 0){
	                    nums[i] = 1;
	                    
	                    if(nums[i] < nums[i+1]){
	                        count++;
	                    }
	                }
	            }
	        }
	        if(count == nums.length){
	            return true;
	        }else{
	            return false;
	        }
	    }

	 static int getMoneySpent(int[] keyboards, int[] drives, int b) {
	        int maxamount = -1;


	        for (int i = 0; i < keyboards.length; i++) {

	            for (int j = 0; j < drives.length; j++) {

	            		int bill = keyboards[i]+drives[j];
	            	
	                    if (keyboards[i]+drives[j] <= b) {

	                        maxamount = Math.max(maxamount, keyboards[i]+drives[j]);

	                }
	            }
	        }
	        return maxamount;
	    }

	static int minimumNumber(int n, String password) {
		int count = 0;

		if (!password.matches(".*[a-z].*")) {
			count++;
		}

		if (!password.matches(".*[A-Z].*")) {
			count++;
		}

		if (!password.matches(".*[0-9].*")) {
			count++;
		}

		if (password.matches("[a-zA-Z0-9]*")) {
			count++;
		}

		int lengthDifference = 6 - password.length();

		if (lengthDifference > 0 && count <= lengthDifference) {
			return lengthDifference;
		}

		return count;

	}

	public static int balencingParentheses(String text) {

		int openBrac = 0;
		int endBrac = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '(') {
				openBrac++;
			} else {
				endBrac++;
			}

		}
		if (endBrac >= openBrac) {
			return endBrac - openBrac;
		} else {
			return openBrac - endBrac;
		}

	}

	static int pageCount(int n, int p) {

		int leftCount = p / 2;
		int rightCount = n / 2 - p / 2;

		return Math.min(leftCount, rightCount);
	}

//	 static int pageCount(int n, int p) {
//	      
//         int count = 0;
//         int lowcount = 0;
//         for(int i = 1; i <= n; i=i+p){
//             
//             if(i == (p+1) || i == (p-1)){
//                 count++;
//                 break;
//             }else if()
//             
//         }
//           return Math.min(count , lowcount);
//   }

	static void bonAppetit(List<Integer> bill, int k, int b) {

		int anna = 0;
		int haveToPay = 0;

		for (int i = 0; i < bill.size(); i++) {

			if (bill.get(i) != bill.get(k)) {
				anna += bill.get(i);
			}
		}
		anna = anna / 2;
		if (b != anna) {
			haveToPay = b - anna;
			System.out.println(haveToPay);
		} else {
			System.out.println("Bon Appetit");
		}
	}

	static int migratoryBirds(int[] arr) {

		Map<Integer, Integer> map = new TreeMap<>();
		int result = 0;
		int curMin = 0;

		for (int i : arr) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}

		for (Entry<Integer, Integer> m : map.entrySet()) {
			if (curMin < m.getValue()) {
				curMin = m.getValue();
				result = m.getKey();
			}
		}
		return result;
	}

	public static int[] breakingRecords(int[] scores) {
		int[] result = new int[2];
		int highRecord = scores[0];
		int lowRecord = scores[0];

		int highCount = 0;
		int lowCount = 0;

		for (int i = 1; i < scores.length; i++) {

			if (highRecord < scores[i]) {

				highRecord = scores[i];

				highCount++;
			} else if (lowRecord > scores[i]) {

				lowRecord = scores[i];

				lowCount++;
			}

		}
		result[0] = highCount;
		result[1] = lowCount;
		return result;
	}

	public static List<Integer> gradingStudents(List<Integer> grades) {

		List<Integer> result = new ArrayList<Integer>();

		int round = 0;

		for (int i = 0; i < grades.size(); i++) {

			round = grades.get(i);

			if (round <= 37) {
				result.add(grades.get(i));
				continue;
			}

			while (round % 5 != 0 & round > 37) {

				round++;

			}

			if (round - grades.get(i) < 3) {
				result.add(round);
			} else {
				result.add(grades.get(i));
			}
		}

		return result;

	}

	public static int minDis(int[] arr) {
		Arrays.sort(arr);
		int min = arr[1] - arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (min > arr[i + 1] - arr[i]) {
				min = arr[i + 1] - arr[i];
			}
		}
		return min;
	}

	// String [] wordArray = text.replaceAll("[^a-zA-Z]"," ").split(" ");

	public static int getPatter(String pattern, String s) {
		int len = pattern.length() - 1;

		String vowel = "aeiou";
		int count = 0;

		for (int i = 0; i < s.length(); i = i + len) {

			int start = i;
			int end = i + len;

			while (vowel.contains(String.valueOf(s.charAt(start))) && vowel.contains(String.valueOf(s.charAt(end)))) {
				count++;
				start++;
				end--;
			}
		}
		return count;
	}

	static int binaryPatternMatching(String pattern, String s) {

		int len = pattern.length();
		String vowel = "aeiou";
		int match = 0;

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			String sub = s.substring(i, len);
			int subLen = sub.length();
			while (subLen != 0) {

				if (sub.contains(vowel)) {

					count++;

					if (count > 1) {
						match = count;
					}
				}
				subLen--;
			}
			len = len + i + 1;
		}

		return match;

	}

	public static void getResult(int n) {

		int sum = 0;
		int a = 0, b = 1, c = 0;

		for (int i = 2; i <= n; i++) {

			c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}

	}

	static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	public static boolean isPali(String text) {

		char[] arr = text.toCharArray();

		Stack<Character> stc = new Stack<Character>();

		for (int i = 0; i < arr.length; i++) {

			stc.push(arr[i]);
		}

		String str = "";

		while (!stc.isEmpty()) {
			str += stc.pop();
		}

		if (str.equalsIgnoreCase(text)) {
			return true;
		} else {
			return false;
		}
	}

}
