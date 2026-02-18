class POTD_18_02 {//optimal(bits trick)
    public boolean hasAlternatingBits(int n) {
        int x=n^(n>>1);
        return (x&(x+1))==0;
    }
}


class POTD_18_02 {
    public boolean hasAlternatingBits(int n) {
        String binary=Integer.toBinaryString(n);
        for(int i=0;i<binary.length()-1;i++){
            if(binary.charAt(i)==binary.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}