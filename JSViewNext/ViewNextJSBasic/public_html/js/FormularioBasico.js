/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function datos() {

    var dni = document.getElementById("idDNI").value;
    var tratamiento = document.getElementById("idTratamiento").value;
    var nombre = document.getElementById("idNombre").value;
    var fecha = document.getElementById("idFecha").value;
    var importe = document.getElementById("idImporte").value;

    var cogeTrataMiiento = document.getElementById("idTratamiento1").innerHTML = tratamiento;
    var cogeDNI = document.getElementById("idDNI1").innerHTML = dni;
    var cogeNombre = document.getElementById("idNombre1").innerHTML = nombre;
    var cogeFecha = document.getElementById("idFecha1").innerHTML = fecha;
    var cogeImporte = document.getElementById("idImporte1").innerHTML = importe;

    let resultado = `${cogeTrataMiiento} Nombre ${cogeNombre} : DNI ${cogeDNI} : Fecha ${cogeFecha} ingresa la cantidad de ${cogeImporte}€`;

    document.getElementById("obtenerDatos").innerHTML = resultado;
    
}



 