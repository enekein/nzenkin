package ru.job4j.convert;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *@author Nikita Zenkin.
 *@since 19.06.2017.
 *@version 1.
 */
public class ConvertListTest {
    /**
     * Test method toArray with correct situation.
     */
    @Test
    public void whenArrayListConvertToArrayThenReturnArray() {
        ConvertList convertList = new ConvertList();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            arrayList.add(i);
        }
        int[][] expected = new int[][] {
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 0, 0},
        };
        int[][] result = convertList.toArray(arrayList, 3);
        assertThat(result, is(expected));
    }

    /**
     * Test method toList with correct situation.
     */
    @Test
    public void whenArrayConvertToArrayListThenReturnList() {
        ConvertList convertList = new ConvertList();
        int[][] array = new int[][] {
                new int[]{1, 2, 3, 4},
                new int[]{5, 6, 7, 8},
        };
        List<Integer> expected = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            expected.add(i);
        }
        List<Integer> result = convertList.toList(array);
        assertThat(result, is(expected));
    }
}
