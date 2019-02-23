package com.wyc.sword.thirteen;


/**
 * 机器人走格子，当前位置行列坐标的每一位加和不得大于限定值
 * 这个题存在一定的疑问，可能原书想表达的意愿与我所想的不一样
 */
public class MoveCount {
    public int movingCount(int threshold, int rows, int cols) {
        if (threshold < 0)
            return 0;
        boolean[] visited = new boolean[rows * cols];
        return movingCountCore(threshold, rows, cols, 0, 0, visited);
    }

    private int movingCountCore(int threshold, int rows, int cols, int row, int col, boolean[] visited) {
        int count = 0;
        if (check(threshold, rows, cols, row, col, visited)) {
            visited[row * cols + col] = true;
            count = 1 + movingCountCore(threshold, rows, cols, row + 1, col, visited)
                    + movingCountCore(threshold, rows, cols, row - 1, col, visited)
                    + movingCountCore(threshold, rows, cols, row, col + 1, visited)
                    + movingCountCore(threshold, rows, cols, row, col - 1, visited);
        }
        return count;
    }

    /*
     * 判断数字是否满足条件
     */
    private boolean check(int threshold, int rows, int cols, int row, int col, boolean[] visited) {
        if (row >= 0 && row < rows && col >= 0 && col < cols && !visited[row * cols + col]
                && getDigitSum(col) + getDigitSum(row) <= threshold)
            return true;
        return false;
    }

    /*
     * 获得数字的数位之和
     */
    private int getDigitSum(int col) {
        int sum = 0;
        while (col != 0) {
            sum += col % 10;
            col = col / 10;
        }
        return sum;
    }

}
