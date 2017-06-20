package ru.job4j.convert;

import java.util.ArrayList;
import java.util.List;

/**
 *@author Nikita Zenkin.
 *@since 16.06.2017.
 *@version 1.
 */
public class ConvertList {
    /**
     * Method which convert 2-dimensional array of integer to List object..
     * @param array int[][].
     * @return List.
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] rows : array) {
            for (int element : rows) {
                list.add(element);
            }
        }
        return list;
    }

    /**
     * Method which convert List object to 2-dimensional array of integer.
     * @param list List.
     * @param rows int.
     * @return int[][].
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int[][] newArray = new int[list.size() % rows == 0 ? list.size() / rows : list.size() / rows + 1][rows];
        int temp = 0;
        int countCols = 0;
        for (int index = 0; index < list.size(); index++) {
            newArray[countCols][temp++] = list.get(index);
            if (temp == rows) {
                temp = 0;
                countCols++;
            }
        }
        return newArray;
    }
}
