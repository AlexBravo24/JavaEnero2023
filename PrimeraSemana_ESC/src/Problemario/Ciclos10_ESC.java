

import java.util.ArrayList;
import java.util.List;


public class Ciclos10_ESC {

	List <Persona> lista = new ArrayList<Persona>();
		
	//lista pa mostrar elementos filtrados
	List <Persona> listaFiltrada = new ArrayList<Persona>();
		
	//añadimos elementos a la lista original
		
	lista.add(new Persona(" Antonio"   , 20 , " MASCULINO" ));
	lista.add(new Persona(" Aylin"     , 20 , " FEMENINO" ));
	lista.add(new Persona(" César"     , 25 , " MASCULINO" ));
	lista.add(new Persona(" Tavo"      , 24 , " MASCULINO" ));
	lista.add(new Persona(" Ana"       , 18 , " FEMENINO" ));
	lista.add(new Persona(" Cecilia"   , 23 , " FEMENINO" ));
	lista.add(new Persona(" Emmanuel"  , 29 , " MASCULINO" ));
	lista.add(new Persona(" Alejandro" , 25 , " MASCULINO" ));
	lista.add(new Persona(" César"     , 25 , " MASCULINO" ));
	lista.add(new Persona(" Laura"     , 22 , " FEMENINO" ));
	lista.add(new Persona(" Marisol"   , 27 , " FEMENINO" ));

	for (Persona i: lista ) {
		if (i.getGenero().equals("MASCULINO")) {
				listaFiltrada.add(i);
				System.out.println(i);
			}
	}
	listaFiltrada.forEach(System.out::println);


}


        
	


