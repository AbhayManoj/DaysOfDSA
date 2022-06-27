import java.util.*;
class Solution {
    String a,b;
    public int countWords(String[] words1, String[] words2) {
        List<String> list=new ArrayList<String>();
        List<String> list2=new ArrayList<String>();
        for(int i=0;i<words1.length;i++)
        {
            list.add(words1[i]);
        } 
        for(int i=0;i<words2.length;i++)
        {
            list2.add(words1[i]);
        }
        HashSet<String> set=new HashSet(list);
        HashSet<String> set2=new HashSet(list2); 
        for(int i=0;i<list.size();i++)
        {
            if(Collections.frequency(list,list.get(i))>1)
            {   a=list.get(i);
                set.remove(a);
            }
        }
        for(int i=0;i<list2.size();i++)
        {
            if(Collections.frequency(list2,list2.get(i))>1)
            {   b=list2.get(i);
                set2.remove(b);
            }
        }
        set.retainAll(set2);
        return set.size();
    }
}