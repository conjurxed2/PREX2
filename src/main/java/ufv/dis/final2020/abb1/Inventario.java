package ufv.dis.final2020.abb1;

import java.util.ArrayList;

public class Inventario {

	
		private ArrayList<Producto> productos;
		
		public Inventario() {
			
			this.productos = new ArrayList<Producto>();
		}
		
		public void addProduct(Producto p) {
			
			this.productos.add(p);
		}
		
		public void removeProduct(Producto p) {
			
			this.productos.remove(p);
		}
		
		public boolean checkIfExists(Producto p) {
			return this.productos.contains(p);
		}
}
