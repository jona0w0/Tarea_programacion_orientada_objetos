/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class linea extends formas{
    private float largo;
    
    
   public linea(String forma, String color, float largo){
        
    }
    
    //establecer y obtener
    
     public void establecerLargo(float largo ){
    this.largo=largo;
    }
    public float obtenerLargo(){
        return this.largo;
}
     public void dibujarDatos(){
        System.out.println("la forma es:" + forma);
         System.out.println("la color es:" + color);
          System.out.println("la largo es:" + largo);
        
    }
    
}
