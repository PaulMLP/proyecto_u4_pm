package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPersonaRepository;
import com.uce.edu.demo.repository.modelo.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaRepository personaRepository;

	@Override
	public Persona buscarPorId(Integer id) {
		return this.personaRepository.buscarPorId(id);
	}

	@Override
	public void guardar(Persona persona) {
		this.personaRepository.insertar(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		this.personaRepository.actualizar(persona);
	}

	@Override
	public void eliminar(Integer id) {
		this.personaRepository.eliminar(id);
	}

	@Override
	public List<Persona> buscarTodos() {
		return this.personaRepository.buscarTodos();
	}

}
