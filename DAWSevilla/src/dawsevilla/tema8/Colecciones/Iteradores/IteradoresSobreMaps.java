/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.Colecciones.Iteradores;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @see apuntes pag 46
 * @since 04-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class IteradoresSobreMaps {

 public static void recorrerMapForeach() {
  HashMap<Integer, Integer> mapa1 = new HashMap<>();
  int ii = 0;
  for (int i = 0; i < 5; i++) {
   mapa1.put(i, (ii++) * 2);
   for (Integer llave : mapa1.keySet()) {
    Integer valor = mapa1.get(llave);
    System.out.println("Foreach " + llave + " : " + valor);
   }
   System.out.println("----------");
  }
 }

 public static void recorrerMapIterator() {
  HashMap<Integer, Integer> mapa2 = new HashMap<>();
  int ii = 0;
  for (int i = 0; i < 5; i++) {
   mapa2.put(i, (ii++) * 2);
   for (Iterator<Integer> it = mapa2.keySet().iterator(); it.hasNext();) {
    Integer llave = it.next();
    Integer valor = mapa2.get(llave);
    System.out.println("Funcion Iterator " + llave + " : " + valor);
   }
   System.out.println("----------");
  }
 }

 public static void recorrerMapFlechaFuncional() {
  HashMap<Integer, Integer> mapa3 = new HashMap<>();
  int ii = 0;
  for (int i = 0; i < 5; i++) {
   mapa3.put(i, (ii++) * 2);
   mapa3.keySet().forEach((llave) -> {
    Integer valor = mapa3.get(llave);
    System.out.println("Funcion Funcional " + llave + " : " + valor);
   });
   System.out.println("----------");
  }
 }

 public static void main(String[] args) {
//  recorrerMapForeach();
//  recorrerMapIterator();
//  recorrerMapFlechaFuncional();
 }
}
