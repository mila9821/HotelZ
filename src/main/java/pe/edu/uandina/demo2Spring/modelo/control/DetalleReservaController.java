package pe.edu.uandina.demo2Spring.modelo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.uandina.demo2Spring.modelo.services.IDetalleReservaService;

@RestController
@RequestMapping("/api")
public class DetalleReservaController {
    @Autowired
    private IDetalleReservaService detalleReservaService;
}
