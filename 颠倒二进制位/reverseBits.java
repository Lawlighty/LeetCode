public class Solution{
  public int reverseBits(int n){
     int a=0;
      for(int i=0;i<=31;i++){
        //n>>i 更新最后一位
        // 1&(n>>i)若最后一位为1则保留最后一位,不然则为0
        //31-i 当前项应该右移位数
          a=a+((1&(n>>i))<<(31-i));
      }
      return a;
    }
  }
}
