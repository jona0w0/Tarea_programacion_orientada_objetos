/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class circulo extends formas {
    private float radio;
    
    public circulo(String forma, String color, float radio){
      
    }
    
    //establecer y obtener
    
     public void establecerRadio(float radio ){
    this.radio=radio;
    }
    public float obtenerRadio(){
        return this.radio;
}
    
    public void dibujarDatos(){
        System.out.println("la forma es:" + forma);
         System.out.println("la color es:" + color);
          System.out.println("la radio es:" + radio);
        
    }
    
    
    
}