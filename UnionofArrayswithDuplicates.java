import java.util.ArrayList;
import java.util.HashSet;

class UnionofArrayswithDuplicates { // change the class name to Solution if you are using gfg or leetcode
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:set){
            list.add(i);
        }
        return list;
    }
}
