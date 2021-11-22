package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        ArrayList<Serie> series = new ArrayList<Serie>();
        int c;
        do{
            System.out.println("Digite qual ação você deseja fazer\n" +
                                "1: Cadastrar série\n" +
                                "2: Remover uma série\n" +
                                "3: Mostrar as séries vistas e não vistas\n" +
                                "4: Mostar série pelo nome\n" +
                                "5: listar a quantidade de series");
                                c = tc.nextInt();
            switch (c)
            {
                case 1:
                    Serie serie = new Serie();
                    serie.lerDados();
                    series.add(serie);
                    break;
                case 2:
                    System.out.println("digite o nome da série");
                    String nome = tc.next();
                    series.removeIf(s -> s.getTitulo().equalsIgnoreCase(nome));
                    break;

                case 3:
                    for(int i=0;i<series.size();i++) {
                        series.get(i).mostradados();
                    }
                    break;
                case 4:
                    System.out.println("digite o nome da série");
                    String nomeserie = tc.next();
                    for (Serie s : series) {
                        if (nomeserie.equals(s.getTitulo())) {
                            s.mostradados();
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println(series.size());
                    break;
            }
        }while(c!=-9);
    }



    }

