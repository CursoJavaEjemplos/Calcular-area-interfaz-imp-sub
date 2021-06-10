package datos;


public class Triangulo extends Figura implements Area {

    public Triangulo() {
        super();
    }
    
    public Float getArea(){
        
        Float a=this.getAltura();
        Float b=this.getBase();
        Float r = (a * b)/2;
        
        return r;
    }
    
   
    
}
