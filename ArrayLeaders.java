class ArrayLeaders // brute force
 {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean lead=true;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    lead=false;
                    break;
                }
            }
            if(lead==true){
                list.add(arr[i]);
            }
        }
        return list;
    }
}

class ArrayLeaders {//optimal solution
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list= new ArrayList<>();
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        return list;
    }
    
}

