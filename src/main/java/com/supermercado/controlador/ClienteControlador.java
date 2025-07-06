package com.supermercado.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteControlador {

    @GetMapping("/registro")
    public String mostrarFormulario(Model model) {
        return "registro";
    }
}
