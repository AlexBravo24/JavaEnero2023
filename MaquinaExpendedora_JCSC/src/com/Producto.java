package com;

public class Producto {
	
	private String id;
    private int precio;
    private String desc;
    private int stock;    
    public Producto(String id, int precio, String desc, int cant) {
	super();
	this.id = id;
	this.precio = precio;
	this.desc = desc;
	this.stock = cant;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
	return "Producto [" + (desc != null ? "desc=" + desc + ", " : "") + "stock=" + stock + "]";
    }

}
