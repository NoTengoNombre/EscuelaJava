/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8;

/**
 * @see @since 01-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ClaseInteger {

 private static String cadena1 = "1234";
 private static String cadena2 = "1234";

 public static void main(String[] args) {

  Integer i1 = new Integer(1234);

  Integer i2 = 1234;

  System.out.println("Numero i1 : " + i1);
  System.out.println("Numero i2 : " + i2);

  String cad1 = i1.toString();
  String cad2 = i2.toString();

  boolean esIgual1 = cad1.equals(cadena1);
  System.out.println("Valor 1 : " + esIgual1);
  boolean esIgual2 = cad2.equals(cadena2);
  System.out.println("Valor 2 : " + esIgual2);

  
  
 }

}

class BasicInteger {

}
