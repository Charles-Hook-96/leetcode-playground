package org.example;

import java.util.Arrays;

//1672. Richest Customer Wealth
//Test data: int[][] matrix = {{1, 2, 3}, {3, 2, 1}};
//Determine which customer has more wealth of the two in the given array above
public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int[][] matrix = {{1, 2, 3}, {3, 2, 1}};
        /*
        * Notes: The first iteration is for x customer in the loop - so we reset the running total to 0
        * The second iteration actually adds up the money
        * */
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }

        return maxWealth;
    }

}