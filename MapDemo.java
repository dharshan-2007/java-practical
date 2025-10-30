import java.util.*;
public class MapDemo
{
    public static void main(String[] args)
    {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"apple");
        map.put(2,"banana");
        map.put(3,"orange");
        map.put(4,"strawberry");
        System.out.println("Map elements : "+map);
        System.out.println("Get Key 2 : "+map.get(2));
        for(Map.Entry<Integer,String> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}