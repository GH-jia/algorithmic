package com.practice.test3;

import java.lang.reflect.Array;

public class Test3 {

    public static int partition(int[] arr,int left,int right){
        int p = arr[left];
        int l = left+1;
        int r = right;
        while (true){
            while (l<=r && p>arr[l]){
                l++;
            }
            while (l<=r && p<arr[r]){
                r--;
            }
            if (l>=r){
                break;
            }
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
        arr[left] = arr[r];
        arr[r] = p;




        return r;
    }

    public static int[] quickSort(int[] arr,int left,int right){
        if (left < right){
            int mid = partition(arr,left,right);
            arr = quickSort(arr,left,mid-1);
            arr = quickSort(arr,mid+1,right);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3,45,1,4,6,41,23,16,43,2,33,72,8};
        int n = arr.length;
        arr = quickSort(arr,0,n-1);

        for (int a:
                arr) {
            System.out.print(a + " ");
        }
    }
}
