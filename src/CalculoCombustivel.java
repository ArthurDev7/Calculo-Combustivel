//@autor: Arthur Luiz do Nascimento

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoCombustivel {
    public static void main(String[] args) {

        Scanner scanTempo = new Scanner(System.in);
        System.out.println("Quanto tempo é necessário para a viagem?");
        double tempoGasto = scanTempo.nextDouble();

        Scanner scanVeloc = new Scanner(System.in);
        System.out.println("Qual é a velocidade média?");
        double velocMedia = scanVeloc.nextDouble();

        Scanner scanConsumo = new Scanner(System.in);
        System.out.println("Qual é o consumo do veículo?");
        int consumo = scanConsumo.nextInt();

        System.out.println("Tempo gasto: " + tempoGasto + " horas");
        System.out.println("Velocidade média: " + velocMedia+" km/h");

        double distancia = velocMedia * tempoGasto;

        double totalCombustivel = (velocMedia * tempoGasto)/consumo;
        DecimalFormat df = new DecimalFormat();

        System.out.println("Você vai percorrer: " + distancia + " km");
        System.out.println("Será necessário: "+df.format(totalCombustivel)+" litros de combustível");
    }
}
