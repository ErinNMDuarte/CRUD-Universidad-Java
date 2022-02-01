package controlador;

import java.util.ArrayList;
import modelo.Usuario;
import modelo.UsuarioCRUD;


public class CapturaD {

    UsuarioCRUD usucrud = new UsuarioCRUD();
    Usuario us;

    public ArrayList<Usuario> capturadatos(String nombre, String apellidos, String fechan, String correoI, String correoP, String programaA, Long ntCelular, Long ntFijo) {
        us = new Usuario(nombre, apellidos, fechan, correoI, correoP, programaA, ntCelular, ntFijo);
        return usucrud.ingresar(us);
    }

    public int buscardato(String corri) {
        return usucrud .buscar(corri);

    }

    public void modificardato(String correoI, String correoP, String programaA, Long ntCelular, Long ntFijo) {
        us = new Usuario(correoI, correoP, programaA, ntCelular, ntFijo);
        usucrud.modificar(us);

    }

    public void eliminardato(String corri){
        us = new Usuario(corri);
        usucrud.eliminar(us);
    }
}
