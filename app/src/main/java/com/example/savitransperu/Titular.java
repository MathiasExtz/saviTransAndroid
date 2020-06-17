package com.example.savitransperu;

public class Titular {

    private String titulo;
    private String subtitulo;
    private String subtitulo2;

    public Titular(String tit, String sub, String sub2){
        titulo = tit;
        subtitulo = sub;
        subtitulo2 = sub2;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getSubtitulo(){
        return subtitulo;
    }
    public String getSubtitulo2(){
        return subtitulo2;
    }
}
