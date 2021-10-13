package will.villa.entity;

import java.util.Date;

public class Orden {

	private int idOrden;
	private String numero;
	private Date fechaCreacion;
	private Date fechaResibida;
	private double total;

	public Orden() {

	}

	/**
	 * @param idOrden
	 * @param numero
	 * @param fechaCreacion
	 * @param fechaResibida
	 * @param total
	 */
	public Orden(int idOrden, String numero, Date fechaCreacion, Date fechaResibida, double total) {
		this.idOrden = idOrden;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaResibida = fechaResibida;
		this.total = total;
	}

	/**
	 * @return the idOrden
	 */
	public int getIdOrden() {
		return idOrden;
	}

	/**
	 * @param idOrden the idOrden to set
	 */
	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the fechaResibida
	 */
	public Date getFechaResibida() {
		return fechaResibida;
	}

	/**
	 * @param fechaResibida the fechaResibida to set
	 */
	public void setFechaResibida(Date fechaResibida) {
		this.fechaResibida = fechaResibida;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Orden [idOrden=" + idOrden + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion
				+ ", fechaResibida=" + fechaResibida + ", total=" + total + "]";
	}

}
