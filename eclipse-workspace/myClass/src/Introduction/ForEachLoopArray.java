package Introduction;

public class ForEachLoopArray {
/* For-each loop 
 * 
 * arrays are use for store multiple values in a single variable 
 * value inside the array call elements 
 * to access the elements inside the array you have to use "index" concept
 * 
 * 
 * i want to store numbers 1 to 10 in one variable called "Numbers"
	
	*/
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10}; // this is array 
		// "int" data type, 
		//number is variable name and can be anything 
		// inside the curly bracket is values of the variable.
		// that values are elements.
		numbers[8] = 20;// to replace the index number 8 and index start with 0 
		
		//System.out.println(numbers[8]);
		
		
		//length of array gives you total number of elements are inside the array.
		System.out.println(numbers.length );
		
		
		/* steps to declare  an arrays
		 * 1. data type of the values
		 * 2. array sign - square bracket- []
		 * 3. =
		 * 4. { left curly bracket or building block
		 * 5. the values separated by comma(,)
		 * 6. close the right  } curly bracket/building block.
		 * */
		
	

	}

}
