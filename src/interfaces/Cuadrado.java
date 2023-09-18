package interfaces;

// @author Aqhuas
//se implementa(overrride) todos los metodos de cada implement
//para hacer mas de una implementacion se separa por una ,
public class Cuadrado implements Figura,Dibujable{
    private double lado;

    public Cuadrado() {
    }
    

    public Cuadrado(double lado) {
        this.lado = lado;
    } 
    

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un cuadrado");    }

    @Override
    public double calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
