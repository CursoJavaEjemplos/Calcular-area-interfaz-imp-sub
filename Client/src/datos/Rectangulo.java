package datos;

import javax.swing.JOptionPane;


public class Rectangulo extends Figura implements Area {


    public Rectangulo() {
        super();
    }

    
    public Float getArea(){
        
        Float a= this.getAltura();
        Float b= this.getBase();
        
       return a * b;
    }
    
      
}
