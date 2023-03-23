/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iFP.pr_daw_p4_puentes_arturo;

/**
 *
 * @author Alumno
 */
public class Animal {
    private String especie;
    private int peso;
    private String tLesion;
    private String gravedad;
    private String vetLiberacion;    
    private String vetFallecimiento;
    private String fAlta;
    private String fLiberacion;
    private String fFallecimiento;
    private boolean fallecido;
    private String tratamieno;

    public Animal(String especie, int peso, String tLesion, String gravedad, String fAlta) {
        this.especie = especie;
        this.peso = peso;
        this.tLesion = tLesion;
        this.gravedad = gravedad;
        this.fAlta = fAlta;
    }

    public Animal() {
    }
    
    public String getEspecie() {
        return especie;
    }

    public String getTratamieno() {
        return tratamieno;
    }

    public void setTratamieno(String tratamieno) {
        this.tratamieno = tratamieno;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String gettLesion() {
        return tLesion;
    }

    public void settLesion(String tLesion) {
        this.tLesion = tLesion;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public String getVetLiberacion() {
        return vetLiberacion;
    }

    public void setVetLiberacion(String vetLiberacion) {
        this.vetLiberacion = vetLiberacion;
    }

    public String getVetFallecimiento() {
        return vetFallecimiento;
    }

    public void setVetFallecimiento(String vetFallecimiento) {
        this.vetFallecimiento = vetFallecimiento;
    }

    public String getfFallecimiento() {
        return fFallecimiento;
    }

    public void setfFallecimiento(String fFallecimiento) {
        this.fFallecimiento = fFallecimiento;
    }

    public String getfAlta() {
        return fAlta;
    }

    public void setfAlta(String fAlta) {
        this.fAlta = fAlta;
    }

    public String getfLiberacion() {
        return fLiberacion;
    }

    public void setfLiberacion(String fLiberacion) {
        this.fLiberacion = fLiberacion;
    }

    public boolean isFallecido() {
        return fallecido;
    }

    public void setFallecido(boolean fallecido) {
        this.fallecido = fallecido;
    }

    @Override
    public String toString() {
        return "Animal{" + "especie=" + especie + ", peso=" + peso + ", tLesion=" + tLesion + ", gravedad=" + gravedad + ", veterianrio=" + vetLiberacion + ", fAlta=" + fAlta + ", fLiberacion=" + fLiberacion + ", fallecido=" + fallecido + '}';
    }
    
}
