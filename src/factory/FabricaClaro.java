package factory;

import model.PlanDatos;
import model.PlanDatosAcademico;
import model.PlanDatosNegocio;
import model.PlanDatosPersonal;

public class FabricaClaro extends FabricaCreadora {
    @Override
    public PlanDatos crearPlanDatos(String tipo) {
        switch (tipo) {
            case "personal":  return new PlanDatosPersonal(1.6f);
            case "negocio":   return new PlanDatosNegocio(1.2f);
            case "academico": return new PlanDatosAcademico(0.6f);
            default: throw new IllegalArgumentException("Tipo no válido");
        }
    }
}
