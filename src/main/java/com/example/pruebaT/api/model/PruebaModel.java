package com.example.pruebaT.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="TPRUEBA")
public class PruebaModel {
	@Id
	Long idTabla;

	String campo;

	public Long getIdTabla() {
		return idTabla;
	}

	public void setIdTabla(Long idTabla) {
		this.idTabla = idTabla;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

}
