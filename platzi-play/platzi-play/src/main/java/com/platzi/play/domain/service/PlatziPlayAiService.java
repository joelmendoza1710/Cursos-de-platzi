package com.platzi.play.domain.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PlatziPlayAiService {
    @UserMessage("""
            Genera un saludo de bienvenida ala plataforma de gestion de Peliculas PlatziPlay
            usa menos de 120 caracteres y hazlo con el estilo de platzi
            """)
    String generateGreeting();
}
