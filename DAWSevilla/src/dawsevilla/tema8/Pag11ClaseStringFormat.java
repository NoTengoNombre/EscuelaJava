/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.tema8;

/**
 * @see @since 01-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag11ClaseStringFormat {

 public static void main(String[] args) {

  float precio = 3.3f;
  String salida = String.format("El precio es : %2f € : ", precio);
  System.out.println(salida);

  boolean valor1 = false;
  boolean valor2 = true;
  String r0 = String.format("Valor boolean : %b y valor2 : %B ", valor1, valor2);
  System.out.println(r0);

  String s1 = "cadena";
  String s2 = "cadena";
  String r1 = String.format("Valor String : %s1 y valor2: %s2 ", s1, s2);
  System.out.println(r1);

  int i1 = 10;
  int i2 = 20;
  String r2 = String.format("Valor int : %d y %d ", i1, i2);
  System.out.println(r2);

  double d1 = 1.01;
  double d2 = 0.1;
  double d3 = .012;

  String r3 = String.format("Valor double : \n %e \n %E \n %e \n", d1, d2, d3);
  System.out.println(r3);

  float f2 = 0.0001f;
  float f3 = 1000000.0F;

  String r4 = String.format("Valor float : \n \t  %f \n \t %f", f2, f3);
  System.out.println(r4);

  double decimalCorto1 = 0.00000001;
  double decimalCorto2 = 0.10000001;
  String r5 = String.format("Valor Double : \n \t %g \n %G", decimalCorto1, decimalCorto2);
  System.out.println(r5);

  System.out.println("-------- Mostrar Longitud de salida ---------");

  System.out.println("Longitud de desplazamiento : ");
  System.out.println(String.format("%5d", 10)); // Desplazamiento de 3 huecos

  System.out.println("Numero de precision : ");
  System.out.println(String.format("%.4f", 4.2f));

  String lavadora = "Lavadora";
  int unidades = 10;
  float precioUnidad = 302.4f;
  float p = (unidades * precioUnidad);
  String output = String.format(
          "\n Producto: %s; \n Unidades: %d; \n Precio por unidad: %.2f €; \n Total: %.2f €", lavadora, unidades, precioUnidad, p);
  System.out.println(output);

  System.out.println("------ Cambiar la posicion de salida --------");

  int i = 10;
  int j = 20;
  String d = String.format("%1$d multiplicado por %2$d (%1$d x %2$d) es %3$d", i, j, i * j);
  System.out.println(d);
  String d1d = String.format("%3$d resultado de multiplicar %2$d por %1$d --> (%1$dx%2$d) ", i, j, i * j);
  System.out.println(d1d);

  String ca1 = "ca1";
  String ca2 = "ca2".toUpperCase();
  String ca3 = "ca3".toUpperCase().concat(ca2);

  String mostrar = String.format("Mostrar : \t %3$s \t %1$s \t %2$s : ", ca1, ca2, ca3);
  System.out.println(mostrar);

 }
}
