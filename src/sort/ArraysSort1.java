package sort;

import java.util.Arrays;

/**
 Sorting arrays:
------------------------

use  Arrays.sort() method to sort any array in ASC order
use Arrays.toString() method for printing


 */
public class ArraysSort1 {
public static void main(String[] args) {
	 //sort primitives array like int array
    int[] intArr = {5,9,1,10,3,10,78,23,4,7};
    Arrays.sort(intArr);
    System.out.println(Arrays.toString(intArr));
}
}
