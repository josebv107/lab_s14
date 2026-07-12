package factory;

import model.PlanDatos;
import model.PlanDatosAcademico;
import model.PlanDatosNegocio;
import model.PlanDatosPersonal;

public class FabricaMovistar extends FabricaCreadora {
    @Override
    public PlanDatos crearPlanDatos(String tipo) {
        switch (tipo.toLowerCase()) {
            case "personal": return new PlanDatosPersonal(1.6f);
            case "negocio": return new PlanDatosNegocio(1.25f);
            case "academico": return new PlanDatosAcademico(0.8f);
            default: throw new IllegalArgumentException("Tipo no válido");
        }
    }
}
