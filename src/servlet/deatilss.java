package servlet;

import java.util.Date;

public class deatilss {
	private String label;
	private Date date;
	private String HeureDebut;
	private int durée;
	private String intervenant;
	private String client;

	public deatilss(String label, Date date, String heureDebut, int durée, String intervenant, String client) {
		super();
		this.label = label;
		this.date = date;
		HeureDebut = heureDebut;
		this.durée = durée;
		this.intervenant = intervenant;
		this.client = client;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getHeureDebut() {
		return HeureDebut;
	}

	public void setHeureDebut(String heureDebut) {
		HeureDebut = heureDebut;
	}

	public int getDurée() {
		return durée;
	}

	public void setDurée(int durée) {
		this.durée = durée;
	}

	public String getIntervenant() {
		return intervenant;
	}

	public void setIntervenant(String intervenant) {
		this.intervenant = intervenant;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

}

