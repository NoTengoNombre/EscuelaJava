 console.log("dentro del restcountries.js");
 
 function solicitarPaises(continente){
     
     console.log(continente);
  
     var datos = continente;
     
     document.getElementById("idPaisesPorContinente").innerHTML = datos;
     
 }