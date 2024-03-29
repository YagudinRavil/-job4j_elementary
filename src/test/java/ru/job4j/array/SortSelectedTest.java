package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[] {100, 45, 19};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {19, 45, 100};
        assertThat(result).containsExactly(expected);
    }
    @Test
    public void whenSort2() {
        int[] data = new int[] {30, 40, 10, 20, 50};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 20, 30, 40, 50};
        assertThat(result).containsExactly(expected);
    }
}