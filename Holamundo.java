/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author daniel.cortes
 */

public class Holamundo {
    public static void main(String args[]) throws IOException {
        /*
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String respuesta=br.readLine();
        System.out.println(respuesta);
    	int a = Integer.parseInt(respuesta);
        System.out.println((a+5));
        int a=5;

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
            System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String respuesta=br.readLine();
        int a = Integer.parseInt(respuesta);
        if (a>5){
            System.out.println(a+100);
        }
        else if (a<5){
            System.out.println(a%5);
        }
        else {
            System.out.println(a*100);
        }
    }
        int i = 0;
        boolean a = true;
        while (i < 100 && i != 96) {
            System.out.println(i);
            System.out.println(!a);
            a = !a;
            i+=10;
            i-=2;
        }
    int i = 0;
    int mem=0;
        boolean a = true;
        while (i < 10) {


            mem += i;
            i++;


        }
        int i = 0;

        while (i < 3) {
            if(i==1){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        int mem=1;
        for(int i = 1; i < 16; i++) {
            mem = mem * i;
            System.out.println(mem);

        }
        int numero, divisor;
        for(numero = 1; numero < 100; numero++){

            boolean flag = false;
            for (divisor = 2; divisor <= numero/2; divisor++){

                if(numero % divisor == 0){

                    flag = false;
                    break;
                }
                else{
                    flag = true;
                }
            }
            if (flag == true){
                System.out.println(numero + " es primo");
            }

        }

        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String respuesta=br.readLine();



        for(int i=1;i<=10;i++){
           System.out.println(respuesta + " " + i);
        }
        System.out.println("Ingresa tu edad");
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String respuesta=br.readLine();
        try {
            int a = Integer.parseInt(respuesta);
            for (int i=1;i<=a;i = i+2){
            System.out.print( i + ", ");
        }
        }
        catch (NumberFormatException e){
            System.out.print( "Ingresa un numero valido ");
        }

        System.out.println("Ingresa un entero positivo");
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String respuesta=br.readLine();
        try {
            int a = Integer.parseInt(respuesta);
            if(a<0){System.out.print( "Numero invalido, Ingresa un Entero positivo ");}
            for (int i=a;i>-1;i--){
                if(i==0){
                    System.out.print( i );
                    break;

                }
            System.out.print( i + ", ");
            }
        }
        catch (NumberFormatException e){
            System.out.print( "Ingresa un numero valido ");
        }

        System.out.println("Ingresa un entero positivo");
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String respuesta=br.readLine();
        int a = Integer.parseInt(respuesta);
        String aster = "*";
        for (int i = 1;i<=a;i++ ){

            System.out.println(aster);
            aster = aster + "*";
        }

        int x;

        for(int i = 1; i < 11; i++){
            for (int a = 1; a < 11; a++ ){
                x = i*a;
                System.out.println(i + " * " + a + " = " + x);
            }
        }

        System.out.println("Escribe una palabra");
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String respuesta=br.readLine();
        for(int i=0; i<respuesta.length();i++){
            System.out.println(respuesta.charAt(i));
        }

        boolean a = true;
        while(a){
            System.out.println("Escribe un numero");
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            String respuesta=br.readLine();
            var num = Integer.parseInt(respuesta);
            if(num == 10){
                a = false;
            }
        }



        System.out.println("Escribe un numero");
            BufferedReader beer;
            beer = new BufferedReader(new InputStreamReader(System.in));
            String rta =beer.readLine();

            int[] digitosASumar;
            digitosASumar = new int[rta.length()];
            for(int i = 0; i<rta.length(); i++){

                digitosASumar[i] = Integer.parseInt(rta.valueOf(rta.charAt(i)));

            }
            System.out.println(Arrays.toString(digitosASumar));
            int memory = 0;
            for(int j = 0; j<digitosASumar.length; j++){
                memory += digitosASumar[j];
            }
            System.out.println(memory);
            int longitudArray = digitosASumar.length;
            System.out.println(longitudArray);


NUMEROS IMPARES
        int j = 0;
        int[] digitosASumar = new int[5];

            for(int i = 0; i<=10; i++){
                if(i%2==1){
                    digitosASumar[j] = i;
                    j++;
                }


            }
            System.out.println(Arrays.toString(digitosASumar));
           

        PENDIENTE
        String dia ="Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.";

        System.out.println(dia);
        int counter = 0;

        for(int i = 0; i < dia.length(); i++){
            if(dia.charAt(i) == 'a' ||
                    dia.charAt(i) == 'e' ||
                    dia.charAt(i) == 'i' ||
                    dia.charAt(i) == 'o' ||
                    dia.charAt(i) == 'u'){
                System.out.println(dia.charAt(i));
                counter++;
            }
           
        }
        System.out.println("Hay " + counter + " vocales");
            
        
        
        int[] memoria = new int[5];

            for(int i = 0; i<5; i++){
                BufferedReader br;
                br = new BufferedReader(new InputStreamReader(System.in));
                String rta =br.readLine();
                int a = Integer.parseInt(rta);
                memoria[i]=a;
                System.out.println("El numero ingresado es: " + a);
                }
            double suma = 0;
            for (int i : memoria) {
                System.out.println(i);
                suma+=i;
            }
            System.out.println("La media es: "+ (suma/5));
        
        
        SISTEMA DE NOTAS

        System.out.println("Ingresa la longitud del array");
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String rta =br.readLine();
        int longArray = Integer.parseInt(rta);
        int[] memoria = new int[longArray];
        System.out.println("Ingresa los numeros del array");
        for(int i = 0; i<longArray; i++){
                
                BufferedReader brr;
                brr = new BufferedReader(new InputStreamReader(System.in));
                String rtaa =brr.readLine();
                int aa = Integer.parseInt(rtaa);
                
                memoria[i]=aa;
                
                }
            double suma = 0;
            int contAprobados = 0;
            int contDesaprobados = 0;
            for (int i : memoria) {
                if(i>=5){
                    contAprobados += 1;
                }
                else{
                    contDesaprobados += 1;
                }
            }
            for (int i : memoria) {
                System.out.println(i);
                suma+=i;
            }
            
            System.out.println("La media es: "+ (suma/longArray));
            System.out.println(Arrays.toString(memoria));
            System.out.println("Aprobados: "+ contAprobados);
            System.out.println("Desaprobados: "+ contDesaprobados);
           
 
        
        double randomNum = Math.floor(Math.random()*10+1);
        System.out.println(randomNum);
        int value = (int)randomNum;
        int[] array1 = new int[value];
        int[] array2 = new int[value];
        for(int i = 0; i < value; i++){
            double entrieArr1 = Math.floor(Math.random()*10+1);
            int entryArr1 = (int)entrieArr1;
            array1[i] = entryArr1;
        }
        for(int j = 0; j < value; j++){
            double entrieArr2 = Math.floor(Math.random()*10+1);
            int entryArr2 = (int)entrieArr2;
            array2[j] = entryArr2;
        }
        for(int k = 0; k < value; k++){
            if(array1[k]<array2[k]){
                System.out.println("En la posicion " + k + " el segundo array es mayor");
            }
            else if(array1[k]>array2[k]){
                System.out.println("En la posicion " + k + " el primer array es mayor");
            }
            else{
                System.out.println("En la posicion " + k + " ambos valores son iguales");
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array2));*/
        
        int[][] array1 = new int[4][5];
        for(int i=0; i<4;i++){
            for(int j=0; j<5; j++){
                double entrieArr1 = Math.floor(Math.random()*10+1);
                int entryArr1 = (int)entrieArr1;
                array1[i][j] = entryArr1;
            }
        }
        int suma = 0;
        int total = 0;
        for (int[] array2: array1){
            for(int pElem:array2){
                System.out.print(pElem + "\t");
                suma +=pElem;
                
            }
            total=+suma;
            System.out.println("\ts:" + suma);
            suma = 0;
        }
        int totalVertical =0;
        int totalTotal =0;
        for(int i=0; i<5;i++){
            for(int j=0; j<4; j++){
               totalVertical += array1[j][i]; 
               
            }
            totalTotal += totalVertical;
            System.out.print("s:" + totalVertical + "\t");
            totalVertical=0;
        }
        
        
            
            
            System.out.println("\ts:" + totalTotal + "  ");
        
        
        
        
    }


}






