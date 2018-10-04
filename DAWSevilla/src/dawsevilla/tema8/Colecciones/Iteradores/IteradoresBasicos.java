/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.Colecciones.Iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @see apuntes
 * @since 04-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class IteradoresBasicos {

 List<Integer> lista = new ArrayList<>();

 public static void main(String[] args) {

  IteradoresBasicos ib = new IteradoresBasicos();
  for (int i = 0; i < 20; i++) {
   ib.lista.add(i);
  }

  Iterator<Integer> it = ib.lista.iterator();

  while (it.hasNext()) {
   Integer t = it.next();
   if (t % 2 == 0) {
    System.out.println("Eliminado el numero : " + t);
    it.remove();
   }
   System.out.println("Lista de numeros : " + t);
  }

  System.out.println(Arrays.toString(ib.lista.toArray()));

 }

}
