package methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class PracticeMethods {

	public static void main(String[] args) {

		System.out.println("Return Duplicate String using nested for loop: " + getDuplicateString("aaaddca"));
		System.out.println("Ruterning duplicate value using Map: " + getDuplicate("aaddhg"));
		System.out.println("Returning duplicate value count using Set: " + getDuplicate("aaddhgg"));
		System.out.println(dupString("baaffghtt"));

		String text = "I am from Bangladesh";
		String[] arr = text.split(" ");
		System.out.println("Printing array:  " + Arrays.toString(arr));
		System.out.println("List of prime number: " + primeNumberList(36));
		System.out.println("Is Prime number: " + isPrime(11));
		System.out.println("getFactorNumList: " + getFactorNumList(4));
		System.out.println("primeFactors: " + primeFactors(10));

		System.out.println(getPrimeFactor(5));

		System.out.println("getLengthOfLastWord: " + getLengthOfLastWord("my name is john"));
		int[] numArray = { 1, 1, 2, 2, 8 };

		System.out.println(Arrays.toString(removeDuplicates(numArray)));

		int[] num = { 1, 2, 8, 5, 9, 2, 6, 1, 8 };
		System.out.println("removeDupFromSortArray: " + removeDupFromSortArray(num));

		int[] arre = { 2, 7, 11, 15 };
		System.out.println("twoSum: " + Arrays.toString(twoSum(arre, 26)));

		int[] arrar = { 2, 7, 11, 15 };
		System.out.println("getTwoSum: " + Arrays.toString(getTwoSum(arrar, 26)));

		int[] arry = { 2, 7, 11, 15 };
		System.out.println("getTargetedIndex: " + getTargetedIndex(arry, 15));

		System.out.println("getFabonacci: " + getFabonacci(10));

		System.out.println("getPalindrom: " + getPalindrom("mam"));
		int[] missingValueArray = { 1, 2, 3, 5, 6 };
		System.out.println("getOneMissingValue: " + getOneMissingValue(missingValueArray));

		int[] babulArray = { 2, 6, 4, 3, 1 };
		System.out.println(Arrays.toString(getBabbulSort(babulArray)));

		System.out.println("getFactorial2: " + getFactorial2(5));
		System.out.println("getArmstrongNumber: " + getArmstrongNumber(153));
		System.out.println("getPerfectNum: " + getPerfectNum(496));

		int[] nums = { 61, 68, 55, 50, 69, 100 };
		getMinDistance(nums);
		getMaxDistance(nums);

		int[] nums2 = { 1, 8, 9, 15, 24, 30 };
		System.out.println("Given number index is: " + getBainarySerch(nums2, 24));

		int[] arr1 = { 4, 9, 5 };
		int[] arr2 = { 9, 4, 9, 8, 4 };
		System.out.println("intersection : " + Arrays.toString(intersection(arr1, arr2)));
		System.out.println("reverseInt: " + reverseInt(12345));
		System.out.println("isNumPalindrome : " + isNumPalindrome(121));
		
		
		int [] arrM1 = {2, 4, 3, 1, 0 };
		int [] arrM2 = {1, 2, 6, 3, 4, 5 };
	//	System.out.println(missingNumberFromTwoArray(arrM1, arrM2));
		System.out.println("missingNumberFromTwoArray2: " + missingNumberFromTwoArray2(arrM1, arrM2));
	}
	
	
	
	/**
	 * Method: missingNumberFromTwoArray2
	 * Description: This method will help to find what are the missing values is array2 from array1
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public static List<Integer> missingNumberFromTwoArray2(int [] arr1, int[] arr2) {		
		List<Integer> missValue = new ArrayList<Integer>();	
		HashSet<Integer> set = new HashSet<Integer>();
		for(int a1 : arr1) {
			set.add(a1);
		}		
		for (int i : arr2) {			
			if(!set.contains(i)) {			
				missValue.add(i);
			}
		}
		
		// Those line of code required if i want to print value using array
		int [] value = new int [missValue.size()];		
		for(int i = 0; i < missValue.size(); i++) {			
			value[i] = missValue.get(i);				
		}
		System.out.println("Printing Missing value using Array: "+ Arrays.toString(value));
		
		return missValue;
	}
	
	
	public static int missingNumberFromTwoArray(int [] arr1, int [] arr2) {		
		int  missingValue = 0;
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < arr1.length; i++) {
			sum1 = sum1+ arr1[i];
		}
		for(int j = 0; j < arr2.length; j++) {
			sum2 = sum2+ arr2[j];
		}
		if (sum1 - sum2 >= 0 ) {
			missingValue = sum1 - sum2;
		}else if (sum1 - sum2 < 0) {
			
			missingValue = sum2 - sum1;
		}
		
		return missingValue;
	}
	
	/**
	 * Method name: getNumPalindrom
	 * 
	 * @param num
	 * @return
	 */

	public static boolean isNumPalindrome(int num) {
		boolean result = false;
		int input = num;
		int reminder = 0;
		int reverseNum = 0;
		while(num != 0) {
			reminder = num % 10;
			reverseNum = reverseNum * 10 + reminder;
			num = num/10;
		}
		
		if(input == reverseNum) {
			result = true;
		}
		
		return result;
	}
	
	
	/**
	 * Method Name: reverseInt
	 * Link: https://www.youtube.com/watch?v=xf9z_MszHJ0
	 * @param num
	 * @return
	 */
	
	public static int reverseInt(int num) {
		int reverse = 0;
		int reminder = 0;
		
		while(num != 0) {
			
			reminder = num%10;
			reverse = reverse * 10 + reminder;
			num = num/10;
			
		}
		
		
		return reverse;
	}
	
	
	/**
	 * Method name: intersection Description: This method will help to find common
	 * number between two array
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */

	public static int[] intersection(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<Integer>();
		for (Integer i : arr1) {
			set.add(i);
		}
		Set<Integer> intersection = new HashSet<Integer>();
		for (int i : arr2) {
			if (set.contains(i)) {
				intersection.add(i);
			}
		}
		int[] result = new int[intersection.size()];
		int index = 0;
		for (int i : intersection) {
			result[index++] = i;
		}

		return result;
	}

	/**
	 * Method Name: Binary search algorithm Link:
	 * https://www.youtube.com/watch?v=C2apEw9pgtw
	 * 
	 * @param arr
	 * @param input
	 * @return
	 */

	public static int getBainarySerch(int[] arr, int input) {
		int start = 0;
		int last = arr.length - 1;
		while (start <= last) {

			int middle = (start + last) / 2;
			if (input == arr[middle]) {

				return middle;
			} else if (input < arr[middle]) {
				last = middle - 1;
			} else if (input > arr[middle]) {
				start = middle + 1;
			}
		}
		return 0;
	}

	/**
	 * Method name: getMaxDistance method description: it will find maximum distance
	 * between two neumber
	 * 
	 * @param arr
	 * @return
	 */
	public static int getMaxDistance(int[] arr) {
		int maxDistance = 0;
		Arrays.sort(arr);
		int distance = arr[1] - arr[0];
		int index_1 = 0;
		int index_2 = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			if (distance < arr[i + 1] - arr[i]) {

				distance = arr[i + 1] - arr[i];
				index_1 = i;
				index_2 = i + 1;
			}

		}
		maxDistance = distance;
		System.out.println("Minimum number between two values is: " + maxDistance + " and the values is " + arr[index_1]
				+ " , " + arr[index_2]);

		return maxDistance;
	}

	// 50,58,60,67,68

	/**
	 * Method name: getDistance Method description: This method will find the
	 * distance between two closest number
	 * 
	 * @param arr
	 * @return
	 */

	public static int getMinDistance(int[] arr) {
		int distance = 0;
		Arrays.sort(arr);
		int index_1 = 0;
		int index_2 = 0;
		int minDistance = arr[1] - arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (minDistance > arr[i + 1] - arr[i]) { // here it will subtract from 2 index value with 1st index value
				minDistance = arr[i + 1] - arr[i];
				index_1 = i;
				index_2 = i + 1;
			}

		}
		distance = minDistance;
		System.out.println("Minimum number between two values is: " + distance + " and the values is " + arr[index_1]
				+ " , " + arr[index_2]);

		return distance;
	}

	/**
	 * Method name: getPerfectNum Link: https://www.youtube.com/watch?v=0p1QsPRJcAU
	 * {What is perfect number}
	 * 
	 * @param num
	 * @return
	 */

	public static boolean getPerfectNum(int num) {
		boolean result = false;

		int perfectNum = 0;

		for (int i = 1; i < num; i++) {

			if (num % i == 0) {
				perfectNum = perfectNum + i;
			}
		}

		if (perfectNum == num) {
			result = true;
		}

		return result;
	}

	/**
	 * Method name: getArmstrongNumber Link:
	 * https://www.youtube.com/watch?v=KkAiNXR42fk
	 */

	public static boolean getArmstrongNumber(int num) {

		boolean result = false;
		int temp = num;
		int reminder, sum = 0;
		while (num > 0) {
			reminder = num % 10;
			num = num / 10;
			sum = sum + reminder * reminder * reminder;
		}

		if (temp == sum) {
			result = true;
		}

		return result;
	}

	/**
	 * Method: getFactorialNum Factorial number means number(5) factorial num is
	 * (5*4*3*2*1 = 120) Link: https://www.youtube.com/watch?v=HWCWqZzHUtw
	 * 
	 * @param num
	 * @return
	 */

	public static int getFactorial2(int num) {
		int fact = 1;

		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}

		return fact;
	}

	public static int getFactorialNum(int num) {
		int factorialNumber = 1;

		for (int i = 1; i <= num; i++) {

			factorialNumber = factorialNumber * i;
		}

		return factorialNumber;
	}

	public static int[] getBabbulSort(int[] arr) {
		int[] babbulSort = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int num = arr[i];
					arr[i] = arr[j];
					arr[j] = num;
				}
			}
		}

		babbulSort = arr;

		return babbulSort;
	}

	/**
	 * Method name: getOneMissingValue youTube Link:
	 * https://www.youtube.com/watch?v=K5vUX8Sc_08
	 * 
	 * @param numArray
	 * @return
	 */
	public static int getOneMissingValue(int[] numArray) {

		int missingValue = 0;
		int expactedValue = numArray.length + 1;
		int totalSum = expactedValue * (expactedValue + 1) / 2; // It is a generic formula of total sum (total +
																// increment)

		int sum = 0;
		for (int i = 0; i < numArray.length; i++) {
			sum = sum + numArray[i];
		}

		missingValue = totalSum - sum;

		return missingValue;
	}



	/**
	 * Method name: getPalindrom Description: It will check string is same from both
	 * end
	 * 
	 * @param text
	 * @return
	 */

	public static boolean getPalindrom(String text) {
		boolean result = false;
		String str = "";
		for (int i = text.length() - 1; i >= 0; i = i - 1) {
			str = str + text.charAt(i);
			if (str.equalsIgnoreCase(text)) {

				return true;
			}
		}

		return result;
	}

	/**
	 * Method name: getFabonacci Link: https://www.youtube.com/watch?v=GEGqW2qS4Ew
	 * 
	 * @param num
	 * @return
	 */

	public static List<Integer> getFabonacci(int num) {

		List<Integer> febonacci = new ArrayList<Integer>();

		int a = 0;
		int b = 1;
		int c;

		for (int i = 0; i < num; i++) {

			c = a + b;

			a = b;

			b = c;

			febonacci.add(c);

		}

		return febonacci;
	}

	public static int getTargetedIndex(int[] arr, int target) {
		int num = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == target) {

				num = i;
			}
		}

		return num;
	}

	/**
	 * Method name: getTwoSum Method Description: Two Sum Problem Given an array of
	 * integers, return indices of the two number such that they add up to a
	 * specific target Link: https://www.youtube.com/watch?v=_0sLV_H9gIY
	 * 
	 * @param num
	 * @return
	 */

	public static int[] getTwoSum(int[] arr, int target) {
		int[] twoSum = new int[2];

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {

			if (!map.containsKey(target - arr[i])) {
				map.put(arr[i], i);
			} else {

				twoSum[1] = i;
				twoSum[0] = map.get(target - arr[i]);

			}
		}

		return twoSum;
	}

	/**
	 * Method name: twoSum Method Description: Two Sum Problem Given an array of
	 * integers, return indices of the two number such that they add up to a
	 * specific target
	 * 
	 * @param arr
	 * @param num
	 * @return
	 */
	public static int[] twoSum(int[] arr, int num) {
		int num1 = 0;
		int num2 = 0;

		int[] twoSum = new int[2];

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == num) {

					num1 = i;
					num2 = j;
				}
			}
		}
		twoSum[0] = num1;
		twoSum[1] = num2;

		return twoSum;
	}

	/**
	 * Method Name: removeDupFromSortArray Description: It will remove all duplicate
	 * elements from array
	 * 
	 * @param num
	 * @return
	 */

	public static Set<Integer> removeDupFromSortArray(int[] num) {

		Set<Integer> removeDupFromSortArray = new TreeSet<Integer>();

		for (int i = 0; i < num.length; i++) {

			removeDupFromSortArray.add(num[i]);
		}

		return removeDupFromSortArray;
	}

	// https://www.youtube.com/watch?v=wW5VKfsIMNw
	public static int[] removeDuplicates(int[] numArray) {
		int[] uniqueArray = new int[numArray.length];
		int j = 0;
		for (int i = 0; i < numArray.length - 1; i++) {
			if (numArray[i] != numArray[i + 1]) {
				uniqueArray[j] = numArray[i];
				j++;
			}
			uniqueArray[j] = numArray[numArray.length - 1];
		}
		return uniqueArray;
	}

	/**
	 * Method: getLengthOfLastWord Description: Find the length of last word
	 * 
	 * @param text
	 * @return
	 */
	public static int getLengthOfLastWord(String text) {

		int lastWordLangth = 0;
		String[] wordArray = text.split(" ");
		for (int i = wordArray.length - 1; i < wordArray.length; i++) {
			lastWordLangth = String.valueOf(wordArray[i]).length();
		}

		return lastWordLangth;
	}

	/**
	 * Method:getPrimeFactor What is prime factrization:
	 * https://www.khanacademy.org/math/pre-algebra/pre-algebra-factors-multiples/pre-algebra-prime-factorization-prealg/v/prime-factorization-exercise
	 * 
	 * @param number
	 * @return
	 */

	public static ArrayList<Integer> getPrimeFactor(int number) {
		ArrayList<Integer> primeFactor = new ArrayList<Integer>();

		for (int i = 2; i <= number; i++) {

			while (number % i == 0) {

				primeFactor.add(i); // here index will be added

				number /= i;
			}
		}

		return primeFactor;
	}

	public static List<Integer> primeFactors(int number) {
		int n = number;
		List<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		return factors;
	}

	/**
	 * Method : Get the factory of number from 1 to 100 What is factor : Factors are
	 * the numbers we multiply to get another number.factors of 14 are 2 and 7,
	 * because 2 × 7 = 14. Some numbers can be factored in more than one way.16 can
	 * be factored as 1 × 16, 2 × 8, or 4 × 4.
	 * 
	 * @param num
	 * @return
	 */
	public static ArrayList<Integer> getFactorNumList(int num) {
		ArrayList<Integer> factorList = new ArrayList<Integer>();

		for (int i = 1; i <= num; i++) {
			System.out.println("Factors of a number " + i + " are");
			for (int j = 1; j <= num; j++) {

				if (i % j == 0) {
					System.out.println(j);
					factorList.add(j);
				}
			}
		}

		return factorList;
	}

	/**
	 * method: Checking whether number is prime or not
	 */

	public static boolean isPrime(int num) {
		boolean result = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				result = false;
			} else {
				return result;
			}
		}

		return result;
	}

//	public static boolean isPrime(int num) {
//
//		for (int i = 2; i < num; i++) {
//			if (num % i == 0)
//				return false;
//		}
//		return true;
//
//	}

	/**
	 * Method : Find prime number till 100
	 * 
	 * @param text
	 * @return
	 * @return
	 */

	public static ArrayList<Integer> primeNumberList(int number) {
		ArrayList<Integer> primeNumber = new ArrayList<Integer>();
		for (int i = 2; i <= number; i++) {

			for (int j = 2; j <= number; j++) {

				if (i == j) {

					primeNumber.add(i);
				}

				if (i % j == 0) {
					break;
				}
			}
		}

		return primeNumber;
	}

//	public static void primeNumberList() {
//		int number = 10;
//
//		for (int i = 2; i <= number; i++) {
//
//			for (int j = 2; j <= number; j++) {
//				System.out.println("J Value: " + j);
//				if (j == i) {
//					System.out.println(i);
//
//				}
//				if (i % j == 0) {
//					break;
//				}
//
//			}
//
//		}
//
//	}

	public static String dupString(String text) {
		String duplicate = "";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] c = text.toCharArray();
		for (char character : c) {
			if (!map.containsKey(character)) {
				map.put(character, 1);
			} else {
				map.put(character, map.get(character) + 1);
			}

		}
		for (Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() > 1) {

				duplicate = duplicate + String.valueOf(m.getKey());
			}
		}

		return duplicate;
	}

	public static int getDuplicateString(String text) {
		int numCount = 0;

		String str = "";

		for (int i = 0; i < text.length(); i++) {
			for (int j = i + 1; j < text.length(); j++) {

				if (text.charAt(i) == text.charAt(j)) {
					String value = String.valueOf(text.charAt(i));

					if (!str.contains(value)) {
						str = str + text.charAt(i);
					}

					numCount = str.length();
				}
			}
		}

		return numCount;
	}

	/**
	 * Method Name: getDuplicate This will return duplicate value from a string
	 * using map
	 * 
	 * @param text
	 * @return
	 */

	public static String getDuplicate(String text) {

		String value = "";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] charArray = text.toCharArray();
		for (char c : charArray) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		for (Entry<Character, Integer> obj : map.entrySet()) {
			if (obj.getValue() > 1) {
				// System.out.println(obj.getKey());
				value = value + String.valueOf(obj.getKey());
			}
		}
		return value;
	}

	/**
	 * Method name: getDuplicateCount This method will return Duplicate value count
	 * 
	 * @param text
	 * @return
	 */

	public static int getDuplicateCount(String text) {
		int numCount = 0;

		Set<Character> uniqueChars = new HashSet<Character>();
		Set<Character> repeats = new HashSet<Character>();

		for (int i = 0; i < text.length() - 1; i++) {
			if (!uniqueChars.add(text.charAt(i))) {
				System.out.println("Unique: " + uniqueChars);
				repeats.add(text.charAt(i));
				System.out.println("Repeat:" + repeats);
			}
			numCount = repeats.size();
		}
		return numCount;
	}

}