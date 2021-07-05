package com.chicho.learn.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chicho.learn.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
