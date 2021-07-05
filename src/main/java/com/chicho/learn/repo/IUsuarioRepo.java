package com.chicho.learn.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chicho.learn.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{

	Usuario findByNombre(String nombre);
}
