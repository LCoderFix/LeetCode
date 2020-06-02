//14:39
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        if(numRows==0)return list;
        list.add(new ArrayList<Integer>(Arrays.asList(1)));
         if(numRows==1)return list;
        list.add(new ArrayList<Integer>(Arrays.asList(1,1)));
        for(int i=2;i<numRows;i++){
            List<Integer> list1=new ArrayList<>();
            list1.add(1);
            for(int j=0;j<list.get(i-1).size()-1;j++){
                list1.add(list.get(i-1).get(j)+list.get(i-1).get(j+1));
            }
            list1.add(1);
            list.add(list1);
        }
        return list;
    }
}