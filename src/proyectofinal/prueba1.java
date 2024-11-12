package proyectofinal;

import java.util.Scanner;
import java.util.Random;

public class prueba1 {

    Scanner Datos = new Scanner(System.in);

    int valorGasolina;

    public void Gasolina() {

        valorGasolina = 16000;

    } // END VOID VEHICULOS

    int cuposTaxi;
    double consumoAutopistaTaxi;
    double consumoSantaELenaYPalmasTaxi;

    public void Taxi() {

        cuposTaxi = 4;

        System.out.println("Pasajeros del Taxi: " + cuposTaxi);

        consumoAutopistaTaxi = cuposTaxi * 1.20;
        consumoSantaELenaYPalmasTaxi = cuposTaxi * 1.28;

        System.out.println("Consumo en la ruta Autopista del Taxi: " + consumoAutopistaTaxi + " Galones");
        System.out.println("Consumo en la ruta Santa Elena y Palmas del Taxi: " + consumoSantaELenaYPalmasTaxi + " Galones");

    } // END VOID TAXI

    int cuposVans;
    double consumoAutopistaVans;
    double consumoSantaELenaYPalmasVans;

    public void Vans() {

        System.out.println("");

        Random randomNumbers = new Random();

        int pasajero = randomNumbers.nextInt(10) + 1;

        System.out.println("Pasajeros de la Vans: " + pasajero);

        consumoAutopistaVans = pasajero * 1.08;
        consumoSantaELenaYPalmasVans = pasajero * 1.11;

        System.out.println("Consumo en la ruta Autopista en la Vans: " + consumoAutopistaVans + " Galones");
        System.out.println("Consumo en la ruta Santa Elena y Palmas en la Vans: " + consumoSantaELenaYPalmasVans + " Galones");

    } // END VOID VANS

    double consumoAutopistaBuseta;
    double consumoSantaELenaYPalmasBuseta;

    public void Buseta() {

        System.out.println("");

        Random randomNumbers = new Random();

        int pasajero = randomNumbers.nextInt(10) + 1;

        System.out.println("Pasajeros de la Buseta: " + pasajero);

        consumoAutopistaBuseta = pasajero * 1.12;
        consumoSantaELenaYPalmasBuseta = pasajero * 1.15;

        System.out.println("Consumo en la ruta Autopista en la Buseta: " + consumoAutopistaBuseta + " Galones");
        System.out.println("Consumo en la ruta Santa Elena y Palmas en la Buseta: " + consumoSantaELenaYPalmasBuseta + " Galones");

    } // END VOID BUSETA

    public static void main(String[] args) {
        prueba1 Prueba = new prueba1();
        Prueba.Taxi();
        Prueba.Vans();
        Prueba.Buseta();
    }
}
