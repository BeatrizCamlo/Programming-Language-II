import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        MaquinaRefrigerante maquina = new MaquinaRefrigerante(3);

        maquina.imprimirPreco();

        maquina.inserirDinheiro(5);

        System.out.println("Balanço => R$" + maquina.getBalanco() + ",00");
        System.out.println();

        maquina.setDarTroco(true);

        maquina.comprarRefrigerante();


        }
    }