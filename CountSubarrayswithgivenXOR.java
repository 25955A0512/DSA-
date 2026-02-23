class CountSubarrayswithgivenXOR
 {
    public long subarrayXor(int arr[], int k) {
        // code here
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
            int x=xor^k;
            if(map.containsKey(x)){
                count+=map.get(x);
            }
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return count;
    }
}