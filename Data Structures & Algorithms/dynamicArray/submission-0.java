class DynamicArray {

    //initialize variables
    private int[] arr;
    private int length;
    private int capacity;

    // Constructor to initialize the dynamic array
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.arr = new int[this.capacity];
    }

    // get value at index i in array
    public int get(int i) {
        return arr[i];
    }

    // set value n at index i 
    public void set(int i, int n) {
        arr[i] = n;
    }

    // set last position in array to n
    public void pushback(int n) {
        // check if array is full, if so resize
        if (length == capacity) {
            resize();
        }
        arr[length] = n;
        length++;
    }

    // remove last element in array
    public int popback() {
        if (length > 0) {
            length--;
        }

        return arr[length];
    }

    // double the size of array
    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];

        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    // get size
    public int getSize() {
        return length;
    }

    // get capacity
    public int getCapacity() {
        return capacity;
    }
}
