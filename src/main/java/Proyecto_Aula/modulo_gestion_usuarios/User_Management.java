package Proyecto_Aula.modulo_gestion_usuarios;

import Proyecto_Aula.User;

import java.util.ArrayList;
import java.util.Objects;

public class User_Management {
    private ArrayList<User> list_Users = new ArrayList<User>();

    public User iniciarSesion(String email, String password) throws Exception {
        if (list_Users == null) throw new Exception("La lista de usuarios no está inicializada");
        if (list_Users.isEmpty()) throw new Exception("Lista de usuarios vacia");
        for (User usuario : list_Users) {
            if (Objects.equals(usuario.getEmail(), email) && Objects.equals(usuario.getPassword(), password)) return usuario;
        }
        throw new Exception("Correo o contraseña incorrectos");
    }

    public User RegistrarUsuario(User nuevo) throws Exception {
        if (list_Users == null) throw new Exception("La lista de usuarios no está inicializada");
        if (list_Users.isEmpty()) throw new NullPointerException("Lista de usuarios vacia");
        for (User usuario : list_Users) {
            if (Objects.equals(usuario.getEmail(), nuevo.getEmail())) throw new Exception("Ya existe un usuario con este correo");
            if (Objects.equals(usuario.getUser_name(), nuevo.getUser_name())) throw new Exception("Ya existe un usuario con este nombre de usuario");
            if (Objects.equals(usuario.getId(), nuevo.getId())) throw new Exception("Ya existe un usuario con este Id");
        }
            list_Users.add(nuevo);
            return nuevo;
    }


    public User ConsultarUsuario(int id)  throws Exception {
        if (list_Users == null) throw new Exception("La lista de usuarios no está inicializada");
        if (list_Users.isEmpty()) throw new Exception("Lista de usuarios vacía");
        for (User usuario : list_Users) {
            if (usuario.getId() == id) return usuario;
        }
        throw  new Exception("El usuario no existe");
    }


    public User actualizarUsuario(User usuarioActualizado) throws Exception {
        if (list_Users == null) throw new Exception("La lista de usuarios no está inicializada");
        if (list_Users.isEmpty()) throw new Exception("Lista de usuarios vacia");
        for (User usuario : list_Users) {
            if (Objects.equals(usuario.getId(), usuarioActualizado.getId())) {
                usuario.setUser_name(usuarioActualizado.getUser_name());
                usuario.setEmail(usuarioActualizado.getEmail());
                usuario.setPassword(usuarioActualizado.getPassword());
                return usuario;
            }
        }
        throw new Exception("Usuario a actualizar no existe");

    }

    public boolean eliminarUsuario(int id) throws Exception {
        if (list_Users == null) throw new Exception("La lista de usuarios no está inicializada");
        if (list_Users.isEmpty()) throw new Exception("Lista de usuarios vacía");
        for (int i = 0; i < list_Users.size(); i++) {
            User usuario = list_Users.get(i);
            if (usuario.getId() == id) {
                list_Users.remove(i);
                System.out.println("Usuario removido con éxito");
                return true;
            }
        }
        throw new Exception("Usuario a eliminar no existe");
    }
    }
