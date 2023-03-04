import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[][] map = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, -1, 0, 0},
                {-1, 0, 0, 0, 0, 0},
                {0, -1, 0, 0, 0, 0},
                {0, 0, 0, 0, -1, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == -1){
                    continue;
                }
                if (i==0 && j==0){
                    count += Math.abs(map[0][1] + map[1][1] + map[1][0]);
                }
                if (i==0 && j==5){
                    count += Math.abs(map[0][4] + map[1][4] + map[1][5]);
                }
                if (i==0 && j<5 && j>0){
                    count += Math.abs(map[i][j-1] + map[i+1][j-1] + map[i+1][j] + map[i+1][j+1] + map[i][j+1]);
                }
                if (i==5 && j==0){
                    count += Math.abs(map[4][0] + map[4][1] + map[5][1]);
                }
                if (i==5 && j==5){
                    count += Math.abs(map[5][4] + map[4][4] + map[4][5]);
                }
                if (j==0 && i<5 && i>0){
                    count += Math.abs(map[i-1][j] + map[i-1][j+1] + map[i][j+1] + map[i+1][j+1] + map[i+1][j]);
                }
                if (j==5 && i>0 && i<5){
                    count += Math.abs(map[i-1][j] + map[i-1][j-1] + map[i][j-1] + map[i+1][j-1] + map[i+1][j]);
                }
                if (i==5 && j>0 && j<5){
                    count += Math.abs(map[i][j-1] + map[i-1][j-1] + map[i-1][j] + map[i-1][j+1] + map[i][j+1]);
                }
                if (i>0 && i<5 && j>0 && j<5){
                    count += Math.abs(map[i-1][j-1] + map[i-1][j] + map[i-1][j+1] + map[i][j+1] + map[i+1][j+1] + map[i+1][j] + map[i+1][j-1] + map[i][j-1]);
                }
            }
        }
        System.out.println(count);
    }
}