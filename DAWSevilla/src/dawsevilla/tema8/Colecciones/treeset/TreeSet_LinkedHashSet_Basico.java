/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.Colecciones.treeset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @see @since 03-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class TreeSet_LinkedHashSet_Basico {

 public static void main(String[] args) {

  TreeSet<Integer> ts = new TreeSet<>();
  LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

  ts.add(new Integer(4));
  ts.add(new Integer(99));
  ts.add(new Integer(3));
  ts.add(new Integer(1));

  lhs.add(new Integer(4));
  lhs.add(new Integer(99));
  lhs.add(new Integer(3));
  lhs.add(new Integer(1));

  System.out.println("TreeSet");
  //Invocamos Interface Iterator y la implementamos con el iterator 
  // invocamos el objeto a iterar 'LinkedHashSet' y le agregamos el metodo
  // Iteramos el siguiente elemento mediante el objeto 'it.hasNext'
  for (Iterator<Integer> it = lhs.iterator(); it.hasNext();) {
   // Almacenamos en el objeto tipo Integer el siguiente elemento del 'LinkedHashSet'
   Integer i = it.next(); // 
   System.out.println("Valor : " + i);
  }

  System.out.println("LinkedHashSet");
  // invocamos el objeto - le añadimos al 'ts' el metodo forEach
  ts.forEach((i) -> {
   if (i >= 1) {
    System.out.println("Valor : " + ++i);
   }else{
    System.out.println("Ningun Valor : " + ++i);
   }
  });

 }
}
