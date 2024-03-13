package com.banktalib.Users;

/**
 * Hello world!
 *
 */
public class App 
{


        public static void main(String[] args){
            int nums[] = {1, 3, 6, 8, 10, 13, 16, 18};
            int searched_num = 13;

            int[] result = Interpolation_search(nums, searched_num);


            System.out.println(searched_num + " is found at index " + result[0] + " after " + result[1] + " iterations.");

        }

    public static int[] Interpolation_search(int[] nums, int searched_num) {
        int low_num = 0;
        int high_num = nums.length - 1;
        int mid_num = 0;
        int iterations = 0;

        while (nums[high_num] != nums[low_num] && nums[low_num] <= searched_num && nums[high_num] >= searched_num) {
            iterations++;
            mid_num = low_num + ((searched_num - nums[low_num]) * (high_num - low_num) / (nums[high_num] - nums[low_num]));
            if (searched_num > nums[mid_num])
                low_num = mid_num + 1;
            else if (searched_num < nums[mid_num])
                high_num = mid_num - 1;
            else
                return new int[]{mid_num, iterations};
        }
        return new int[]{mid_num, iterations};

    }
    }


