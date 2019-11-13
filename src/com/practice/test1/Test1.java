package com.practice.test1;

/**
 * 选择排序：
 * 首先找到数组中最小的那个元素，然后把这个元素与数组的第一个元素交换位置，
 * 其次，在剩下的元素中找到最小的元素，然后把这个元素与数组的第二个元素交换位置
 * 重复此操作
 * 时间复杂度：O（pow（n，2））
 * 空间复杂度：O（1）
 */

public class Test1 {
    public static void main(String[] args) {
        for (String str:args) {
            System.out.println(str);
        }

        int[] arr = {3,45,1,4,6,4,23,16,43,2,33,72,8};
        int n = arr.length;
        int i=0;
        for (i=0;i<n-1;i++){
            int min = i;
            for (int j=i+1;j<n;j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int a:
             arr) {
            System.out.print(a + " ");
        }

    }
}
