/*
 * Este código pertenece al dominio público. 
 */

package com.gacse.pruebaXML;

import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.*;
import org.w3c.dom.*;

/**
 *
 * @author Juan Antonio Castillo (jachguate)
 */
public class Main {

    public static void interpretarXML(String fileName) 
    throws SAXException, ParserConfigurationException, IOException
    {
        DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dbfactory.newDocumentBuilder();

        Document document = builder.parse(new File( fileName ));

        document.getDocumentElement().normalize();
        //navegación
        Element root = document.getDocumentElement();
        Element emisor, receptor;
        emisor = (Element) root.getElementsByTagName("cfdi:Emisor").item(0);
        receptor = (Element) root.getElementsByTagName("cfdi:Receptor").item(0);

        System.out.println("Datos " + root.getNodeName() + " Folio " + root.getAttribute("Folio"));
        System.out.println("=================================================================");
        System.out.println("Total = " + root.getAttribute("Total") + " " + root.getAttribute("Moneda"));

        System.out.println("RFC Emisor = " + emisor.getAttribute("Rfc"));
        System.out.println("RFC Receptor = " + receptor.getAttribute("Rfc"));
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio de lectura de datos desde XML");
        System.out.println("por Juan Antonio Castillo (jachguate)");
        String fileName;
        if (args.length > 0) {
            fileName = args[0];
        } else {
            fileName = "c:\\test\\xml\\Ejemplo impuesto Trasladado.xml";
            System.out.println("  Sin agrumentos, se utilizara documento default");
        }
        System.out.println("  " + fileName);
        try {
            interpretarXML(fileName);
        } catch (Exception e) {
            System.out.println("Error al interpretar XML:");
            e.printStackTrace();
        }
    }
}
