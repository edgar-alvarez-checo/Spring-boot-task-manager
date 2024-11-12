package com.transformer.transformador.web.models;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.transformer.transformador.web.objects.monedas;
import java.util.ArrayList;
import java.util.List;

@Controller
public class useModel {

    //crear lista
    private List<monedas> monedasList = new ArrayList<>();

    @PostMapping("/")
    public String form(@RequestParam("tarea") String tarea, Model model) {
        monedas moneda = new monedas(tarea);
        monedasList.add(moneda);

        //enviar vistas
        model.addAttribute("tarea", tarea);
        model.addAttribute("monedasList", monedasList);

        //bucle foreach para mostrar la tarea
        monedasList.forEach(monedaItem -> System.out.println(monedaItem.getTask()));

        return "index2"; //direccion donde se envian los datos
    }

}
