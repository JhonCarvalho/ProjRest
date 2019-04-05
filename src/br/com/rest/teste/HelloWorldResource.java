package br.com.rest.teste;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/ex1")
public class HelloWorldResource {

	@GET
	@Path("show/{param1}/{param2}/{param3}")
	public String show(@PathParam("param1") String nome,@PathParam("param2") int idade,@PathParam("param3") String linguagem) {
		String out = "Eu "+nome+", trabalho e estudo, tenho "+idade+" anos e adoro programar em "+linguagem;
		return out;
	}
	
	@GET
	@Path("somar/{param1}/{param2}")
	public String somar (@PathParam("param1") double alt, @PathParam("param2") double peso) {
		
		double imc = peso / (alt *alt);
		String res= "";
		String out= "";
		
		if(imc < 17) {
			res = " Muito abaixo do peso ";
		}else if(imc >= 17   && imc <= 18.49) {
			res = " Abaixo do peso ";
		}else if(imc >= 18.5 && imc <= 24.99) {
			res = " Peso normal ";
		}else if(imc >= 25   && imc <= 29.99) {
			res = " Acima do peso ";
		}else if(imc >= 30   && imc <= 34.99) {
			res = " Obesidade I acima do peso ";
		}else if(imc >= 35   && imc <= 29.99) {
			res = " Obesidade II (severa) acima do peso ";
		}else if(imc >= 40) {
			res = " Obesidade III (mórbida) acima do peso ";
		}
		
		out = "Eu tenho "+alt+" de altura e tenho "+peso+" Kg, eu estou "+res;
		
		return out;
	}
	
}
