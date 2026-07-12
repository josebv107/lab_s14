package factory;

import model.PlanDatos;
import model.PlanDatosAcademico;
import model.PlanDatosNegocio;
import model.PlanDatosPersonal;

public class FabricaLineaRapida extends FabricaCreadora {
    @Override
    public PlanDatos crearPlanDatos(String tipo) {
        switch (tipo.toLowerCase()) {
            case "personal": return new PlanDatosPersonal(0.5f);
            case "negocio": return new PlanDatosNegocio(1.5f);
            case "academico": return new PlanDatosAcademico(1.0f);
            default: throw new IllegalArgumentException("Tipo no válido");
        }
    }
}
