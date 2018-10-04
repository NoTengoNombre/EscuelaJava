/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.ejemploPedidosArticulos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @see pag 47
 * @since 04-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
class Articulo {

 private String codArticulo;
 private String descripcion;
 private int cantidad;

 public Articulo() {
  this.codArticulo = null;
  this.descripcion = null;
  this.cantidad = 0;

 }

 public Articulo(String codArticulo, String descripcion, int cantidad) {
  this.codArticulo = codArticulo;
  this.descripcion = descripcion;
  this.cantidad = cantidad;
 }

 public int getCantidad() {
  return cantidad;
 }

 public void setCantidad(int cantidad) {
  this.cantidad = cantidad;
 }

 public String getCodArticulo() {
  return codArticulo;
 }

 public void setCodArticulo(String codArticulo) {
  this.codArticulo = codArticulo;
 }

 public void setDescripcion(String descripcion) {
  this.descripcion = descripcion;
 }

 public String getDescripcion() {
  return descripcion;
 }
}

/**
 *
 * @author Formacion
 */
public class ProcesarArchivo2 {

 private static final Scanner ENTRADA = new Scanner(System.in);

 private static final Pattern SECCION = Pattern.compile("^##[ ]*(FIN)?[ ]*(PEDIDO|ARTICULOS)[ ]*##$");
 private static final Pattern CAMPO = Pattern.compile("^(.+):.*\\{(.*)\\}$");
 private static final Pattern ARTICULO = Pattern.compile("^\\{(.*)\\|(.*)\\|[ ]*([0-9]*)[ ]*\\$");

 public static void main(String[] args) {
  // Obtener buffer de datos
  BufferedReader lector;
  // Crear una lista para almacenar los Articulo
  List<Articulo> Articulos = new ArrayList<>();
  // Creamos un HashMap para almacenar los valores por clave valor
  Map<String, String> DatosPedido = new HashMap<>();
// Recogemos los parametros recibidos desde la consola
  if (args.length > 0) {
   // Almacenamos en la variable BufferedReader objeto pasado por parametros de la consola 
   lector = cargarArchivo(args[0]);
  } else {
   // Lector no tiene archivo asignado
   lector = cargarArchivo();
  }

  //Si : lector es igual null
  if (lector == null) {
   /**
    * Si no se ha pdido cargar el archivo , no continua
    */
   System.out.println("No se ha podido cargar el archivo");
  } else {
   // Si ha podido cargar el archivo , continua procesando la linea
   String linea;
   try {
    // Lee desde teclado 
    linea = lector.readLine();
    while (linea != null) {
     procesarLinea(linea, DatosPedido, Articulos);
     linea = lector.readLine();
    }
   } catch (IOException ex) {
    System.out.println("Error de entrada y salida. " + ex.getMessage());
   }

   DatosPedido.keySet().forEach((etiqueta) -> {
    System.out.println("Datos del Pedido --> " + etiqueta + " : " + DatosPedido.get(etiqueta));
   });

//   for (Articulo ar : Articulos) {
//    System.out.println("Codigo Articulo  : " + ar.getCodArticulo() + "' ");
//    System.out.println("Descripcion : " + ar.getDescripcion() + "' ");
//    System.out.println("Cantidad : " + ar.getCantidad() + "' ");
//   }
   Articulos.stream()
           .map((ar) -> {
            System.out.println("Codigo Articulo  : " + ar.getCodArticulo() + "' ");
            return ar;
           }).map((ar) -> {
    System.out.println("Descripcion : " + ar.getDescripcion() + "' ");
    return ar;
   }).forEachOrdered((ar) -> {
    System.out.println("Cantidad : " + ar.getCantidad() + "' ");
   });
  }
 }

 /**
  * Procesa 1 linea del archivo de pedido para detectar que es y extraer infor k
  * contiene
  *
  * @param linea
  * @param datosPedido Mapa en el que ira metidiendo la info del pedido La llave
  * del mapa sera el nombre del campo
  * @param articulos - Lista en la que se iran metiendo los articulos del pedido
  * @return si la linea contiene info que corresponde al formato esperado ,
  * false en caso contrario
  */
 private static boolean procesarLinea(String linea, Map<String, String> datosPedido, List<Articulo> articulos) {
  //Patrones para filtrar los datos
  Matcher deteccionSeccion = SECCION.matcher(linea);
  Matcher deteccionCampo = CAMPO.matcher(linea);
  Matcher deteccionArticulo = ARTICULO.matcher(linea);

  // Si : patron coincide con el campo con datos del pedido
//        metera tanto el campo como el valor del mapa
  if (deteccionSeccion.matches()) {
   return true;
   /**
    * Sino
    */
  } else if (deteccionCampo.matches()) {
   datosPedido.put(deteccionCampo.group(1).trim().toLowerCase(), deteccionCampo.group(2).trim());
   return true;
  } else if (deteccionArticulo.matches()) {
   Articulo datosArticulo = new Articulo();
   datosArticulo.setCodArticulo(deteccionArticulo.group(1).trim());
   datosArticulo.setDescripcion(deteccionArticulo.group(2).trim());
   datosArticulo.setCantidad(Integer.parseInt(deteccionArticulo.group(3)));
   articulos.add(datosArticulo);
   return true;
  } else {
   System.out.println("!Cuidado! Linea no procesable : " + linea);
   return false;
  }
 }

 /**
  *
  * @param name
  * @return
  */
 private static BufferedReader cargarArchivo(String name) {
  String nombreArchivo = name;
  BufferedReader reader = null;
  if (name == null) {
   System.out.print("Introduce el nombre del archivo:");
   nombreArchivo = ENTRADA.nextLine();
  }
  try {
   FileReader f = new FileReader(nombreArchivo);
   reader = new BufferedReader(f);
  } catch (FileNotFoundException ex) {
   Logger.getLogger(ProcesarArchivo2.class.getName()).log(Level.SEVERE, null, ex);
  }
  return reader;
 }

 /**
  *
  * @return Null
  */
 private static BufferedReader cargarArchivo() {
  return cargarArchivo(null);
 }
}
