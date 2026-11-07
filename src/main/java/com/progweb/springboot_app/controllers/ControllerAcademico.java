package com.progweb.springboot_app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class ControllerAcademico {
    @GetMapping("/identificador")
    public Map<String, String> obtenerIdentificador() {
        Map<String, String> info = new HashMap<>();
        info.put("proyecto", "springboot-app");
        info.put("autor", "Azael Chávez Lorenzo");
        info.put("iniciales", "ACL");
        return info;
    }


    @GetMapping("/materias")
    public Map<String, Object> obtenerMaterias() {

        Map<String, Object> respuesta = new LinkedHashMap<>();
        Map<String, List<String>> semestres = new LinkedHashMap<>();

        semestres.put("semestre_1", List.of(
                "Cálculo Diferencial",
                "Fundamentos de Programación",
                "Taller de Ética",
                "Matemáticas Discretas",
                "Taller de Administración",
                "Fundamentos de Investigación"
        ));

        semestres.put("semestre_2", List.of(
                "Cálculo Integral",
                "Programación Orientada a Objetos",
                "Contabilidad Financiera",
                "Química",
                "Álgebra Lineal",
                "Probabilidad y Estadística"
        ));

        semestres.put("semestre_3", List.of(
                "Cálculo Vectorial",
                "Estructura de Datos",
                "Cultura Empresarial",
                "Investigación de Operaciones",
                "Sistemas Operativos",
                "Física General"
        ));

        semestres.put("semestre_4", List.of(
                "Ecuaciones Diferenciales",
                "Métodos Numéricos",
                "Tópicos Avanzados de Programación",
                "Fundamentos de Bases de Datos",
                "Taller de Sistemas Operativos",
                "Principios Eléctricos y Aplicaciones Digitales"
        ));

        semestres.put("semestre_5", List.of(
                "Desarrollo Sustentable",
                "Fundamentos de Telecomunicaciones",
                "Taller de Bases de Datos",
                "Simulación",
                "Fundamentos de Ingeniería de Software",
                "Arquitectura de Computadoras"
        ));

        semestres.put("semestre_6", List.of(
                "Lenguajes y Autómatas I",
                "Redes de Computadoras",
                "Administración de Bases de Datos",
                "Graficación",
                "Ingeniería de Software",
                "Lenguajes de Interfaz"
        ));

        semestres.put("semestre_7", List.of(
                "Lenguajes y Autómatas II",
                "Conmutación y Enrutamiento de Redes de Datos",
                "Taller de Investigación I",
                "Programación Web",
                "Gestión de Proyectos de Software",
                "Programación Lógica y Funcional"
        ));

        semestres.put("semestre_8", List.of(
                "Administración de Redes",
                "Taller de Investigación II",
                "Programación de Dispositivos Móviles",
                "Desarrollo de Aplicaciones Web",
                "Sistemas Programables"
        ));

        semestres.put("semestre_9", List.of(
                "Inteligencia Artificial",
                "Desarrollo de Software con Enfoque Ágil",
                "Servicio Social",
                "Residencia Profesional"
        ));

        respuesta.put("carrera", "Ingeniería en Sistemas Computacionales");
        respuesta.put("institucion", "Tecnológico Nacional de México");
        respuesta.put("totalSemestres", semestres.size());
        respuesta.put("semestres", semestres);

        return respuesta;
    }

}