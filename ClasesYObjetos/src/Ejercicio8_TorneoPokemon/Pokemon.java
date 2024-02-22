package Ejercicio8_TorneoPokemon;

public class Pokemon {
	private String nombre;
    private String elemento;
    private int puntosSalud;

    public Pokemon(String nombre, String elemento, int puntosSalud) {
        this.nombre = nombre;
        this.elemento = elemento;
        this.puntosSalud = puntosSalud;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public void setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
    }
}
