package com.wangwenjun.scala.chapter8;

/***************************************
 * @author:Alex Wang
 * @Date:2017/6/15
 * QQ:532500648
 * QQ交流群:286081824
 ***************************************/
public class RecursionTest {


    public int factor(int n) {
        return loop(1, n);
    }

    private int loop(int acc, int n) {
        for (; ; ) {
            if (n <= 1) return acc;
            else acc = acc * n--;
        }
    }

    public static void main(String[] args) {
        System.out.println(new RecursionTest().factor(10));
    }
}
