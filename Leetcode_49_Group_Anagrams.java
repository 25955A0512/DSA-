class Leetcode_49_Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
        for(String word:strs){ //----> TC: O(NK)
            String newword=generate(word);
            if(!map.containsKey(newword)){
                map.put(newword,new ArrayList<>());
            }
            map.get(newword).add(word);
        }
        return new ArrayList<>(map.values());


        // HashMap<String,List<String>> map=new HashMap<>();
        // for(String s:strs){  ----> TC: O(m*nlogn)
        //     char ch[]=s.toCharArray();
        //     Arrays.sort(ch);
        //     String temp=new String(ch);
        //     if(!map.containsKey(temp)){
        //         map.put(temp,new ArrayList<>());
        //     }
        //     map.get(temp).add(s);
        // }
        // return new ArrayList<>(map.values());
    }
    public String generate(String word){
        int[] arr=new int[26];
        for(char ch:word.toCharArray()){
            arr[ch-'a']++;
        }
        StringBuilder newword=new StringBuilder();
        for(int i=0;i<26;i++){
            int freq=arr[i];
            if(freq>0){
                char ch=(char) (i+'a');
                for(int j=0;j<freq;j++){
                    newword.append(ch);
                }
            }
        }
        return newword.toString();
    }
}