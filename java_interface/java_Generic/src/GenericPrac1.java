class Pair<K,V>{
    private K k;
    private V v;
    public Pair(K k,V v){
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public V getV() {
        return v;
    }
}

public class GenericPrac1 {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair("One",1);
        Pair<Integer,String> pair2 = new Pair(2,"Two");

        System.out.println("Key : "+pair.getK()+" , Value : "+pair.getV());
        System.out.println("Key : "+pair2.getK()+" , Value : "+pair2.getV());
    }
}
