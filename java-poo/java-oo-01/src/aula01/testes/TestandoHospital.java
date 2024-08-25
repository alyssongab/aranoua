package aula01.testes;

import aula01.modelo.Hospital;

import java.util.Scanner;

public class TestandoHospital {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("hapvida", "rua teste 12", "1111222",
                "hapvida.com.br", "hapvida@gmail");

        System.out.println(hospital.getNome());
        System.out.println(hospital.getEndereco());
        System.out.println(hospital.getTelefone());
        System.out.println(hospital.getSite());
        System.out.println(hospital.getEmail());

    }
}
