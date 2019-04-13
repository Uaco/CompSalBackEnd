package com.marcio.CompSal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marcio.CompSal.models.Usuario;
import com.marcio.CompSal.repositories.IusuarioRepository;

@Controller
public class UsuarioController {


	@Autowired
	private IusuarioRepository usuarioRepository;

	@RequestMapping(value = "/cadastrarUsuario", method = RequestMethod.GET)
	public String formCadastroUsuario() {
		return "/templatesUsuario/formCadastrarUsuario";
	}

	@RequestMapping(value = "/cadastrarUsuario", method = RequestMethod.POST)
	public String formCadastroUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
		return "redirect:/cadastrarUsuario";
	}

}
