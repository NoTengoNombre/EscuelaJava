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
public class Pag14ClaseStringMetodoBasic {

 private char[] cadena = {'a', 'b', 'c', 'd', 'e'};

 private static int letraA = 0;
 private static int letraB = 0;
 private static int letraC = 0;
 private static int letraD = 0;
 private static int letraE = 0;
//                                 012345678910
 private static String palabra1 = "Bienvenido!";
//                                 012345
 private static String palabra2 = "Bien!";
//                                 0123456
 private static String palabra3 = "venido!";

 public String getPalabra1() {
  return palabra1;
 }

 public String getPalabra2() {
  return palabra2;
 }

 public String getPalabra3() {
  return palabra3;
 }

 private static Character c5;

 public static void main(String[] args) {

  Pag14ClaseStringMetodoBasic objStr = new Pag14ClaseStringMetodoBasic();

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
   n = Double.valueOf(c).doubleValue(); // forma larga
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

  System.out.println("------ IndexOf -------");

//                 0123
  String busca1 = "Bien";
//                 012345
  String busca2 = "venido";

  int p1 = palabra1.indexOf(busca1);
  System.out.println("Posicion 1 : " + p1);

  int p2 = palabra1.indexOf(busca2);
  System.out.println("Posicion 2 : " + p2);

  int contadorPalabras = 0;

  String sTexto = "palabra o palabra y palabra";
  String sTextoBuscado = "palabra";

  while (sTexto.indexOf(sTextoBuscado) > -1) {
   sTexto = sTexto.substring(sTexto.indexOf(sTextoBuscado) + sTextoBuscado.length(), sTexto.length());
   contadorPalabras++;
  }
  System.out.println("Texto : " + sTexto);
  System.out.println("Cuantas palabras encontradas : " + contadorPalabras);

  boolean si1 = palabra1.contains(palabra2);
  System.out.println("Contiene palabra : " + si1);

  boolean si2 = palabra1.contains(palabra1);
  System.out.println("Contiene palabra : " + si2);

  System.out.println(
          "Palabra 1 : " + objStr.getPalabra1()
          + "\nPalabra 2 : " + objStr.getPalabra2()
          + "\nContiene la palabra : "
          + objStr.getPalabra1().contains(objStr.getPalabra2()));

  System.out.println("Contiene : " + "paco".contains("paco"));

  System.out.println("Comienza 1 : " + "paco".startsWith("PacoPaquitopaco"));
  System.out.println("Comienza 2 : " + "paco".startsWith("paco"));
  System.out.println("Termina 1 : " + "paco".endsWith("PacoPaquitopaco"));
  System.out.println("Termina 2 : " + "paco".endsWith("paco"));

  String cadenaHj = "hojalata";
  int posicionRemplazo = cadenaHj.replace("l", "j").indexOf("ja");
  System.out.println(posicionRemplazo + " - " + cadenaHj);
 
  String cadHojaLata = "hojalata";
  System.out.println(cadHojaLata.replace("l", "j"));
 
 }
 
 

}
