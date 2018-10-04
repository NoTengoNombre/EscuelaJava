/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.Colecciones.Iteradores;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @see @since 04-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class IteradoresConObjetosSinObjetos {

 /**
  *
  * @param longitud
  * @return lista
  */
 public ArrayList<Integer> getLista(int longitud) {
  ArrayList<Integer> lista = new ArrayList<>();
  System.out.println("Indicando el tipo de Objeto en el Iterador");
  for (int i = 0; i < longitud; i++) {
   lista.add(i);
  }
  Iterator<Integer> it = lista.iterator();
  while (it.hasNext()) {
   Integer t = it.next();
   System.out.println("• Elementos añadidos : " + t);
   if (t % 2 == 0) {
    System.out.println("- Elementos borrados : " + t);
    it.remove();
   }
  }
  return lista;
 }

 public static void main(String[] args) {

  IteradoresConObjetosSinObjetos icoso = new IteradoresConObjetosSinObjetos();
//  icoso.getLista((int) (Math.random() * (1 + 100) + 1));

  ArrayList<Integer> lista = new ArrayList<>();

  System.out.println("No Indicando el tipo de Objeto en el Iterador");

  for (int i = 0; i < 20; i++) {
   lista.add(i);
  }
  Iterator it = lista.iterator();
  while (it.hasNext()) {
   Integer t = (Integer) it.next();
   System.out.println("• Elementos añadidos : " + t);
   if (t % 2 == 0) {
    System.out.println("- Elementos borrados : " + t);
    it.remove();
   }
  }
 }
}
