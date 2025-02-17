public class Vector {
    private int[] arr;
    private int size;
    private int capacity;

    public Vector(int size) {
        if (size < 0)
            size = 1;
        this.size = size;
        this.capacity = size;
        this.arr = new int[capacity];
    }

    public int getSize() {
        return size;
    }

    public int get(int idx) {
        assert idx >= 0 && idx < size : "Index out of bounds";
        return arr[idx];
    }

    public void set(int idx, int val) {
        assert idx >= 0 && idx < size : "Index out of bounds";
        arr[idx] = val;
    }

    public void print() {
        for (int i = 0; i < size; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public int find(int value) {
        for (int i = 0; i < size; ++i)
            if (arr[i] == value)
                return i;
        return -1;
    }

    public int getFront() {
        return arr[0];
    }

    public int getBack() {
        return arr[size - 1];
    }

    public void pushBack(int value) {
        if (size == capacity)
            expandCapacity();
        arr[size++] = value;
    }

    public void insert(int idx, int value) {
        assert idx >= 0 && idx < size : "Index out of bounds";

        if (size == capacity)
            expandCapacity();

        for (int p = size - 1; p >= idx; --p)
            arr[p + 1] = arr[p];

        arr[idx] = value;
        ++size;
    }

    public void rightRotate() {
        int lastElement = arr[size - 1];
        for (int p = size - 2; p >= 0; --p)
            arr[p + 1] = arr[p];
        arr[0] = lastElement;
    }

    public void leftRotate() {
        int firstElement = arr[0];
        for (int p = 1; p < size; ++p)
            arr[p - 1] = arr[p];
        arr[size - 1] = firstElement;
    }

    public void rightRotate(int times) {
        times %= size;
        while (times-- > 0)
            rightRotate();
    }

    public int pop(int idx) {
        assert idx >= 0 && idx < size : "Index out of bounds";
        int val = arr[idx];

        for (int p = idx + 1; p < size; ++p)
            arr[p - 1] = arr[p];

        --size;
        return val;
    }

    public int findTransposition(int value) {
        for (int i = 0; i < size; ++i) {
            if (arr[i] == value) {
                if (i == 0)
                    return 0;

                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                return i - 1;
            }
        }
        return -1;
    }

    private void expandCapacity() {
        capacity *= 2;
        int[] arr2 = new int[capacity];
        for (int i = 0; i < size; ++i)
            arr2[i] = arr[i];

        arr = arr2;
    }
}
