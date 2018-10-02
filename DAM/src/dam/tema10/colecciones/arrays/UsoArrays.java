/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.tema10.colecciones.arrays;

import java.util.Arrays;

/**
 * @see @since 14-sep-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class UsoArrays {

 private int arregloInt[] = {1, 2, 3, 4, 5, 6};
 private double arregloDouble[] = {8.4, 9.3, 0.2, 7.9, 3.4};
 private int arregloIntLleno[], copiaArregloInt[];

 public UsoArrays() {
  arregloIntLleno = new int[10];
  copiaArregloInt = new int[arregloInt.length];

  Arrays.fill(arregloIntLleno, 7);
  Arrays.sort(arregloDouble);
//  System.sort(arregloDouble);

 }
}
