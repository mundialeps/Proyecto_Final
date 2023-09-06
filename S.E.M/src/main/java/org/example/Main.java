package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    static String[] nombreUsuario = new String[99];
    static Integer[] CedulasEspecialista = new Integer[99];
    static Double[] salarioEspecialistas = new Double[99];
    static String[] fechaDeIngreso = new String[99];
    static String[] especialidadEspecialistas = new String[99];
    static Byte indice = 0;
    static Integer cedula = 0;
    static double horasTrabajadas = 0;
    static  Integer valorHora = 150000;
    static Double[] horasEspecialistas = new Double[99];
    static double totalSalario = 0;

    public static void main(String[] args) {

        int rolUsuario = 0;
        System.out.println("******BIENVENIDO A TU EPS .. S.E.M.******");
        System.out.println("********************************************");
        System.out.println("1. Administrador");
        System.out.println("2. Especialista");
        System.out.println("3. Paciente");
        System.out.println("4. Salir");
        do {
            System.out.println("Digita tu rol en la empresa:  ");
            rolUsuario = teclado.nextInt();
            if (rolUsuario == 1) {
                administrador();
            } else if (rolUsuario == 2) {
                especialista();
            } else if (rolUsuario == 3) {
                paciente();
            } else {
                System.out.println("Ha sido un placer. ¡vuelve pronto!");
            }
        } while (rolUsuario != 4);
    }

    private static void administrador() {
        int opcionAdmin = 0;
        String nombre = teclado.nextLine();
        System.out.println("Bienvenido al menú de administración");
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1. Registrar Especialistas-Médicos.");
        System.out.println("2. Ver información de los Especialistas-Médicos.");
        System.out.println("3. Buscar un Especialista por la cédula.");
        System.out.println("4. Terminar contrato a Especialista-Médico.");
        System.out.println("5. Salir.");
        do {
            System.out.println("Digita una opcion del menú");
            opcionAdmin = teclado.nextInt();
            switch (opcionAdmin) {
                case 1:
                    System.out.println("1. Para registrar un Especialistas-Médicos complete los siguientes datos: ");
                    System.out.println("Digita el nombre completo del Especialista-Médico: ");
                    nombreUsuario[indice] = teclado.nextLine();
                    teclado.nextLine();
                    System.out.println("Digita la cédula del Especialista-Médico: ");
                    CedulasEspecialista[indice] = teclado.nextInt();
                    System.out.println("Digite el salario del Especialista-Médico: ");
                    salarioEspecialistas[indice] = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Digite la fecha de ingreso del Especialista-Médico: ");
                    fechaDeIngreso[indice] = teclado.nextLine();
                    System.out.println("Digite la Especialidad: ");
                    especialidadEspecialistas[indice] = teclado.nextLine();
                    indice++;
                    break;
                case 2:
                    System.out.println("Esta es la información de los Especialistas: ");
                    for (int i = 0; i < 99; i++) {
                        System.out.println(nombreUsuario[i]);
                        System.out.println(CedulasEspecialista[i]);
                        System.out.println(salarioEspecialistas[i]);
                        System.out.println(fechaDeIngreso[i]);
                        System.out.println(especialidadEspecialistas[i]);
                    }
                    break;
                case 3:
                    System.out.println("Digite la cédula del Especialista para ver sus datos: ");
                    cedula = teclado.nextInt();
                    for (int i = 0; i < 99; i++) {
                        if (Objects.equals(CedulasEspecialista[i], cedula)) {
                            System.out.println(especialidadEspecialistas[i]);
                            System.out.println(nombreUsuario[i]);
                            System.out.println(CedulasEspecialista[i]);
                            System.out.println(salarioEspecialistas[i]);
                            System.out.println(fechaDeIngreso[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digita la cédula del Especialista que desea retirar: ");
                    cedula = teclado.nextInt();
                    for (int i = 0; i < 99; i++) {
                        if (Objects.equals(CedulasEspecialista[i], cedula)) {
                            CedulasEspecialista = remove(cedula);
                        } else {
                            System.out.println(" El especilista ha sido retirado con exito");
                        }
                    }
                    break;
                default:System.out.println("Opción no valida.");
                    break;
            }
        } while (opcionAdmin != 5);

    }

    private static void especialista() {
        int opcionEsp=0;
        System.out.println("Bienvenido al menú de especialista");
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1. Número de horas trabajadas.");
        System.out.println("2. Ver la base de datos Especialistas-Médicos.");
        System.out.println("3. Ver salario mensual.");
        System.out.println("4. Salir");
        do{
            System.out.println("Digita una opcion del menú");
            opcionEsp = teclado.nextInt();
            switch (opcionEsp){
                case 1:
                    System.out.println("Digita tu cédula para ver el número de horas trabajadas en el mes: ");
                    cedula = teclado.nextInt();
                    for (int i = 0; i < 99; i++) {
                        if (Objects.equals(CedulasEspecialista[i], cedula)) {
                            horasTrabajadas = salarioEspecialistas[i]/valorHora;
                            horasEspecialistas[i] = horasTrabajadas;
                            System.out.println("El especialista trabajó en el mes: "+horasTrabajadas+" horas.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Esta es la base de datos de los Especialistas");

                    for (int contador = 0; contador < 99; contador++) {
                        System.out.println(CedulasEspecialista[contador]);
                        System.out.println(fechaDeIngreso[contador]);
                        System.out.println(nombreUsuario[contador]);
                        System.out.println(especialidadEspecialistas[contador]);
                    }
                    break;
                case 3:
                    System.out.println("Para ver el salario digite el número de su cédula: ");
                    cedula = teclado.nextInt();
                    for (int i = 0; i < 99; i++) {
                        if (Objects.equals(CedulasEspecialista[i], cedula)) {
                            totalSalario = salarioEspecialistas[i] - 0.4;
                            System.out.println("El salario del especialista fue: "+salarioEspecialistas[i]);
                            System.out.println("El salario del especialista con la retención del 4% fue: "+totalSalario);
                        }
                    }
                    break;
                default:
                    break;

            }
        }while (opcionEsp != 4);


    }

    private static void paciente() {
        int opcionPac=0;
        System.out.println("Bienvenido al menu de paciente");
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1. Ver base de datos de los Especialistas-Médicos.");
        System.out.println("2. Salir");
        do{
            System.out.println("Digite una opcion del menú");
            opcionPac= teclado.nextByte();
            switch (opcionPac){
                case 1:
                    System.out.println("Esta es la base de datos de los Especialistas");
                    for (int contador = 0; contador < 99; contador++) {
                        System.out.println(CedulasEspecialista[contador]);
                        System.out.println(nombreUsuario[contador]);
                        System.out.println(especialidadEspecialistas[contador]);
                    }
                    break;
                case 2:
                    System.out.println("salir");
                    break;
                default:
                    System.out.println("ha sido un placer servirle");
                    break;
            }
        }while (opcionPac!=2);
    }

    }