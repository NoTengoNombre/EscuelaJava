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
public class Pag28ClasesGenericas {

 public static void main(String[] args) {

  Integer[] a = {0, 1, 2, 3, 4, 5};
  Integer[] b = {0, 1, 2, 3, 4, 5};

  System.out.println(UtilOtro.compararTamanio(a, b));
  System.out.println(UtilOtro.<Integer>compararTamanio(a, b));

 }
}

class UtilOtro {

 /**
  *
  * 
  * @param a
  * @param b
  * @return
  */
 public static int compararTamanio(Object[] a, Object[] b) {
  return (a.length - b.length);
 }

 /**
  *
  * @param <T>
  * @param a
  * @param b
  * @return
  */
 public static <T> int compararTamanioGe(T[] a, T[] b) {
  return (a.length - b.length);
 }

}
