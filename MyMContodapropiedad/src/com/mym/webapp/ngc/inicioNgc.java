package com.mym.webapp.ngc;

import java.util.List;

import com.mym.webapp.Dao.inicioDao;
import com.mym.webapp.Dto.inicioDto;
import com.mym.webapp.util.ExcepcionWeb;



public class inicioNgc{
	
	private inicioDao InicioDao;
	
	private static inicioNgc InicioNgc;
	
	private inicioNgc(){
		InicioDao = new inicioDao();
	}
	
	public static inicioNgc getIntance(){
		if(InicioNgc == null){
			InicioNgc = new inicioNgc();
		}
		return InicioNgc;
	}

	public void crearPropiedad(inicioDto InicioDto) throws ExcepcionWeb {
		InicioDao.buscarPropiedad(InicioDto);
		InicioDao.crearPropiedad(InicioDto);
	}
	
	public List<inicioDto> listarPropiedades(){
		return InicioDao.listarPropiedades();
	}

}
