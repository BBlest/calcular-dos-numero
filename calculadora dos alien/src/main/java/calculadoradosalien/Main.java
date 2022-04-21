/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoradosalien;

import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Desde aqui se comienza a escribir
        System.out.println("Bienvenido a la calculadora de solo dos digitos");
        System.out.println("Calcular dos numeros enteros");
        System.out.println("opciones de la calculadora"+"\n");
        
        Scanner escaner = new Scanner (System .in);
        System.out.println("ingresa el primer digito");
        int digito1 = escaner.nextInt();
        System.out.println("su primer digito es: "+digito1);
        
        System.out.println("ingresa el segundo digito 2");
        int digito2 = escaner.nextInt();
        System.out.println("su segundo digito es: "+digito2+"\n");
        // El menu seria
        System.out.println("Menu");
        System.out.println(" Escoja +,-,*,/, x para salir");
        System.out.println(" - restar");
        System.out.println(" + sumar");
        System.out.println(" * multiplicar");
        System.out.println(" / dividir");
        System.out.println(" x para salir");
        //String variable = escaner.nextLine();
        String variable;
        variable = escaner.next();
       
        switch (variable) {
            case "+":
            int resultado = digito1 + digito2;
                    System.out.println("la suma es: "+resultado);
                    break;

            case "-":
                    resultado= digito1 - digito2;
                    System.out.println("la resta es: "+resultado);
                    break;
            case "/":
                    resultado= digito1 / digito2;
                    System.out.println("la division es: "+resultado);
                    break;
            case "*":
                    resultado= digito1 * digito2;
                    System.out.println("la multiplicacion es: "+resultado);
                    break;
            case "x":                   
                    System.out.println("ocupo la opcion de Salir");
                    break;
                    
        //segundo cambio para git commit            
        
        }
    }
        
}        
              
                
       
        
      
        
        
        
       
                       
        
        
        
              
        
        
