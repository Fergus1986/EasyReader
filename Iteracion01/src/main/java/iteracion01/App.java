package iteracion01;

import iteracion01.dominio.GestionarCanal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Iteracion 01" );
        
        GestionarCanal reader = new GestionarCanal();
        
        reader.addCanal("http://www.vidaextra.com/index.xml");
        
        
    }
}
