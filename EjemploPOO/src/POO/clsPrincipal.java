/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author pc
 */
public class clsPrincipal {
    private int numero;
    public clsPrincipal(){
        this.numero = 0;
    }
    
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void mostrar(){
        
    }
    
    public static void main(String[] aa){
        clsPrincipal obj = new clsPrincipal();
        obj.setNumero(20);
        System.out.println(obj.getNumero());
    }
}
