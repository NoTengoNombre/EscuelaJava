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
public class Pag30ClaseGenericaMetodosConTiposAdicionales {

 public static void main(String[] args) {

  Integer[] a1 = {1, 2, 3, 4, 5};
  System.out.println("Integer 1 : " + a1.length);
  Double[] a2 = {1d, 2d, 3d, 4d, 5d};
  System.out.println("Double 2 : " + a2.length);
  System.out.println(Util2Tipos.sumaDeLongitudes(a1, a2));
 }
}

class UtilMetodoTipoAdicional<A> {

 private A a;

 /**
  *
  * @param a
  */
 public UtilMetodoTipoAdicional(A a) {
  this.a = a;
 }

 /**
  * Creo un metodo generico que recibe otro tipo de valor Generico
  *
  * @param <B>
  * @param b
  */
 public <B> void salida(B b) {
  System.out.println(a.toString() + " - " + b.toString());
 }

}
