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
public class Pag23MatricesBasicas {

 private int[][] a2d = {
  {0, 1, 2},
  {3, 4, 5},
  {6, 7, 8}};

 private int[][][] a3d = {{
  {0, 1, 2},
  {3, 4, 5},
  {6, 7, 8}
 }};

 public static int matrizParametro(int[][] a2d) {
  int suma = 0;
  for (int i = 0; i < a2d.length; i++) {
   for (int j = 0; j < a2d[i].length; j++) {
    suma += a2d[i][j];
   }
  }
  return suma;
 }

 public static int[][] matriz(int n, int m) {
  int[][] ret = new int[n][m];
  for (int j = 0; j < n; j++) {
   for (int k = 0; k < m; k++) {
    ret[j][k] = n * m;
   }
  }
  return ret;
 }

 public static void main(String[] args) {

  int[][] mI = new int[3][];

  mI[0] = new int[7];
  mI[1] = new int[15];
  mI[2] = new int[9];

  if ((mI[1] != null) && (mI[1].length > 10)) {
   for (int i = 0; i < mI.length; i++) {
    for (int j = 0; j < mI[i].length; j++) {
     System.out.print(mI[i][j]);
    }
    System.out.println();
   }
  }

  int[][] matriz = Pag23MatricesBasicas.matriz(2, 4);

  for (int[] matriz1 : matriz) {
   for (int j = 0; j < matriz1.length; j++) {
    System.out.print(matriz1[j]);
   }
   System.out.println("");
  }

  int[][][] i3d2 = {{{0, 1}, {0, 2}}, {{10, 11, 13}, {20, 21, 23}}, {{200, 230, 240}, {110, 111, 115}}};
//  int[][][] i3d2 = {{{0, 1}, {1, 2}, {3, 4}}};

  for (int i = 0; i < i3d2.length; i++) {
   for (int j = 0; j < i3d2[i].length; j++) {
    for (int k = 0; k < i3d2[i][j].length; k++) {
     System.out.println(i3d2[i][j][k]);
    }
    System.out.println("");
   }
   System.out.println("");
  }
 }
}
