package ufv.dis.final2020.abb1;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;

import com.google.zxing.WriterException;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        
        Inventario inventario = new Inventario();
        
        final TextField name = new TextField();
        name.setCaption("Type your name here:");
        
        final TextField ean13 = new TextField();
        ean13.setCaption("Type your ean13 here:");
        
        final TextField category = new TextField();
        category.setCaption("Type your category here:");
        
        final TextField price = new TextField();
        price.setCaption("Type your price here:");

        Button button = new Button("Click Me");
        button.addClickListener(e -> {
            
        	Producto p =  new Producto(name.getValue(), category.getValue(), ean13.getValue(), Float.parseFloat(price.getValue()));
        	inventario.addProduct(p);
        	
        	
        });
        
        layout.addComponents(name, ean13, category, price, button);
        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
