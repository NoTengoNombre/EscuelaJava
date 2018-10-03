/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.ClasesGenericas;

/**
 * @param <T>
 * @see apuntes
 * @since 03-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Main<T> {

 private Integer[] a1 = {0, 1, 2, 3, 4, 5};
 private Double[] a2 = {0d, 1d, 2d, 3d, 4d, 5d};

 public Integer[] getA1() {
  return a1;
 }

 public Double[] getA2() {
  return a2;
 }

 public void getMostrar(T[] numeros) {
  for (int i = 0; i < numeros.length; i++) {
   System.out.println(String.format("Posicion %d: %5s ", i, numeros[i]));
  }
 }

 public static void main(String[] args) {

  Integer[] numeros = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
  Util<Integer> u = new Util<>();
  u.invertir(numeros);

  Main num = new Main();
  num.getMostrar(numeros);

  System.out.println(String.format("Longitud Array Genericos : %d ", Util.sumaDeLongitudes(num.getA1(), num.getA2())));

  Integer a1 = 0;
  Double d1 = 1.3d;
  Float f1 = 1.1f;

  // Ternarios de 3 tipos difernetes
  Terna<Integer, Double, Float> t = new Terna<>(a1, d1, f1);
  
  
  
 }
}
