import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionPrac2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String,Integer> hashMap = new HashMap<>();
        while(true){
            System.out.println("이름 입력 : ");
            String name = in.next();
            if(name.equals( "종료")){
                break;
            }
            System.out.println("나이 입력 :");
            int age = in.nextInt();
            hashMap.put(name,age);
        }
        for(Map.Entry<String,Integer> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
//        System.out.println(hashMap);
    }
}
