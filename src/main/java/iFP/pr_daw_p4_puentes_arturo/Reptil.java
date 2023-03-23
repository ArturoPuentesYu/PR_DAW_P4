/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iFP.pr_daw_p4_puentes_arturo;

/**
 *
 * @author Alumno
 */
public class Reptil extends Animal{
    boolean infecBateriana;

    public Reptil(boolean infecBateriana, String especie, int peso, String tLesion, String gravedad, String veterianrio, String fAlta, String fLiberacion, boolean fallecido) {
        super(especie, peso, tLesion, gravedad, veterianrio, fAlta, fLiberacion, fallecido);
        this.infecBateriana = infecBateriana;
    }

    public Reptil() {
    }
    
    public boolean isInfecBateriana() {
        return infecBateriana;
    }

    public void setInfecBateriana(boolean infecBateriana) {
        this.infecBateriana = infecBateriana;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reptil{");
        sb.append("infecBateriana=").append(infecBateriana);
        sb.append('}');
        return sb.toString();
    }
    
    
}
