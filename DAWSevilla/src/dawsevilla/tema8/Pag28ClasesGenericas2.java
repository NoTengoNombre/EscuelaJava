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
public class Pag28ClasesGenericas2 {

 public static void main(String[] args) {

  // Declara un array de Integer
  Integer[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

  // Creo un objeto de tipo generico
  UtilSubClase<Integer> utilGenerico = new UtilSubClase<>();
  // Invoco el metodo y le paso un array 
  utilGenerico.getInvetir(numeros);

  UtilSubClase u2 = new UtilSubClase();
  u2.seeArray(numeros);

 }
}

class UtilSubClase<T> {

 private T t1;

 public void getInvetir(T[] array) {
// dividimos el array en 2
  for (int i = 0; i < (array.length / 2); i++) {
   t1 = array[i];
   array[i] = array[array.length - i - 1];
   array[array.length - i - 1] = t1;
  }
 }

 /**
  * Recorrer : Array Genericos
  *
  * @param b
  */
 public void seeArray(T[] b) {
  int c = 0;
  for (T b1 : b) {
   String v = String.format("Posicion %2d: %4s ", c++, b1);
   System.out.println(v);
  }
 }

 public static <T, M> int sumaDeLongitud(T[] a, M[] b) {
  return (a.length - b.length);
 }

}

/**
 * Generico de 3 elementos
 *
 * @author Formacion
 * @param <A>
 * @param <B>
 * @param <C>
 */
class TernaSubClase<A, B, C> {

 private A a;
 private B b;
 private C c;

 public TernaSubClase(A a, B b, C c) {
  this.a = a;
  this.b = b;
  this.c = c;
 }

 public A getA() {
  return a;
 }

 public B getB() {
  return b;
 }

 public C getC() {
  return c;
 }

 public static <T, M> int sumaDeLongitud(T[] a, M[] b) {
  return (a.length - b.length);
 }

 @Override
 public String toString() {
  return String.format(" %5s %5s %5s : ", getA(), getB(), getC());
 }

}
