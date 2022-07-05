package ru.netology.stats.statistic.service;
public class StatsService {
    public long summSales(long[] sales) {
        long summ = 0;
        for (long sale : sales) {
            summ = summ + sale;
        }
        return summ;
    }

    public long averageSales(long[] sales) {
        long average = summSales(sales) / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
           month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int countMonthMin(long[] sales) {
        int countMonth = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;
    }

    public int countMonthMax(long[] sales) {
        int countMonth = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;
    }
}




