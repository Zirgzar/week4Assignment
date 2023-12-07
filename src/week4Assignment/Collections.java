package week4Assignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		// 1. Create array of int with given values
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// 1a. Subtract value of first element from value of last (93 - 3 = 90)
		System.out.println(ages[ages.length -1] - ages[0]);
		
		// 1b. i. Create new array with 9 elements
		int[] ages2 = {7, 23, 13, 36, 42, 69, 5, 50, 19};
		
		// 1b. ii. Repeat step 1a. on new array (19 - 7 = 12)
		System.out.println(ages2[ages2.length -1] - ages2[0]);
		
		// 1c. Iterate through and calc average age (264 / 9 = 29 (29.333~ as float))
		int total = 0;
		for (int i = 0; i < ages2.length; i++) {
			total += ages2[i];
		}
		int average = total / ages2.length;
		System.out.println(average);
		
		// 2. Create array of strings with given values
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// 2a. Loop through and calculate average number of letters per name (23 / 6 = 3 (3.8333 if a float))
		int totNames = 0;
		for (String s : names) {
			totNames += s.length();
		}
		int avgNames = totNames / names.length;
		System.out.println(avgNames);
		
		// 2b. Loop through and concatenate names seperated by spaces (added check to remove trailing space)
		String concatNames = "";
		for (String s : names) {
			if (s == names[names.length -1]) {
				concatNames += s;
			} else {
				concatNames += s + " ";
			}
		}
		System.out.println(concatNames);
		
		// 3. How do you access the last element of an array?
		// Answer: array[array.length - 1]
		
		// 4. How do you access the first element of an array?
		// Answer: array[0]
		
		// 5. Create an array of int named "nameLengths" to loop through names array and add length of each name to new array
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		// 6. Loop over nameLengths and calculate the sum (23)
		int sumNameLengths = 0;
		for (int i : nameLengths) {
			sumNameLengths += i;
		}
		System.out.println(sumNameLengths);
		
		// 7a. Test method written in 7
		System.out.println(concatenateWord("Hello", 3));
		
		// 8a. Test method written in 8
		System.out.println(makeFullName("Seth", "Tor"));
		
		// 9a. Test method written in 9
		// 9a. i. nameLengths sum = 23 so should return false
		System.out.println(checkSumGreaterThan100(nameLengths));
		// 9a. ii. ages2 sum = 264 so should return true
		System.out.println(checkSumGreaterThan100(ages2));
		
		// 10a. Test method written in 10 (190.93 / 4 = 47.7325)
		double[] testDblArr = {30.33, 50.50, 10.1, 100.0};
		System.out.println(returnAverageOfArray(testDblArr));
		
		// 11a. Test method written in 11
		double[] secondDblArr = {20.2, 11.1, 80.8}; // (112.1 / 3 = 37.3666~)
		// 11a. i. testDblArr average > secondDblArr average so should return true
		System.out.println(checkAverageFirstGreaterThanSecondArray(testDblArr, secondDblArr));
		// 11a. ii. secondDblArr average < testDblArr average so should return false
		System.out.println(checkAverageFirstGreaterThanSecondArray(secondDblArr, testDblArr));
		
		// 12a. Test method written in 12
		// 12a. i. hot = true && money = 12 = will return true
		System.out.println(willBuyDrink(true, 12));
		// 12a. ii. hot = true && money = 4 = will return false
		System.out.println(willBuyDrink(true, 4));
		// 12a. iii. hot = false && money = 20 = will return false
		System.out.println(willBuyDrink(false, 20));
		
		// 13a. Test method written in 13
		// 13a. i. Create Set of gifts to buy and Map of gifts bought;
		Set<String> wishList = new HashSet<>();
		wishList.add("Barbie");
		wishList.add("Paw Patrol");
		wishList.add("Bike");
		wishList.add("Stuffed Animal");
		
		Map<String, Boolean> boughtGifts = new HashMap<>();
		boughtGifts.put("Barbie", true);
		boughtGifts.put("Paw Patrol", false);
		boughtGifts.put("Bike", false);
		
		// 13a. ii. Still need to buy a stuffed animal, still need to wrap the Paw Patrol and bike, the Barbie is all done
		checkingItTwice(wishList, boughtGifts);
		
		// 13a. iii. Wrapped Paw Patrol, bought stuffed animal, need to buy should be empty, need to wrap stuffed animal and bike, Barbie and Paw Patrol are completed
		boughtGifts.put("Stuffed Animal", false);
		boughtGifts.put("Paw Patrol", true);
		checkingItTwice(wishList, boughtGifts);
		
	}
	
	// 7. Write a method that takes 2 args, String word and int n, and concatenates word n amount of times
	public static String concatenateWord(String word, int n) {
		String finalString = "";
		
		for (int i = 0; i < n; i++) {
			finalString += word;
		}
		
		return finalString;
	}
	
	// 8. Write method that takes first and last name and returns a full name
	public static String makeFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	// 9. Write method that takes array of int and returns true if sum of array is > 100
	public static boolean checkSumGreaterThan100(int[] intArr) {
		int sum = 0;
		for (int i : intArr) {
			sum += i;
		}
		
		return sum > 100;
	}
	
	// 10. Write method that takes array of double and returns average of array
	public static double returnAverageOfArray(double[] dblArr) {
		double sum = 0;
		for (double n : dblArr) {
			sum += n;
		}
		double avg = sum / dblArr.length;
		
		return avg;
	}
	
	// 11. Write method that takes 2 arrays of double and return true if average of first array > average of second array
	public static boolean checkAverageFirstGreaterThanSecondArray(double[] firstArr, double[] secondArr) {
		double firstAvg = returnAverageOfArray(firstArr);
		double secondAvg = returnAverageOfArray(secondArr);
		
		return firstAvg > secondAvg;
	}
	
	// 12. Write a method called willBuyDrink that tkaes boolean isHotOutside and double moneyInPocket and return true if hot == true && money > 10.50
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside && moneyInPocket > 10.50);
	}
	
	// 13. (Own method) Method will compare a set, giftsToBuy, and a map, giftsBought, that has the gifts and a boolean value for
	//     if they are wrapped, and will remove items from giftsToBuy if item is in giftsBought, and creates a set called giftsToWrap if the boolean is false
	//     and a set for completed presents.
	public static void checkingItTwice(Set<String> giftsToBuy, Map<String, Boolean> giftsBought) {
		giftsToBuy.removeAll(giftsBought.keySet());
		Set<String> giftsToWrap = new HashSet<>();
		Set<String> completedPresents = new HashSet<>();
		
		for (String gift : giftsBought.keySet()) {
			if (giftsBought.get(gift) == false) {
				giftsToWrap.add(gift);
			}
			if (giftsBought.get(gift) == true) {
				completedPresents.add(gift);
			}
		}
		
		
		System.out.println("Still need to buy: " + giftsToBuy);
		System.out.println("Still need to wrap: " + giftsToWrap);
		System.out.println("Completed: " + completedPresents);
	}

}
