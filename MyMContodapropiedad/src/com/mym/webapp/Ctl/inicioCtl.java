

package com.mym.webapp.Ctl;

import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;
import org.zkoss.zul.Radiogroup;

import com.mym.webapp.Dto.inicioDto;
import com.mym.webapp.ngc.inicioNgc;

/**
 * Clase controladora de las vistas
 * 
 * @author DanielGomez
 *
 */

public class inicioCtl extends GenericForwardComposer implements ListitemRenderer {

	private Button btn1;
	private Button BtnBuscar; 
 	private Radiogroup RadProp;
 	private Radiogroup RadTipo;
 	
 	private inicioNgc InicioNgc;
 	
 	public inicioCtl(){
		InicioNgc = inicioNgc.getIntance();
	}
 	
 	public void onCreate(){
 		definirModelo();
 	}
 	
	private void definirModelo() {
		List<inicioDto> listaPropiedades = InicioNgc.listarPropiedades();
		ListModel<inicioDto> model = new ListModelList<inicioDto>(listaPropiedades);		
	}
	
	public void onClick$BtnBuscar(Event e){
		System.out.println(RadProp.getSelectedItem());
	}

	public void render(Listitem item, Object data, int index) throws Exception {
		// TODO Auto-generated method stub

	}
	
	public void doAfterCompose(Component comp) throws Exception{		
		super.doAfterCompose(comp);	
	}
	
}
