package pe.edu.uandina.demo2Spring.modelo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.uandina.demo2Spring.modelo.Restaurante;
import pe.edu.uandina.demo2Spring.modelo.services.IRestauranteService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestauranteController {
    @Autowired
    private IRestauranteService restauranteService;

    public List<Restaurante> listar(){
        return restauranteService.findAll();
    }
}
