/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.ejemploPedidosArticulos;

import java.util.Comparator;

/**
 * @see apuntes pag 50
 * @since 04-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ComparadorArticulos implements Comparator<Articulo> {

 /**
  * Devuelve negativo si el 1º objeto es menor que el 2º objeto
  *
  * Devuelve 0 si el 1º objeto es igual que el 2º objeto
  *
  * Devuelve positivo si el 2º objeto es mayor que el 1º objeto
  *
  * @param o1
  * @param o2
  * @return valor de la comparacion
  */
 @Override
 public int compare(Articulo o1, Articulo o2) {
  return o1.getCodArticulo().compareTo(o2.getCodArticulo());
 }

 public static void main(String[] args) {

  Articulo a1 = new Articulo();
  a1.setCodArticulo("A1");
  a1.setDescripcion("Lapices");
  a1.setCantidad(30);

  Articulo a2 = new Articulo();
  a2.setCodArticulo("B1");
  a2.setDescripcion("Lapices");
  a2.setCantidad(30);

  Articulo a1A = new Articulo("C1", "Lapices", 30);
  Articulo a1B = new Articulo("C1", "Lapices", 30);

  ComparadorArticulos ca = new ComparadorArticulos();
  
  System.out.println(ca.compare(a1, a2));
  
  System.out.println(ca.compare(a1A, a1B));

  Articulo a2A = new Articulo("B1", "Lapices", 30);
  Articulo a2B = new Articulo("A1", "Lapices", 30);
  System.out.println(ca.compare(a2A, a2B));

 }
}
