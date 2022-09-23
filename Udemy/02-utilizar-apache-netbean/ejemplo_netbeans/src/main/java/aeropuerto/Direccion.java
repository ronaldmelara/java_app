/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeropuerto;

/**
 *
 * @author melaragalaz
 */
public class Direccion {

    @Override
    public String toString() {
        return "Direccion{" + "pais=" + pais + ", calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + '}';
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Direccion(String pais, String calle, int numero, String ciudad) {
        this.pais = pais;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
    }
    private String pais;
    private String calle;
    private int numero;
    private String ciudad;
}
