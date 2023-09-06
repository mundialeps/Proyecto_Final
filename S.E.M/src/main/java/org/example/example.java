package org.example;

import java.util.Objects;
import java.util.Scanner;


public class example {
    public static void main (String[] args){
        Boolean rol;
        Scanner teclado = new Scanner(System.in);
        String[] nombresEspecialistas = new String[99];
        Integer[] CedulasEspecialista = new Integer[99];
        String[] especialidadEspecialistas = new String[99];
        Double[] salarioEspecialistas = new Double[99];
        String[] fechaDeIngreso = new String[99];
        //Byte[] horasTrabajadas=new Byte[184];
        double horasTrabajadas = 0;
        double totalSalario = 0;
        Double[] horasEspecialistas = new Double[99];
        String diasTrabajados ="";
        Integer valorHora = 150000;
        double porcentaje = 0.0;
        Integer opcionAdministracion = 99;
        Integer opcionEspeMed = 99;
        Integer opcionPaciente = 99;
        Byte indice = 0;
        Integer opcion = 100;
        Integer cedula = 0;
        String nombres = "";



        System.out.println("BIENVENIDO A TU EPS .. S.E.M.");

        System.out.println("Digita tu rol en la empresa:  ");

        System.out.println("1. Gestión administrativa");
        System.out.println("2. Gestión Especialista-Médico");
        System.out.println("3. Gestión Paciente");
        System.out.println("4. Salir.");

        rol = teclado.nextBoolean();

        System.out.println("*****BIENVENIDO A EL MENU DE LA EMPRESA*****");
        do {
            System.out.println("Digita una opcion del menú 1. admin 2. especia 3. pacie:  ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:

                    System.out.println("1. Registrar Especialistas-Médicos.");
                    System.out.println("2. Ver información de los Especialistas-Médicos.");
                    System.out.println("3. Buscar Especialista por la cédula.");
                    System.out.println("4. Terminar contrato a Especialista-Médico.");
                    System.out.println("5. Salir.");

                    do {
                        System.out.println("Que desea hacer en el menú de Administración: ");
                        opcionAdministracion = teclado.nextInt();
                        switch (opcionAdministracion) {
                            case 1:

                                System.out.println("1. Registrar un Especialistas-Médicos. ");

                                System.out.println("Digita la cédula del Especialista-Médico: ");
                                CedulasEspecialista[indice] = teclado.nextInt();

                                System.out.println("Digite el salario del Especialista-Médico: ");
                                salarioEspecialistas[indice] = teclado.nextDouble();

                                System.out.println("Digite el nombre del Especialista-Médico: ");
                                nombresEspecialistas[indice] = teclado.nextLine();
                                teclado.nextLine();

                                System.out.println("Digite la fecha de ingreso del Especialista-Médico: ");
                                fechaDeIngreso[indice] = teclado.nextLine();

                                System.out.println("Digite la Especialidad: ");
                                especialidadEspecialistas[indice] = teclado.nextLine();

                                indice++;

                                indice++;
                                break;

                            case 2:
                                for (int contador = 0; contador < 99; contador++) {

                                    System.out.println(CedulasEspecialista[contador]);
                                    System.out.println(salarioEspecialistas[contador]);
                                    System.out.println(nombresEspecialistas[contador]);
                                    System.out.println(fechaDeIngreso[contador]);
                                    System.out.println(especialidadEspecialistas[contador]);
                                }
                                break;
                            case 3:
                                System.out.println("Digite la cédula del EspMédi que desea buscar: ");
                                cedula = teclado.nextInt();
                                for (int i = 0; i < 99; i++) {
                                    if (Objects.equals(CedulasEspecialista[i], cedula)) {


                                        System.out.println(nombresEspecialistas);
                                        System.out.println(CedulasEspecialista);
                                        System.out.println(salarioEspecialistas);
                                        System.out.println(fechaDeIngreso);
                                        System.out.println(especialidadEspecialistas);
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Digite la cédula del EspMédi que desea retirar: ");
                                cedula = teclado.nextInt();
                                for (int i = 0; i < 99; i++) {
                                    if (Objects.equals(CedulasEspecialista[i], cedula)) {
                                        //CedulasEspecialista = remove()
                                    }
                                }
                                break;

                            default:
                                System.out.println("Hasta pronto, opción no valida");
                                break;
                        }
                    } while (opcionAdministracion != 5);
                    break;
                default:
                    System.out.println("Construyendo Opción");


                case 2:
                    System.out.println("1. Número de horas trabajadas.");
                    System.out.println("2. Ver base de datos Especialistas-Médicos(sin salario)");
                    System.out.println("3. Ver salario mensual.");
                    System.out.println("4. Salir");

                    do {
                        System.out.println("Que desea hacer en el menú Especialista-Médico: ");
                        opcionEspeMed = teclado.nextInt();
                        switch (opcionEspeMed) {
                            case 1:
                                System.out.println("Digite la cédula del EspMédi que desea buscar: ");
                                cedula = teclado.nextInt();
                                for (int i = 0; i < 99; i++) {
                                    if (Objects.equals(CedulasEspecialista[i], cedula)) {
                                        horasTrabajadas = salarioEspecialistas[i]/valorHora;
                                        horasEspecialistas[i] = horasTrabajadas;
                                        System.out.println("El especialista trabajó: "+horasTrabajadas+" horas");
                                    } else {
                                        System.out.println("No hay datos");
                                    }
                                }
                                break;

                            case 2:
                                System.out.println("2. Base de datos Esecialistas-Médicos.");
                                for (int contador = 0; contador < 99; contador++) {
                                    System.out.println(CedulasEspecialista[contador]);
                                    System.out.println(fechaDeIngreso[contador]);
                                    System.out.println(nombresEspecialistas[contador]);
                                    System.out.println(especialidadEspecialistas[contador]);}

                                break;
                            case 3:
                                System.out.println("Digite la cédula del EspMédi que desea buscar para ver su salario: ");
                                cedula = teclado.nextInt();
                                for (int i = 0; i < 99; i++) {
                                    if (Objects.equals(CedulasEspecialista[i], cedula)) {
                                        totalSalario = salarioEspecialistas[i] - 0.04;
                                        System.out.println("El salario del especialista fue: "+salarioEspecialistas[i]);
                                        System.out.println("El salario del especialista menos el 4% fue: "+totalSalario);
                                    } else {
                                        System.out.println("No hay datos");
                                    }
                                }
                                break;
                            default:
                                System.out.println("digita una opcion valida");
                                break;
                        }
                    } while (opcionEspeMed != 4);
                    break;

                    case 3:
                    System.out.println("1. Ver base de datos de los Especialistas-Médicos.(Sin s - ni fecha)");
                    System.out.println("2. Salir");

                    do{
                        System.out.println("Que desea hacer en el menú Paciente: ");
                        opcionPaciente = teclado.nextInt();
                        switch (opcionPaciente) {
                            case 1:
                                System.out.println("1. Ver base de datos de especialistas..");
                                for (int contador = 0; contador < 99; contador++) {
                                    System.out.println(CedulasEspecialista[contador]);
                                    System.out.println(nombresEspecialistas[contador]);
                                    System.out.println(especialidadEspecialistas[contador]);}
                                break;
                            case 2:
                                System.out.println("salir");
                            default:
                                System.out.println("adios mil gracias");
                        }
                    }
                    while (opcionPaciente != 3);
                    break;
            }
        } while (opcion != 4);
    }
}
