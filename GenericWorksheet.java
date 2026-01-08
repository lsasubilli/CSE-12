import java.io.*;
import java.util.*;

public class GenericWorksheet<E extends Comparable<E>> {
    public E[] data;

    public GenericWorksheet() {
        this.data = null;
    }

    public GenericWorksheet(E[] data) {
        this.data = Arrays.copyOf(data, data.length);
    }

    public E findMedian() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j].compareTo(data[j + 1]) > 0) {
                    E temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        int n = data.length;

        return data[data.length / 2];
    }

    public E findLast() {
        return data[data.length - 1];
    }

    public E removeFirst() {

        E[] newArr = (E[]) new Object[data.length - 1];
        E first = data[0];
        for (int i = 1; i < data.length; i++) {
            newArr[i - 1] = data[i];
        }
        return E;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < data.length; i++) {
            str += data[i];
        }
        return str;
    }
}
