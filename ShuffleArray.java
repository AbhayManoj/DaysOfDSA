class Solution
{   static int total;
    public int[] shuffle(int[] nums, int n)
    {
        total=2*n;
        int a[]=new int[total];
        int first=0,second=n,index=0;
        while(first<n)
        {
            a[index]=nums[first];
            index++;first++;
            a[index]=nums[second];
            index++;second++;
        }
        for(int i=0;i<n;i++)
        {
           System.out.println(a[i]);
        }
        return a;
    }
}