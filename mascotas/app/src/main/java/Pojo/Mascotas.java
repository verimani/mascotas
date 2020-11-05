package Pojo;


public class Mascotas {
    private int id;
    private String nombre;
    private int fotomas;
    /*private int likes;*/


    public Mascotas(int fotomas,String nombre) {
        this.nombre=nombre;
        this.fotomas=fotomas;
        /*this.likes=likes;*/


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFotomas() {
        return fotomas;
    }

    public void setFotomas(int fotomas) {
        this.fotomas = fotomas;
    }

    /*public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/
}
