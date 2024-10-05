package main;

import planetas.Saturno;
import planetas.Tierra;

enum tipoplaneta {
    Gaseoso, terrestre, Enano
}

public class Ejecutar {

    private static String TipoDePlaneta;

    public static void main(String[] args) {

        Tierra planeta_1 = new Tierra();
        planeta_1.setNombre("Tierra");
        planeta_1.setSatelites(1);
        planeta_1.setMasa(5.97217E+24);
        planeta_1.setVolumen(1.08321E+12);
        planeta_1.setDiametro(12742);
        planeta_1.setDistanciasol(150000000);
        tipoplaneta tipo = tipoplaneta.terrestre;
        planeta_1.setObservable(Boolean.TRUE);

        System.out.println("Nombre del planeta = " + planeta_1.getNombre());
        System.out.println("Cantidad de satélites = "
                + planeta_1.getSatelites());
        System.out.println("Masa = " + planeta_1.getMasa() + " Kg");
        System.out.println("Volumen = " + planeta_1.getVolumen() + " Km³");
        System.out.println("Diametro = " + planeta_1.getDiametro() + " Km");
        System.out.println("Disatancia al sol = "
                + planeta_1.getDistanciasol() + " Km");
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + planeta_1.getObservable());
        System.out.println("La densidad es = " + planeta_1.densidad()+"Kg/Km³");
        System.out.println("¿Es un planeta exterior? = "
                + (planeta_1.planetaexterior() ? "Si" : "No"));
        System.out.println("\n____________________________________________\n");

        Saturno planeta_2 = new Saturno();
        planeta_2.setNombre("Saturno");
        planeta_2.setSatelites(146);
        planeta_2.setMasa(5.683E26);
        planeta_2.setVolumen(8.27E23);
        planeta_2.setDiametro(116460);
        planeta_2.setDistanciasol(1418);
        tipoplaneta tip = tipoplaneta.Gaseoso;
        planeta_2.setObservable(Boolean.TRUE);

        System.out.println("Nombre del planeta = " + planeta_2.getNombre());
        System.out.println("Cantidad de satélites = " + 
                planeta_2.getSatelites());
        System.out.println("Masa = " + planeta_2.getMasa() + " Kg");
        System.out.println("Volumen = " + planeta_2.getVolumen() + " Km³");
        System.out.println("Diametro = " + planeta_2.getDiametro() + " Km");
        System.out.println("Disatancia al sol = " + 
                planeta_2.getDistanciasol() + " Km");
        System.out.println("Tipo de planeta = " + tip);
        System.out.println("Es observable = " + planeta_2.getObservable());
        System.out.println("La densidad es = " + planeta_2.densidad()+"Kg/Km³");
        System.out.println("¿Es un planeta exterior? = " + 
                (planeta_2.planetaexterior() ? "Si" : "No"));

    }
}
