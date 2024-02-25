package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when98to63then5dot83() {
        double expected = 5.83;
        int x1 = 9;
        int y1 = 8;
        int x2 = 6;
        int y2 = 3;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void  whenMinus6Minus5to22then10dot63() {
        double expected = 10.63;
        int x1 = -6;
        int y1 = -5;
        int x2 = 2;
        int y2 = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}