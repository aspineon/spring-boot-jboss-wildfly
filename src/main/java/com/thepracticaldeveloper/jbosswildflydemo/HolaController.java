package com.thepracticaldeveloper.jbosswildflydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author moises.macero
 */
@RestController
@RequestMapping("/hola")
public final class HolaController {

    @GetMapping
    public String dimeHolaGet(){
        String message = "Hola Amigo get!";
        return message;
    }

}
