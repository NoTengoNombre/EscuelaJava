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
public class Util1 {

 /**
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
