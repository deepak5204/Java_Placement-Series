package ObjectOrientedProgramming.classandobjects;

public class DynamicArray {
    int data[]; // create instance of array
    private int nextElementIndex;

    public DynamicArray() {
        data = new int[5];
        nextElementIndex = 0;
    }

    // know size of the dynamic array
    public int size() {
        return nextElementIndex;
    }

    // check DA is empty or not
    public boolean isEmpty() {
        return nextElementIndex == 0;
    }

    // get Value from index
    public int getValue(int index) {
        if (index >= nextElementIndex) {
            return -1;
        }
        return data[index];
    }

    // set value on index
    public void setValue(int index, int value) {
        if (index >= nextElementIndex) {
            data[nextElementIndex] = value;
            return;
        }
        data[index] = value;
    }

    // remove from last
    public void remove() {
        nextElementIndex--;
        return;
    }

    // remove index element
    public void removeIndexElts(int index) {
        nextElementIndex--;
        int i = index;
        while (i < data.length - 1) {
            data[i] = data[i + 1];
            i++;
        }
    }

    // add value
    public void add(int val) {
        if (nextElementIndex == data.length) {
            doubleCapacity();
        }

        data[nextElementIndex] = val;
        nextElementIndex++;
    }

    // add value in middle of array
    public int addInMid(int index, int value) {
        nextElementIndex++;

        int i = data.length;
        doubleCapacity();
        while (i >= index) {
            data[i + 1] = data[i];
            i -= 1;
        }

        data[index] = value;
        return nextElementIndex;
    }

    // double size of array
    public void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    // print array
    public void print() {
        System.out.println();
        for (int i = 0; i < nextElementIndex; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
