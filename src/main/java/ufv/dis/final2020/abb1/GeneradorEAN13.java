package ufv.dis.final2020.abb1;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.EAN13Writer;

public class GeneradorEAN13 {
	
	public static void generarEan(Producto p) throws WriterException, IOException {
		
		
		
		EAN13Writer ean13writer = new EAN13Writer();
		BitMatrix bitMatrix = ean13writer.encode(p.getEan13(), BarcodeFormat.EAN_13, 300, 100);
		Path path = FileSystems.getDefault().getPath("productos/"+ p.getEan13() + p.getEan13() + ".png");
		MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
	}

}
