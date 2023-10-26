
import java.util.*;
public class Collection {
    public static void main(String[] args) {
        //LinkedList
        List<String > linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add(1,"C");
        System.out.println(linkedList);

        //HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("A");
        System.out.println(hashSet);

        //LinkedHashSet
        Set<String > linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("C");
        linkedHashSet.add("B");
        linkedHashSet.add("A");
        System.out.println(linkedHashSet);

        //TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("A");
        System.out.println(treeSet);

        //HashMap
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("three",3);
        System.out.println(hashMap);
        System.out.println(hashMap.get("one"));

        //LinkedHashMap
//        Map<String ,Integer>

        //TreeMap

    }

}
