import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionPrac1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> hashSet = new HashSet<>();
        while(true){
            int num = in.nextInt();
            if(num == -1){
                break;
            }
            hashSet.add(num);
        }
        System.out.println(hashSet);
    }
}
