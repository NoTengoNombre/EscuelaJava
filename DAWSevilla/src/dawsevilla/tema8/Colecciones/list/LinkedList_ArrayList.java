/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.Colecciones.list;

import java.util.LinkedList;

/**
 * @see @since 03-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class LinkedList_ArrayList {

 LinkedList<Integer> t = new LinkedList<>();

 public LinkedList<Integer> getT() {
  return t;
 }

 /**
  * @param t : Cualquier parametro de tipo List<Integer> para añadirle numeros
  * internamente
  */
 public void verElementos(LinkedList<Integer> t) {
  t.add(1); // Añade el elemento al final de la lista
  t.add(3); // Añade el elemento al final de la lista
  t.add(1, 2); // Añade el elemento al final de la lista
  t.add(t.get(1) + t.get(2)); // Suma elementos - agrega al final
  t.remove(0);
  t.forEach((i) -> {
   System.out.println(i);
  });
 }

 public static void main(String[] args) {

  LinkedList_ArrayList la = new LinkedList_ArrayList();

  la.verElementos(la.getT());

 }
}
