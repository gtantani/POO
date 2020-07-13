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
public class AA extends BB{
    private int a;
    public AA(){
        super();
        this.a = 0;
    }

    public void mostrar(){
        super.mostrar();
        System.out.println(" Valor hijo: "+getA());
    }
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
}
