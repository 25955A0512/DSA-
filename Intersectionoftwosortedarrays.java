import java.util.*;

class Intersectionoftwosortedarrays // change the class name to Solution if you are using gfg or leetcode
 {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        // code here
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0;
        int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr2[j]<arr1[i]){
                j++;
            }else{
                if(list.isEmpty() || list.get(list.size()-1) !=arr1[i]){
                list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        return list;
    }
}
