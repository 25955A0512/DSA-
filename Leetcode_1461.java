class Leetcode_1461 {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set=new HashSet<>();
            int limit=(int)Math.pow(2,k);
            for(int i=k;i<=s.length();i++){
                String sub=s.substring(i-k,i);
                set.add(sub);
            }
            if(set.size()==limit){
                return true;
            }
            return false;
    }
}