package ru.mirea.inbo0219_Sort;

public class Student_Test {
    public static void main(String[] args) {
        Student p1 = new Student();
        p1.Sort();
        p1.SortingStudentsByGPA(p1.array, 0, p1.array.length - 1);
        p1.merge();
        p1.Sort2(p1.a3, 0, p1.a3.length - 1);

        for (int i = 0; i<p1.iDNumber.length; i++){
            System.out.println(p1.iDNumber[i]);
        }
        System.out.print('\n');

        for (int i = 0; i<p1.array.length; i++){
            System.out.println(p1.array[i]);
        }
        System.out.print('\n');

        for (int i = 0; i<p1.a3.length; i++){
            System.out.println(p1.a3[i]);
        }
    }
}
