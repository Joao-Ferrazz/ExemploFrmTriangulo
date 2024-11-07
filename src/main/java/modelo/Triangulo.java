package modelo;

/**
 *
 * @author joaov
 */
public class Triangulo {
    private Double base;
    private Double altura;

    public Triangulo(){
        this(0.0, 0.0);
    }
    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double getArea(){
        return ((getBase()*getAltura())/2);
    }
    
}
