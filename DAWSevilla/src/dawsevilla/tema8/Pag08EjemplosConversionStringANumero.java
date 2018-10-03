/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8;

import javax.swing.JOptionPane;

/**
 * @see @since 01-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag08EjemplosConversionStringANumero {

 /**
  * Atributo de instancia
  */
 private boolean operacionCancelada;

 /**
  * Constructor basico
  */
 public Pag08EjemplosConversionStringANumero() {
 }

 /**
  *
  * @param operacionCancelada
  */
 public Pag08EjemplosConversionStringANumero(boolean operacionCancelada) {
  this.operacionCancelada = operacionCancelada;
 }

 /**
  * Metodo que permite comprobar si la ultima operacion tipo Pedir ha sido
  * cancelada
  *
  * @return true si la ultima operacion realizada ha sido cancelada , false en
  * caso contrario
  */
 public boolean isOperacionCancelada() {
  return operacionCancelada;
 }

 /**
  * Metodo que permite cambiar el estado de la variable privada de la
  * operacionCancelada
  *
  * Este metodo es privado , solo puede usarse como un metodo propio de la clase
  *
  * @param operacionCancelada - True o False , el nuevo estado para la variable
  */
 private void setOperacionCancelada(boolean operacionCancelada) {
  this.operacionCancelada = operacionCancelada;
 }

 /**
  * Clase que pide al usuario que introduzca un numero , el numero esperado es
  * un numero de doble precision , en cualquier de sus formatos
  *
  * Admitira numeros como : 2E10 ( 2*10^10); 2,45;
  *
  * @param titulo
  * @param mensaje
  * @return
  */
 public double PedirNumeroDouble(String titulo, String mensaje) {
  double d = 0;
  setOperacionCancelada(false);
  boolean NumeroValido = false;
  do {
   String s = (String) JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");
   if (s != null) {
    try {
     d = Double.parseDouble(s);
     NumeroValido = true;
    } catch (NumberFormatException nfe) {
     JOptionPane.showMessageDialog(null, "El numero introducido no es valido. " + nfe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
   } else {
    NumeroValido = true;
    setOperacionCancelada(true);
   }
  } while (!NumeroValido);
  return d;
 }

 /**
  * Clase que pide al usuario que introduzca un numero
  *
  * El numero esperado es un numero de precision sencilla , en cualquiera de sus
  * formatos
  *
  * @param titulo
  * @param mensaje
  * @return numero formateado a float
  */
 public float PedirNumeroFloat(String titulo, String mensaje) {
  float f = 0;
  setOperacionCancelada(false);
  boolean NumeroValido = false;

  do {
   String s = (String) JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");
   if (s != null) {
    try {
     f = Float.valueOf(s);
     NumeroValido = true;
    } catch (NumberFormatException nfe) {
     JOptionPane.showMessageDialog(null, "El Numero introducido no valido." + nfe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
   } else {
    NumeroValido = true;
    setOperacionCancelada(true);
   }
  } while (!NumeroValido);
  return f;
 }

 /**
  *
  * @param titulo
  * @param mensaje
  * @return
  */
 public int PedirNumeroInteger(String titulo, String mensaje) {
  int i = 0;
  setOperacionCancelada(false);
  boolean NumeroValido = false;
  do {
   String s = (String) JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");
   if (s != null) {
    try {
     i = Integer.valueOf(s);
     NumeroValido = true;
    } catch (NumberFormatException nfe) {
     JOptionPane.showMessageDialog(null, "El numero introducido no es valido." + nfe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
   } else {
    NumeroValido = true;
    setOperacionCancelada(true);
   }
  } while (!NumeroValido);

  return i;
 }

 /**
  *
  * @param titulo
  * @param mensaje
  * @return
  */
 public long PedirNumeroLong(String titulo, String mensaje) {
  long l = 0;
  setOperacionCancelada(false);
  boolean NumeroValido = false;
  do {
   String s = (String) JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");
   if (s != null) {
    try {
     l = Long.valueOf(s);
     NumeroValido = true;
    } catch (NumberFormatException nfe) {
     JOptionPane.showMessageDialog(null, "El numero introducido no es valido." + nfe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
   } else {
    NumeroValido = true;
    setOperacionCancelada(true);
   }
  } while (!NumeroValido);
  return l;
 }

 /**
  *
  * @param titulo
  * @param mensaje
  * @return
  */
 public short PedirNumeroShort(String titulo, String mensaje) {
  short s = 0;
  setOperacionCancelada(false);
  boolean NumeroValido = false;
  do {
   String st = (String) JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");
   if (st != null) {
    try {
     s = Short.valueOf(st);
     NumeroValido = true;
    } catch (NumberFormatException nfe) {
     JOptionPane.showMessageDialog(null, "El numero introducido no es valido." + nfe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
   } else {
    NumeroValido = true;
    setOperacionCancelada(true);
   }
  } while (!NumeroValido);
  return s;
 }

 public static void main(String[] args) {

  Double d = new Pag08EjemplosConversionStringANumero().PedirNumeroDouble("Lanzar", "Introduce un numero Double ");
  JOptionPane.showMessageDialog(null, "El numero Introducido es : " + d.toString(), "Valor obtenido", JOptionPane.INFORMATION_MESSAGE);

  Float f = new Pag08EjemplosConversionStringANumero().PedirNumeroFloat("Lanzar", "Introduce un numero Float ");
  JOptionPane.showMessageDialog(null, "El numero Introducido es : " + f.toString(), "Valor obtenido", JOptionPane.INFORMATION_MESSAGE);

  Integer i = new Pag08EjemplosConversionStringANumero().PedirNumeroInteger("Lanzar", "Introduce un numero Integer ");
  JOptionPane.showMessageDialog(null, "El numero Introducido es : " + i.toString(), "Valor obtenido", JOptionPane.INFORMATION_MESSAGE);

  Long l = new Pag08EjemplosConversionStringANumero().PedirNumeroLong("Lanzar", "Introduce un numero Long ");
  JOptionPane.showMessageDialog(null, "El numero Introducido es : " + l.toString(), "Valor obtenido", JOptionPane.INFORMATION_MESSAGE);

  Short s = new Pag08EjemplosConversionStringANumero().PedirNumeroShort("Lanzar", "Introduce un numero Short ");
  JOptionPane.showMessageDialog(null, "El numero Introducido es : " + s.toString(), "Valor obtenido", JOptionPane.INFORMATION_MESSAGE);

 }

}
