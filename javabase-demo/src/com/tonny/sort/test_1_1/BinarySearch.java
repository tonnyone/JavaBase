package com.tonny.sort.test_1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by tonny on 2016/8/14.
 */
public class BinarySearch {

    public static int rank(int key,int[] a ) {

        int lo = 0;
        int hi = a.length-1;
        while (lo <= hi ){
            int mid = lo + (hi - lo)/2;
            if(key<a[mid]) hi=mid-1;
            if(key>a[mid]) lo=mid+1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whilelist = In.readInts(args[0]);
        Arrays.sort(whilelist);
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(rank(key,whilelist)== -1){
                StdOut.println(key);
            }
        }
    }
}
