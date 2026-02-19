class TwoSumOfGFG {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        
        while(i < j) {
            if(arr[i] + arr[j] < target) {
                i++;
            }
            else if(arr[i] + arr[j] > target) {
                j--;
            }
            else {
                list.add(i+1);
                list.add(j+1);
                return list;
            }
        }
        
        list.add(-1);
        list.add(-1);
        return list;
    }
}