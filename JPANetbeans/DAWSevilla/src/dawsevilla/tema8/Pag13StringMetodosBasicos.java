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
public class Pag13StringMetodosBasicos {

 public static void main(String[] args) {

  String cad1 = "a", cad2 = "a";
  String cad3 = "x";

  System.out.println("Comparar cadenas con : compareTo");

  int c1 = cad1.compareTo(cad2);
  System.out.println(String.format("Soy Igual : %s ", c1));

  int c2 = cad1.compareTo(cad3);
  System.out.println(String.format("Soy menor : %s ", c2));

  int c3 = cad3.compareTo(cad1);
  System.out.println(String.format("Soy mayor : %s ", c3));

  System.out.println("Equiparar cadenas con : equals");
  System.out.println(cad1.equals(cad2));
  System.out.println(cad1.equals(cad3));

  String cadenaCamelCase1 = "CamelCase1";
  String cadenaCamelCase1a = "CamelCase1";
  String cadenaCamelCase2 = "CamelCase2";

  System.out.println("Comparar cadenas con compareToIgnoreCase");
  System.out.println(cadenaCamelCase1.compareToIgnoreCase(cadenaCamelCase2));
  System.out.println(cadenaCamelCase1.compareToIgnoreCase(cadenaCamelCase1a));
  System.out.println("Comparar cadenas equalsIgnoreCase");
  System.out.println(cadenaCamelCase1.equalsIgnoreCase(cadenaCamelCase2));

  System.out.println("Metodo trim() ");
  String cadenaTrim = "        !quitar TRIM! ";
  String otraCopia = cadenaTrim.trim();
  System.out.println(otraCopia);

  System.out.println("----- indexOf -------- ");
//                        0123456789
  String cadenaIndice1 = "CadenaConIndice";
  String cadenaIndice2 = "CadenaConIndice";
  String cadenaIndice3 = "Cadena";
  String cadenaIndice4 = "Con";
  String cadenaIndice5 = "Indice";

  System.out.println(cadenaIndice1.indexOf(cadenaIndice2));
  System.out.println(cadenaIndice1.indexOf(cadenaIndice3));
  System.out.println(cadenaIndice1.indexOf(cadenaIndice4));
  System.out.println(cadenaIndice1.indexOf(cadenaIndice5));
  System.out.println(cadenaIndice1.indexOf(cadenaIndice3,1));
 }
}
