/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.Colecciones.Set.ComparadorObjetos;

import java.util.Comparator;

/**
 * @see @since 03-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ComparadorDeObjetos implements Comparator<Objeto> {

 /**
  * Para comparar objetos en ordenes distintos
  *
  * @param o1 Objeto a comparar 1
  * @param o2 Objeto a comparar 2
  * @return
  */
 @Override
 public int compare(Objeto o1, Objeto o2) {
  int sumao1 = o1.a + o1.b; //  Creamos la suma de los objetos
  System.out.println("-- Total sumao1 : " + sumao1);
  int sumao2 = o2.a + o2.b; //  Creamos la suma de los objetos
  System.out.println("-- Total sumao2 : " + sumao2);
  // Comparamos los valores numericos
  if (sumao1 < sumao2) {
   return 1;
  } else if (sumao1 > sumao2) {
   return -1;
  } else {
   return 0;
  }
 }

 public static void main(String[] args) {

  ComparadorDeObjetos c = new ComparadorDeObjetos();
  Objeto a1 = new Objeto(1, 1);
  Objeto b1 = new Objeto(22, 22);

  Objeto a2 = new Objeto(11, 11);
  Objeto b2 = new Objeto(1, 1);

  Objeto a3 = new Objeto(2, 2);
  Objeto b3 = new Objeto(2, 2);

  System.out.println("Si obj1 debe de ir antes que obj2 - Valor negativos ");
  System.out.println("Si obj1 debe de ir despues que obj2 - Valor positivo ");
  System.out.println("Si obj1 es igual que obj2 - Valor 0 ");
  System.out.println("Comparacion a1 y b1 : " + c.compare(a1, b1));
  System.out.println("Comparacion a2 y b2 : " + c.compare(a2, b2));
  System.out.println("Comparacion a3 y b3 : " + c.compare(a3, b3));

 }

}

/**
 * Para comparar objetos lo ideal
 *
 * sería crear una variable de tipo entero
 *
 *
 * @author Formacion
 */
class Objeto {

 public int a;
 public int b;

 public Objeto() {
 }

 public Objeto(int a, int b) {
  this.a = a;
  this.b = b;
 }

}
