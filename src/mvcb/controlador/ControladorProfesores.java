package mvcb.controlador;

import java.util.ArrayList;
import mvcb.modelo.Profesor;
import mvcb.modelo.ProfesorMedioTiempo;
import mvcb.modelo.ProfesorTiempoCompleto;
import mvcb.modelo.ProfesorTiempoParcial;

public class ControladorProfesores {
    
    //private ArrayList<Profesor>lista = new ArrayList<Profesor>();
    private ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
//    private ArrayList<Profesor> listaProfesoresNedioTiempo = new ArrayList<Profesor>();
//    private ArrayList<Profesor> listaProfesoresTiempoParcial = new ArrayList<Profesor>();
//    private ArrayList<Profesor> listaProfesoresTiempoCompleto = new ArrayList<Profesor>();
    
    public ControladorProfesores () {
        //listaProfesores.add(Profesor ());
        listaProfesores.add(new ProfesorMedioTiempo("1738597436", "Jose Francisco","Espiñoza Sarango",5, "Sistemas"));
        listaProfesores.add(new ProfesorTiempoCompleto("2345677364", "Juan","Castillo", 4,"Geología"));
        listaProfesores.add(new ProfesorTiempoParcial(24, "2748364796","Jhones","Ston", 12, "Electromecanica"));
    }
    
    public ArrayList<Profesor> getlista() {
        return listaProfesores;
    }
    

    public void setListaLibros(ArrayList<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }
}
