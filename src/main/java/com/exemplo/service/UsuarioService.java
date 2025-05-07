package com.exemplo.service;

import com.exemplo.model.Usuario;
import com.exemplo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EmailService emailService;

    public void cadastrarUsuario(Usuario usuario) {
        usuarioRepository.salvar(usuario);

        String assunto = "Bem-vindo, " + usuario.getNome() + "!";
        String corpo = "Obrigado por se cadastrar, " + usuario.getNome() + ". Seu e-mail é " + usuario.getEmail();

        emailService.enviarEmail(usuario.getEmail(), assunto, corpo);
    }
}