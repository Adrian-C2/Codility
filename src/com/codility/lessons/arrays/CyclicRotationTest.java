package com.codility.lessons.arrays;

import org.junit.Assert;
import org.junit.Test;

public class CyclicRotationTest {
    CyclicRotation tester = new CyclicRotation();

    @Test
    public void test0() {
        int[] A = {3, 8, 9, 7, 6};

        Assert.assertArrayEquals(tester.solution(A, 0), new int[]{3, 8, 9, 7, 6});
    }

    @Test
    public void test1() {
        int[] A = {3, 8, 9, 7, 6};

        Assert.assertArrayEquals(tester.solution(A, 1), new int[]{6, 3, 8, 9, 7});
    }

    @Test
    public void test3() {
        int[] A = {3, 8, 9, 7, 6};

        Assert.assertArrayEquals(tester.solution(A, 3), new int[]{9, 7, 6, 3, 8});
    }
}