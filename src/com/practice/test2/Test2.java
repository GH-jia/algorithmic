package com.practice.test2;

/**
 * Insert sort
 * Insert unordered elements one by one into ordered elements,
 * In order to insert elements, we need to make room for free,
 * Move all remaining elements to the right by one bit.
 * Pick the second element of the array,compare it to the first element on the left,
 * If the first element on the left is larger than it,it continues to compare with
 * the second element on the left.Continue,until it encounters elements smaller than
 * it.Then it is inserted to the right of this element.
 * Continue to select the third element.Repeat the above steps.
 * time complexity: pow(n,2)
 * space complexity: 1
 */

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {3,45,1,4,6,41,23,16,43,2,33,72,8};
        int n = arr.length;
        for (int i=1;i<n;i++){
            int temp = arr[i];
            int j=0;
            for (j=i-1;j>=0;j--){
                if (temp < arr[j]){
                    arr[j+1] = arr[j];
                }
                else {
                    break;
                }
            }
            arr[j+1] = temp;
        }
        for (int a:
                arr) {
            System.out.print(a + " ");
        }
    }
}
