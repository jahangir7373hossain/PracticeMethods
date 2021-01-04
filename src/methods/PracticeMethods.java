package methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
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
		

		System.out.println("getPrimefactorization: " + getPrimefactorization(36));

		System.out.println("getLengthOfLastWord: " + getLengthOfLastWord("my name is john"));
		int[] numArray = {1, 1, 2, 2, 8};

		System.out.println(Arrays.toString(removeDuplicates(numArray)));

		int[] num = { 1, 2, 8, 5, 9, 2, 6, 1, 8};
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
		System.out.println("getPerfectNum: " + isPerfectNum(496));

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
		
		int[] secondLagArray = { 75, 88, 44, 55 };
		System.out.println(getSecondLagestNumFromArray(secondLagArray));
		System.out.println("getUnion: " + getUnion("usha", "asha"));

		int[] lagArray = { 75, 88, 44, 55 };
		System.out.println("getLargestNumFromArray: " + getLargestNumFromArray(lagArray));

		int[] dupArray1 = { 2, 9, 3, 4, 7, 3, 9, 55, 33, 44, 33, 20, 9 };
		System.out.println("moveDuplicateToAnArray: " + Arrays.toString(moveDuplicateToAnArray(dupArray1)));
		 
		System.out.println("isAnagram: " + isAnagram("hello world", "hlleo world"));

		int[] a1 = {1, 12, 15, 26, 38};
		int[] a2 = {2, 13, 17, 30, 45};
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

		int[] productarr = {-2, -3, 0, -2, -40};

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
		
		int[] arratc = {8,1,2,2,3};
		System.out.println("smallerNumbersThanCurrent: " + Arrays.toString(smallerNumbersThanCurrent(arratc)));
		
		System.out.println("removePalindromeSub: " + removePalindromeSub("bab"));
		
		int [] arrmcn = {8,1,1,1,1,2,2,3};
		
		System.out.println("mostConsecutiveNum: " + mostConsecutiveNum(arrmcn));
		
		
		int [] arrlcis = {1,3,5,4,7};  // or 1,3,5,4,7
		System.out.println("longestContinuousIncreasingSubsequence: "+ longestContinuousIncreasingSubsequence(arrlcis));
		
		int[] arrbtbss = { 7, 1, 5, 3, 6, 4 };
		System.out.println("bestTimetoBuyandSellStock: " + bestTimetoBuyandSellStock(arrbtbss));

		int arru1[] = { 7, 1, 5, 2, 3, 6 };
		int arru2[] = { 3, 8, 6, 20, 7 };
		System.out.println(Arrays.toString(getArrayUnion(arru1, arru2)));

		int[] arrpn = { -1, 6, 9, -4, -10, 8 };
		System.out.println(Arrays.toString(sortPositiveNegative(arrpn)));

		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("Java", "John");
		map2.put("C#", "Rob");
		map2.put("Ruby", "John");
		map2.put("Rails", "Rob");

		System.out.println("getAuthorAndBook: " + getAuthorAndBook(map2));

		System.out.println("mixString: " + mixString("abc", "efg"));
		System.out.println("largestSubString: " + largestSubString("Happy%^&new!@(year"));

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(1);
		l1.add(3);
		l1.add(3);
		l1.add(4);
		l1.add(1);
		System.out.println("notInCorrectPoint: " + notInCorrectPoint(l1));
		
		int[] arrm11 = {1,1,3};
        int[] arrm22 = {2,4,6,8};
		
        System.out.println(Arrays.toString(margeArrayTo3rdArray(arrm11,arrm22)));
        
    	int[] arrmcon = {1,1,0,0,0,0,1,1,1,1,1};
        System.out.println("mosConAParticularNum: " + mosConAParticularNum(arrmcon, 1));
        
        int[] arrmdbp = {101,-113,1,45,78,-2,-3,7};
        System.out.println("getMinDiffBetweenPrimes: "+ getMinDiffBetweenPrimes(arrmdbp));
        
        int[] arrrsa = {1,2,3,4,5,6,7,8,9};
        System.out.println("reverseSubArray: " + Arrays.toString(reverseSubArray(arrrsa, 3)));
        
        int[] s1 = {1,5,4,6,8,2};
    	int[] s2 = {5,8,2,7};
        System.out.println("findSubSet: " + Arrays.toString(findSubSet(s1, s2)));
        
        int[] arrmaztl = {0, 1, 1, 0, 0, 1, 0, 0, 1};
        System.out.println("moveAllZeroToLeft: " +Arrays.toString(moveAllZeroToLeft(arrmaztl)));
        
        int [] arrCC = {1,1,1,0,0,3,4};
        System.out.println("checkConsecutive: " + checkConsecutive(arrCC, 1));
        
         getPrimeNumberPairs(34);
         
         System.out.println("binaryToDecimal: "+ binaryToDecimal(101101));
         
         System.out.println("decimalToBinary: " + decimalToBinary(45));
         
         System.out.println("isPrefixOfWord: " + isPrefixOfWord("i love eating burger", "burg"));
         
         int [] arrre = {3,2,2,3};
 		 System.out.println("removeElement: " + removeElement(arrre, 3));
 		 
 		int[] dupArray2 = { 2, 9, 3, 4, 7, 3, 9, 55, 33, 44, 33, 20, 9 };
		System.out.println("removeDupFromArray: " + Arrays.toString(removeDupFromArray(dupArray2)));
		
		String [] arrlcp = {"flower","flow","flight"};
		System.out.println("longestCommonPrefix: "+ longestCommonPrefix(arrlcp));
		
		System.out.println("longestSubStringPalindrome: "+ longestPalindromeSubString("babad"));
		
		System.out.println(reverseWordWithoutUsingSplit("Jahangir hossain khan"));
		
		int [] arrmac = {1,8,6,2,5,4,8,3,7};
		System.out.println("maxAreaOfContainer: " + maxAreaOfContainer(arrmac));
		
		int [] rearrangeAnArray = {2, 4, 3, 5, 1};
		System.out.println("rearrangeAnArray: " + Arrays.toString(rearrangeAnArray(rearrangeAnArray)));
		
		int [] saseza = {4, 2, -3, 1, 6};
		System.out.println("subArraySumEqualZero: " + subArraySumEqualZero(saseza));
		
		int [] fts = {1, 4, 20, 3,10, 5 };
		System.out.println("findTargetedSum: " + findTargetedSum(fts, 33));
	
		int [] lolcs = {4,2,1,6,5,7};
		System.out.println("lengthOfLongestConsecutiveSequence: " + lengthOfLongestConsecutiveSequence(lolcs));
		
		int [] arrSRSA = {2,3,4,5,6,7,8,0,1};
		System.out.println("searchInRotatedSortedArray: " + searchInRotatedSortedArray(arrSRSA, 5));
		
		System.out.println("overrideAllDigitsWithFirstDigit: " + overrideAllDigitsWithFirstDigit(6789));
		
		int [] fpearr = {1,2,3,1};
		System.out.println("findPeakElement: " + findPeakElement(fpearr));
		
		int [] lrarr = {1,2,3,4,5};		
		System.out.println("leftRotation: " + Arrays.toString(leftRotation(lrarr, 2)));
		
		int [] mmarr = {1,2,3};
		System.out.println("minimumMoves: " + minimumMoves(mmarr));
		
		
		int [] arrts1 = {0,0,-5,30212};
		int [] arrts2 = {-10,40,-3,9};
		
		System.out.println("sumOfTwoArrayEqualTarget: " + sumOfTwoArrayEqualTarget(arrts1, arrts2, -8));
		
		System.out.println("gettingFirstUniqeCharFromSting: " + gettingFirstUniqeCharFromSting("abacabad"));
		
		System.out.println("gettingFirstDuplicateCharFromSting: " + gettingFirstDuplicateCharFromSting("abacabad"));
		
		int [] arrsq = {-4,-1,0,3,10};
		System.out.println("sortedSquares:" + Arrays.toString(sortedSquares(arrsq)));

		System.out.println("isSubsequence: " + isSubsequence("abd", "ahbgdc"));
		
		System.out.println("climbStairs: " + climbStairs(4));
		
		System.out.println("isBalanced : " + isBalanced("[{()}]"));
		
		System.out.println("countingValleys: "+ countingValleys("DUDDUUUUDDD"));
		
		int [] smarr = {1,2,1,2,1,3,2};
		System.out.println("sockMerchant: " + sockMerchant(smarr));
		
		
		int [] arrmad = {3,-7,0};
		System.out.println("minimumAbsoulteDifference: " + minimumAbsoulteDifference(arrmad));
		
		payChange(500, 25);

	}
	
	public static void payChange(int paid, int cost) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		int rest = 0;
		int change = paid - cost;
		
		int twenty = change / 20;
		map.put("20", twenty);
		rest = change % 20;
		
		int ten = rest / 10;
		map.put("10", ten);
		rest = rest % 10;
		
		int five = rest / 5;
		map.put("5", five);
		rest = rest % 5;
		
		int one = rest / 1;
		map.put("1", one);
		
//		for(int m:map.values()) {
//			System.out.println(m);
//		}
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() +" = "+ m.getValue());
		}
		
	}
	
	//https://www.youtube.com/watch?v=cYelJ-lJyyY&list=PLU_sdQYzUj2nKXYskiYlKQIKknqu4H5ti&index=11
	public static int minimumAbsoulteDifference(int [] arr) {
		
		int min_absolute_difference = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i = 0; i < arr.length-1; i++) {
			int current_absoulte_value = Math.abs(arr[i] - arr[i+1]);
			min_absolute_difference = Math.min(min_absolute_difference, current_absoulte_value);
		}
		return min_absolute_difference;
	}
	
	//https://www.youtube.com/watch?v=HGgD8pgevc0&list=PLU_sdQYzUj2nKXYskiYlKQIKknqu4H5ti&index=8
	public static int sockMerchant(int [] arr) {
		
		int count = 0;
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i: arr) {
			
			if(!set.contains(i)) {
				set.add(i);
			}else {
				set.remove(i);
				count++;
			}
		}
		return count;
	}
	
	//https://www.youtube.com/watch?v=MMmFELo0QjM
	public static int countingValleys(String text) {
		
		int altitude = 0;
		int max_valleys = 0;
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == 'U') {
				altitude++;
				if(altitude == 0) {
					max_valleys++;
				}
			}else {
				altitude--;
			}
		}
		return max_valleys;
	}
	
	public static String isBalanced(String text) {
		
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == '(' || text.charAt(i) == '{' || text.charAt(i) == '[') {
				stack.push(text.charAt(i));
			}else {
				if(stack.isEmpty()) {
					return "NO";
				}else {
					char pop_val = stack.pop();
					if(text.charAt(i)== ')' && pop_val != '(') {
						return "NO";
					}
					else if(text.charAt(i)== '}' && pop_val != '{') {
						return "NO";
					}
					else if(text.charAt(i)== ']' && pop_val != '[') {
						return "NO";
					}
				}
				
			}
		}
		if(stack.isEmpty()) {
			return "YES";
		}else {
			return "NO";
		}
	}
	
	
	public static int climbStairs(int num) {
		
		int [] result = new int[num+1];
		result[0] = 1;
		result[1] = 1;
		
		for(int i = 2; i <= num; i++) {
			
			result[i] = result[i-1] + result[i-2];
		}
		return result[num];
	}
	
	/**
	 * Method name: isSubsequence
	 * Method description: This method will check if second string contains first string
	 * @param text1
	 * @param text2
	 * @return
	 */
	public static boolean isSubsequence(String text1, String text2) {		
		Set<Character> set = new HashSet<>();	
		for(char c: text2.toCharArray()) {
			set.add(c);
		}	
		for(int i = 0; i < text1.length(); i++) {
			
			if(!set.contains(text1.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	
	/**
	 * Method name: Given an array of integers A sorted in increasing order, 
	 * return an array of the squares of each number, also in sorted increasing order.
	 * @param arr
	 * @return
	 */
	
	public static int [] sortedSquares(int [] arr) {
		int start = 0;
		int end = arr.length-1;
		int c = arr.length-1;
		int [] result = new int [arr.length];
		while(start < end) {
			
			int startSq = arr[start] * arr[start];
			int endSq = arr[end] * arr[end];
			
			if(startSq > endSq) {
				result[c--] = startSq;
				start++;
			}else {
				result[c--] = endSq;
				end--;
			}
		}
		return result;
	}
	
	/**
	 * Method name: gettingFirstDuplicateCharFromSting
	 * Description: Get first duplicate char from string
	 * @param text
	 * @return
	 */
	
	public static char gettingFirstDuplicateCharFromSting(String text) {
		
		for(int i = 0; i < text.length(); i++) {
			
			System.out.println(text.lastIndexOf(text.charAt(i)));
			
			if(text.indexOf(text.charAt(i)) != text.lastIndexOf(text.charAt(i))) {
				
				return text.charAt(i);
			}
		}
		return '-';
	}
	/**
	 * Method name: gettingFirstUniqeCharFromSting
	 * Description: Get first unique char from string
	 * @param text
	 * @return
	 */
	
	public static char gettingFirstUniqeCharFromSting(String text) {
		
		for(int i = 0; i < text.length(); i++) {
	
			if(text.indexOf(text.charAt(i)) == text.lastIndexOf(text.charAt(i))) {
				
				return text.charAt(i);
			}
		}
		return '-';
	}
	
	/**
	 * Method name: sumOfTwoArrayEqualTarget
	 * Description: Find the targeted sum from two different array
	 * Link: https://www.youtube.com/watch?v=sfuZzBLPcx4&t=601s
	 * @param arr1
	 * @param arr2
	 * @param target
	 * @return
	 */
	
	public static boolean sumOfTwoArrayEqualTarget(int [] arr1, int [] arr2, int target) {
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i : arr1) {
			if(!set.contains(target-i)) {
				set.add(target-i);
			}
		}
		for(int j : arr2) {
			if(set.contains(j)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Method name: minimumMoves
	 * Description: Given an array with n positive integers. We need to find the minimum number of operation to make all elements equal.
	 *  We can perform addition, multiplication, subtraction or division with any element on an array element.
	 * @param arr
	 * @return
	 */
	public static int minimumMoves(int [] arr) {
		
		int minmum = arr[0];
		for(int i : arr) {		
			minmum = Math.min(minmum, i);
		}
		
		int res = 0;
		for(int j : arr) {
			res += j - minmum;
		}
		
		return res;
	}
	
	/**
	 * Method name
	 * method des: A left rotation operation on an array shifts each of the array's elements 1 unit to the left.
	 *  For example, if 2  left rotations are performed on array [1 2 3 4 5], then the array would become [3 4 5 1 2]
	 * @param arr
	 * @param target
	 * @return
	 */
	
	public static int [] leftRotation(int [] arr, int target) {
		
		int [] rotatedArray = new int [arr.length];
		int i = 0;
		int j = arr.length-1;
		int c = 0;
		
		while(c < arr.length) {			
			if(target < arr[j]) {
				rotatedArray[c++] = arr[target++];
			}else {
				rotatedArray[c++] = arr[i++];
			}
		}
		return rotatedArray;
	}
	
	//1,2,3,1
	
	public static int findPeakElement(int [] arr) {
		
		int start = 0;
		int end = arr.length-1;
		int mid = 0;
		while(start < end) {
			mid = (start+end)/2;
			
			if(arr[mid] < arr[mid+1]) {
				start = mid+1;
			}else {
				end = mid;
			}
		}
		return start;
	}
	
//	Write a function called duplicates that has a single parameter that is a positive integer. It returns
//	the integer obtained by changing all digits in the parameter to the first digit.
//	Your function can return any result of your choice if it is given an illegal parameter value. Excessively long solutions
//	
	public static Integer overrideAllDigitsWithFirstDigit(int num) {
		
		int n = num;
		int firstDigit = 0;
		
		while(n >= 10) {
			n/=10;
			firstDigit = n;
		}
		String add="";
		while(num != 0) {
			num/=10;
			add += String.valueOf(firstDigit);
		}
		return Integer.valueOf(add);
	}
	
	//Link: https://www.youtube.com/watch?v=oTfPJKGEHcc&t=77s
	
	public static int searchInRotatedSortedArray(int [] arr, int target) {
		
		int len = arr.length;
		int right = 0;
		int left = len-1;
		int mid;
		
		while(right <= left) {
			mid = (right + left)/2;
			if(target == arr[mid]) {
				return mid;
			}else if(arr[mid] > arr[left]) {
				
				if(target <= arr[mid] && target >= arr[left]) {
					left = mid - 1;
				}else {
					right = mid + 1;
				}
			}else {
				
				if(target >= arr[mid] && target <= arr[left]) {
					right = mid + 1;
				}else {
					left = mid-1;
				}
			}
		}
		return -1;
	}
	
	
	/**
	 * Method name: lengthOfLongestConsecutiveSequence
	 * Method description: 
	 * @param arr
	 * @return
	 */
	//4,2,1,5,6
	public static int lengthOfLongestConsecutiveSequence(int [] arr) {
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i : arr) {
			set.add(i);
		}
		int max = 0;
		int len = 0;
		
		for(int i: arr) {		
			
			if(!set.contains(i-1)) {
				
				while(set.contains(i)) {
					i++;
					len++;
				}
				max = Math.max(max , len);
				len = 0;
			}
		}
		return max;
	}
	
	 /**
	  * Method name: findTargetedSum
	  * Method description: This method help to find the targeted sum 
	  * @param arr
	  * @param target
	  * @return
	  */
	public static int findTargetedSum(int [] arr, int target) {	
		int currentSum = 0;
		int i = 0;
		int j = 0;		
		while(currentSum != target && currentSum < target) {
			currentSum += arr[i];
			i++;
			if(currentSum == target) {
				return currentSum;
			}			
		}		
		while(currentSum != target) {
			currentSum -= arr[j];
			j++;
			if(currentSum == target) {
				return currentSum;
			}			
		}
		return currentSum;
	}
	
	/**
	 * Method name: subArraySumEqualZero
	 * Description: maximum subarray whose sum equals 0.
	 * The method will check if sub array sum equal how many zero count.
	 * 
	 * @param arr
	 * @return
	 */
	
	//4 , 2, -3, 1, 6
	
	public static int subArraySumEqualZero(int [] arr) {
		
		int sum = 0;
		int count = 0;
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
			
			if(arr[i] == 0 || sum == 0 || set.contains(sum)) {
				count++;
			}
			
			set.add(sum);
		}
		return count;
	}
	
	/**
	 * Method name: rearrangeAnArray description: Given an unsorted array, sort it
	 * in such a way that the first element is the largest value, the second element
	 * is the smallest, the third element is the second largest element and so on.
	 * [2, 4, 3, 5, 1] -> [5, 1, 4, 2, 3]
	 * 
	 * @param arr
	 * @return
	 */
	
	public static int[] rearrangeAnArray(int [] arr) {
		
		int [] newArray = new int [arr.length];
		Arrays.sort(arr);
		int point1 = 0;
		int point2 = arr.length-1;
		int index = 0;
		
		while(index < arr.length) {
			
			if(index != arr.length) {
				newArray[index++] = arr[point2--];
			}
			if(index != arr.length) {
				newArray[index++] = arr[point1++];
			}
		}
		
		return newArray;
	}
	
	/**
	 * Method name: reverseWordWithoutUsingSplit
	 * Description: This method will reverse word without using spilt method
	 * @param text
	 * @return
	 */
	
	public static String reverseWordWithoutUsingSplit(String text) {
		if (text.isEmpty()) {
			return null;
		}
		String result = "";
		String temp = "";
		char[] charArray = text.concat(" ").toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			temp += charArray[i];
			if (temp.endsWith(" ")) {
				StringBuilder sb = new StringBuilder(temp);
				sb.reverse();
				result = result.trim() + sb;
				temp = "";
			}
		}
		return result;

	}
	
	/**
	 * Method name : maxAreaOfContainer
	 * Method for: Dev Leet code (Medium)
	 * @param s
	 * @return
	 */
	
	public static int maxAreaOfContainer(int [] heights) {		
		int max = 0;
		int left = 0;
		int right = heights.length-1;
		while(left < right) {
			int minOfHeight = Math.min(heights[left], heights[right]);
			int distance = right - left;
			max = Math.max(max, minOfHeight*distance);
			if(heights[left] < heights[right]) {
				left++;
			}else {
				right--;
			}
		}
		return max;
	}
	
	/**
	 * Method name : longestPalindromeSubString
	 * Method for: Dev Leet code (Medium)
	 * @param s
	 * @return
	 */
	public static String longestPalindromeSubString(String s) {
		String result = "";
		int start = 0;
		int end = 0;	
		for(int i = 0; i < s.length(); i++) {
			int len1 = expandFromMiddle(s, i, i);
			int len2 = expandFromMiddle(s, i, i+1);
			int len = Math.max(len1, len2);
			if(len > end - start) {
//				start = i - ((len-1)/2);
//				end = i + (len/2);
				
				start = i - len/2;
				end = len;
			}
		}
//		result = s.substring(start, end+1);
		result = s.substring(start, start+end);
		return result;
	}
	
	
	public static int expandFromMiddle(String s, int left, int right) {
		if(s == null) return 0;
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left -1;
	}
	
	public static String longestCommonPrefix(String [] arr) {
		String longestCommonPrefix = "";
		int index = 0;
		char [] c = arr[0].toCharArray();
		for(int i = 0; i < c.length; i++) {
			for(int j = 1; j < arr.length; j++) {
				if(index >= arr[j].length() || c[i] != arr[j].charAt(index)){
					return longestCommonPrefix;
				}
			}
			longestCommonPrefix+=c[i];
			index++;
		}
		return longestCommonPrefix;
	}
	
	/**
	 * Method Name: removeDupFromArray
	 * Description: This method will will remove all duplicate value from arr 
	 * @param arr
	 * @return
	 */
	
	public static int [] removeDupFromArray(int [] arr) {		
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}else {
				arr[i] = 0;
			}
		}
		return arr;
	}
	
	/**
	 * LeetCode 27
	 * 
	 * 	Method name :  Remove Element
	 * Description: Given an array nums and a value val, remove all instances of that value
	 *  in-place and return the new length.Do not allocate extra space for another array, you 
	 *  must do this by modifying the input array in-place with O(1) extra memory.
	 * @param arr
	 * @param value
	 * @return
	 */
	
	public static int removeElement(int [] arr, int value) {
		int len = 0;
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != value) {
				arr[j] = arr[i];
				len++;
			}
		}
		return len;
	}
	 
	  /*
	   * Method name : isPrefixOfWord
	   * Method description: Check If a Word Occurs As a Prefix of Any Word in a Sentence
	   */
	
	public static String isPrefixOfWord(String text, String searchWord) {

		String result = "";
		String[] words = text.toLowerCase().split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].startsWith(searchWord)) {
				result = words[i];
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @param num
	 * @return
	 */
	
	public static int decimalToBinary(int num) {
		int binary = 0;
		String value = "";
		int reminder = 0;
		while(num != 0) {
			reminder = num % 2;
			value = reminder + value;
			num/=2;
		}
		binary = Integer.valueOf(value);
		return binary;
	}
	
	/**
	 * Method name: binaryToDecimal
	 * @param num
	 * @return
	 */
	public static int binaryToDecimal(int num) {
		int decimalNum = 0;
		double pw = 0;
		int reminder = 0;
		int i = 0;
		while(num != 0) {
			reminder = num % 10;
			System.out.println(Math.pow(2, i));
			pw = reminder * Math.pow(2, i);
			
			decimalNum += pw; 
			num/=10;
			i++;
		}
		return decimalNum;
	}
	
	
	/*
	 * Method Name: getPrimeNumberPairs
	 * 
	 */
	public static void getPrimeNumberPairs(int num) {
		
		for(int i = 1; i <= num; i++) {
			
			if(isPrime(i)) {
				
				if(isPrime(num - i)) {
					
					System.out.println(i + " = " + (num-i));
				}
			}
		}
	}
	
	/**
	 * Method name: checkConsecutive
	 * Description: Write a code to return a value 'True' if the number '1' throughout the array appears consecutively. Ex: S = {1,1,1,0,0,3,4}.
	 * Else, return 'False' if the array does not have the given number (char = '1' in this case) in the consecutive order. Ex: S = {1,1,0,0,1,3,4}
	 * @param arr
	 * @param target
	 * @return
	 */
	public static boolean checkConsecutive(int [] arr, int target) {
		boolean result = true;
		int count = 0;
		int temp = 0;
		
		for(int i : arr) {
			if(i == target) {
				temp++;
				if(temp > count) {
					count = temp;
				}else {
					result = false;
					break;
				}
			}else {
				count = 0;
			}
		}
		return result;
	}
	
	/**
	 * Method Name: moveAllZeroToLeft
	 * @param arr
	 * @return
	 */
	
	public static int[] moveAllZeroToLeft(int [] arr) {
		int [] newArr = new int[arr.length];
		int c = arr.length-1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 1) {
				newArr[c--] = arr[i];
			}
		}
		return newArr;
	}
	
	/**
	 * Method name: findSubSet
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	
	private static int [] findSubSet(int[] s1, int[] s2) {
		
		int [] arr = {5,8};	
		int c = 0;int d=0;	
		int len = 0;		
		if(s1.length > s2.length) {
			len = s1.length;
		}else {
			len = s2.length;
		}		
		for(int i = 0; i < len; i++) {
			
			if(i < arr.length && i < s1.length && s1[i] == arr[c]) {
				c++;				
			}
			if(i < arr.length && i < s2.length && s2[i] == arr[d]) {
				d++;
			}		
		}
		
		if(c > d) {
			return s1;
		}else {
			return s2;
		}	
	}
	
	/**
	 * Method Name: Reverse sub array
	 * @param arr
	 * @param n
	 * @return
	 */
	public static int [] reverseSubArray(int [] arr, int n) {
		
		for(int i = 0; i < arr.length; i = i + n) {
			int left = i;
			int right = i + n - 1;
			while (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return arr;
	}
	
	/**
	 * Method name: getMinDiffBetweenPrimes
	 * You are given an array of integers. Find the minimum difference between two prime numbers(Positive or negative)
	 *  in the array when present with minimum time complexity and provide the test data to test the this code.
	 * @param arr
	 * @return
	 */
	public static int getMinDiffBetweenPrimes(int [] arr) {
		int min = 0;
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(isPrime(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i]+1));
			}
		}
		min = map.firstKey().intValue() - map.lastKey().intValue();
		return min;
	}
	
	
	/**
	 * Method name: most con a particular number 
	 * @param arr
	 * @return
	 */
	
	public static int mosConAParticularNum(int [] arr, int target) {
		int count = 0;
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				temp++;
				if(temp > count) {
					count = temp;
				}
			}else {
				temp = 0;
			}
		}
		return count;
	}
	
	/**
	 * Method name: margeArrayTo3rdArray
	 * Description: Merge two sorted array Note: You are not allowed to merge two array then sort array
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	
	public static int[] margeArrayTo3rdArray(int [] arr1, int [] arr2) {
		int len = arr1.length + arr2.length;
		int [] result = new int [len];
		int idxArr1 = 0;
		int idxArr2 = 0;
		for(int i = 0; i < len; i++) {
			if(idxArr1 == arr1.length) {
				result[i] = arr2[idxArr2++];
			}else if(idxArr2 == arr2.length) {
				result[i] = arr1[idxArr1++];
			}else if(arr1[idxArr1] < arr2[idxArr2]) {
				result[i] = arr1[idxArr1++];
			}else {
				result[i] = arr2[idxArr2++];
			}
		}
		return result;
	}
	
	/**
	 * Method name: notInCorrectPoint
	 * Description: Method will check  how many integer not in correct position
	 * @param list1
	 * @return
	 */
	 public static int notInCorrectPoint(List<Integer> list1) {
		   List<Integer> clone = new ArrayList<Integer>(list1);
		   Collections.sort(list1);
		   int count = 0;
		   for(int i = 0; i < list1.size(); i++) {
			   if(list1.get(i) != clone.get(i)) {
				   count++;
			   }
		   }
		   return count;
	   }
	
	/**
	 * Method name: largestSubString
	 * @param text
	 * @return
	 */
	
	public static String largestSubString(String text) {
    	String larg = ""; 
    	String [] wordArray = text.replaceAll("[^a-zA-Z]"," ").split(" ");
    	int curLen = 0;
    	for(int i = 0; i < wordArray.length; i++) {
    		if(wordArray[i].length() > curLen) {
    			curLen = wordArray[i].length();
    			larg = wordArray[i];
    		}
    		
    	}
    	
    	return larg;
    }
	
	/**
	 * Method Name : mixString
	 * Description: This method will add 1 char from one string another char from other string. That means mix string 
	 * @param a
	 * @param b
	 * @return
	 */
	public static String mixString(String a, String b) {
		String str = "";
		int len = 0;
		if(a.length() >= b.length()) {
			len = a.length();
		}else {
			len = b.length();
		}
		for(int i = 0; i < len; i++) {
			if(i < a.length()) {
				str = str + a.charAt(i);
			}
			if(i < b.length()) {
				str = str + b.charAt(i);
			}
		}
		return str;
	}
	
	/**
	 * Method name: getAuthorAndBook
	 * Description:You have been given a map which holds book name and book author. Oneauthor might have several different books.
	    But books are unique. Now, write a function which will return you a Map which will have the author name as 
	    unique and all the books he has written as values.
	 * @param map
	 * @return
	 */
	public static Map<String, List<String>> getAuthorAndBook(Map<String,String> map){
		Map<String, List<String>> result = new HashMap<String, List<String>>();
		List<String> John = new ArrayList<String>();
		List<String> Rob = new ArrayList<String>();
		
		for(Map.Entry<String, String> m: map.entrySet()) {
			if(m.getValue().equalsIgnoreCase("John")) {
				John.add(m.getKey());
				result.put("John", John);
			}
			if(m.getValue().equalsIgnoreCase("Rob")) {
				Rob.add(m.getKey());
				result.put("Rob", Rob);
			}
		}
		return result;
	}
	
	public static int[] sortPositiveNegative(int[] arr) {
		Arrays.sort(arr);
		int c = 0;
		int [] result = new int [arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] < 0) {
				result[c++] = arr[i];
			}
			if( arr[arr.length-1-i] >= 0) {
				result[c++] = arr[arr.length-1-i];
			}
		}
		return result;
	}
	
	/**
	 * MethodName: getArrayUnionstatus 
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	 public static int [] getArrayUnion(int [] arr1, int [] arr2){
	      Set<Integer> set1 = new TreeSet<Integer>();
	      for(int i: arr1){
	          set1.add(i);
	    }
	     for(int i : arr2){
	        if(!set1.contains(i)){
	             set1.add(i);
	         }
	     }
	      int[] result =new int [set1.size()];
	      int c = 0;
	      for(int i: set1){
	          result[c++] = i;
	      }
	      return result;
	  }
	
	/**
	 * Method name : bestTimetoBuyandSellStock (LeetCode)
	 * Description: 
	 * @param arr
	 * @return
	 */
	public static int bestTimetoBuyandSellStock(int [] arr) {
		int maxPrice = 0;
		int minPrice = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < minPrice) {
				minPrice = arr[i];
			}else {
				if(maxPrice < arr[i] - minPrice) {
					maxPrice = arr[i] - minPrice;
				}
			}
		}
		return maxPrice;
	}
	
	/**
	 * Method name : longestContinuousIncreasingSubsequence
	 * Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 
                    Even though [1,3,5,4,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4. 
	 * @param arr
	 * @return
	 */
	
	public static int longestContinuousIncreasingSubsequence(int[] arr) {
		int temp = 1;
		int count = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] < arr[i+1]) {
				temp++;
				if(temp>count) {
					count = temp;
				}
			}else {
				temp = 1;
			}
		}
		return count;
	}
	/*
	 * Method name: sortestWordDistance
	 * Description: This method will help to find the shortest distance between two word
	 * 
	 */
	
	
	/**
	 * Method name: mostConsecutiveNum
	 * @param arr
	 * @return
	 */
	
	public static int mostConsecutiveNum(int [] arr) {
		int count = 0;
		int currCount = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				currCount++;
				if (currCount > count) {
					count = currCount;					
				}
			} else {
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
			
				char c = key.charAt(position);
				encrypted = encrypted + c;
			
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

	public static int maximumConsecutiveRepeatingCharacter(String text) {
		int temp = 1;
		int count = 0;
		char [] arr = text.toCharArray();
		for(int i = 0; i < arr.length-1; i++) {
			
			if(arr[i] == arr[i+1]) {				
				temp++;
				if(temp > count) {
					count = temp;
				}
			}else {
				temp = 1;
			}
		}
		return count;
		
	
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
	  public static int [] mergeTwoArraySort(int [] arr1, int [] arr2){
	       int [] newArray = new int[arr1.length+arr2.length];
	       int c = 0;
	       for(int i: arr1){
	           newArray[c++] = i;
	        }
	       for(int i: arr2){
	           newArray[c++] = i;
	       }
	       Arrays.sort(newArray);
	       return newArray;
	   }
	
	public static int[] mergeTwoArraySortold(int[] arr1, int[] arr2) {
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
//		int[] result = new int[2];
//		Arrays.sort(arr);
//		int maxNum = arr[0] * arr[1];
//		int indexOne = 0;
//		int indexTwo = 0;
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (maxNum < arr[i] * arr[i + 1]) {
//				maxNum = arr[i] * arr[i + 1];
//				result[0] = arr[i];
//				result[1] = arr[i + 1];
//			} else {
//				result[0] = arr[indexOne];
//				result[1] = arr[indexTwo + 1];
//
//			}
//		}

//		return result;
		
		int [] result = new int [2];	
		int max1 = arr[0], max2 = Integer.MIN_VALUE;
		int min1 = arr[0], min2 = Integer.MAX_VALUE;	
		for(int i = 0; i < arr.length; i++) {	
			if(arr[i] > max1) {
				max2= max1;
				max1 = arr[i];
			}
			else if(arr[i] > max2) {
				max2 = arr[i];
			}			
			if(arr[i] < min1) {
				min2= min1;
				min1 = arr[i];
			}
			else if(arr[i] < min2) {
				min2 = arr[i];
			}		
		}		
		if(max1 * max2 > min1* min2) {
			result[0] = max1;
			result[1] = max2;
		}else {
			result[0] = min1;
			result[1] = min2;
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

	public static int getNearestPalindrome(int num) {
		int a = 0;		
		while(true) {
			a += 1;
			int decrease = num - a;
			int increase = num + a;
			if(isPalindromeFNG(increase)) {
				return increase;
			}else if(isPalindromeFNG(decrease)){
				return decrease;
			}
			
		}
	}

	// This method is used for getNearestPalindrome
	public static boolean isPalindromeFNG(int num) {
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
		int j = 0;
		int [] temp = new int[arr.length];

		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j] = arr[i];
				j++;
			}

		}
		temp[j] = arr[arr.length-1];				
		return temp;
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
	 public static String getUnion(String text1, String text2){
	        String union = "";
	        String newText = text1.concat(text2);
	        char[] ch = newText.toCharArray();
	        Map<Character, Integer> map = new TreeMap<Character, Integer>();
	        for(char c : ch){
	            if(!map.containsKey(c)){
	               map.put(c, 1); 
	            }
	        }
	        for(Entry<Character, Integer> m: map.entrySet()){
	            union = union + String.valueOf(m.getKey());
	        }
	        return union;
	    }

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

	public static int getMinDistance(int[] arr) { // 7,2,8,4,6 //2,4,6,7,9

		
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

	public static boolean isPerfectNum(int num) {
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
	 * Method:getPrimeFactor What is prime factorization:
	 * https://www.khanacademy.org/math/pre-algebra/pre-algebra-factors-multiples/pre-algebra-prime-factorization-prealg/v/prime-factorization-exercise
	 * 
	 * @param number
	 * @return
	 */

	public static ArrayList<Integer> getPrimefactorization(int number) {
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
	
	    for(int i=2;i<num;i++) {
	        if(num%i==0)
	            return false;
	    }
	    return true;
		
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