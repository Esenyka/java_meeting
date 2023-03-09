import java.util.Scanner;


public class dz2_task1{
    public static void main(String[] args) {
        Scanner IsScanner1 = new Scanner(System.in);
        System.out.println("Введите длину строки - ");
        int n = IsScanner1.nextInt();

        Scanner IsScanner2 = new Scanner(System.in);
        System.out.println("Введите первый символ - ");
        String c1 = IsScanner2.nextLine();

        Scanner IsScanner3 = new Scanner(System.in);
        System.out.println("Введите второй символ - ");
        String c2 = IsScanner3.nextLine();
        
        String s = creatNewString(n, c1, c2);
        System.out.println(s);
    }

    static String creatNewString(int lenth, String el1, String el2){
        String resultStr = "";
        int count = 0;
        while(count != lenth/2){
            resultStr += el1;
            resultStr += el2;
            count++;
        }
        if(lenth % 2 != 0){
            resultStr += el1;
        }
        return resultStr;
    }
}
