import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String marca = sc.nextLine();
        MaquinaDeRefrigerante maquina = new MaquinaDeRefrigerante(marca);


        System.out.println("Insira os 3 refrigerantes: ");
        ArrayList<String> refri = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Refrigerante " + i + ": ");
            refri.add(sc.nextLine());
        }
        maquina.setRefrigerantes(refri);


        System.out.println("Insira os preços dos 3 refrigerantes: ");
        ArrayList<Double> precos = new ArrayList<>();
        for (String ref : refri) {
            System.out.println("Refrigerante " + ref + ": R$ ");
            precos.add(Double.parseDouble(ref));
        }
    }
}