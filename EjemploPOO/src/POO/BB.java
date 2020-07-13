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
public class BB {
    private int b;
    
    public BB(){
        this.b = 0;
    }
    public void mostrar(){
        System.out.println("Valor de Padre: "+getB());
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
}
