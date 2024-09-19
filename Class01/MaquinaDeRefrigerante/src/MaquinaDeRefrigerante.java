import java.util.ArrayList;

public class MaquinaDeRefrigerante{
    private String marca;
    private ArrayList<String> refrigerantes;
    private ArrayList<Double> precos;
    
    public MaquinaDeRefrigerante(String marca){
        this.marca = marca;
    }
    
    public void setRefrigerantes(ArrayList<String> soda){
        this.refrigerantes = soda;
    }
    
    public void setPreços(ArrayList<Double> precos){
        this.precos = precos;
    }

    @Override
    public String toString() {
        return "MaquinaDeRefrigerante{" +
                "marca='" + marca + '\'' +
                ", refrigerantes=" + refrigerantes +
                ", precos=" + precos +
                '}'; //
    }
}
