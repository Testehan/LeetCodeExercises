package com.testehan.leetcode.easy.e463;

// 463. Island Perimeter

public class Solution {

    public static int islandPerimeter(int[][] grid) {
        int perimeter=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length; j++){
               if (grid[i][j]==1){
                   perimeter=perimeter+4;

                   // if upper cell is also land, remove 2 lines from perimeter, 2 because we remove 1 from the current
                   // cell and the previous one (meaning the upper cell)
                   if (i > 0 && grid[i-1][j] == 1){
                       perimeter -= 2;
                   }
                   // if left cell is also land, remove 2 limes from perimeter, 2 because we remove 1 from the current
                   // cell and the previous one (meanning the left cell)
                   if (j > 0 && grid[i][j-1] == 1){
                       perimeter -= 2;
                   }
               }
            }
        }

        return perimeter;
    }


    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},
                        {1,1,1,0},
                        {0,1,0,0},
                        {1,1,0,0}};

        System.out.println(islandPerimeter(grid));
    }

}
