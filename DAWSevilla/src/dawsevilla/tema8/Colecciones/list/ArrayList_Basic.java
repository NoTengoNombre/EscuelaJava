/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.Colecciones.list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @see @since 03-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ArrayList_Basic {

 private static int c1;
 private static int c2;

 public static void main(String[] args) {

  LinkedList<Integer> linked1 = new LinkedList<>();
  LinkedList<Integer> linked2 = new LinkedList<>();
  linked1.add(1);
  linked1.add(3);
  linked1.add(1, 2);
  linked1.add(linked1.get(1) + linked1.get(2));
  linked1.remove();

  linked1.forEach(l -> {
   System.out.println("Valores : " + l);
  });

  ArrayList<Integer> arrlist = new ArrayList<>();
  arrlist.add(10);
  arrlist.add(11);
  arrlist.set(arrlist.indexOf(11), 12);
  arrlist.addAll(0, linked1.subList(1, linked1.size()));

  arrlist.forEach(i -> {
   System.out.println(c1++ + "• Valores : " + i);
  });

  arrlist.subList(0, 2).clear();

  for (Integer id : arrlist) {
   System.out.println(c2++ + " ○ Valores : " + id);
  }

  System.out.println("Longitud : " + linked2.size());
  linked2.add(linked2.size() + 1);
  linked2.add(linked2.size() + 1);
  Integer suma = linked2.get(0) + linked2.get(1);
  System.out.println("Suma total : " + suma);

 }
}
