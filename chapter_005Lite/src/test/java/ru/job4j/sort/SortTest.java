package ru.job4j.sort;


import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 26.06.2017.
 */
public class SortTest {
    /**
     * Test method sort in SortUser.
     */
    @Test
    public void whenSortArrayListThenReturnSortedTreeSet() {
        Sort.SortUser sortUser = new Sort.SortUser();
        List<Sort.User> arrayList = new ArrayList<>();
        arrayList.add(new Sort.User(20, "Temmy"));
        arrayList.add(new Sort.User(26, "Demmy"));
        arrayList.add(new Sort.User(18, "Cemmy"));
        Set<Sort.User> result = sortUser.sort(arrayList);
        Set<Sort.User> expected = new TreeSet<>();
        expected.add(new Sort.User(18, "Cemmy"));
        expected.add(new Sort.User(20, "Temmy"));
        expected.add(new Sort.User(26, "Demmy"));
        assertThat(result, is(expected));
    }
}
