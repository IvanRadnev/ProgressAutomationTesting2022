package com.company;

public class Homework1 {
    public static void main(String[] args) {

        int arr[] = {18, 24, 21, 27, 19};

        System.out.println("The minimum element is " + minNum(arr));
        System.out.println("The maximum element is " + maxNum(arr));
    }

    public static int minNum(int arr[]){
        int i;
        int min = arr[0];

        for (i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return min;
    }

    public static int maxNum(int arr[]){
        int i;
        int max = arr[0];

        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }
}
