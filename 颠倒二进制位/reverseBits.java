public class Solution{
  public int reverseBits(int n){
    int res = 0;
    for(int i=0;i<32;i++){
      //当前项最后一位向左位移相应位数
      res+=(n%2)<<(32-i);
      //当前32二进制数右移一位
      n = n/2;
      //n = n>>1;
    }
  }
}
