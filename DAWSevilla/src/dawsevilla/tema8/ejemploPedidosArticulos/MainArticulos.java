/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.ejemploPedidosArticulos;

/**
 * @see apuntes
 * @since 04-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class MainArticulos {

 /**
  *
  * @param a1
  * @param a2
  */
 public void compararObjetos(Articulo2 a1, Articulo2 a2) {
  int valor = a1.compareTo(a2);
  if (valor < 0) {
   System.out.println(a1.getCodArticulo() + " es menor que : " + a2.getCodArticulo());
  } else if (valor > 0) {
   System.out.println(a1.getCodArticulo() + " es mayor que : " + a2.getCodArticulo());
  } else {
   System.out.println(a1.getCodArticulo() + " es igual que : " + a2.getCodArticulo());
  }
 }

 public static void main(String[] args) {

  MainArticulos ma = new MainArticulos();

  Articulo2 a1i = new Articulo2("a1", "zapatos", 20);
  Articulo2 a2i = new Articulo2("a1", "zapatos", 20);

  ma.compararObjetos(a1i, a2i);

  Articulo2 a1menor = new Articulo2("a10", "zapatos", 10);
  Articulo2 a2menor = new Articulo2("a1", "zapatos", 10);

  ma.compararObjetos(a1menor, a2menor);

  Articulo2 a1mayor = new Articulo2("a1", "zapatos", 10);
  Articulo2 a2mayor = new Articulo2("a10", "zapatos", 10);

  ma.compararObjetos(a1mayor, a2mayor);

 }
}
