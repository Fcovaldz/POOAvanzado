package com.generation;

import com.generation.persona.Persona;

public class Main {

    public static int numerador = 10;
    public static int denominador = 0;
    public static float division;

    public static void main(String[] args) {

        System.out.println("Antes de la division: "+ numerador + "/" +denominador);

        try {
            division = numerador / denominador;
        }
        catch (NullPointerException ex){
            System.out.println("NullPointer");
            System.out.println(ex.getMessage());
        }
        catch (Exception ex){
            System.out.println("Exception");
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("I am finally");
        }
        System.out.println("Después de la division: "+ numerador + "/" + denominador + " = " + division);



        /*
        Persona person= new Persona();
        person.setName("Santiago");
        person.setAge(33);
        person.setId("102045455");
        System.out.println( "Name: " + person.getName());
        System.out.println( "Age: "+ person.getAge());
        System.out.println( "Id: " +  person.getId());
         */
        /*
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNombre("Francisco Valadez");
        cuenta.setClave("lknvdlkfn");
        cuenta.setSaldo(1000000000);

        cuenta.mostrarSaldo();
        System.out.println(cuenta.getNombre());

         */
        /*
        Animal animal = new Animal();
        animal.nombre = "Iguana";

        Persona persona = new Persona();
        persona.nombre = "Francisco";
        persona.edad = 23;
        */
    }

}
