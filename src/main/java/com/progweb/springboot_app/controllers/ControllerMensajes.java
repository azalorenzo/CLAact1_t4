package com.progweb.springboot_app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ControllerMensajes {
    @GetMapping("/saludo")
    public String obtenerMensajeSimple() {
        return "¡Bienvenido al servidor de Spring Boot configurado exitosamente!";
    }

    @GetMapping("/informacion-servidor")
    public Map<String, Object> obtenerInformacionServidor() {
        Map<String, Object> informacion = new HashMap<>();

        informacion.put("aplicacion", "springboot-app");
        informacion.put("estado", "Activo");
        informacion.put("versionJava", System.getProperty("java.version"));
        informacion.put("sistemaOperativo", System.getProperty("os.name"));
        informacion.put("fechaHoraServidor", LocalDateTime.now().toString());
        informacion.put("mensaje", "Servidor funcionando correctamente");

        return informacion;
    }
}