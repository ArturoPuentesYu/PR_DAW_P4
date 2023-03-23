/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iFP.pr_daw_p4_puentes_arturo;

/**
 *
 * @author Alumno
 */
public class Mamifero extends Animal{
    boolean Atropello;

    public Mamifero(boolean Atropello, String especie, int peso, String tLesion, String gravedad, String fAlta) {
        super(especie, peso, tLesion, gravedad, fAlta);
        this.Atropello = Atropello;
    }



    public Mamifero() {
    }
    
    public boolean isAtropello() {
        return Atropello;
    }

    public void setAtropello(boolean Atropello) {
        this.Atropello = Atropello;
    }

    
}
