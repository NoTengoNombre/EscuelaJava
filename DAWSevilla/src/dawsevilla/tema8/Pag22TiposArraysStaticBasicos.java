/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8;

/**
 * @see apuntes
 * @since 02-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag22TiposArraysStaticBasicos {

 public static int[] getArrayConNumerosConsecutivos(int totalNumeros) {
  int[] r = new int[totalNumeros];
  for (int i = 0; i < totalNumeros; i++) {
   r[i] = i;
  }
  return r;
 }

 public static StringBuilder[] getCadenaMutable() {
  StringBuilder[] sb = new StringBuilder[10];
  for (int i = 0; i < sb.length; i++) {
   sb[i] = new StringBuilder("Cadena " + i);
  }
  return sb;
 }

 public static void setSemana() {
  String[] diaSemana = {"lunes", "m", "mi", "j", "v", "s", "d"};
  System.out.println(diaSemana[0].substring(0, 2));
 }

 public static void main(String[] args) {

  System.out.println(getArrayConNumerosConsecutivos(10).length);
  int[] arrayConNumerosConsecutivos = getArrayConNumerosConsecutivos(10);

  for (int i = 0; i < arrayConNumerosConsecutivos.length; i++) {
   System.out.print(String.format("%d ", arrayConNumerosConsecutivos[i]));
  }
  System.out.print("\n");

  int i = 1;
  for (StringBuilder sb : getCadenaMutable()) {
   System.out.println((i++) + "º" + " " + sb);
  }

  setSemana();

 }

}
