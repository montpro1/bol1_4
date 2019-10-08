
package bol1_4;

import java.util.Scanner;


public class Bol1_4 {

    public static void main(String[] args) {
       Scanner teclado= new Scanner(System.in);
       float num1,num2;
       System.out.println("teclee aqui el numero 1 ");
       num1=teclado.nextFloat();
       System.out.println("teclee aqui el numero 2");
       num2=teclado.nextFloat();
       float r=num1-num2;
       float s=num1+num2;
       float c=num1/num2;
       float p=num1*num2;
       System.out.println("la suma es "+s+", \n la resta es "+r+", el cociente es "+c+", el producto es "+p);
       
       
       
        // TODO code application logic here
    }
    
}
