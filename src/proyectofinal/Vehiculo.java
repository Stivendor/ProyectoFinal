package proyectofinal;

import java.util.Scanner;
import java.util.Random;

public class Vehiculo {

    double valorGasolina = 16000;

    int pasajerosTaxi = 4;
    double valorPasajeTaxi = 25000;
    double valorPeajeTaxi = 15500;
    double ingresoDiarioTaxi;
    double gastoDiarioTaxi;
    double totalGastosTaxi;
    double acomuladorIngresosTaxi = 0;
    double acomuladorGastosTaxi = 0;

    double rentabilidadBajadaTaxi;
    double rentabilidadSubidaTaxi;
    double promedioRentabilidadTaxi;

    double consumoGasolina;
    double consumoAdicionalGasolina;
    double consumoAutopistaTaxi;
    double consumoSantaElenaTaxi;
    double consumoPalmasTaxi;

    public void Taxi() {
        //CALCULAR EL CONSUMO TOTAL DE LA GASOLINA EN AUTOPISTA (TAXI)
        consumoGasolina = valorGasolina / 50 * distanciaBajadaAutopista;
        consumoAdicionalGasolina = consumoGasolina * .20;
        consumoAutopistaTaxi = consumoGasolina + consumoAdicionalGasolina;
        totalGastosTaxi = totalConsumoCambiosAutopista + valorPeajeTaxi + consumoAutopistaTaxi;

        //CALCULAR EL PROMEDIO DE RENTABILIDAD  (TAXI)
        rentabilidadBajadaTaxi = ingresoDiarioTaxi - (valorPeajeTaxi + consumoAutopistaTaxi);
        rentabilidadSubidaTaxi = rentabilidadBajadaTaxi -  totalConsumoCambiosAutopista;
        promedioRentabilidadTaxi = (rentabilidadBajadaTaxi + rentabilidadSubidaTaxi)/2;
        Cambios();

        for (int i = 0; i < 6; i++) {

            ingresoDiarioTaxi = valorPasajeTaxi * pasajerosTaxi;
            acomuladorIngresosTaxi += ingresoDiarioTaxi;

            gastoDiarioTaxi = consumoAutopistaTaxi; //aca va el consumoSantaElenaTaxi...
            acomuladorGastosTaxi += gastoDiarioTaxi;

            ingresosMatriz[i][0] = ingresoDiarioTaxi;
            gastosMatriz[i][0] = gastoDiarioTaxi;

            System.out.println("============ Día " + (i + 1) + " ============");
            System.out.println("Pasajeros Taxi: " + pasajerosTaxi);
            System.out.println("Gasto Autopista Taxi: " + totalGastosTaxi + " pesos");
            System.out.println("Gasto Santa Elena Taxi: " + consumoSantaElenaTaxi + " pesos");
            System.out.println("Gasto Palmas Taxi: " + consumoPalmasTaxi + " pesos");
            System.out.println("");

            System.out.println("Ingresos de Taxi (Día " + (i + 1) + "): " + ingresoDiarioTaxi);
            System.out.println("Gastos de Taxi (Día " + (i + 1) + "): " + gastoDiarioTaxi);
            System.out.println("");
//            System.out.println("totalGastos " + totalGastosTaxi);
//            System.out.println("totalConsumoCambioAutopista "+ totalConsumoCambiosAutopista);
//            System.out.println("cambioUno "+consumoCambioUnoAutopista);
//            System.out.println("cambioDos "+consumoCambioDosAutopista);
//            System.out.println("cambioTres "+consumoCambioTresAutopista);
//            System.out.println("factor " +factorConsumoAutopista);
            System.out.println("prom "+ promedioRentabilidadTaxi);
            System.out.println("subida "+ rentabilidadSubidaTaxi);
            System.out.println("bajada "+ rentabilidadBajadaTaxi);

        }

    } // END VOID TAXI

    Random randomVans = new Random();

    double valorPeajeVans = 20500;
    double valorPasajeVans = 15000;
    double ingresoDiarioVans;
    double gastoDiarioVans;
    double acomuladorIngresosVans = 0;
    double acomuladorGastosVans = 0;

    double consumoAutopistaVans;
    double consumoSantaElenaVans;
    double consumoPalmasVans;

    public void Vans() {
        Cambios();

        for (int i = 0; i < 6; i++) {
            int pasajerosVans = randomVans.nextInt(10) + 1;

            ingresoDiarioVans = valorPasajeVans * pasajerosVans;
            acomuladorIngresosVans += ingresoDiarioVans;

            consumoAutopistaVans = (consumoCambioAutopista + valorPeajeVans + (pasajerosVans * valorGasolina / 40) * 1.08);
            consumoSantaElenaVans = (consumoCambioSantaElena + valorPeajeVans + (pasajerosVans * valorGasolina / 40) * 1.11);
            consumoPalmasVans = (consumoCambioPalmas + valorPeajeVans + (pasajerosVans * valorGasolina / 40) * 1.11);

            gastoDiarioVans = consumoAutopistaVans + consumoSantaElenaVans + consumoPalmasVans;
            acomuladorGastosVans += gastoDiarioVans;

            ingresosMatriz[i][1] = ingresoDiarioVans;
            gastosMatriz[i][1] = gastoDiarioVans;

            System.out.println("============ Día " + (i + 1) + " ============");
            System.out.println("Pasajeros Vans: " + pasajerosVans);
            System.out.println("Gasto Autopista Vans: " + consumoAutopistaVans + " pesos");
            System.out.println("Gasto Santa Elena Vans: " + consumoSantaElenaVans + " pesos");
            System.out.println("Gasto Palmas Vans: " + consumoPalmasVans + " pesos");
            System.out.println("");

            System.out.println("Ingreso de Vans (Día " + (i + 1) + "): " + ingresoDiarioVans);
            System.out.println("Gastos de Vans (Día " + (i + 1) + "): " + gastoDiarioVans);
            System.out.println("");

        }

    } // END VOID VANS

    Random randomBuseta = new Random();

    double valorPasajeBuseta = 12000;
    double valorPeajeBuseta = 25000;
    double ingresoDiarioBuseta;
    double gastoDiarioBuseta;
    double acomuladorIngresosBuseta = 0;
    double acomuladorGastosBuseta = 0;

    double consumoAutopistaBuseta;
    double consumoSantaElenaBuseta;
    double consumoPalmasBuseta;

    public void Buseta() {
        Cambios();

        for (int i = 0; i < 6; i++) {
            int pasajerosBuseta = randomBuseta.nextInt(15) + 1;

            ingresoDiarioBuseta = valorPasajeBuseta * pasajerosBuseta;
            acomuladorIngresosBuseta += ingresoDiarioBuseta;

            consumoAutopistaBuseta = (consumoCambioAutopista + valorPeajeBuseta + (pasajerosBuseta * valorGasolina / 30) * 1.12);
            consumoSantaElenaBuseta = (consumoCambioSantaElena + valorPeajeBuseta + (pasajerosBuseta * valorGasolina / 30) * 1.15);
            consumoPalmasBuseta = (consumoCambioPalmas + valorPeajeBuseta + (pasajerosBuseta * valorGasolina / 30) * 1.15);

            gastoDiarioBuseta = consumoAutopistaBuseta + consumoSantaElenaBuseta + consumoPalmasBuseta;
            acomuladorGastosBuseta += gastoDiarioBuseta;

            ingresosMatriz[i][2] = ingresoDiarioBuseta;
            gastosMatriz[i][2] = gastoDiarioBuseta;

            System.out.println("============ Día " + (i + 1) + " ============");
            System.out.println("Pasajeros Buseta: " + pasajerosBuseta);
            System.out.println("Gasto Autopista Buseta: " + consumoAutopistaBuseta + " pesos");
            System.out.println("Gasto Santa Elena Buseta: " + consumoSantaElenaBuseta + " pesos");
            System.out.println("Gasto Palmas Buseta: " + consumoPalmasBuseta + " pesos");
            System.out.println("");

            System.out.println("Ingresos de Buseta (Día " + (i + 1) + "): " + ingresoDiarioBuseta);
            System.out.println("Gastos de Buseta (Día " + (i + 1) + "): " + gastoDiarioBuseta);
            System.out.println("");

        }

    } // END VOID BUSETA

    int distanciaSubidaAutopistaCambioUno;
    int distanciaSubidaAutopistaCambioDos;
    int distanciaSubidaAutopistaCambioTres;

    int distanciaSubidaSantaElenaCambioUno;
    int distanciaSubidaSantaElenaCambioDos;
    int distanciaSubidaSantaElenaCambioTres;

    int distanciaSubidaPalmasCambioUno;
    int distanciaSubidaPalmasCambioDos;
    int distanciaSubidaPalmasCambioTres;

    int distanciaBajadaAutopista = 45;
    int distanciaBajadaSantaElena = 50;
    int distanciaBajadaPalmas = 55;

    public void DistanciaRutas() {

        //el total de subida Autopista es de: 45 
        distanciaSubidaAutopistaCambioUno = 10;
        distanciaSubidaAutopistaCambioDos = 25;
        distanciaSubidaAutopistaCambioTres = 10;

        //el total de subida Santa Elena es de: 50
        distanciaSubidaSantaElenaCambioUno = 20;
        distanciaSubidaSantaElenaCambioDos = 20;
        distanciaSubidaSantaElenaCambioTres = 10;

        //el total de subida Palmas es de: 55
        distanciaSubidaPalmasCambioUno = 15;
        distanciaSubidaPalmasCambioDos = 15;
        distanciaSubidaPalmasCambioTres = 25;

    }// END VOID DISTANCIARUTAS

    double cambioUno;
    double cambioDos;
    double cambioTres;

    double consumoCambioUnoAutopista;
    double consumoCambioDosAutopista;
    double consumoCambioTresAutopista;
    double totalConsumoCambiosAutopista;

    double consumoCambioAutopista;
    double consumoCambioSantaElena;
    double consumoCambioPalmas;
    double factorConsumoAutopista;

    public void Cambios() {
        DistanciaRutas();

        cambioUno = .03;
        cambioDos = .02;
        cambioTres = .01;

        factorConsumoAutopista = consumoAutopistaTaxi / distanciaBajadaAutopista;
        consumoCambioUnoAutopista = factorConsumoAutopista * distanciaSubidaAutopistaCambioUno * cambioUno;
        consumoCambioDosAutopista = factorConsumoAutopista * distanciaSubidaAutopistaCambioDos * cambioDos;
        consumoCambioTresAutopista = factorConsumoAutopista * distanciaSubidaAutopistaCambioTres * cambioTres;
        totalConsumoCambiosAutopista = consumoCambioUnoAutopista + consumoCambioDosAutopista + consumoCambioTresAutopista;

        consumoCambioSantaElena = ((distanciaSubidaSantaElenaCambioUno * cambioUno) + (distanciaSubidaSantaElenaCambioDos * cambioDos) + (distanciaSubidaSantaElenaCambioTres * cambioTres));
        consumoCambioPalmas = ((distanciaSubidaPalmasCambioUno * cambioUno) + (distanciaSubidaPalmasCambioDos * cambioDos) + (distanciaSubidaPalmasCambioTres * cambioTres));

    }//END VOID CAMBIOS

    double[][] ingresosMatriz = new double[6][3]; // Columna 0: Taxi, Columna 1: Vans, Columna 2: Busetas
    double[][] gastosMatriz = new double[6][3];

    double promedioIngresoDiarioTaxi;
    double promedioIngresoDiarioVans;
    double promedioIngresoDiarioBuseta;
    double promedioGastoDiarioTaxi;
    double promedioGastoDiarioVans;
    double promedioGastoDiarioBuseta;

    double sumaPromedioIngresoDiario;
    double sumaPromedioGastoDiario;
    double promedioRentabilidadDiaria;

    double gastosGlobales;
    double ingresosGlobales;
    double rentabilidad;

    public void Matriz() {
        System.out.println("\n=== Matriz de Ingresos y Gastos por Día ===");
        System.out.println("Día\tIngresos Taxi\t\tGastos Taxi\t\tIngresos Vans\t\tGastos Vans\tIngresos Buseta\t\tGastos Buseta");
        for (int i = 0; i < ingresosMatriz.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < ingresosMatriz[i].length; j++) {
                System.out.print(ingresosMatriz[i][j] + "\t\t" + gastosMatriz[i][j] + "\t\t");
            }
            System.out.println();
        }

        promedioIngresoDiarioTaxi = acomuladorIngresosTaxi / ingresosMatriz.length;
        promedioIngresoDiarioVans = acomuladorIngresosVans / ingresosMatriz.length;
        promedioIngresoDiarioBuseta = acomuladorIngresosBuseta / ingresosMatriz.length;

        promedioGastoDiarioTaxi = acomuladorGastosTaxi / gastosMatriz.length;
        promedioGastoDiarioVans = acomuladorGastosVans / gastosMatriz.length;
        promedioGastoDiarioBuseta = acomuladorGastosBuseta / gastosMatriz.length;

        sumaPromedioIngresoDiario = promedioIngresoDiarioBuseta + promedioIngresoDiarioVans + promedioIngresoDiarioTaxi;
        sumaPromedioGastoDiario = promedioGastoDiarioBuseta + promedioGastoDiarioTaxi + promedioGastoDiarioVans;
        promedioRentabilidadDiaria = sumaPromedioIngresoDiario + sumaPromedioGastoDiario;

        ingresosGlobales = acomuladorIngresosBuseta + acomuladorIngresosVans + acomuladorIngresosTaxi;
        gastosGlobales = acomuladorGastosBuseta + acomuladorGastosVans + acomuladorGastosTaxi;
        rentabilidad = ingresosGlobales - gastosGlobales;

        System.out.println("");
        System.out.println("======INGRESOS DE LOS VEHICULOS=====");
        System.out.println("Los ingresos totales del Taxi: " + acomuladorIngresosTaxi);
        System.out.println("Los ingresos totales de la Vans " + acomuladorIngresosVans);
        System.out.println("Los ingresos totales de la Buseta " + acomuladorIngresosBuseta);

        System.out.println("");

        System.out.println("=====GASTOS DE LOS VEHICULOS======");
        System.out.println("Los gastos totales del Taxi: " + acomuladorGastosTaxi);
        System.out.println("Los gastos totales de la Vans " + acomuladorGastosVans);
        System.out.println("Los gastos totales de la Buseta " + acomuladorGastosBuseta);

        System.out.println("");

        System.out.println("=====PROMEDIO INGRESOS Y GASTOS DIARIOS=====");
        System.out.println("El promedio de ingresos del Taxi en la semana fue de: " + promedioIngresoDiarioTaxi);
        System.out.println("El promedio de ingresos de la Vans en la semana fue de: " + promedioIngresoDiarioVans);
        System.out.println("El promedio de ingresos de la Buseta en la semana fue de: " + promedioIngresoDiarioBuseta);
        System.out.println("TOTAL: " + sumaPromedioIngresoDiario);
        System.out.println("El promedio de gastos del Taxi en la semana fue de: " + promedioGastoDiarioTaxi);
        System.out.println("El promedio de gastos de la Vans en la semana fue de: " + promedioGastoDiarioVans);
        System.out.println("El promedio de gastos de la Buseta en la semana fue de: " + promedioGastoDiarioBuseta);
        System.out.println("TOTAL: " + sumaPromedioGastoDiario);
        System.out.println("El promedio de rentabilidad diaria fue de: " + promedioRentabilidadDiaria);

        System.out.println("");

        System.out.println("=====RENTABILIDAD TOTAL DE LA SEMANA=====");
        System.out.println("La rentabilidad de la semana fue de: " + rentabilidad + " pesos");
        System.out.println("coso taxi: " + consumoAutopistaTaxi);

        System.out.println("");

        System.out.println("=====INGRESOS Y GASTOS GLOBALES=====");
        System.out.println("Los ingresos globales: " + ingresosGlobales + " pesos");
        System.out.println("Los gastos globales: " + gastosGlobales + " pesos");

    } // END VOID MATRIZ

    public void Menu() {
        Scanner Dato = new Scanner(System.in);

        System.out.println("1. Ver la semana del Taxi");
        System.out.println("2. Ver la semana de la Vans");
        System.out.println("3. Ver la semana de la Buseta");
        System.out.println("4. Ver el arreglo matricial con los totales y la rentabilidad");
        System.out.print("Ingrese el numero de la opcion que desea ver: ");
        int opcion = Dato.nextInt();
        System.out.println("");

        switch (opcion) {
            case 1:
                Taxi();
                break;

            case 2:
                Vans();
                break;

            case 3:
                Buseta();
                break;

            case 4:
                Taxi();
                Vans();
                Buseta();
                break;

            default:
                System.out.println("Opcion incorrecta");
        }
    }

    public static void main(String[] args) {
        Vehiculo Prueba = new Vehiculo();
        Prueba.Menu();
        Prueba.Matriz();
    }
}
