package com.example;

import org.junit.Test;

public class mutationTest {
    //***********************************************************
    //  Come up with an initial set of at least 3 test cases
    //
    //
    //  1. How many mutants are there?
    //  2. How many test cases do you need to kill the non-equivalent mutants?
    //  3. What mutation coverage where you able to acheive before analyzing for equivalent mutants?
    //  4. How many equivalent mutants are there
    //
    //
    //  Turn in your Java code and associated graphs as an addition document in a format I can easily open
    //  (e.g.MS Word, PDF).
    //***********************************************************


    //public static int cal(int month1, int day1, int month2, int day2, int year)



    //test for (+) days/months
    @Test
    public void testCal() {
        int m1 = 1, d1 = 12, m2 = 6, d2 = 6, year = 1984;
    }

    //test for month1 <= month2
    @Test
    public void test() {
        int m1 = 1, d1 = 12, m2 = 6, d2 = 6, year = 1984;
    }

    //test for year > 10000     (also messes up leap year part)
    @Test
    public void test() {
        int m1 = 1, d1 = 12, m2 = 6, d2 = 6, year = 1984;
    }
}
