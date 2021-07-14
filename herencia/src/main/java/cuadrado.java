/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class cuadrado extends formas {
    private float area;
   
   public cuadrado(String forma, String color, float area){
        
    }
    
    //establecer y obtener
    
     public void establecerRadio(float area  ){
    this.area=area;
    }
    public float obtenerRadio(){
        return this.area;
}
     public void dibujarDatos(){
        System.out.println("la forma es:" + forma);
         System.out.println("la color es:" + color);
          System.out.println("la area es:" + area);
        
    }
    
}
