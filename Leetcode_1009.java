class Solution {
    public int bitwiseComplement(int n) {
        // if(n==0) return 1;

        int bits= (int) Math.floor((Math.log(n)/Math.log(2))+1);
        int mask=(1<<bits)-1; // TC- O(n)
        return n^mask;


        //Approach 2
        // int counter=0;
        // int result=0;
        // while(n>0){
        //     int r=n%2;
        //     result+=Math.pow(2,counter)*(1-r);
        //     counter++;
        //     n=n/2;
        // }
        //     return result; 

        //Approach 3
        // int mask=1;
        // while(mask<n){
        //     mask=(mask<<1) |1;
        // }
        // return mask^n;

    }
}