class Solution(object):
    def numRookCaptures(self, board):
        """
        :type board: List[List[str]]
        :rtype: int
        """
        x,y=0,0
        for i in range(8):
            for j in range(8):
                if board[i][j] =='R':
                    x,y = i,j
                    break
        across=""
        virtical=""
        #竖
        for j in range(8):
            if board[x][j]!='.':#不是空白格的加入字符串 
                virtical+=board[x][j]
        #横向
        for j in range(8):
            if board[j][y] !='.':#不是空白格的加入字符串 
                across+=board[j][y]
        
        return across.count('Rp')+across.count('pR')+virtical.count('Rp')+virtical.count('pR')
