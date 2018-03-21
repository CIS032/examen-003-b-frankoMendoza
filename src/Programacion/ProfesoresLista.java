/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion;

import mvcb.modelo.Profesor;
import mvcb.modelo.ProfesorTiempoCompleto;
import mvcb.modelo.ProfesorTiempoParcial;
import mvcb.modelo.ProfesorMedioTiempo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ProfesoresLista {
    
    ArrayList<Profesor>profesores = new ArrayList<>();

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
    
    public void agregar(Profesor profesor){
        this.profesores.add(profesor);
    }
    
    public void horasCompletarias(int horas){
        for (Profesor profesore : profesores) {
            profesore.horasCompletarias(horas);
        }
    }
    
    public void grabar() throws IOException{
        FileWriter fw = new FileWriter(new File("Profesores.txt"));
        try {
            for (Profesor profesore : profesores) {
                if (profesore instanceof ProfesorTiempoParcial) {
                    ProfesorTiempoParcial ptp = (ProfesorTiempoParcial)profesore;
                    fw.write(ptp.getCedula()+";"+ptp.getNombres()+";"+ptp.getApellidos()+";"+"Profesor tiempo parcial"+";"+ptp.getHorasClase()+";"+ptp.horasCompletarias(ptp.getHorasClase())+"\n");
                }
                if (profesore instanceof ProfesorMedioTiempo) {
                    ProfesorMedioTiempo pmt = (ProfesorMedioTiempo)profesore;
                    fw.write(pmt.getCedula()+";"+pmt.getNombres()+";"+pmt.getApellidos()+";"+"Profesor medio tiempo"+";"+pmt.getHorasClase()+";"+pmt.horasCompletarias(pmt.getHorasClase())+"\n");
                }
                if (profesore instanceof ProfesorTiempoCompleto) {
                    ProfesorTiempoCompleto ptc = (ProfesorTiempoCompleto)profesore;
                    fw.write(ptc.getCedula()+";"+ptc.getNombres()+";"+ptc.getApellidos()+";"+"Profesor tiempo completo"+";"+ptc.getHorasClase()+";"+ptc.horasCompletarias(ptc.getHorasClase())+"\n");
                }
            }
            fw.close();
        } catch (IOException e) {
        }
    } 
}
