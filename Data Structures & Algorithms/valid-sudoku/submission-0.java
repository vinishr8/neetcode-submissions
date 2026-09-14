class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        System.out.println(board[0][4]);
        for(int i=0;i<board[0].length;i++){
            set=new HashSet<>();
            set2=new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int value = board[i][j] - '0';
                    if (!set.add(value)) {
                        return false;
                    }
                }
                if (board[j][i] != '.') {
                    int value = board[j][i] - '0';
                    if (!set2.add(value)) {
                        return false;
                    }
                }
            }
            set = new HashSet<>();
            for (int k = 0; k < 3; k++) {
                for (int l = 0; l < 3; l++) {
                    int row = (i / 3) * 3 + k;
                    int col = (i % 3) * 3 + l;
                    if (board[row][col] == '.') {
                        continue;
                    }
                    int value = board[row][col] - '0';
                    if (!set.add(value)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
