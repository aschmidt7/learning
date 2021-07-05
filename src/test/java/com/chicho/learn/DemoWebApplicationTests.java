package com.chicho.learn;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.chicho.learn.model.Usuario;
import com.chicho.learn.repo.IUsuarioRepo;

@SpringBootTest
class DemoWebApplicationTests {

	@Autowired
	IUsuarioRepo repo;
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Test
	void contextLoads() {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setClave(encoder.encode("Chicho77"));
		usuario.setNombre("admin");
		Usuario save = repo.save(usuario);
		
		assertTrue(save.getClave().equalsIgnoreCase(usuario.getClave()));
	}

}
