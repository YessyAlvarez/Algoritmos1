package obli;

import obli.Retorno.Resultado;

public class Sistema implements ISistema {
        private ListaCiudad Lciudad;
        private ListaCrucero Lcrucero;
        private int maxCiudades;


	@Override
	public Retorno crearSistemaReservas(int cantCiudades) {
            Retorno ret = new Retorno();
            maxCiudades = cantCiudades;
            if(cantCiudades>0){
                Lciudad = new ListaCiudad();
                Lcrucero = new ListaCrucero();
                Lciudad.setCapacidad(cantCiudades);
                ret.resultado = Resultado.OK;
            }else if(cantCiudades<1){
                ret.resultado = Resultado.ERROR_1;
            }else{
                ret.resultado = Resultado.NO_IMPLEMENTADA;
            }
            return ret;
	}

	@Override
	public Retorno destruirSistemaReservas() {
            
            
            /***
             * Destruyo todas las listas o matrices? o solo Lciudad
             ***/
            
            
            Retorno ret = new Retorno();
            if(Lciudad!=null && Lcrucero!=null){
                Lciudad = null;
                ret.resultado = Resultado.OK;
            }else{
                ret.resultado = Resultado.NO_IMPLEMENTADA;
            }
            return ret;
	}

	@Override
	public Retorno registrarCiudad(String ciudad) {
		Retorno ret = new Retorno();
		if(Lciudad!=null){
                    //Verifico que la ciudad no este repetida
                    if(Lciudad.buscarciudad(ciudad)){
                        ret.resultado = Resultado.NO_IMPLEMENTADA;
                    }else{
                        if(maxCiudades==0){
                            ret.resultado = Lciudad.agregarInicio(ciudad);
                            ret.resultado = Resultado.OK;
                        }else{

                        }

                        if(Lciudad.getCapacidad()<maxCiudades){

                        }
                    }
                }else{
                    ret.resultado = Resultado.NO_IMPLEMENTADA;
                }
		return ret;
	}
        

	@Override
	public Retorno registrarCrucero(String ciudad, String nombre, int estrellas, int capacidad) {
		Retorno ret = new Retorno();
		
		ret.resultado = Resultado.NO_IMPLEMENTADA;
		
		return ret;
	}

	@Override
	public Retorno ingresarServicio(String ciudad, String crucero, String servicio) {
		Retorno ret = new Retorno();
		
		ret.resultado = Resultado.NO_IMPLEMENTADA;
		
		return ret;
	}

	@Override
	public Retorno borrarServicio(String ciudad, String crucero, String servicio) {
		Retorno ret = new Retorno();
		
		ret.resultado = Resultado.NO_IMPLEMENTADA;
		
		return ret;
	}

	@Override
	public Retorno realizarReserva(int cliente, String ciudad, String crucero) {
		Retorno ret = new Retorno();
		
		ret.resultado = Resultado.NO_IMPLEMENTADA;
		
		return ret;
	}

	@Override
	public Retorno cancelarReserva(int cliente, String ciudad, String crucero) {
		Retorno ret = new Retorno();
		
		ret.resultado = Resultado.NO_IMPLEMENTADA;
		
		return ret;
	}

	@Override
	public Retorno ingresarComentario(String ciudad, String crucero, String comentario, int ranking) {
		Retorno ret = new Retorno();
		
		ret.resultado = Resultado.NO_IMPLEMENTADA;
		
		return ret;
	}

	@Override
	public Retorno listarServicios(String ciudad, String crucero) {
		Retorno ret = new Retorno();
		
		ret.resultado = Resultado.NO_IMPLEMENTADA;
		
		return ret;
	}

	@Override
	public Retorno listarCrucerosCiudad(String ciudad) {
		Retorno ret = new Retorno();
		
		ret.resultado = Resultado.NO_IMPLEMENTADA;
		
		return ret;
	}

	@Override
	public Retorno listarCrucerosRankingAsc(String ciudad) {
		Retorno ret = new Retorno();
		
		ret.resultado = Resultado.NO_IMPLEMENTADA;
		
		return ret;
	}

	@Override
	public Retorno listarCrucerosRankingDesc(String ciudad) {
		Retorno ret = new Retorno();
		
		ret.resultado = Resultado.NO_IMPLEMENTADA;
		
		return ret;
	}

	@Override
	public Retorno listarCrucerosRanking() {
		Retorno ret = new Retorno();
		
		ret.resultado = Resultado.NO_IMPLEMENTADA;
		
		return ret;
	}

	@Override
	public Retorno listarComentarios(String ciudad, String crucero) {
		Retorno ret = new Retorno();
		
		ret.resultado = Resultado.NO_IMPLEMENTADA;
		
		return ret;
	}

	@Override
	public Retorno cargarDistancias(int[][] ciudades) {
		Retorno ret = new Retorno();
		
		ret.resultado = Resultado.NO_IMPLEMENTADA;
		
		return ret;
	}

	@Override
	public Retorno buscarCamino(int[][] m, String origen, String destino) {
		Retorno ret = new Retorno();
		
		ret.resultado = Resultado.NO_IMPLEMENTADA;
		
		return ret;
	}

}
