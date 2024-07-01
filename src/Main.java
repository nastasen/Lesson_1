import java.util.Scanner;

//Позже буду разбивать на ветки задания. Ранее не работала в Git
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        TrueFalse();
        ScanSb();
        ScanSb2();
        SctStrNumb();
        LeapYear();
        MassArray();
        emptyMassArray();
        Mass12();
        Mass13();
        SomeMethod();
    }

    public static void printThreeWords() {
        String word_1 = "Orange";
        String word_2 = "Banana";
        String word_3 = "Apple";
        String result = word_1 + "\n" + word_2 + "\n" + word_3;
        System.out.println("Задание 1");
        System.out.println(result);
    }

    public static void checkSumSign() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Задание 2" + "\n" + "Метод checkSumSign(). Введите значение a и b: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = a + b;
            System.out.println(c >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor() {
        System.out.println("Задание 3" + "\n" + "Метод printColor(). Введите любое число: ");
            Scanner sc = new Scanner(System.in);
                int value = sc.nextInt();
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        System.out.println("Задание 4" + "\n" + "Метод compareNumbers(). Введите два числа для сравнения a и b: ");
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s;
        if (a >= b) s = "a>=b";
            else s = "a<b";
        System.out.println(s);
    }

    public static void TrueFalse() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Задание 5" + "\n" + "Метод TrueFalse().  Введите два числа a и b: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
        if (sum>=10 && sum<=20) {
            System.out.println(true);
            }
        else System.out.println(false);
    }

    public static void ScanSb() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Задание 6. Определение числа положительным или отрицательным" + "\n" + "Введите число: ");
                int value_1 = sc.nextInt();
            System.out.println(value_1 >= 0 ? "Положительное " : "Отрицательное ");
    }

    public static void ScanSb2() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Задание 7. Метод должен вернуть true, если число отрицательное,\n и вернуть false если положительное.\n" +
                    "Замечание: ноль считаем положительным числом." + "\n" + "Введите число: ");
        int value_2 = sc.nextInt();
            System.out.println(value_2 >= 0 ? "false " : "true ");
    }

    public static void SctStrNumb() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Задание 8. Введите строку и количество повторений: ");
                String mess = sc.nextLine();
        int value_3 = sc.nextInt();
            for (int i = 0; i < value_3; i++) {
                System.out.println(mess);
            }
    }

    public static void LeapYear() {
        boolean t = true;
        boolean f = false;
            Scanner sc = new Scanner(System.in);
            System.out.println("Задание 9. ");
            System.out.println("Опредилим високосный год. \n Введите год: ");
        int year = sc.nextInt();
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    System.out.println(t);
                    return;
                }
        }
        System.out.println(f);
    }

    public static void MassArray() {
        System.out.println("Задание 10. ");
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
                System.out.print("Исходный массив: ");
                    for (int i : arr) {System.out.print(i + " ");}
                        System.out.println();
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = arr[i] == 1 ? 0 : 1; // Инвертируем значения массива
        }

        System.out.print("Измененный массив: ");
        for (int i : arr) {System.out.print(i + " ");
        }
    }

    public static void emptyMassArray(){
        System.out.println();
        System.out.println("Задание 11");
            int[] arr_2=new int[100];
                for(int i=0;i<arr_2.length;i++){
                    arr_2[i]=i+1;
                }
                System.out.println();
                for (int i : arr_2) {System.out.print(i + " ");
                }
    }

    public static void Mass12(){
        System.out.println();
        System.out.println("Задание 12");
            int[]arr_3={ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
                for (int i : arr_3){System.out.print(i + " ");}
                for(int i=0;i<arr_3.length;i++){
                    if (arr_3[i]<6) {
                        arr_3[i]*=2;
            }
        }
        System.out.println();
        for (int i : arr_3) {System.out.print(i + " ");
        }
    }

    public static void Mass13(){
        System.out.println();
        System.out.println("Задание 13");
            int[][]arr_4= new int[3][3];
            for (int i = 0; i < arr_4.length; i++) {
                for (int j = 0; j < arr_4[i].length; j++){
                    if(i==j){arr_4[i][j]=1;}
                    System.out.print(arr_4[i][j] + " ");
            }
        }
    }
    public static void SomeMethod(){

        System.out.println("Задание 14");
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите длину массива и число, которым его заполнить: ");
            int len= sc.nextInt();
            int  initialValue= sc.nextInt();
            int [] arr_5=new int[len];
                for(int i=0;i<len;i++){
                    arr_5[i]=initialValue;
                }
                for(int i: arr_5){
                    System.out.print(i+" ");//nastasen
        }
    }

}






