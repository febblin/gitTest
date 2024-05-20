package com.newgame.game;

import java.util.*;

public class T1 {
    public static void main(String[] args) {
        int[] a = {0,2,4,6}, b = {1,3,5,10};
        System.out.println(t1(a, b));
        System.out.println(t2(10));
    }

    private static ArrayList<Integer> t1(int[] a, int[] b){
        HashSet<Integer> set = new HashSet<>();
        for (int i : a) set.add(i);
        for (int i : b) set.add(i);
        ArrayList<Integer> c = new ArrayList<>();
        for (Integer i : set) {c.add(0, i);}
        return c;
    }

    private static int t2(int fiers){
        int time = 0;
        if (fiers==1) time = 2;
        while (fiers >= 2){
            time+=4;
            fiers--;
        }
        time += fiers*2;
        return time;
    }
}
