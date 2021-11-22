package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Serie {
    Scanner tc = new Scanner(System.in);
    private String titulo;
    private int temporadas;
    private int numeroeps;
    private String sinopse;
    private boolean vista;

    public void lerDados(){
        System.out.println("Digite o titulo");
        titulo = tc.nextLine();
        System.out.println("Digite o números de temporadas");
        temporadas = tc.nextInt();
        tc.nextLine();
        System.out.println("Digite o numero de eps");
        numeroeps = tc.nextInt();
        tc.nextLine();
        System.out.println("Digite a sinopse");
        sinopse = tc.nextLine();
        System.out.println("Digite se foi vista ou não");
        String v = tc.next();
        if(v.equals("nao")){
            vista = false;
        }else if(v.equals("sim")){
            vista = true;
        }
    }

    public void mostradados(){
        System.out.println("Título: "+this.titulo);
        System.out.println("Temporadas: "+this.temporadas);
        System.out.println("Número de episódios total: "+this.numeroeps);
        System.out.println("Sinopse: "+this.sinopse);
        if(this.vista == true){
            System.out.println("Vista");
        }else if(this.vista == false) {
            System.out.println("não vista");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return titulo.equals(serie.titulo);
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getNumeroeps() {
        return numeroeps;
    }

    public void setNumeroeps(int numeroeps) {
        this.numeroeps = numeroeps;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public boolean isVista(String a) {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }

}
