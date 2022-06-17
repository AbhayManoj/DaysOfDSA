class Solutions
  {
    public static void main(String args[])
    { int digits=0;
      int array[]={10,250,20,654,22};
      int len=array.length;
      for(int i=0;i<len;i++)
        {
          int count=findCount(array[i]);
          if(count%2==0)
          {
            digits++;
          }
        }
     System.out.println(digits);
    }
    static int findCount(int num)
    {
      String str=Integer.toString(num);
      int elementLen=str.length();
      return elementLen;
    }
  }