package com.generation.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Productos")
public class ProductosModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "Nombre_producto", nullable = false, length = 255)
	private String nombre_producto;
	
	@Column(name = "Precio", nullable = false)
	private int precio;
	
	@Column(name = "Cantidad_inventario", nullable = false)
	private byte cantidad_inventario;
	
	

	public ProductosModel() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public byte getCantidad_inventario() {
		return cantidad_inventario;
	}

	public void setCantidad_inventario(byte cantidad_inventario) {
		this.cantidad_inventario = cantidad_inventario;
	}

	@Override
	public String toString() {
		return "ProductosModel [id=" + id + ", nombre_producto=" + nombre_producto + ", precio=" + precio
				+ ", cantidad_inventario=" + cantidad_inventario + "]";
	}
	
	
}
