/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.Colecciones.hashset;

import java.util.HashSet;

/**
 * @see @since 03-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class HashSetBasic {

 static HashSet<Integer> conjunto = new HashSet<>();

 public static void verNumeros(Integer n) {
  for (int i = 0; i < 11; i++) {
   conjunto.add(i);
  }
  if (!conjunto.add(n)) {
   System.out.println("Numero ya esta en la lista : NO SE INSERTA");
  } else {
   System.out.println("Numero No esta en la lista : SE INSERTA");
  }
  int c = 1;
  for (Integer i : conjunto) {
   System.out.println(c++ + " : Objeto Integer almacenado : " + i
   );
  }
 }

 public static void main(String[] args) {

  Integer n = 101;
  verNumeros(n);

  Integer n1 = 101;
  verNumeros(n1);

 }

}
