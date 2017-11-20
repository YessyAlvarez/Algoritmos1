
package obli;

public class Obl2017 {

    public static Sistema S = new Sistema();
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        S.crearSistemaReservas(10);
        
        
        
        
        S.destruirSistemaReservas();
        
        
        //prueba P = new prueba();
        //S.crearSistemaReservas(5);
        //preuba1(S,P);
        //preuba2(S,P);
        
        
        
        
    }
    
 static void preuba1(Sistema s, prueba p){
   p.ver(s.registrarCiudad("Montevideo").resultado, Retorno.Resultado.OK, "Se registra Montevideo");
   p.ver(s.registrarCiudad("Montevideo").resultado, Retorno.Resultado.ERROR_1, "Se intenta registrar Montevideo nuevamente"); 
   p.ver(s.registrarCiudad("Tacuarembo").resultado, Retorno.Resultado.OK, "Se intenta registrar Montevideo nuevamente");         
   p.ver(s.registrarCiudad("Maldonado").resultado, Retorno.Resultado.OK, "Se registra Maldonado");
   p.ver(s.registrarCiudad("Rocha").resultado, Retorno.Resultado.OK, "Se registra Rocha");
   p.ver(s.registrarCiudad("Flores").resultado, Retorno.Resultado.OK, "Se registra Flores");   
   p.ver(s.registrarCiudad("Atlantida").resultado, Retorno.Resultado.ERROR_2, "Se registra Atlantida");
  
   
   p.imprimirResultadosPrueba();
    }

 
 static void preuba2 (Sistema s, prueba p){
   p.ver(s.registrarCiudad("Montevideo").resultado, Retorno.Resultado.OK, "Se registra Montevideo");
   p.ver(s.registrarCiudad("Montevideo").resultado, Retorno.Resultado.ERROR_1, "Se intenta registrar Montevideo nuevamente");         
   p.ver(s.registrarCiudad("Maldonado").resultado, Retorno.Resultado.OK, "Se registra Maldonado");
   p.ver(s.registrarCiudad("Rocha").resultado, Retorno.Resultado.OK, "Se registra Rocha");
   p.ver(s.registrarCiudad("Flores").resultado, Retorno.Resultado.OK, "Se registra Flores");
   p.ver(s.registrarCiudad("Punta del este").resultado, Retorno.Resultado.OK, "Se registra Punta del Este");
   p.ver(s.registrarCiudad("Atlantida").resultado, Retorno.Resultado.OK, "Se registra Atlantida");
   p.imprimirResultadosPrueba();
 }
 
}
