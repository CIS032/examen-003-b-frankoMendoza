package mvcb.modelo;

public class ProfesorTiempoCompleto extends Profesor {
    public int HORAS_SEMANALES = 40;

    public ProfesorTiempoCompleto(String cedula, String nombres, String apellidos, int horasClase, String carreras) {
        super(cedula, nombres, apellidos, horasClase, carreras);
    }
    
    public int horasCompletarias(int horas) {
        int x =this.HORAS_SEMANALES-horas;
        return x;
    }
}
