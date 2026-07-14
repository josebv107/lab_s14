package app;

import factory.FabricaClaro;
import factory.FabricaCreadora;
import factory.FabricaLineaRapida;
import factory.FabricaMovistar;
import model.PlanDatos;

public class FabricaPlanesDatos {

    public static void calculoConsumo(FabricaCreadora fabrica, String tipo, int numeroMegasConsumido) {
        PlanDatos plan = fabrica.crearPlanDatos(tipo);
        System.out.println(plan.toString() + " | " + "Pago: " + plan.calculoPago(numeroMegasConsumido) + " | " +
                numeroMegasConsumido + " megas");
    }

    public static void main(String[] args) {
        int megas = 1000;

        System.out.println("BIENVENIDOS A LINEA RAPIDA");
        FabricaCreadora lineaRapida = new FabricaLineaRapida();
        calculoConsumo(lineaRapida, "personal", megas);
        calculoConsumo(lineaRapida, "NEGOCIO", megas);
        calculoConsumo(lineaRapida, "academico", megas);

        System.out.print("\n");

        System.out.println("BIENVENIDOS A CLARO");
        FabricaCreadora claro = new FabricaClaro();
        calculoConsumo(claro, "personal", megas);
        calculoConsumo(claro, "NEGOCIO", megas);
        calculoConsumo(claro, "academico", megas);

        System.out.print("\n");

        System.out.println("BIENVENIDOS A MOVISTAR");
        FabricaCreadora movistar = new FabricaMovistar();
        calculoConsumo(movistar, "personal", megas);
        calculoConsumo(movistar, "NEGOCIO", megas);
        calculoConsumo(movistar, "academico", megas);
    }
}
