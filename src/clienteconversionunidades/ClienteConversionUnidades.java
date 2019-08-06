/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteconversionunidades;

/**
 * Implementación de un cliente del servicio web de conversión de unidades.
 * @author Ingeniero en Computación: Ricardo Presilla.
 * @version 1.0.
 */
public class ClienteConversionUnidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double centimetros=100, pulgadas= 1;
        System.out.println("Cliente del servicio de convertirUnidades:");
        System.out.printf("%f centimetros son %f pulgadas.\n", centimetros, centimetrosAPulgadas(centimetros));
        System.out.printf("%f pulgadas son %f centimetros.\n", pulgadas, pulgadasACentimetros(pulgadas));
    }
    /**
     * LLamada a la operación centimetrosAPulgadas del servicio web 
     * conversionUnidades.
     * @param centimetros   Tipo double.
     * @return Regresa un double.
     */
    private static double centimetrosAPulgadas(double centimetros) {
        webservices.ConversionUnidades_Service service = new webservices.ConversionUnidades_Service();
        webservices.ConversionUnidades port = service.getConversionUnidadesPort();
        return port.centimetrosAPulgadas(centimetros);
    }
    /**
     * LLamada a la operación pulgadasACentimetros del servicio web 
     * conversionUnidades.
     * @param centimetros   Tipo double.
     * @return Regresa un double.
     */
    private static double pulgadasACentimetros(double pulgadas) {
        webservices.ConversionUnidades_Service service = new webservices.ConversionUnidades_Service();
        webservices.ConversionUnidades port = service.getConversionUnidadesPort();
        return port.pulgadasACentimetros(pulgadas);
    }
    
}
