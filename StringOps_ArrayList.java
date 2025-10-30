
import java.util.*;

public class StringOps_ArrayList {

    ArrayList<String> list = new ArrayList<>();

    public void append(String str) {
        list.add(str);
    }

    public void insert(int index, String str) {
        if (index >= 0 && index <= list.size()) {
            list.add(index, str);
        }
    }

    public boolean search(String s) {
        return list.contains(s);
    }

    public void startsWith(char ch) {
        for (String s : list) {
            if (s.startsWith(String.valueOf(ch))) {
                System.out.println(s);
            }
        }
    }

    public void display() {
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        StringOps_ArrayList lst = new StringOps_ArrayList();
        lst.append("apple");
        lst.append("banana");
        lst.append("strawberry");
        lst.append("orange");
        lst.insert(2, "pineapple");
        System.out.println("Banana present : " + lst.search("banana"));
        System.out.println("Starts with character a");
        lst.startsWith('a');
        System.out.println("Array list : ");
        lst.display();

    }
}
