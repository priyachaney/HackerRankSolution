/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

*/


public class Solution {
    public static void main(String[] args){
    int num1[]={1,2,3,0,0,0};
    int num2[]={2,5,6};
    int m = 3;
    int n = 3;
    merge(num1,m,num2,n);

    for (int i =0; i< m+n; i++){
        System.out.println(num1[i] + " ");
    }
    }

    public static void merge(int[] num1, int m, int[] num2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while (j>=0){
            if (i>=0 && num1[i]>num2[j]){
                num1[k] = num1[i];
                k--;
                i--;
            }else {
                num1[k] = num2[j];
                j--;
                k--;
            }

        }
    }

}


