package Vista;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Historia_3 {

	public BufferedImage  imgFondo;		
	public void cargarImagen() throws IOException{
		imgFondo = ImageIO.read(new File("mapa_nivel_1.jpg"));	
	}
}
