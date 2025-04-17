package com.plurasight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        // create a array of 10 test scores
        int[] nums = {100,85,78,90,86,92,82,73,99,85};

        int sum = 0;
        int highScore = nums[0];
        int lowScore = nums[0];

        for (int i = 0; i <nums.length; i++) {
            sum += nums[i];
            if (nums[i] > highScore) {
                highScore = nums[i];
            }
            if (nums[i] < lowScore) {
                lowScore = nums[i];
            }
        }

        double average = (double) sum / nums.length;

        // sort the array to get the median
        Arrays.sort(nums);
        double median;
        if (nums.length % 2 ==0) {
            median = (nums[nums.length / 2 -1] + nums[nums.length / 2]) / 2.0;
        } else {
            median = nums[nums.length / 2];
        }

        System.out.println("Average score: " + average);
        System.out.println("High score: " + highScore);
        System.out.println("Low score: " + lowScore);
        System.out.println("Median score: " + median);
        System.out.println("Difference between average and median: " + Math.abs(average - median));
  }
}