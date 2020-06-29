package ufv.dis.final2020.abb1;

public class Producto {
	
		private String name;
		private String category;
		private String ean13;
		private float price;
		
		public Producto(String name, String category, String ean13, float price) {
			super();
			this.name = name;
			this.category = category;
			this.ean13 = ean13;
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getEan13() {
			return ean13;
		}
		public void setEan13(String ean13) {
			this.ean13 = ean13;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		
		
}
