/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.Colecciones.hashset;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 * @see @since 03-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class HashSetEjemplo {

 public static void getValores() {

  HashSet<Integer> conjunto = new HashSet<>();
  String str;
  do {
   str = JOptionPane.showInputDialog("Introduce un numero : " + (conjunto.size() + 1) + " : ");
   try {
    Integer n = Integer.parseInt(str);

    if (!conjunto.add(n)) {
     JOptionPane.showMessageDialog(null, "Numero ya en la lista : Debes Introducir otro");
    }
   } catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Numero erroneo : " + e.getMessage());
   }
  } while (conjunto.size() < 5);
  Integer suma = 0;

  for (Integer indice : conjunto) {
   suma = suma + indice;
  }
  JOptionPane.showMessageDialog(null, "La suma es : " + suma);
 }

 public static void main(String[] args) {

  HashSetEjemplo.getValores();

 }
}
