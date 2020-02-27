# gacseXML

El proyecto del ejercicio consiste en una clase *Main* para ser ejecutada desde la consola.

La clase principal recibe como parámetro el nombre del archivo XML a procesar. 

En caso de no recibir ningún parámetro, utiliza el archivo ubicado en
`c:\test\xml\Ejemplo impuesto Trasladado.xml`

La aplicación fue desarrollada utilizando NetBeans.

Para ejecutar el ejercicio desde la consola, compile la clase y luego invoquela de la siguiente manera:

    c:\proyectos\gacseXML\build\classes\java\main>java com.gacse.pruebaXML.Main "c:\docs\MiArchivo.XML" 
    
Esto producirá una salida como la siguiente:

    Ejercicio de lectura de datos desde XML
    por Juan Antonio Castillo (jachguate)
      c:\docs\MiArchivo.XML
    Datos cfdi:Comprobante Folio 12
    =================================================================
    Total = 58 MXN
    RFC Emisor = GOYA780416GM0
    RFC Receptor = XAXX010101000
