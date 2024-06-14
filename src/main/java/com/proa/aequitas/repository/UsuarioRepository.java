package com.proa.aequitas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proa.aequitas.model.UsuarioLogin;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioLogin, Long> {
	public Optional<UsuarioLogin> findByEmail(String email);
}