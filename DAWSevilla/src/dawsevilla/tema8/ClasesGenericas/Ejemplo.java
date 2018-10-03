/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.ClasesGenericas;

/**
 * @see Paso de clases Genericas por Parametro
 * @since 03-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ejemplo<A> {

 public A a;

 public void test(Ejemplo<Integer> e) {
  System.out.println("Valor : " + e.getClass().toGenericString());
 }

 /**
  * Metodo generico que acepta cualquier tipo de Objeto
  *
  * @param e
  */
 public void test2(Ejemplo<?> e) {
  System.out.println("Valor : " + e.getClass().toGenericString());
 }

 /**
  * Metodo generico que acepta cualquier tipo de Objeto que herede de Number
  *
  * @param e
  */
 public void test3(Ejemplo<? extends Number> e) {
  System.out.println("Valor : " + e.getClass().toGenericString());
 }

}
