/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function convert(strNumero) {

    var UNIDADES = ["", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"];
    var DECENAS = ["", "", "", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"];
    var CENTENAS = ["", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"];

    var EXCEPCIONES = ["diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte",
        "veintiuno", "veintidos", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve"];

    let numero = parseInt(strNumero);
    let resultado = "";

    if (numero === 100){
        return "cien";
    }
    if (numero === 0){
        return "cero";
    }

    var c = parseInt(numero / 100);
    var d = parseInt(numero % 100 / 10);
    var u = parseInt(numero % 10);

    var du = d * 10 + u;
    var excepcion = (du > 9 && du < 30) ? true : false;

    resultado = UNIDADES[u];

    if (excepcion) {
        resultado = EXCEPCIONES[du - 10];
    } else {
        resultado = DECENAS[d] + ((d === 0 || u === 0) ? "" : " y ") + resultado;
    }
    return CENTENAS[c] + " " + resultado;

}

function test() {
    let numero = document.getElementById("idEntrada").value;
    let numText = convert(numero);
    document.getElementById("idRespuesta").innerHTML = numText;
}