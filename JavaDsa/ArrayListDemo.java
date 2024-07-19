import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        list.get(1);
        list.add(0, 3);
        System.out.println(list);
        System.out.println(list.contains(4));

    }

}

// [1,2,3,4,5,6,7,8,9,0] size = 10
// 1.75
// [1,2,3,4,5,6,7,8,9,0,11,12,13,14,15,16,17,18,`9,20]

// [1,2,3,4,5,6,7,8,9,0,11,12,13,14,15,16,17,18,`9,20 ,21]
