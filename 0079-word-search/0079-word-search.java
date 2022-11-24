class Solution {
    
    private boolean search(char[][] board, String word, int r, int c, int i){
        int m = board.length, n = board[0].length;
        if(i == word.length()) return true;
        if(r < 0 || r == m || c < 0 || c == n || board[r][c] != word.charAt(i)) return false;
        char temp = board[r][c];
        board[r][c] = '#';
        boolean exist = search (board, word, r+1, c, i+1) ||
                        search (board, word, r-1, c, i+1) ||
                        search (board, word, r, c-1, i+1) ||
                        search (board, word, r, c+1, i+1);
        board[r][c]=temp;
        return exist;
        
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for(int i=0; i<m; i++) 
            for(int j=0; j<n; j++) 
                if (search (board, word, i, j, 0))
                    return true;
        return false;
    }
}