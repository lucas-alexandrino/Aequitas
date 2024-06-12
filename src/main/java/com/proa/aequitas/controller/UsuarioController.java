package com.proa.aequitas.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.proa.aequitas.model.UsuarioLogin;
import com.proa.aequitas.repository.UsuarioRepository;
import com.proa.aequitas.service.Service;

public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuariorepository;

	@Autowired
	private Service usuarioService;
	
	@PostMapping("/logar")
	public ResponseEntity<UsuarioLogin> login(@RequestBody Optional<UsuarioLogin> usuarioLogin) {
		return usuarioService.autenticarUsuario(usuarioLogin).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
}
