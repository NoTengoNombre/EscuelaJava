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
public class Pag28ClasesGenericas3Ternarias {

 public static void main(String[] args) {

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
class TernariaOtraSub<A, B, C> {

 private A a;
 private B b;
 private C c;

 public TernariaOtraSub(A a, B b, C c) {
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
