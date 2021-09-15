package com.anurag;

public class Main {

    public static void main(String[] args) {
        int[] arr=  {2, 3,85, 45, 7 };
        int target = 2;
        int num = LinearSearch(arr , target);
        System.out.println(num);


    }

    static int LinearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        // run a loop for searching the array fully
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
            return -1;

        }
    }

