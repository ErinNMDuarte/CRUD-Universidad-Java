package vista;

import controlador.CapturaD;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Usuario;
import modelo.UsuarioCRUD;

public class VistaU {

    ArrayList<Usuario> lista = new ArrayList<>();
    UsuarioCRUD usucrud;
    Scanner cap = new Scanner(System.in);
    CapturaD cd = new CapturaD();
    ArrayList<Usuario> datos = new ArrayList<>();
    Usuario us = new Usuario();
    int dato, c;
    String nombre, apellidos, fechan, correoI, correoP, programaA, corri;
    Long ntCelular, ntFijo;

    public VistaU() {
        this.usucrud = new UsuarioCRUD();
    }

    public void menuprincipal() {

        do {
            String menu = "INSTITUTO LA FLORESTA\n"
                    + "Seleccione tarea a realizar:\n"
                    + "1. Ingresar estudiante\n"
                    + "2. Buscar estudiante\n"
                    + "3. Modificar estudiante\n"
                    + "4. Eliminar Estudiante\n"
                    + "5. Ver directorio de estudiantes\n"
                    + "6. Salir\n"
                    + "Opción:";

            System.out.println(menu);
            try {
                dato = cap.nextInt();
            } catch (Exception e) {
                dato = 0;
            }

            switch (dato) {
                case 1:
                    System.out.print("\n");
                    System.out.println("Ingresar estudiante");
                    cap.nextLine();
                    System.out.print("Ingresar nombres:\n");
                    System.out.print("\n");
                    nombre = cap.nextLine();
                    System.out.print("Ingresar apellidos:\n");
                    System.out.print("\n");
                    apellidos = cap.nextLine();
                    System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD):\n");
                    fechan = cap.next();
                    System.out.println("Ingresar correo institucional:\n");
                    correoI = cap.next();
                    System.out.println("Ingresar correo personal:\n");
                    correoP = cap.next();
                    System.out.println("Ingresar número de celular:\n");
                    ntCelular = cap.nextLong();
                    cap.nextLine();
                    System.out.println("Ingresar número fijo:\n");
                    ntFijo = Long.parseLong(cap.nextLine());

                    System.out.println("Ingresar programa:\n");
                    programaA = cap.nextLine();

                    datos = cd.capturadatos(nombre, apellidos, fechan, correoI, correoP, programaA, ntCelular, ntFijo);

                    System.out.println("Se agregó el estudiante\n");
                    break;
                case 2:
                    System.out.print("\n");
                    System.out.println("Buscar estudiante");
                    System.out.print("Ingresar correo institucional:");
                    System.out.print("\n");
                    corri = cap.next();
                    System.out.print("\n");
                    System.out.print("Información del estudiante\n");
                    c = cd.buscardato(corri);
                    System.out.println("Nombres: " + datos.get(c).getNombre1()
                            + "\nApellido: " + datos.get(c).getApellidos1()
                            + "\nFecha nacimiento: " + datos.get(c).getFechaN()
                            + "\nCorreo institucional: " + datos.get(c).getCorreoi()
                            + "\nCorreo personal: " + datos.get(c).getCorreop()
                            + "\nNúmero de teléfono celular: " + datos.get(c).getNtcelular()
                            + "\nNúmero de teléfono fijo: " + datos.get(c).getNtfijo()
                            + "\nPrograma académico: " + datos.get(c).getProgramaa());
                    System.out.print("\n");
                    break;
                case 3:
                    System.out.print("\n");
                    System.out.println("Modificar estudiante");
                    System.out.print("Ingresar correo institucional:\n");
                    System.out.print("\n");
                    correoI = cap.next();
                    System.out.print("Ingresar correo personal:\n");
                    System.out.print("\n");
                    correoP = cap.next();
                    System.out.print("Ingresar número de celular:\n");
                    System.out.print("\n");
                    ntCelular = cap.nextLong();
                    System.out.print("Ingresar número fijo:");
                    System.out.print("\n");
                    ntFijo = cap.nextLong();
                    System.out.print("Ingresar programa:");
                    System.out.print("\n");
                    programaA = cap.next();
                    cd.modificardato(correoI, correoP, programaA, ntCelular, ntFijo);
                    System.out.print("Se modificó el estudiante\n");
                    System.out.print("\n");
                    break;

                case 4:
                    System.out.print("\n");
                    System.out.println("Eliminar estudiante");
                    System.out.print("Ingresar correo institucional:\n");
                    System.out.print("\n");
                    corri = cap.next();
                    cd.eliminardato(corri);
                    System.out.print("Se eliminó el estudiante\n");
                    System.out.print("\n");
                    break;

                case 5:
                    System.out.print("\n");
                    System.out.println("El directorio de los estudiantes\n");
                    for (int i = 0; i < datos.size(); i++) {
                        us = datos.get(i);
                        System.out.println("Nombres: " + us.getNombre1()
                                + "\nApellido: " + us.getApellidos1()
                                + "\nFecha nacimiento: " + us.getFechaN()
                                + "\nCorreo institucional: " + us.getCorreoi()
                                + "\nCorreo personal: " + us.getCorreop()
                                + "\nNúmero de teléfono celular: " + us.getNtcelular()
                                + "\nNúmero de teléfono fijo: " + us.getNtfijo()
                                + "\nPrograma académico: " + us.getProgramaa());
                        System.out.print("\n");

                    }
                    break;
            }

        } while (dato != 6);
        System.out.print("\n");
        System.out.println("Hasta pronto");
        
    }
}
