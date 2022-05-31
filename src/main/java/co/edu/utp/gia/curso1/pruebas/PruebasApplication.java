package co.edu.utp.gia.curso1.pruebas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("prueba")
@SpringBootApplication
public class PruebasApplication {

	public static void main(String[] args) {

		SpringApplication.run(PruebasApplication.class, args);
	}

	// INSERTAR DATOS
	@GetMapping("/{nombre}/{apellido}")
	public String getUser(@PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido) {
		return String .format("Hola %s %s", nombre, apellido);
	}

}

