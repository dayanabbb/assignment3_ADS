import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> jobTable = new MyHashTable<>();

        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            String value = "value_" + i;
            MyTestingClass key = new MyTestingClass("key_" + random.nextInt(100));
            jobTable.put(key, value);
        }

        for (int i = 0; i < jobTable.chainArray.length; i++) {
            int count = 0;
            MyHashTable<MyTestingClass, String>.HashNode<MyTestingClass, String> node = jobTable.chainArray[i];
            while (n!=null) {
                count++;
                n  n.getNext();
            }
            System.out.println("bucket " + i + "has " + count + " elements");
        }
    }
}