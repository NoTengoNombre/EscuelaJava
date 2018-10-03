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
public class Pag22TiposArraysBasicos {

 public static void main(String[] args) {

  MetodosArrayBasic mab = new MetodosArrayBasic();
  mab.getDeclaraciones();
  System.out.println("Suma total: " + mab.sumaArray(mab.getArray()));

  System.out.println("--------------------");

  int j = 0;
  int[] i = new int[1];
  i[0] = 0;

  mab.modificaArray(j, i);
  System.out.println(j + " - " + i[0]);

 }
}

class MetodosArrayBasic {

 private int[] a = null;

 public MetodosArrayBasic() {
  a = new int[]{5, 4, 3, 2, 1};
 }

 public int[] getArray() {
  a = new int[]{1, 1, 1, 1, 1};
  return a;
 }

 public void getDeclaraciones() {
  int[] numeros = new int[5];
  int[] num = {1, 2, 3, 4, 5};
  int[] otrosNum = new int[]{6, 7, 8, 9, 10};

  numeros[0] = 99;
  numeros[1] = 120;
  numeros[2] = 33;
  numeros[3] = 34;
  numeros[4] = 43;

  System.out.println("Sumar 1 : " + (numeros[0] + numeros[1]));
  System.out.println("Sumar 2 : " + (numeros[0] + numeros[1]));
  System.out.println("Sumar 3 : " + (numeros[3] + numeros[4]));
  System.out.println("Numeros : " + num.length);
  System.out.println("OtrosNum : " + otrosNum.length);
 }

 /**
  *
  * @param j
  * @return
  */
 public int sumaArray(int[] j) {
  int suma = 0;
  for (int i = 0; i < j.length; i++) {
   suma = suma + j[i];
  }
  return suma;
 }

 /**
  * Los valores pasados por parametros solo seran modificados los que son por
  * Referencia
  *
  * @param j
  * @param i
  */
 public void modificaArray(int j, int[] i) {
  j++; // por valor 
  i[0]++; // por referencia
 }

}
