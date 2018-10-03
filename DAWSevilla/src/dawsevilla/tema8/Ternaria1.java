/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8;

/**
 * @see @since 03-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ternaria1<A, B, C> {

 private A a;
 private B b;
 private C c;

 private Integer[] a1 = {0, 1, 2, 3, 4, 5};
 private Double[] a2 = {0d, 1d, 2d, 3d, 4d, 5d};

 public Ternaria1() {
  a = null;
  b = null;
  c = null;
 }

 public Ternaria1(A a, B b, C c) {
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

}
