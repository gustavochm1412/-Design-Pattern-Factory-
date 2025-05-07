package com.exemplo.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void enviarEmail(String destino, String assunto, String corpo) {
        // Simulando envio de email
        System.out.println("Simulando envio de e-mail para: " + destino);
        System.out.println("Assunto: " + assunto);
        System.out.println("Corpo: " + corpo);
    }
}