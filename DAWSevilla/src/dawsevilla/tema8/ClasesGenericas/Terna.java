/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.ClasesGenericas;

/**
 * @param <A>
 * @param <B>
 * @param <C>
 * @see @since 03-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Terna<A, B, C> {

 private A a = null;
 private B b = null;
 private C c = null;

 public Terna() {
  this.a = null;
  this.b = null;
  this.c = null;
 }

 public Terna(A a, B b, C c) {
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

 @Override
 public String toString() {
  return "getA " + getA() + " getB " + getB() + " getC " + getC();
 }

}
