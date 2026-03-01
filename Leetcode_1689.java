class Leetcode_1689{
    public int minPartitions(String n) {
        char max_Char='0';
        for(int i=0;i<n.length();i++){
            char num=n.charAt(i);
            if(num>max_Char){
                max_Char=num;
            }
        }
        int res=Character.getNumericValue(max_Char);
        return res;
    }
}