package ufv.dis.final2020.abb1;

import java.io.IOException;
import java.util.ArrayList;

import com.google.zxing.WriterException;

public class Inventario {

	
		private ArrayList<Producto> productos;
		
		public Inventario() {
			
			this.productos = new ArrayList<Producto>();
		}
		
		public void addProduct(Producto p) {
			
			this.productos.add(p);
			
			try {
				GeneradorEAN13.generarEan(p);
			} catch (WriterException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		public void removeProduct(Producto p) {
			
			this.productos.remove(p);
		}
		
		public boolean checkIfExists(Producto p) {
			return this.productos.contains(p);
		}
}
