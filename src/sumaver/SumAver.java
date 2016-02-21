package sumaver;

import java.util.Scanner;//шмпортуємо клас для введення кількості значень з клавіатури

/**
 * Created by Yuriy on 21.02.2016.
 */
public class SumAver {
    public static void main(String[] args) {
        int i = 1;//оголошуємо змінні
        int x;
        int Sum=0;
        double Aver=1;
        Scanner sc = new Scanner(System.in);//вводимо кількість значень з клавіатури
        System.out.print("Enter number x: ");
        x = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
for(i=1;i<=x;i++){
    Sum+=i;
    Aver=(double)Sum/x;// приводимо до типу дабл щоб отримати не лише ціле число
      }
        System.out.println("The Sum is: "+Sum);
        System.out.println("The Avg is: "+Aver);
    }
}
