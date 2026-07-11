package factory;

import model.PlanDatos;

public abstract class FabricaCreadora {
    public abstract PlanDatos crearPlanDatos(String tipo);
}
