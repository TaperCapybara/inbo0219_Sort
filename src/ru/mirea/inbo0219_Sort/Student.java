package ru.mirea.inbo0219_Sort;

import java.lang.*;
import java.util.Arrays;

public class Student {
    public int[] array = {10, 2, 10, 3, 1, 2, 5};
    public int[] iDNumber = {854, 150, 648, 879,116, 700, 345};
    int[] a1 = new int[] {854, 105, 648, 879, 116, 700, 345};
    int[] a2 = new int[] {345, 816, 798, 114, 216, 995, 784};
    public int[] a3 = new int[a1.length + a2.length];


    public void Sort() {
        for (int i = 1; i < iDNumber.length; i++) {
            int value = iDNumber[i];
            int value1 = i - 1;
            for (; value1 >= 0; value1--) {
                if (value < iDNumber[value1]) {
                    iDNumber[value1 + 1] = iDNumber[value1];
                }
                else {
                    break;
                }
            }
            iDNumber[value1 + 1] = value;
        }
    }

    public void SortingStudentsByGPA(int[] array, int low, int high){
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] > opora) {
                i++;
            }

            while (array[j] < opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
    }
        if (low < j)
            SortingStudentsByGPA(array, low, j);

        if (high > i)
            SortingStudentsByGPA(array, i, high);
    }

    public void merge(){
        for (int i = 0; i < 7; i++){
            a3[i] = a1[i];
        }
        for (int i = 7; i < 14; i++){
            a3[i] = a2[i-7];
        }
    }
    public void Sort2(int[] a, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        Sort2(a, lo, mid);
        Sort2(a, mid + 1, hi);

        int[] buf = Arrays.copyOf(a3, a3.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }

}
