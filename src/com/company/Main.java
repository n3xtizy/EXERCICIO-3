package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException
    {
        var lista = new ArrayList<String>();
        lista.add("4"); //Pega os valores
        lista.add("8");
        lista.add("2");

        var media = 0.0;
        var maior = 0.0;
        var menor = 0.0;
        boolean primeiro = true;

        for (String i : lista) {
            media += Double.valueOf(i);

            if (maior <= Double.valueOf(i) || primeiro) {
                maior = Double.valueOf(i);
            }

            if (menor >= Double.valueOf(i) || primeiro) {
                menor = Double.valueOf(i);
            }
            primeiro = false;
        }

        media = media / lista.size();

        System.out.println("-----------------------------------");
        System.out.println("Media: " + media);
        System.out.println("-----------------------------------");
        System.out.println("Menor: " + maior);
        System.out.println("-----------------------------------");
        System.out.println("Maior: " + menor);
        System.out.println("-----------------------------------");
    }
}




