package will.villa.entity;

public class DetalleOrden {

	private int idDetalleOrden;
	private String nombre;
	private double cantidad;
	private double precio;
	private double total;

	/**
	 * Constructor vacio
	 */
	public DetalleOrden() {

	}

	/**
	 * @param idDetalleOrden
	 * @param nombre
	 * @param cantidad
	 * @param precio
	 * @param total
	 */
	public DetalleOrden(int idDetalleOrden, String nombre, double cantidad, double precio, double total) {
		this.idDetalleOrden = idDetalleOrden;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}

	/**
	 * @return the idDetalleOrden
	 */
	public int getIdDetalleOrden() {
		return idDetalleOrden;
	}

	/**
	 * @param idDetalleOrden the idDetalleOrden to set
	 */
	public void setIdDetalleOrden(int idDetalleOrden) {
		this.idDetalleOrden = idDetalleOrden;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cantidad
	 */
	public double getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
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
		return "DetalleOrden [idDetalleOrden=" + idDetalleOrden + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + ", total=" + total + "]";
	}

}
