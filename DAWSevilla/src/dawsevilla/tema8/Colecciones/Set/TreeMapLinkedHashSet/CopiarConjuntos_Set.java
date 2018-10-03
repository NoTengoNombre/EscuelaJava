/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.Colecciones.Set.TreeMapLinkedHashSet;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @see apuntes
 * @since 03-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class CopiarConjuntos_Set {

 // NO ADMITE DUPLICADOS : NO ORDENA
 static TreeSet<Integer> a = new TreeSet<>();
 // NO ADMITE DUPLICADOS : ORDENA
 static LinkedHashSet lhs = new LinkedHashSet();

 public static void metodoAddAll(TreeSet ts, LinkedHashSet lhs) {
  ts.addAll(lhs);
  ts.forEach((i) -> {
   System.out.println("Valores : " + i);
  });
  System.out.println("-----------");
 }

 public static void metodoRemoveAll(TreeSet ts, LinkedHashSet lhs) {
  ts.removeAll(lhs);
  ts.forEach((i) -> {
   System.out.println("Valores : " + i);
  });
  System.out.println("-----------");
 }

 public static void metodoRetainAll(TreeSet ts, LinkedHashSet lhs) {
  ts.retainAll(lhs);
  ts.forEach((i) -> {
   System.out.println("Valores : " + i);
  });
  System.out.println("-----------");
 }

 public static void main(String[] args) {
  a.add(9);
  a.add(19);
  a.add(5);
  a.add(7);

  lhs.add(10);
  lhs.add(20);
  lhs.add(5);
  lhs.add(7);

//  metodoAddAll(a, lhs);
//  metodoRemoveAll(a, lhs);
  metodoRetainAll(a, lhs);
 }
}
