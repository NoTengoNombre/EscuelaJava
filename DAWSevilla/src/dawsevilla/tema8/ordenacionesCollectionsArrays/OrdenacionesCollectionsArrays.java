/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8.ordenacionesCollectionsArrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @see @since 04-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class OrdenacionesCollectionsArrays {

// Atributo de instancia
 private Integer[] array;

 /**
  * Constructor
  */
 public OrdenacionesCollectionsArrays() {
  this.array = new Integer[]{
   (int) (Math.random() * (1 + 1000) + 1),
   (int) (Math.random() * (1 + 1000) + 1),
   (int) (Math.random() * (1 + 1000) + 1),
   (int) (Math.random() * (1 + 1000) + 1),
   (int) (Math.random() * (1 + 1000) + 1),
   (int) (Math.random() * (1 + 1000) + 1),
   (int) (Math.random() * (1 + 1000) + 1)};
 }

 /**
  * @param array objeto Integer array
  */
 public OrdenacionesCollectionsArrays(Integer[] array) {
  this.array = array;
 }

 /**
  *
  * @return array de Integer
  */
 public Integer[] getArray() {
  return array;
 }

 /**
  *
  * @param array de Integer
  */
 public void setArray(Integer[] array) {
  this.array = array;
 }

 @Override
 public String toString() {
  return Arrays.toString(getArray());
 }

 public static void main(String[] args) {

  OrdenacionesCollectionsArrays oca = new OrdenacionesCollectionsArrays();

  System.out.println(Arrays.toString(oca.getArray()));
  Arrays.sort(oca.getArray());
  System.out.println(Arrays.toString(oca.getArray()));

 }
}
