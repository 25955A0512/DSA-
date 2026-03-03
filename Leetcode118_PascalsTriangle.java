class Leetcode118_PascalsTriangle{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            result.add(rowgen(i));
        }
        return result;
    }
    public List<Integer> rowgen(int row){
        List<Integer> list=new ArrayList<>();
        int ans=1;
        list.add(ans);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            list.add((int)ans);
        }
        return list;
    }
}