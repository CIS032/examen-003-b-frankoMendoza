package mvcb.modelo;

public class ProfesorMedioTiempo extends Profesor {

    public int HORAS_SEMANALES = 20;

    public ProfesorMedioTiempo(String cedula, String nombres, String apellidos, int horasClase, String carreras) {
        super(cedula, nombres, apellidos, horasClase, carreras);
    }

    
    public int horasCompletarias(int horas) {
        int x = HORAS_SEMANALES-horas;
        return x;
    }
    
}
