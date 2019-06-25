class Solution {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        if(nlen==0){
            return 0;
        }
        int i=0;int j=0;
        while(i<hlen &&j<nlen){
            if(haystack.charAt(i)==needle.charAt(j)){
                //匹配成功,定位双双向后移动
                i++;
                j++;
            }
            else{
                //匹配错误,i减去当前匹配成功项数后向后移动一位
                i = i-j+1;
                j = 0;
            }
        }
        if(j==nlen){
            return i-j;
        }else{
            return -1;
        }
        
    }
    
}
