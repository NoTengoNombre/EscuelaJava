/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var miPeticion = new XMLHttpRequest();

miPeticion.onreadystatechange = function(){

    console.log("Hemos cambiado de estado !!");

    if(miPeticion.readyState === 3){
        console.log("Estado 3 !!!! ");
    }

    if(miPeticion.readyState === 4){
        console.log("Se acaba de completar la peticion");
        var datos = miPeticion.responseText;
    }
};

// Peticion y URL
miPeticion.open("GET","https://restcountries.eu/rest/v2/name/ireland");

miPeticion.send(null);
