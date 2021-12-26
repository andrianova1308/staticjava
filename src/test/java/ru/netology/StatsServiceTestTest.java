package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTestTest {

    @Test
    void shouldTotalMonthSum() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.totalMonthSum(managerSales);
        assertEquals(expected, actual);
    }


    @Test
    void shouldFindAverage() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAverage(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthMax() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMonthMax(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthMin() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMonthMin(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthDownAverage() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findMonthDownAverage(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthUpAverage() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findMonthUpAverage(managerSales);
        assertEquals(expected, actual);
    }
}