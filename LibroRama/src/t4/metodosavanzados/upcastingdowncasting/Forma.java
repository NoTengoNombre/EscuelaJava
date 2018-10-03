/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t4.metodosavanzados.upcastingdowncasting;

/**
 * @see
 * @since 10-sep-2018
 * @version 1.0 
 * @author Raul Vela Salas
 */
public abstract class Forma {
 void identidad(){ System.out.println("");
 }
}

class Circulo extends Forma{
 
 public String toString(){return "circulo";}
 
 public static void jerarquia(Object obj){
  Object o = obj;
  while(o.getClass().getSuperclass() != null){
   System.out.println(o.getClass());
   
  }
 }
}
