class PythagoreanTriplet
 {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
            set.add(x*x);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int a1 = arr[i] * arr[i];
                int b1 = arr[j] * arr[j];
                if(set.contains(a1+b1)){
                    return true;
                }
            }
        }
        return false;
    }
}