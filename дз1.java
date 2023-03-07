import javax.sound.midi.Track;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class дз1 {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
    
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false
    
        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear(2023));

        String arrayToString = Arrays.toString(createChangeArray(7));
        System.out.print("task1 =" + arrayToString);

        String arrayToString2 = Arrays.toString(task2Array());
        System.out.println(" task2 =" + arrayToString2);
    
        int[][] arra = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = arra[2][3]; 
    
    
    }
    
    private static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        if (sum >=10 & sum <=20){
            return true;
        }
        return false;
    }
    
    private static boolean isPositive(int x) {
        if(x > 0){
            return true;
        }
        return false;
    }
    
    private static void printString(String source, int repeat) {
        System.out.println(source.repeat(repeat));
    }
    
    private static boolean isLeapYear(int year) {
        if((year % 4 == 0 & year%100!= 0) | (year%400==0)){
            return true;
        }
        return false;
    }
    
    private static int[] createArray(int len, int initalValue) {
        int[] arr = new int[len];
        for(int a: arr){
            a = initalValue;
        }
        return arr;
    }

    private static int[] createChangeArray(int len) {
        //  1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        //* Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = new int[len];
        for(int i=0; i != len; i++){
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("element %d: ", i+1);
            String elementStr = iScanner.nextLine();
            int elementInt = Integer.parseInt(elementStr);
            arr[i]= elementInt;
        }
        for(int i=0; i!=7; i++){
            if (arr[i] == 0){
                arr[i] = 1;
            }
            else{
                arr[i] = 0;
            }
        }
        return arr;
    }
    
    private static int[] task2Array() {
        //  2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i=0; i<12; i++){
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }
    /**
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * * Также заполнить элементы побочной диагонали
     */
    }