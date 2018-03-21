package mvcb.modelo;

public abstract class Profesor {

    private String cedula;
    private String nombres;
    private String apellidos;
    private int horasClase;
    private String carreras;
    private String tipo;

    public Profesor(String cedula, String nombres, String apellidos, int horasClase, String carreras) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.horasClase = horasClase;
        this.carreras = carreras;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public String getCarreras() {
        return carreras;
    }

    public void setCarreras(String carreras) {
        this.carreras = carreras;
    }

    public abstract int horasCompletarias(int horas);
}
