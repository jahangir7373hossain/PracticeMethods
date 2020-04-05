package methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
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
		System.out.println("primeFactors: " + primeFactors(36));

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

		int[] arrM1 = { 2, 4, 3, 1, 0 };
		int[] arrM2 = { 1, 2, 6, 3, 4, 5 };
		// System.out.println(missingNumberFromTwoArray(arrM1, arrM2));
		System.out.println("missingNumberFromTwoArray2: " + missingNumberFromTwoArray2(arrM1, arrM2));

		int[] dupArray = { 2, 4, 8, 3, 6, 2, 8, 9 };
		System.out.println("duplicateNumber: " + Arrays.toString(duplicateNumber(dupArray)));

		List<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(3);
		numList.add(5);
		numList.add(1);
		numList.add(6);
		numList.add(11);
		numList.add(33);
		numList.add(5);
		numList.add(11);
		numList.add(60);
		numList.add(11);
		System.out.println("removeDupDisplayDuo: " + removeDupDisplayDup(numList));
		System.out.println(getUserOccurrences("User1,User2,user1,user3,user2,user3,user1"));
		int[] secondLagArray = { 75, 88, 44, 55 };
		System.out.println(getSecondLagestNumFromArray(secondLagArray));
		System.out.println("findUniou: " + findUniou("usha", "asha"));

		int[] lagArray = { 75, 88, 44, 55 };
		System.out.println("getLargestNumFromArray: " + getLargestNumFromArray(lagArray));

		int[] dupArray1 = { 2, 9, 3, 4, 7, 3, 9, 55, 33, 44, 33, 20, 9 };
		System.out.println("moveDuplicateToAnArray: " + Arrays.toString(moveDuplicateToAnArray(dupArray1)));
		System.out.println(isAnagram("Hello world", "world hello"));

		int[] a1 = { 1, 12, 15, 26, 38 };
		int[] a2 = { 2, 13, 17, 30, 45 };
		System.out.println("getMaiden: " + getMaiden(a1, a2));
		System.out.println("reverseIntegerArray: " + Arrays.toString(reverseIntegerArray(a1)));

		int[] findUniqeArray = { 1, 2, 6, 2, 9 };
		System.out.println("uniqueIntegerArray: " + Arrays.toString(uniqueIntegerArray(findUniqeArray)));

		System.out.println("getNearestPalindrome: " + getNearestPalindrome(6603494));
		int[] arrx = { -1, -3, -4, 2, 0, -5 };
		// int [] arrx = {1, 4, 3, 6, 7, 0};
		System.out.println("largestProductOfTwoConsecutiveElements: "
				+ Arrays.toString(largestProductOfTwoConsecutiveElements(arrx)));

		System.out.println("reverseWord: " + reverseWord("You are hosting a game in your server"));
		System.out.println("reverseWord2: " + reverseWord2("You are hosting a game in your server"));
		int[] arrm1 = { 1, 3, 8, 4, 15 };
		int[] arrm2 = { 9, 7, 8, 5, 19 };
		System.out.println("mergeTwoArraySort: " + Arrays.toString(mergeTwoArraySort(arrm1, arrm2)));
		System.out.println("canBeConvertedToPalindrome: " + canBeConvertedToPalindrome("yakak")); // andaadna

		int[] sumA = { 4, -2, 6, 7, 3, 5 };
		sumPairs(sumA, 10);
		System.out.println(getSubstringWithOutRepeatingChar("pwwkew"));
		System.out.println("mostCommonCharInString: " + mostRepeatingCharInString("Ramrrnarmmmesh"));

		System.out
				.println("maximumConsecutiveRepeatingCharacter: " + maximumConsecutiveRepeatingCharacter("abcccbbbb"));
		sumPaires2(sumA, 10);

		int[] sumArra = { 3, 5, -5, -1, 4, 3, -2 };
		System.out.println("sumMaximumSubArray: " + sumMaximumSubArray(sumArra));

		int[] moveZero = { 2, 0, 3, 0, 8 };
		System.out.println(Arrays.toString(moveAllZeroToRight(moveZero)));

		System.out.println("SumOfDigitsTillSingleDigitRecursion: " + SumOfDigitsTillSingleDigitRecursion(1234));
		System.out.println(a(1234));

		int[] xy = { 4, 2, 3, 5, 7 };
		System.out.println("removeElementFromArray: " + Arrays.toString(removeElementFromArray(xy, 3)));

		int[] productarr = { -2, -3, 0, -2, -40 };

		// {-2, -3, 0, -2, -40};
		System.out.println(maxProductArray(productarr));

		int[] arrFAL = { 1, 3, 5, 5, 5, 5, 7, 67, 123, 125 };
		System.out.println("findFirstAndLast: " + Arrays.toString(findFirstAndLast(arrFAL, 5)));
		
		int [] arrM3 = {9,5,4,3,15};
		System.out.println("getThirdHigestNumber: " + getThirdHigestNumber(arrM3));
		
		
		int [] missArra = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumber(missArra));
		

		int plusonearr[] = {1,2,9}; // or {9,9,9} // or{1,2,3}
		System.out.println(Arrays.toString(plusOne(plusonearr)));
		
		
		int [] arrPair = {1,4,3,2};
		System.out.println("arrayPairSum : "+ arrayPairSum(arrPair));
		
		System.out.println("getEncrypted: " + getEncrypted("jahangir"));	
		
		int[] arratc = { 8,1,2,2,3};
		System.out.println("smallerNumbersThanCurrent: " + Arrays.toString(smallerNumbersThanCurrent(arratc)));
		
		System.out.println("removePalindromeSub: " + removePalindromeSub("bab"));
		
		int [] arrmcn = {1,1,0,1,1,1};
		
		System.out.println(mostConsecutiveNum(arrmcn));
		
		System.out.println("sortestWordDistance: " + sortestWordDistance("practice makes perfect coding makes","makes","makes"));


	}
	
	/*
	 * Method name: sortestWordDistance
	 * Description: This method will help to find the shortest distance between two word
	 * 
	 */
	
	public static int sortestWordDistance(String text, String str1, String str2) {
		int sortestDis = 0;
		int index1 = 0;
		int index2 = 0;
		String [] wordArray = text.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < wordArray.length; i++) {
			if(!map.containsKey(wordArray[i])) {
				map.put(wordArray[i], 1);
				if(wordArray[i].equalsIgnoreCase(str1)) {
					index1 = i;
				}
			}else {
				map.put(wordArray[i], map.get(wordArray[i])+1);
				if(wordArray[i].equalsIgnoreCase(str2)) {
					index2 = i;
				}
			}
		}
		sortestDis = index2 - index1;
		//if index 2 smaller that index1 then below code will run
		if(sortestDis < 0) {
			sortestDis = index1 - index2;
		}
		
		return sortestDis;
	}
	
	
	/**
	 * Method name: mostConsecutiveNum
	 * @param arr
	 * @return
	 */
	
	public static int mostConsecutiveNum(int [] arr) {
		int count = 0;
		int currCount = 1;
		
		for (int i = 0; i < arr.length-1; i++) {
			
			if(arr[i] == arr[i+1]) {
				
				currCount++;
			}
			
			if(currCount > count) {
				count = currCount;
				currCount = 1;
			}
			
		}
		return count;
	}
	
	public static int removePalindromeSub(String s) {
        if(s.length()==0){
            return 0;
        }
        
        if(isPali(s)){
            return 1;
        }
        
        return 2;
    }
	
	public static boolean isPali(String text) {
		boolean result = false;
		String str = "";
		for(int i = text.length()-1; i >= 0; i--) {
			str = str + text.charAt(i);
		}
		if(str.equalsIgnoreCase(text)) {
			result = false;
		}
		return result;
	}
	
	/**
	 * Method name :smallerNumbersThanCurrent
	 * Method des: Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
	 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
	 * @param arratc
	 * @return
	 */
	
	public static int [] smallerNumbersThanCurrent(int [] arratc) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int [] clone = arratc.clone();
		Arrays.sort(arratc);
		for(int i = 0; i < arratc.length; i++) {
			if(!map.containsKey(arratc[i])) {
				map.put(arratc[i], i);
			}
		}
		int [] result = new int[arratc.length];
		for(int i = 0; i < clone.length; i++) {
			result[i] = map.get(clone[i]);
		}
		return result;
	}
	
	/**
	 * Method name: getEncrypted
	 * description: This method will convert regular text in encrypted text
	 * @param text
	 * @return
	 */
	
	public static String getEncrypted(String text) {
		String value =  "abcdefghijklmnopqrstuvwxyz";
		String key = "ABF5REWIOPLJ583ZX5BGTH6403";
		
		String encrypted = "";
		for(int i = 0; i < text.length(); i++) {
			int position = value.indexOf(text.charAt(i));
			if(position != -1) {
				char c = key.charAt(position);
				encrypted = encrypted + c;
			}
		}
		return encrypted;
		
	}
	
	/**
	 * Array partition
	 * Method name: arrayPairSum
	 * Description: Given an array of 2n integers, your task is to group these integers into n pairs of integer,
	 *  say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
	 * @param arr
	 * @return
	 */
	
	public static int arrayPairSum(int [] arr) {
		int sum = 0;
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i = i + 2) {		
			sum = sum + arr[i];
		}	
		return sum;
	}
	
	/**
	 * Method name: plusOne
	 * description: Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
     The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
	 * @param arr
	 * @return
	 */
	public static int [] plusOne(int [] arr) {
		for(int i = arr.length-1; i >= 0; i--) {
			if(arr[i] < 9) {
				arr[i]++;
				return arr;
			}
			arr[i] = 0;
		}
		int [] result = new int[arr.length+1];
		result[0] = 1;
		return result;
	}
	
	/**
	 * Method Name: findDisappearedNumber
	 * Description: Find the repeating and the missing | Added 3 new methods.Given an unsorted array of size n.
	 *  Array elements are in the range from 1 to n. One number from set {1, 2, …n}
	 *   is missing and one number occurs twice in the array. Find these two numbers.
	 * @param arr
	 * @return
	 */
	
	public static List<Integer> findDisappearedNumber(int [] arr){
		List<Integer> missingNumber = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		for(int i : arr) {
			set.add(i);
		}
		
		for(int i = 1; i <= arr.length; i++) {
			
			if(!set.contains(i)) {
				missingNumber.add(i);
			}
		}
		
		return missingNumber;
	}

	/**
	 * Method name: getThirdHigestNumber
	 * @param arr
	 * @return
	 */
	
	public static int getThirdHigestNumber(int[] arr) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;

		for (int i : arr) {
			if(i > max1) {
				max3 = max2;
				max2 = max1;
				max1 = i;
			}
			else if(i > max2) {
				max3 = max2;
				max2 = i;
			}
			else if(i > max3) {
				max3 = i;
			}
		}

		return max3;
	}

	/**
	 * Method name : findFirstAndLast description: Given a sorted array with
	 * possibly duplicate elements, the task is to find indexes of first and last
	 * occurrences of an element x in the given array.
	 * 
	 * @param arr
	 * @param target
	 * @return
	 */

	public static int[] findFirstAndLast(int[] arr, int target) {
		int[] array = new int[2];
		int firstIndex = 0;
		int lastIndex = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {

				if (!map.containsKey(arr[i])) {
					map.put(arr[i], 1);
					firstIndex = i;
				} else {
					map.put(arr[i], map.get(arr[i] + 1));
					lastIndex = i;
				}
				if (lastIndex == 0) {
					lastIndex = firstIndex;
				}
			}
		}
		array[0] = firstIndex;
		array[1] = lastIndex;
		return array;
	}

	public static int maxProductArray(int[] arr) {
		int max = arr[0];
		int currMax = arr[0];
		int currMin = arr[0];
		for (int i = 1; i < arr.length; i++) {

			int nextMax = currMax * arr[i];
			int nextMin = currMin * arr[i];

			currMax = Math.max(arr[i], Math.max(nextMax, nextMin));
			currMin = Math.min(arr[i], Math.min(nextMax, nextMin));

			max = Math.max(max, currMax);
		}

		return max;
	}

	/**
	 * Method: removeElementFromArray
	 * 
	 * @param arr
	 * @param ele
	 * @return
	 */

	public static int[] removeElementFromArray(int[] arr, int ele) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				index = i;
				break;
			}
		}

		int len = arr.length;
		for (int i = index; i < len - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[len - 1] = 0;
		return arr;

	}

	// Method a and b help each other
	// SumOfDigitsTillSingleDigitRecursion

	public static int a(int num) {

		if (num < 9) {
			return num;
		}
		int sum = 0;

		while (num > 0) {

			sum = sum + num % 10;
			num /= 10;
		}
		if (sum > 9) {
			return b(sum);
		}

		return sum;
	}

	public static int b(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num /= 10;
		}

		return sum;
	}

	// This method is same as method = a
	public static int SumOfDigitsTillSingleDigitRecursion(int num) {

		if (num < 10) {
			return num;
		}
		int sum = 0;
		while (num > 0) {

			sum = sum + num % 10;
			num = num / 10;
		}

		return (SumOfDigitsTillSingleDigitRecursion(sum));
	}

	/**
	 * Method name: moveAllZeroToRight Method Description: This method will move all
	 * zero to the right side
	 * 
	 * @param arr
	 * @return
	 */

	public static int[] moveAllZeroToRight(int[] arr) {
		int[] newArr = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				newArr[index++] = arr[i];
			}
		}

		return newArr;
	}

	/**
	 * Method name: sumMaximumSubArray Link:
	 * https://www.youtube.com/watch?v=U4iVyHQQIqA
	 * 
	 * @param arr
	 * @return
	 */

	public static int sumMaximumSubArray(int[] arr) {
		int maxSoFar = Integer.MIN_VALUE;
		int maxEndingHere = 0;
		for (int i = 0; i < arr.length; i++) {
			maxEndingHere = maxEndingHere + arr[i];
			if (maxSoFar < maxEndingHere) {
				maxSoFar = maxEndingHere;
			}
			if (maxEndingHere < 0) {
				maxEndingHere = 0;
			}
		}

		return maxSoFar;
	}

	/**
	 * Method name: sumPairs Description: This method will print the value which are
	 * equals 10
	 * 
	 * @param arr
	 * @param sum
	 */

	public static void sumPaires2(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {

			if (!map.containsKey(target - arr[i])) {

				map.put(arr[i], i);
			} else {
				System.out.println(target - arr[i] + "," + arr[i]);
			}
		}

	}

	/**
	 * Method name: maximumConsecutiveRepeatingCharacter description: Given a
	 * string, the task is to find maximum consecutive repeating character in
	 * string. We do not need to consider overall count, but the count of repeating
	 * that appear at one place.
	 * 
	 * @param text
	 * @return
	 */

	public static char maximumConsecutiveRepeatingCharacter(String text) {
		char result = 0;
		int charCount = 1;
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (i < text.length() - 1 && text.charAt(i) == text.charAt(i + 1)) {
				charCount++;

			} else {
				if (charCount > count) {
					count = charCount;
					result = text.charAt(i);

				}
				charCount = 1;
			}
		}

		return result;
	}

	/**
	 * Method name : mostCommonCharInString Description: This method will help to
	 * find the most common char from string
	 * 
	 * @param text
	 * @return
	 */
	public static char mostRepeatingCharInString(String text) {
		char result = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] character = text.replaceAll(" ", "").toCharArray();
		for (char c : character) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		int max = 0;
		for (Entry<Character, Integer> m : map.entrySet()) {
			if (max < m.getValue()) {
				max = m.getValue();
				result = m.getKey();
			}
		}

		return result;
	}

	/**
	 * Method Name: getSubstringWithOutRepeatingChar Description: This method will
	 * return longest substring without repeating char
	 * 
	 * @param text
	 * @return
	 */

	public static String getSubstringWithOutRepeatingChar(String text) {
		String longestTillNow = "";
		String longestOverAll = "";
		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);

			if (set.contains(c)) {
				longestTillNow = "";
				set.clear();
			}
			longestTillNow += c;
			set.add(c);

			if (longestTillNow.length() > longestOverAll.length()) {

				longestOverAll = longestTillNow;
			}
		}

		return longestOverAll;
	}

	/**
	 * Method name: sumPairs Description: This method will print the value which are
	 * equals 10
	 * 
	 * @param arr
	 * @param sum
	 */
	public static void sumPairs(int[] arr, int sum) {

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (set.contains(arr[i])) {

				System.out.println(arr[i] + "," + (sum - arr[i]));
			} else {

				set.add(sum - arr[i]);
			}
		}

	}

	/**
	 * Method name: canBeConvertedToPalindrome Description: This method will check
	 * whether the string can be converted into plaindrome
	 * 
	 * @param text
	 * @return
	 */

	public static boolean canBeConvertedToPalindrome(String text) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] character = text.toCharArray();
		for (char c : character) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		boolean hasOdd = false;
		for (Entry<Character, Integer> m : map.entrySet()) {

			if (m.getValue() % 2 == 1) {
				if (hasOdd) {

					return false;
				} else {
					hasOdd = true;
				}
			}
		}

		return true;
	}

	/**
	 * Method name:mergeTwoArraySort Description: This method will merge two array
	 * and sort
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public static int[] mergeTwoArraySort(int[] arr1, int[] arr2) {
		int[] mergeArray = new int[arr1.length + arr2.length];
		int c = 0;
		for (int i = 0; i < arr1.length; i++) {
			mergeArray[i] = arr1[i];
			c++;
		}
		for (int j = 0; j < arr2.length; j++) {
			mergeArray[c++] = arr2[j];
		}
		Arrays.sort(mergeArray);

		return mergeArray;
	}

	// or

	public static int[] mergeArray(int[] arr1, int[] arr2) {

		int[] mergeArray = new int[arr1.length + arr2.length];

		int c = 0;

		for (int i : arr1) {
			mergeArray[c++] = i;
		}
		for (int j : arr2) {

			mergeArray[c++] = j;
		}
		Arrays.sort(mergeArray);

		return mergeArray;
	}

	/**
	 * Method name: reverseWord2
	 * 
	 * @param text
	 * @return
	 */
	public static String reverseWord2(String text) {
		String reverseWord = "";
		String[] wordArray = text.split(" ");
		for (int i = 0; i < wordArray.length; i++) {
			StringBuilder sb = new StringBuilder(wordArray[i]);
			sb.reverse();
			reverseWord = reverseWord.trim() + " " + sb.toString();
		}

		return reverseWord;
	}

	/**
	 * Method name: reverseWord Description: This method will reverse every single
	 * word of sentence Related Method: reverse
	 * 
	 * @param text
	 * @return
	 */
	public static String reverseWord(String text) {
		String reverseWord = "";

		String[] wordArray = text.split(" ");

		for (int i = 0; i < wordArray.length; i++) {

			String value = String.valueOf(wordArray[i]);

			reverseWord = reverseWord.trim() + " " + reverse(value);
			;
		}

		return reverseWord;
	}

	// This method is developed for reverseWord method
	public static String reverse(String input) {
		String str = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			str = str + String.valueOf(input.charAt(i));
		}
		return str;
	}

	/**
	 * Method name : largestProductOfTwoConsecutiveElements Description: Given an
	 * array, find the largest product of two consecutive elements.
	 * 
	 * @param arr
	 * @return
	 */

	public static int[] largestProductOfTwoConsecutiveElements(int[] arr) {
		int[] result = new int[2];
		Arrays.sort(arr);
		int maxNum = arr[0] * arr[1];
		int indexOne = 0;
		int indexTwo = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (maxNum < arr[i] * arr[i + 1]) {
				maxNum = arr[i] * arr[i + 1];
				result[0] = arr[i];
				result[1] = arr[i + 1];
			} else {
				result[0] = arr[indexOne];
				result[1] = arr[indexTwo + 1];

			}
		}

		return result;
	}

	/**
	 * Method Name:getNearestPalindrome Description: This method will help to find
	 * nearest palindrome number Related Method: reverseIntFGNP
	 * 
	 * @param number
	 * @return
	 */

	public static int getNearestPalindrome(int number) {
		@SuppressWarnings("unused")
		int nearestPalindrome = 0;
		int increase = 0;
		int decrecase = 0;
		while (true) {
			increase = increase + 1;
			int num1 = number + increase;
			if (reverseIntFGNP(num1) == true) {
				return nearestPalindrome = num1;
			}

			else if (reverseIntFGNP(num1) == false) {
				decrecase = decrecase + 1;
				int num2 = number - decrecase;
				if (reverseIntFGNP(num2) == true) {
					return nearestPalindrome = num2;

				}
			}
		}

	}

	// This method is used for getNearestPalindrome
	public static boolean reverseIntFGNP(int num) {
		boolean result = false;
		int input = num;
		int reverse = 0;
		int reminder = 0;
		while (num != 0) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}

		if (reverse == input) {
			result = true;
		}

		return result;
	}

	/**
	 * Method name: uniqueIntegerArray
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] uniqueIntegerArray(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : arr) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		;
		for (Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() == 1) {
				list.add(m.getKey());
			}
		}
		int[] uniqueInteger = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			uniqueInteger[i] = list.get(i);
		}

		return uniqueInteger;
	}

	/**
	 * Method name: reverseIntegerArray Description: it will reverse the the array
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] reverseIntegerArray(int[] arr) {
		int arrLength = arr.length;
		int[] reverse = new int[arrLength];
		for (int i = 0; i < arrLength; i++) {

			reverse[i] = arr[arrLength - i - 1];
		}

		return reverse;
	}

	/**
	 * Method: getMaiden Description: Median of two sorted arrays of same size
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */

	public static int getMaiden(int[] arr1, int[] arr2) {
		int maiden = 0;
		int a1_middle = (0 + arr1.length - 1) / 2;
		int a2_middle = (0 + arr2.length - 1) / 2;

		maiden = (arr1[a1_middle] + arr2[a2_middle]) / 2;

		return maiden;
	}

	/**
	 * Method name: ANAGRAM Link: https://www.youtube.com/watch?v=6HSjG0JogIU
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */

	public static boolean isAnagram(String str1, String str2) {
		boolean result = false;

		char[] word1 = str1.toLowerCase().replaceAll(" ", "").toCharArray();

		char[] word2 = str2.toLowerCase().replaceAll(" ", "").toCharArray();

		Arrays.sort(word1);
		Arrays.sort(word2);

		if (Arrays.equals(word1, word2)) {
			result = true;
		}

		return result;
	}

	/**
	 * Method name: moveDuplicateToAnArray description: Given an array of integers,
	 * how would you move the duplicate integers into a different array?
	 * 
	 * @param arr
	 * @return
	 */

	public static int[] moveDuplicateToAnArray(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i : arr) {
			if (!set.contains(i)) {
				set.add(i);
			} else {
				list.add(i);
			}
		}
		int[] dupValuArray = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			dupValuArray[i] = list.get(i);
		}
		return dupValuArray;
	}

	/**
	 * Method : getLargestNumFromArray
	 * 
	 * @param arr
	 * @return
	 */
	public static int getLargestNumFromArray(int[] arr) {
		int largNum = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (largNum < arr[i]) {

				largNum = arr[i];
			}
		}

		return largNum;
	}

	/**
	 * Method name: findUniou Description: It will sort out the string and make the
	 * string unique
	 * 
	 * @param text1
	 * @param text2
	 * @return
	 */

	public static String findUniou(String text1, String text2) {
		String union = "";
		String addString = text1.concat(text2);
		char[] charStr = addString.toCharArray();
		Set<Character> set = new TreeSet<Character>();
		for (char c : charStr) {
			set.add(c);

		}
		union = union + set.toString();

		return union;
	}

	/**
	 * Method name: getSecondLagestNumFromArray Description: it will find the second
	 * largest num from array
	 * 
	 * @param arr
	 * @return
	 */

	public static int getSecondLagestNumFromArray(int[] arr) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) {
				secondHighest = highest;
				System.out.println("second: " + secondHighest);
				highest = arr[i];
			} else if (arr[i] > secondHighest) {

				secondHighest = arr[i];
			}
		}

		return secondHighest;
	}

	/**
	 * Method name: getUserOccurrences Description: write a program where a there
	 * are multiple users logging into the system or file and I want to know the
	 * login Occurrences of the each user . Note : The file is separated by the
	 * commas. ex: User1 , User2, user1 , user3.........
	 * 
	 * @param users
	 * @return
	 */

	public static Map<String, Integer> getUserOccurrences(String users) {

		Map<String, Integer> userOccurances = new HashMap<String, Integer>();
		String[] usr = users.toLowerCase().split(",");
		for (String u : usr) {
			if (!userOccurances.containsKey(u)) {
				userOccurances.put(u, 1);
			} else {
				userOccurances.put(u, userOccurances.get(u) + 1);
			}
		}
		return userOccurances;
	}

	/**
	 * Method name: removeDupDisplayDup Description: Amazon interview question -->
	 * remove duplicate from list and return duplicate
	 * 
	 * @param numList
	 * @return
	 */

	public static List<Integer> removeDupDisplayDup(List<Integer> numList) {
		List<Integer> dupList = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : numList) {
			if (!set.contains(i)) {
				set.add(i);
			} else {
				dupList.add(i);
			}
		}
		return dupList;
	}

	/**
	 * Method name: duplicateNumber Description: This method will return duplicate
	 * number
	 * 
	 * @param arr
	 * @return
	 */

	public static int[] duplicateNumber(int[] arr) {

		List<Integer> list = new ArrayList<Integer>();

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int a : arr) {

			if (!map.containsKey(a)) {

				map.put(a, 1);
			} else {

				map.put(a, map.get(a) + 1);
			}
		}

		for (Entry<Integer, Integer> m : map.entrySet()) {

			if (m.getValue() > 1) {

				list.add(m.getKey());
			}
		}
		int[] duplicateNum = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {

			duplicateNum[i] = list.get(i);
		}

		return duplicateNum;
	}

	/**
	 * Method: missingNumberFromTwoArray2 Description: This method will help to find
	 * what are the missing values is array2 from array1
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public static List<Integer> missingNumberFromTwoArray2(int[] arr1, int[] arr2) {
		List<Integer> missValue = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for (int a1 : arr1) {
			set.add(a1);
		}
		for (int i : arr2) {
			if (!set.contains(i)) {
				missValue.add(i);
			}
		}

		// Those line of code required if i want to print value using array
		int[] value = new int[missValue.size()];
		for (int i = 0; i < missValue.size(); i++) {
			value[i] = missValue.get(i);
		}
		System.out.println("Printing Missing value using Array: " + Arrays.toString(value));

		return missValue;
	}

	public static int missingNumberFromTwoArray(int[] arr1, int[] arr2) {
		int missingValue = 0;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum1 = sum1 + arr1[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			sum2 = sum2 + arr2[j];
		}
		if (sum1 - sum2 >= 0) {
			missingValue = sum1 - sum2;
		} else if (sum1 - sum2 < 0) {

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
		while (num != 0) {
			reminder = num % 10;
			reverseNum = reverseNum * 10 + reminder;
			num = num / 10;
		}

		if (input == reverseNum) {
			result = true;
		}

		return result;
	}

	/**
	 * Method Name: reverseInt Link: https://www.youtube.com/watch?v=xf9z_MszHJ0
	 * 
	 * @param num
	 * @return
	 */

	public static int reverseInt(int num) {
		int reverse = 0;
		int reminder = 0;

		while (num != 0) {

			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;

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
		
//		int [] a = new int [2];
//	       int indexOne = 0;
//	       int indexTwo = 0;
//	       Arrays.sort(arr);
//	       int minDis = arr[1] - arr[0];
//	       for(int i = 0; i < arr.length-1; i++){
//	           if(minDis > arr[i+1] - arr[i]){
//	               minDis = arr[i+1] - arr[i];
//	               a[0] =  arr[i];
//	               a[1] = arr[i+1];
//	           }
//	       }
//	      
//	       System.out.println("Minmum distance is: " + minDis);
//	       return a;
//	   }
	
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