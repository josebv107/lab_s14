package model;

public abstract class PlanDatos {
    protected String nombre;
    protected float tasa;

    public PlanDatos(String nombre, float tasa) {
        this.nombre = nombre;
        this.tasa = tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public float calculoPago(int datos) {
        return datos * tasa;
    }

    public String toString() {
        return "Plan: " + nombre + "\nTasa: " + tasa;
    }
}
