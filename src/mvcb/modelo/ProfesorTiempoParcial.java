package mvcb.modelo;

public class ProfesorTiempoParcial extends Profesor{
    private int horasSemanales;     

    public ProfesorTiempoParcial(int horasSemanales, String cedula, String nombres, String apellidos, int horasClase, String carreras) {
        super(cedula, nombres, apellidos, horasClase, carreras);
        this.horasSemanales = horasSemanales;
    }

  
    
    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }
    
    
    public int horasCompletarias(int horas){
        int x =this.horasSemanales-horas;
        return x;
    }
    
}
