class AlternatePositiveNegative
 {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        int n=arr.size();
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr.get(i)>=0){
                pos.add(arr.get(i));
            }else{
                neg.add(arr.get(i));
            }
        }
        arr.clear();
        for(int i=0;i<Math.max(pos.size(),neg.size());i++){
            if(i<pos.size()){
                arr.add(pos.get(i));
            }
            if(i<neg.size()){
                arr.add(neg.get(i));
            }
        }
    }
}