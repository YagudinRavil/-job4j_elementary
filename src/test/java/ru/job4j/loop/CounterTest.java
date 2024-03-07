package ru.job4j.loop;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void whenSum0to10() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        AssertionsForClassTypes.assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSum3to8() {
        int start = 3;
        int finish = 8;
        int result = Counter.sum(start, finish);
        int expected = 33;
        AssertionsForClassTypes.assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSum1to1() {
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 1;
        AssertionsForClassTypes.assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSum5to1() {
        int start = 5;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 0;
        AssertionsForClassTypes.assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSum99to222() {
        int start = 99;
        int finish = 222;
        int result = Counter.sum(start, finish);
        int expected = 19902;
        AssertionsForClassTypes.assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom10To8() {
        int start = 10;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus28To8() {
        int start = -28;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = -190;
        assertThat(result).isEqualTo(expected);
    }

}