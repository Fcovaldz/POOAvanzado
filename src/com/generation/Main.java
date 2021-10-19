package com.generation;

import com.generation.persona.Persona;

public class Main {

    public static void main(String[] args) {

        Persona person= new Persona();
        person.setName("Santiago");
        person.setAge(33);
        person.setId("102045455");
        System.out.println( "Name: " + person.getName());
        System.out.println( "Age: "+ person.getAge());
        System.out.println( "Id: " +  person.getId());

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
