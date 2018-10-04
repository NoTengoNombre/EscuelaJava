/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.Colecciones.list_objetos_no_mutables_mutables;

import java.util.LinkedList;

/**
 * @see @since 03-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Test {

 private Integer num;

 public Integer getNum() {
  return num;
 }

 public void setNum(Integer num) {
  this.num = num;
 }

 public Test(int num) {
  this.num = num;
 }

 public static void main(String[] args) {

  Test p1 = new Test(11);
  Test p2 = new Test(12);

  LinkedList<Test> lista = new LinkedList<>();
  lista.add(p1);
  lista.add(p2);

  for (Test temp : lista) {
   System.out.println("Valor : " + temp.getNum());
  }

  p1.setNum(44);

  for (Test temp : lista) {
   System.out.println("♦ Valor : " + temp.getNum());
  }

 }
}
