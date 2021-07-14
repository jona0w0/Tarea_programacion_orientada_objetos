/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class triangulo extends formas {
    private float angulo;
    
    public triangulo(String forma, String color, float angulo){
        
    }
    
    //establecer y obtener
    
     public void establecerAngulo(float angulo ){
    this.angulo=angulo;
    }
    public float obtenerAngulo(){
        return this.angulo;
}
     public void dibujarDatos(){
        System.out.println("la forma es:" + forma);
         System.out.println("la color es:" + color);
          System.out.println("la angulo es:" + angulo);
        
    }
    
}
