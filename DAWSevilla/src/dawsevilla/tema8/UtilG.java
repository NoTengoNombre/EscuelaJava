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
public class UtilG<A> {

 private A a;

 public UtilG(A a) {
  this.a = a;
 }

 public <B> void Salida(B b) {
  System.out.println((a.toString()) + (b.toString()));
 }
}
