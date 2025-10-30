import java.util.*;
public class HashSetEx
{
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("strawberry");
        System.out.println("Hash set Elements are : "+set);
        if(set.contains("banana"))
        {
            System.out.println("Set contains Banana");
        }
    }
}