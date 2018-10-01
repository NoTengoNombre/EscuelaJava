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
public class ClaseStringMetodoBasic {

 private char[] cadena = {'a', 'b', 'c', 'd', 'e'};
 private static int letraA = 0;
 private static int letraB = 0;
 private static int letraC = 0;
 private static int letraD = 0;
 private static int letraE = 0;

 private static Character c5;

 public static void main(String[] args) {

  String cadena = "!Bienvenido!";
  int longitud = cadena.length();

  char t = cadena.charAt(5);
  System.out.println(t);

  System.out.println("------------------");

  System.out.println(cadena.substring(0, 5));
  System.out.println(cadena.substring(5, 11));
  System.out.println(cadena.substring(5, cadena.length()));
  System.out.println(cadena.substring(5, cadena.length() - 1));

  System.out.println("---- Solo un indice ---- ");

  System.out.println(cadena.substring(5));

  System.out.println("---- Solo un indice ---- ");

  String subcad = cadena.substring(2);
  System.out.println(subcad);

  System.out.println("------ Numero a Caracter -----");

  String cad2 = "Numero cinco : " + 5;
  System.out.println(cad2);

  System.out.println("------- Float a Caracteres -----");

  System.out.println("A" + 5f);

  for (int i = 0; i < longitud; i++) {
   System.out.print(cadena.charAt(i));

   if (cadena.charAt(i) == 'a') {
    letraA++;
   }
   if (cadena.charAt(i) == 'b') {
    letraB++;
   }

   if (cadena.charAt(i) == 'c') {
    letraC++;
   }

   if (cadena.charAt(i) == 'd') {
    letraD++;
   }

   if (cadena.charAt(i) == 'e') {
    letraE++;
   }

  }

  System.out.println("------- Float a Caracteres -----");

  String c = "1234.5678";
  double n;
  double n1;

  try {
   n = Double.valueOf(c).doubleValue();
   n1 = Double.valueOf(c);
   System.out.println("Double 1 " + n + " Double 2 " + n1);
  } catch (NumberFormatException nfo) {
   System.out.println("Numbero " + nfo.getLocalizedMessage() + " - " + nfo.getCause().toString());
  }

  System.out.println("Letra 'a' : " + letraA);
  System.out.println("Letra 'b' : " + letraB);
  System.out.println("Letra 'c' : " + letraC);
  System.out.println("Letra 'd' : " + letraD);
  System.out.println("Letra 'e' : " + letraE);

 }
}
