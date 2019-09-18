package Controller;

import Model.Persona;
import View.PersonaView;

public class PersonaController {
	
	private Persona model;
	private PersonaView view;
	
	public PersonaController(Persona model, PersonaView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getPersonaNombre() {
		return model.getNombre();
	}
	
	public void setPersonaNombre(String nombre) {
		model.setNombre(nombre);
	}
	
	public String getPersonaApellido() {
		return model.getApellido();
	}
	
	public void setPersonaApellido(String apellido) {
		model.setApellido(apellido);
	}
	
	public int getPersonaCedula() {
		return model.getCedula();
	}
	
	public void setPersonaCedula(int cedula) {
		model.setCedula(cedula);
	}
	
	public void updateView() {
		view.printPersona(model.getNombre(), model.getApellido(), model.getCedula());
	}
}
