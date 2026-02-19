class MissingElementinRange_POTD_19_02
 {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=low;i<=high;i++){
            set.add(i);
        }
        for(int num:arr){
            set.remove(Integer.valueOf(num));
        }
        list.addAll(set);
        Collections.sort(list);
        return list;
    }
}