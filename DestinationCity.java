class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> list=new ArrayList<String>(); 
        List<String> list2=new ArrayList<String>(); 
        for(int i=0;i<paths.size();i++)
        {
          list.add(paths.get(i).get(0)); 
          list2.add(paths.get(i).get(1));
        }
        list2.removeAll(list);
       return list2.get(0).toString();
    }
}