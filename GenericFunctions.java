public class GenericFunctions
{
    public static <T extends Comparable<T>> T findMax(T[] arr)
    {
        T max=arr[0];
        for(T i:arr)
        {
            if(i.compareTo(max)>0);
            {
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        Integer[] nums={12,45,8,2,45};
        String[] str={"apple","banana","orange"};
        System.out.println("Max Integer : "+findMax(nums));
        System.out.println("Max String : "+findMax(str));
        
    }
   
}