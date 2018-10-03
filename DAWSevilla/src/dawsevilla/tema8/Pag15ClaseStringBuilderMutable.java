/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8;

/**
 * @see @since 02-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag15ClaseStringBuilderMutable {

 public static void main(String[] args) {

//                                      01234567890123456789012345678901234567890
  StringBuilder sb0 = new StringBuilder("Clase Mutable - El mismo objeto para todo");
  System.out.println(sb0);
//                                        012345678901
  StringBuilder strb = new StringBuilder("Hoal Muuundo");
  System.out.println("Cadena a manejar : " + strb);
  System.out.println(String.format("Longitud total : %d ", strb.length()));
  System.out.println(strb.delete(6, 8));
  strb.append("!");
  System.out.println(strb);
  strb.insert(0, "!");
  System.out.println(strb);
  strb.replace(3, 5, "la");
  System.out.println(strb);

  StringBuilder strb1 = new StringBuilder("Rotar");
  strb1.append(strb1.charAt(0));
  strb1.delete(0, 1);
  System.out.println(strb1);

 }
}
