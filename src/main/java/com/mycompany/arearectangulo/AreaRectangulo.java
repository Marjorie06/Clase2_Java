/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arearectangulo;

/**
 *
 * @author GT ECUADOR
 */
public class AreaRectangulo {

    public static void main(String[] args) {
        /*EJERCICIO 1
        double base=2;
        double altura=4;
        double area=0;
        area=base*altura;
        System.out.println("La altura del rectangulo es: "+area);*/
        
        /*EJERCICIO 2
        Escribe si un programa que determine si un  numero entero es positivo
        Imprime ei el numero ingresado es psitivo
        
         Entrada
        int num=2;
        if (num>0){
            System.out.println("El numero ingresado es positivo:"+num);
        }
        else System.out.println("Error, el numero es negativo");*/
        
        /*EJERCICIO 3
        Escribe un programa que determine si un numero es par o impar
        
        int num= 10;
        
        int operacion=num %2; 
        if (operacion ==0) {
            System.out.println("El numero par");
        }else{
            System.out.println("El numero es impar");}*/
        
        /*EJERCICIO 4
        Escribe un programa que determine si un estudiante aprueba o reprueba segun su nota
        Si la nota es mayor o igual a 90, imprime "Aprobado"
        Si es menor a 70, imprime "Reprobado"*/
        int nota=80;
        if ((nota>=0)&&(nota<=100)){
        if (nota>=90) {
            System.out.println("Exelente");
        }else if ((nota>=70)&&(nota<=89)){  
            System.out.println("Aprobado");   
        }else if (nota<70){
            System.out.println("Reprobado");
        }else {
            System.out.println("Su nota es inavalida");
        }
        
    }
}
}