/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iFP.pr_daw_p4_puentes_arturo;

/**
 *
 * @author Alumno
 */
public class Ave extends Animal{
    private boolean cazaFurtiba;

    public Ave(boolean cazaFurtiba, String especie, int peso, String tLesion, String gravedad, String fAlta) {
        super(especie, peso, tLesion, gravedad, fAlta);
        this.cazaFurtiba = cazaFurtiba;
    }

    

   

    public Ave() {
    }
    
    public boolean isCazaFurtiba() {
        return cazaFurtiba;
    }

    public void setCazaFurtiba(boolean cazaFurtiba) {
        this.cazaFurtiba = cazaFurtiba;
    }

    @Override
    public String toString() {
        return "Ave{" + "cazaFurtiba=" + cazaFurtiba + '}';
    }
    
    
}
