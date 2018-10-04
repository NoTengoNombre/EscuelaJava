/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.ColeccionesMetodosOrdenacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @see pag 51
 * @since 04-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ColeccionesMetodosOrdenacion {

 public static List<Articulos3> listaElementos = new ArrayList<>();

 public static void main(String[] args) {

  Articulos3 a1 = new Articulos3();

  listaElementos.add(new Articulos3(11, "zapatos", Boolean.FALSE));
  listaElementos.add(new Articulos3(22, "lapices", Boolean.TRUE));
  listaElementos.add(new Articulos3(33, "relojes", Boolean.FALSE));
  listaElementos.add(new Articulos3(44, "camiones1", Boolean.TRUE));
  listaElementos.add(new Articulos3(55, "camiones2 ", Boolean.FALSE));
  listaElementos.add(new Articulos3(66, "camiones3", Boolean.TRUE));
  listaElementos.add(new Articulos3(77, "camiones4", Boolean.FALSE));
  listaElementos.add(new Articulos3(88, "camiones5", Boolean.TRUE));
  listaElementos.add(new Articulos3(99, "camiones6", Boolean.FALSE));

  a1.verLista(listaElementos);
  a1.getMezclar(listaElementos);

  a1.verLista(listaElementos);
  a1.getReverseLista(listaElementos);

  a1.verLista(listaElementos);

  List<Articulos3> listaElementos2 = new ArrayList(5);

  List<Articulos3> rellenarLista = a1.rellenarLista(listaElementos2, new Articulos3(new Articulos3().getValor(), "lanchas ".concat(String.valueOf(new Articulos3().getValor())), Boolean.FALSE), 5);

  a1.verLista(rellenarLista);

 }
}

class Articulos3 {

 private Integer cod;
 private String nombre;
 private Boolean descatalogado;
 private int valor = ((int) (Math.random() * (1 + 101) + 1));

 public Articulos3() {
  this(0, null, false);
 }

 public Articulos3(Integer cod, String nombre, Boolean descatalogado) {
  this.cod = cod;
  this.nombre = nombre;
  this.descatalogado = descatalogado;
 }

 public List<Articulos3> getMezclar(List<Articulos3> articulos) {
  Collections.shuffle(articulos);
  return articulos;
 }

 public List<Articulos3> rellenarLista(List<Articulos3> articulos, Articulos3 articulo, int num) {
  for (int i = 0; i < num; i++) {
   articulos.add(articulo);
  }
  return articulos;
 }

 public void verLista(List<Articulos3> articulos) {
  articulos.forEach((indice) -> {
   System.out.println(indice.toString());
  });
  System.out.println("-------------------------------------");
 }

 public List<Articulos3> getConvertirArrayEnLista(Articulos3[] articulos) {
  return Arrays.asList(articulos);
 }

 public Articulos3[] getConvertirListaArrays(List<Articulos3> articulos) {
  return (Articulos3[]) articulos.toArray();
 }

 public List<Articulos3> getReverseLista(List<Articulos3> articulos) {
  Collections.reverse(articulos);
  return articulos;
 }

 public int getValor() {
  return valor;
 }

 /**
  * @return the cod
  */
 public Integer getCod() {
  return cod;
 }

 /**
  * @param cod the cod to set
  */
 public void setCod(Integer cod) {
  this.cod = cod;
 }

 /**
  * @return the nombre
  */
 public String getNombre() {
  return nombre;
 }

 /**
  * @param nombre the nombre to set
  */
 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 /**
  * @return the descatalogado
  */
 public Boolean getDescatalogado() {
  return descatalogado;
 }

 /**
  * @param descatalogado the descatalogado to set
  */
 public void setDescatalogado(Boolean descatalogado) {
  this.descatalogado = descatalogado;
 }

 @Override
 public String toString() {
  return " • Codigo : " + getCod() + " Nombre " + getNombre() + " Descatalogado " + getDescatalogado();
 }

}
