/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.Colecciones.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @see @since 03-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class MapaBasicos {

 public static void main(String[] args) {

  Map<String, String> datos = new HashMap<>();

  datos.put("A", "44");

  System.out.println(Integer.parseInt(datos.get("A")) - 4);
 }
}
