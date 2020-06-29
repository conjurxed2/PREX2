package ufv.dis.final2020.abb1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestProductos {

	
	@Test
	public void creacionProduct() {
		
		
		
	}
	@Test
	public void addproductInventario() {
		
		Producto p = new Producto("Zapas", "ropa", "5726501675190", 58);
		Inventario inventario = new Inventario();
		
		Inventario.addProduct(p);
		
		assertEquals();
		
		
	}
	@Test
	public void removeproduct() {
		
	}
}
