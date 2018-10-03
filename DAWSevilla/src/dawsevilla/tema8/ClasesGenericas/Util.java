/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.ClasesGenericas;

/**
 * @param <T>
 * @see @since 03-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Util<T> {

 private T t1;

 public Util() {
 }

 public Util(T t) {
  this.t1 = t;
 }

 public <B> void Salida(B b) {
  System.out.println(t1.toString() + " " + b.toString());
 }

 /**
  * Invertir el sentido del array
  *
  * @param array
  */
 public void invertir(T[] array) {
  for (int i = 0; i < (array.length / 2); i++) {
   t1 = array[i];
   array[i] = array[array.length - i - 1];
   array[array.length - i - 1] = t1;
  }
 }

 /**
  * Dos o mas Parametros de TIPO
  *
  * @param <T>
  * @param <M>
  * @param a
  * @param b
  * @return
  */
 public static <T, M> int sumaDeLongitudes(T[] a, M[] b) {
  return (a.length + b.length);
 }

 /**
  *
  * @param <T>
  * @param t1
  * @param t2
  * @return
  */
 public static <T extends Number> Double sumar(T t1, T t2) {
  return new Double(t1.doubleValue() + (t2.doubleValue()));
 }

}
