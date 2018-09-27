/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validateDNI(dni) {
    var numero;
    var longitud;
    var letra;
    var expresion_regular_dni;

    expresion_regular_dni = /^\d{8}[a-zA-Z]$/;

    if (expresion_regular_dni.test(dni) == true) {
        numero = dni.substr(0, dni.length - 1);
        longitud = dni.substr(dni.length - 1, 1);
        longitud = longitud.toUpperCase();
        numero = numero % 23;
        letra = 'TRWAGMYFPDXBNJZSQVHLCKET';
        letra = letra.substring(numero, numero + 1);
        if (letra != longitud) {
            alert('La letra no corresponde con el DNI.');
        } else {
            alert('DNI correcto.');
            return true;
        }
    } else {
        alert('DNI no válido.');
    }
    return false;
}


function respuesta() {
    let cadena = document.getElementById("idEntrada").value;
    let numText = validateDNI(cadena);
    document.getElementById('idRespuesta').innerHTML = numText;
}
    