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
public class DD {
    private int d;
    // Composición BB
    private BB objCorazon;
    public DD(){
        objCorazon = new BB();
    }

    public BB getObjCorazon() {
        return objCorazon;
    }

    public void setObjCorazon(BB objCorazon) {
        this.objCorazon = objCorazon;
    }
    
    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
    
}
