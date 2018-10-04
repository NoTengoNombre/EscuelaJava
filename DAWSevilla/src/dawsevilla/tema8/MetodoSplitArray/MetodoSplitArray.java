/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.MetodoSplitArray;

import java.util.Arrays;

/**
 * @see apuntes
 * @since 04-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class MetodoSplitArray {

 public static void main(String[] args) {

  String texto = "Z,B,A,X,M,O,P,U";
  String[] partes = texto.split(",");
  Arrays.sort(partes);

  for (String indice : partes) {
   System.out.print(indice + " ");
  }
  System.out.println("");

 }
}
