package proyectofinal;

import java.util.Scanner;

public class Vehiculo {

    double valorGasolina = 16000;

    int pasajerosTaxi = 4;
    double valorPasajeTaxi = 25000;
    double valorPeajeTaxi = 15500;
    double ingresoDiarioTaxi;
    double gastoDiarioTaxi;

    double acomuladorIngresosTaxi = 0;
    double acomuladorGastosTaxi = 0;

    //VARIABLES PROMEDIO RUTAS (TAXI)
    double promedioRentabilidadAutopistaTaxi;
    double promedioRentabilidadSantaElenaTaxi;
    double promedioRentabilidadPalmasTaxi;

    //VARIABLES CALCULO AUTOPISTA (TAXI)
    double consumoGasolinaAutopistaTaxi;
    double consumoAdicionalAutopistaTaxi;
    double promedioGastosAutopistaTaxi;
    double promedioIngresosAutopistaTaxi;
    double consumoNormalAutopistaTaxi;
    double consumoExtraAutopistaTaxi;

    //VARIABLES CALCULO SANTA ELENA (TAXI)
    double consumoGasolinaSantaElenaTaxi;
    double consumoAdicionalSantaElenaTaxi;
    double promedioGastosSantaElenaTaxi;
    double promedioIngresosSantaElenaTaxi;
    double consumoNormalSantaElenaTaxi;
    double consumoExtraSantaElenaTaxi;

    //VARIABLES CALCULO PALMAS (TAXI)
    double consumoGasolinaPalmasTaxi;
    double consumoAdicionalPalmasTaxi;
    double promedioGastosPalmasTaxi;
    double promedioIngresosPalmasTaxi;
    double consumoNormalPalmasTaxi;
    double consumoExtraPalmasTaxi;

    //TOTALES DE CONSUMO
    double consumoAutopistaTaxi;
    double consumoSantaElenaTaxi;
    double consumoPalmasTaxi;

    public void Taxi() {
        //CALCULAR EL CONSUMO TOTAL DE LA GASOLINA EN AUTOPISTA (TAXI)
        consumoGasolinaAutopistaTaxi = valorGasolina / 50 * 45;
        consumoAdicionalAutopistaTaxi = consumoGasolinaAutopistaTaxi * 0.2;
        consumoAutopistaTaxi = consumoGasolinaAutopistaTaxi + consumoAdicionalAutopistaTaxi;

        //CALCULAR EL CONSUMO TOTAL DE LA GASOLINA EN SANTA ELENA (TAXI)
        consumoGasolinaSantaElenaTaxi = valorGasolina / 50 * 50;
        consumoAdicionalSantaElenaTaxi = consumoGasolinaSantaElenaTaxi * 0.28;
        consumoSantaElenaTaxi = consumoGasolinaSantaElenaTaxi + consumoAdicionalSantaElenaTaxi;

        //CALCULAR EL CONSUMO TOTAL DE LA GASOLINA EN PALMAS (TAXI)
        consumoGasolinaPalmasTaxi = valorGasolina / 50 * 55;
        consumoAdicionalPalmasTaxi = consumoGasolinaPalmasTaxi * 0.28;
        consumoPalmasTaxi = consumoGasolinaPalmasTaxi + consumoAdicionalPalmasTaxi;

        Cambios();

        for (int i = 0; i < 6; i++) {

            //CONSUMO DE GASOLINA AUTOPISTA (TAXI)
            consumoNormalAutopistaTaxi = ingresoDiarioTaxi - (consumoAutopistaTaxi + valorPeajeTaxi);
            consumoExtraAutopistaTaxi = consumoNormalAutopistaTaxi - totalConsumoCambiosAutopistaTaxi;

            //CONSUMO DE GASOLINA SANTA ELENA (TAXI)
            consumoNormalSantaElenaTaxi = ingresoDiarioTaxi - (consumoSantaElenaTaxi + valorPeajeTaxi);
            consumoExtraSantaElenaTaxi = consumoNormalSantaElenaTaxi - totalConsumoCambiosSantaElenaTaxi;

            //CONSUMO DE GASOLINA PALMAS
            consumoNormalPalmasTaxi = ingresoDiarioTaxi - (consumoPalmasTaxi + valorPeajeTaxi);
            consumoExtraPalmasTaxi = consumoNormalPalmasTaxi - totalConsumoCambiosPalmasTaxi;

            ingresoDiarioTaxi = valorPasajeTaxi * pasajerosTaxi;
            acomuladorIngresosTaxi += ingresoDiarioTaxi;

            gastoDiarioTaxi = consumoAutopistaTaxi + consumoSantaElenaTaxi + consumoPalmasTaxi; //aca va el consumoSantaElenaTaxi...
            acomuladorGastosTaxi += gastoDiarioTaxi;

            //CALCULAR EL PROMEDIO DE RENTABILIDAD AUTOPISTA (TAXI)
            promedioRentabilidadAutopistaTaxi = ((consumoNormalAutopistaTaxi + consumoExtraAutopistaTaxi) / 2);

            //CALCULAR EL PROMEDIO DE RENTABILIDAD SANTA ELENA (TAXI)
            promedioGastosSantaElenaTaxi = ((consumoNormalSantaElenaTaxi + consumoExtraSantaElenaTaxi) / 2);
            promedioIngresosSantaElenaTaxi = acomuladorIngresosTaxi / 6;
            promedioRentabilidadSantaElenaTaxi = ((promedioGastosSantaElenaTaxi + promedioIngresosSantaElenaTaxi) / 2);

            //CALCULAR EL PROMEDIO DE RENTABILIDAD PALMAS (TAXI)
            promedioGastosPalmasTaxi = ((consumoNormalPalmasTaxi + consumoExtraPalmasTaxi) / 2);
            promedioIngresosPalmasTaxi = acomuladorIngresosTaxi / 6;
            promedioRentabilidadPalmasTaxi = ((promedioGastosPalmasTaxi + promedioIngresosPalmasTaxi) / 2);

            ingresosMatriz[i][0] = ingresoDiarioTaxi;
            gastosMatriz[i][0] = gastoDiarioTaxi;

            System.out.println("============ Día " + (i + 1) + " ============");
            System.out.println("Pasajeros Taxi: " + pasajerosTaxi);
            System.out.println("Gasto Autopista Taxi: " + consumoAutopistaTaxi + " pesos");
            System.out.println("Gasto Santa Elena Taxi: " + consumoSantaElenaTaxi + " pesos");
            System.out.println("Gasto Palmas Taxi: " + consumoPalmasTaxi + " pesos");
            System.out.println("");

            System.out.println("Ingresos de Taxi (Día " + (i + 1) + "): " + ingresoDiarioTaxi);
            System.out.println("Gastos de Taxi (Día " + (i + 1) + "): " + gastoDiarioTaxi);
            System.out.println("");
            System.out.println("promedioRentabilidad " + promedioRentabilidadPalmasTaxi);
            System.out.println("promedioIngresos " + promedioIngresosPalmasTaxi);
            System.out.println("promedioGastos " + promedioGastosPalmasTaxi);
            System.out.println("consumoExtra " + consumoExtraPalmasTaxi);
            System.out.println("consumoNormalSanta " + consumoNormalPalmasTaxi);
            System.out.println("RENTABILIDAD " + promedioRentabilidadAutopistaTaxi);
        }

    } // END VOID TAXI

    double valorPeajeVans = 20500;
    double valorPasajeVans = 15000;
    double ingresoDiarioVans;
    double gastoDiarioVans;
    double acomuladorIngresosVans = 0;
    double acomuladorGastosVans = 0;

    //VARIABLES PROMEDIO RUTAS (VANS)
    double promedioRentabilidadAutopistaVans;
    double promedioRentabilidadSantaElenaVans;

    //VARIABLES CALCULO AUTOPISTA (VANS)
    double consumoGasolinaAutopistaVans;
    double consumoAdicionalAutopistaVans;
    double promedioGastosAutopistaVans;
    double promedioIngresosAutopistaVans;
    double consumoNormalAutopistaVans;
    double consumoExtraAutopistaVans;

    //VARIABLES CALCULO SANTA ELENA (VANS)
    double consumoGasolinaSantaElenaVans;
    double consumoAdicionalSantaElenaVans;
    double promedioGastosSantaElenaVans;
    double promedioIngresosSantaElenaVans;
    double consumoNormalSantaElenaVans;
    double consumoExtraSantaElenaVans;

    //TOTALES DE CONSUMO
    double consumoAutopistaVans;
    double consumoSantaElenaVans;

    public void Vans() {

        //CALCULAR EL CONSUMO TOTAL DE LA GASOLINA EN AUTOPISTA (VANS)
        consumoGasolinaAutopistaVans = valorGasolina / 40 * 45;
        consumoAdicionalAutopistaVans = consumoGasolinaAutopistaVans * (0.08 * pasajerosTotales);
        consumoAutopistaVans = consumoGasolinaAutopistaVans + consumoAdicionalAutopistaVans;

        //CALCULAR EL CONSUMO TOTAL DE LA GASOLINA EN SANTA ELENA (VANS)
        consumoGasolinaSantaElenaVans = valorGasolina / 40 * 50;
        consumoAdicionalSantaElenaVans = consumoGasolinaSantaElenaVans * (0.11 * pasajerosTotales);
        consumoSantaElenaVans = consumoGasolinaSantaElenaVans + consumoAdicionalSantaElenaVans;

        Cambios();

        for (int i = 0; i < 6; i++) {

            //CONSUMO DE GASOLINA AUTOPISTA (VANS)
            consumoNormalAutopistaVans = ingresoDiarioVans - (consumoAutopistaVans + valorPeajeVans);
            consumoExtraAutopistaVans = consumoNormalAutopistaVans - totalConsumoCambiosAutopistaVans;

            //CONSUMO DE GASOLINA SANTA ELENA (VANS)
            consumoNormalSantaElenaVans = ingresoDiarioVans - (consumoSantaElenaVans + valorPeajeVans);
            consumoExtraSantaElenaVans = consumoNormalSantaElenaVans - totalConsumoCambiosSantaElenaVans;

            ingresoDiarioVans = valorPasajeVans * pasajerosTotales;
            acomuladorIngresosVans += ingresoDiarioVans;

            gastoDiarioVans = consumoAutopistaVans;
            acomuladorGastosVans += gastoDiarioVans;

            //CALCULAR EL PROMEDIO DE RENTABILIDAD AUTOPISTA (VANS)
            promedioRentabilidadAutopistaVans = ((consumoNormalAutopistaVans + consumoExtraAutopistaVans) / 2);

            //CALCULAR EL PROMEDIO DE RENTABILIDAD SANTA ELENA (VANS)
            promedioRentabilidadSantaElenaVans = ((consumoNormalSantaElenaVans + consumoExtraSantaElenaVans) / 2);

            ingresosMatriz[i][1] = ingresoDiarioVans;
            gastosMatriz[i][1] = gastoDiarioVans;

            System.out.println("============ Día " + (i + 1) + " ============");
            System.out.println("Pasajeros Vans: " + pasajerosTotales);
            System.out.println("Gasto Autopista Vans: " + consumoAutopistaVans + " pesos");
            System.out.println("Gasto Santa Elena Vans: " + consumoSantaElenaVans + " pesos");
            System.out.println("Gasto Palmas Vans: " + " pesos");
            System.out.println("");

            System.out.println("Ingreso de Vans (Día " + (i + 1) + "): " + ingresoDiarioVans);
            System.out.println("Gastos de Vans (Día " + (i + 1) + "): " + gastoDiarioVans);
            System.out.println("");

            System.out.println("RENTABILIDAD " + promedioRentabilidadSantaElenaVans);

        }

    } // END VOID VANS

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

            ingresoDiarioBuseta = valorPasajeBuseta * pasajerosTotales;
            acomuladorIngresosBuseta += ingresoDiarioBuseta;

            consumoAutopistaBuseta = (consumoCambioAutopista + valorPeajeBuseta + (pasajerosTotales * valorGasolina / 30) * 1.12);
            consumoSantaElenaBuseta = (consumoCambioSantaElena + valorPeajeBuseta + (pasajerosTotales * valorGasolina / 30) * 1.15);
            consumoPalmasBuseta = (consumoCambioPalmas + valorPeajeBuseta + (pasajerosTotales * valorGasolina / 30) * 1.15);

            gastoDiarioBuseta = consumoAutopistaBuseta + consumoSantaElenaBuseta + consumoPalmasBuseta;
            acomuladorGastosBuseta += gastoDiarioBuseta;

            ingresosMatriz[i][2] = ingresoDiarioBuseta;
            gastosMatriz[i][2] = gastoDiarioBuseta;

            System.out.println("============ Día " + (i + 1) + " ============");
            System.out.println("Pasajeros Buseta: " + pasajerosTotales);
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

    double consumoCambioAutopista;
    double consumoCambioUnoAutopista;
    double consumoCambioDosAutopista;
    double consumoCambioTresAutopista;

    double consumoCambioSantaElena;
    double consumoCambioUnoSantaElena;
    double consumoCambioDosSantaElena;
    double consumoCambioTresSantaElena;

    double consumoCambioPalmas;
    double consumoCambioUnoPalmas;
    double consumoCambioDosPalmas;
    double consumoCambioTresPalmas;

    double factorConsumoAutopistaTaxi;
    double totalConsumoCambiosAutopistaTaxi;
    double totalConsumoCambiosSantaElenaTaxi;
    double totalConsumoCambiosPalmasTaxi;

    double factorConsumoAutopistaVans;
    double totalConsumoCambiosAutopistaVans;
    double totalConsumoCambiosSantaElenaVans;

    double factorConsumoSantaElena;
    double factorConsumoPalmas;

    public void Cambios() {
        DistanciaRutas();

        cambioUno = .03;
        cambioDos = .02;
        cambioTres = .01;

        //OPERACIONES PARA HALLAR EL TOTAL DE CONSUMO DE LOS CAMBIOS TAXI
        //AUTOPISTA
        factorConsumoAutopistaTaxi = consumoAutopistaTaxi / distanciaBajadaAutopista;
        consumoCambioUnoAutopista = factorConsumoAutopistaTaxi * distanciaSubidaAutopistaCambioUno * cambioUno;
        consumoCambioDosAutopista = factorConsumoAutopistaTaxi * distanciaSubidaAutopistaCambioDos * cambioDos;
        consumoCambioTresAutopista = factorConsumoAutopistaTaxi * distanciaSubidaAutopistaCambioTres * cambioTres;
        totalConsumoCambiosAutopistaTaxi = consumoCambioUnoAutopista + consumoCambioDosAutopista + consumoCambioTresAutopista;

        //SANTA ELENA
        factorConsumoSantaElena = consumoSantaElenaTaxi / distanciaBajadaSantaElena;
        consumoCambioUnoSantaElena = factorConsumoSantaElena * distanciaSubidaSantaElenaCambioUno * cambioUno;
        consumoCambioDosSantaElena = factorConsumoSantaElena * distanciaSubidaSantaElenaCambioDos * cambioDos;
        consumoCambioTresSantaElena = factorConsumoSantaElena * distanciaSubidaSantaElenaCambioTres * cambioTres;
        totalConsumoCambiosSantaElenaTaxi = consumoCambioUnoSantaElena + consumoCambioDosSantaElena + consumoCambioTresSantaElena;

        //PALMAS
        factorConsumoPalmas = consumoPalmasTaxi / distanciaBajadaPalmas;
        consumoCambioUnoPalmas = factorConsumoPalmas * distanciaSubidaPalmasCambioUno * cambioUno;
        consumoCambioDosPalmas = factorConsumoPalmas * distanciaSubidaPalmasCambioDos * cambioDos;
        consumoCambioTresPalmas = factorConsumoPalmas * distanciaSubidaPalmasCambioTres * cambioTres;
        totalConsumoCambiosPalmasTaxi = consumoCambioUnoPalmas + consumoCambioDosPalmas + consumoCambioTresPalmas;

        //OPERACIONES PARA HALLAR EL TOTAL DE CONSUMO DE LOS CAMBIOS VANS
        //AUTOPISTA
        factorConsumoAutopistaVans = consumoAutopistaVans / distanciaBajadaAutopista;
        consumoCambioUnoAutopista = factorConsumoAutopistaVans * distanciaSubidaAutopistaCambioUno * cambioUno;
        consumoCambioDosAutopista = factorConsumoAutopistaVans * distanciaSubidaAutopistaCambioDos * cambioDos;
        consumoCambioTresAutopista = factorConsumoAutopistaVans * distanciaSubidaAutopistaCambioTres * cambioTres;
        totalConsumoCambiosAutopistaVans = consumoCambioUnoAutopista + consumoCambioDosAutopista + consumoCambioTresAutopista;

        //SANTA ELENA
        factorConsumoSantaElena = consumoSantaElenaVans / distanciaBajadaSantaElena;
        consumoCambioUnoSantaElena = factorConsumoSantaElena * distanciaSubidaSantaElenaCambioUno * cambioUno;
        consumoCambioDosSantaElena = factorConsumoSantaElena * distanciaSubidaSantaElenaCambioDos * cambioDos;
        consumoCambioTresSantaElena = factorConsumoSantaElena * distanciaSubidaSantaElenaCambioTres * cambioTres;
        totalConsumoCambiosSantaElenaVans = consumoCambioUnoSantaElena + consumoCambioDosSantaElena + consumoCambioTresSantaElena;

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

        System.out.println("=====RENTABILIDAD EN AUTOPISTA=====");
        System.out.println("Taxi:" + promedioRentabilidadAutopistaTaxi + " pesos");
        System.out.println("Vans " + promedioRentabilidadAutopistaVans + " pesos");
        System.out.println("Buseta " + " pesos");
        
        System.out.println("=====RENTABILIDAD EN SANTA ELENA=====");
        System.out.println("Taxi:" + promedioRentabilidadSantaElenaTaxi + " pesos");
        System.out.println("Vans " + promedioRentabilidadSantaElenaVans + " pesos");
        System.out.println("Buseta " + " pesos");

    } // END VOID MATRIZ

    int pasajerosCambio;
    int pasajerosTotales;

    public void Menu() {
        Scanner Dato = new Scanner(System.in);

        // Datos de vehículos
        String[] vehiculos = {"Taxi", "Van", "Buseta"};
        int[] capacidades = {4, 10, 15}; // Capacidad según el vehículo

        // Datos de rutas
        String[] rutas = {"Autopista Medellín-Bogotá", "Santa Elena", "Las Palmas"};
        int[] distancias = {90, 100, 110}; // Distancia ida y vuelta en km

        // Selección de vehículo
        System.out.println("Seleccione el tipo de vehículo:");
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println((i + 1) + ". " + vehiculos[i]);
        }
        int opcionVehiculo = Dato.nextInt();
        while (opcionVehiculo < 1 || opcionVehiculo > vehiculos.length) {
            System.out.println("Opción inválida. Seleccione un vehículo válido:");
            opcionVehiculo = Dato.nextInt();
        }

        String vehiculoSeleccionado = vehiculos[opcionVehiculo - 1];
        int capacidadVehiculo = capacidades[opcionVehiculo - 1];

        // Selección de ruta
        System.out.println("Seleccione la ruta:");
        for (int i = 0; i < rutas.length; i++) {
            System.out.println((i + 1) + ". " + rutas[i] + " (" + distancias[i] + " km)");
        }
        int opcionRuta = Dato.nextInt();
        while (opcionRuta < 1 || opcionRuta > rutas.length) {
            System.out.println("Opción inválida. Seleccione una ruta válida:");
            opcionRuta = Dato.nextInt();
        }

        String rutaSeleccionada = rutas[opcionRuta - 1];

        // Validar pasajeros en cada cambio
        int pasajerosTotales = 0;
        for (int cambio = 1; cambio <= 3; cambio++) {
            System.out.println("¿Cuántos pasajeros subirán en el cambio " + cambio + "?");
            int pasajerosCambio = Dato.nextInt();

            while (pasajerosTotales + pasajerosCambio > capacidadVehiculo) {
                System.out.println("¡Error! No puedes exceder la capacidad máxima del vehículo (" + capacidadVehiculo + ").");
                System.out.println("Por favor, ingresa un número válido de pasajeros para el cambio " + cambio + ":");
                pasajerosCambio = Dato.nextInt();
            }

            pasajerosTotales += pasajerosCambio;
        }

        // Mostrar resultados
        System.out.println("\nResumen del viaje:");
        System.out.println("Vehículo seleccionado: " + vehiculoSeleccionado);
        System.out.println("Ruta seleccionada: " + rutaSeleccionada);
        System.out.println("Pasajeros totales abordados: " + pasajerosTotales);
        System.out.println("Validación completada. ¡Buen viaje!");
    }

    public static void main(String[] args) {
        Vehiculo Prueba = new Vehiculo();
        Prueba.Vans();
        Prueba.Menu();
        Prueba.Matriz();
    }
}
