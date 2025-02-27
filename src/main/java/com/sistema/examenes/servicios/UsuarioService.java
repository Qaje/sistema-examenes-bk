package com.sistema.examenes.servicios;

import com.sistema.examenes.entidades.Usuario;
import com.sistema.examenes.entidades.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String userName);

    public void eliminarUsuario(Long usuarioId);

}
