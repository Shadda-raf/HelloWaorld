package main.java;

import java.io.IOException;
import java.util.Locale;

import java.util.concurrent.ForkJoinPool;

public class Start {
    public static void main() throws IOException {


        int srok;
        int mounthPlatezh=300;
        double stavka=1.05;  // переменная ставки
        double summa=0;
        double vRublyah=72;
        System.out.println("Введите срок");
        srok=System.in.read();
   /*   System.out.println("Введите ежемесячный платеж");
        mounthPlatezh=System.in.read();
        System.out.println("Введите ставку");
        stavka= System.in.read();

     */ for (int i=srok;i>=0;i--){
            summa=summa+(12*mounthPlatezh*Math.pow(stavka,i));
        }
        System.out.println("Итого сумма = ");
        System.out.printf("%f", summa);
        System.out.println("\nИтого сумма в рублях = " );
        System.out.printf("%f", summa*vRublyah);
    }
}