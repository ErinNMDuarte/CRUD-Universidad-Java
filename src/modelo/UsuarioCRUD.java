package modelo;

import java.util.ArrayList;

public class UsuarioCRUD {
    Usuario us = new Usuario();
    ArrayList<Usuario> lista = new ArrayList<>();
    int c;

    public ArrayList<Usuario> ingresar(Usuario us) {
        lista.add(us);
        return lista;
    }

    public int buscar(String corri) {
        for (int i = 0; i < lista.size(); i++) {
            if (corri.equals(lista.get(i).getCorreoi())) {
                c = i;
            }
        }
        return c;

    }

    public void modificar(Usuario us) {
        for (int i = 0; i < lista.size(); i++) {
            if (us.getCorreoi().equals(lista.get(i).getCorreoi())) {
                lista.get(i).setCorreop(us.getCorreop());
                lista.get(i).setNtcelular(us.getNtcelular());
                lista.get(i).setNtfijo(us.getNtfijo());
                lista.get(i).setProgramaa(us.getProgramaa());
            }
        }
    }

     public void eliminar(Usuario us) {
        for (int i = 0; i < lista.size(); i++) {
            if (us.getCorreoi().equals(lista.get(i).getCorreoi())) {
                lista.remove(i);
            }
        }

    }

}

