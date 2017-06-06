package ru.job4j.array;

/**
 *@author Nikita Zenkin.
 *@since 06.06.2017.
 *@version 1.
 */
 
public class ArrayMerger {
	/**
	 * @return int[]. Sorted merger array.
	 * @param array1 int[]. First sorted array.
	 * @param array2 int[]. Second sorted array.
	 */
	 public int[] merger(int[] array1, int[] array2) {
		 int[] sortedMergerArray = new int[array1.length + array2.length];
		 int count1 = 0;
		 int count2 = 0;
		 
		 for (int i = 0; i < sortedMergerArray.length; i++) {
             if (array1[count1] < array2[count2]) {
                 sortedMergerArray[i] = array1[count1++];
                 if (count1 == array1.length) {
                     for (int j = count2; j < array2.length; j++) {
                         sortedMergerArray[count1 + j] = array2[j];
                     }
                     break;
                 }
             } else {
                 sortedMergerArray[i] = array2[count2++];
                 if (count2 == array2.length) {
                     for (int j = count1; j < array1.length; j++) {
                         sortedMergerArray[count2 + j] = array1[j];
                     }
                     break;
                 }
             }
         }
		 return sortedMergerArray;
	 }
}