package ru.netology;

public class StatsService {
    public int totalMonthSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int findAverage(int[] sales) {
        return totalMonthSum(sales) / sales.length;
    }

    public int findMonthMax(int[] sales) {
        int monthMax = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[monthMax]) {
                monthMax = month;
            }
            month++;
        }
        return monthMax + 1;
    }

    public int findMonthMin(int[] sales) {
        int monthMin = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[monthMin]) {
                monthMin = month;
            }
            month++;
        }
        return monthMin + 1;
    }

    public int findMonthDownAverage(int[] sales) {
        int downAverage = 0;
        for (int sale : sales) {
            if (sale < findAverage(sales)) {
                downAverage++;
            }
        }
        return downAverage;
    }

    public int findMonthUpAverage(int[] sales) {
        int upAverage = 0;
        for (int sale : sales) {
            if (sale > findAverage(sales)) {
                upAverage++;
            }
        }
        return upAverage;
    }
}