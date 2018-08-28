package mx.rafuru.linkedlist.model;

import java.util.Objects;

public class Game {

    private String titulo;
    private String plataforma;

    public Game() {
    }

    public Game(String titulo, String plataforma) {
        this.titulo = titulo;
        this.plataforma = plataforma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(titulo, game.titulo) &&
                Objects.equals(plataforma, game.plataforma);
    }

    @Override
    public int hashCode() {

        return Objects.hash(titulo, plataforma);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
