package com.exemplo.controller;

import com.exemplo.model.Usuario;
import com.exemplo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public String cadastrar(@RequestBody Usuario usuario) {
        usuarioService.cadastrarUsuario(usuario);
        return "Usuário cadastrado com sucesso!";
    }
}