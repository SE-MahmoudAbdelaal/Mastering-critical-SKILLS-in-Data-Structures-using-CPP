import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int n = 5;
        Vector v = new Vector(n);
        for (int i = 0; i < n; ++i)
            v.set(i, i);

        v.print();
        v.rightRotate(5 * 1000);
        v.print();
        v.rightRotate(2);
        v.print();
        v.leftRotate();
        v.print();

        int val = v.pop(2);
        System.out.println(val);
        v.print();

        System.out.println(v.findTransposition(3));
        v.print();
    }

}