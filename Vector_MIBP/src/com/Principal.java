package com;

public class Principal {

	//¿QUÉ ES UN VECTOR?
	
//	 Un vector es similar a un array, la diferencia estriba en que un vector crece 
//	 automáticamente cuando alcanza la dimensión inicial máxima. 
//	 Además, proporciona métodos adicionales para añadir, eliminar elementos, e insertar
//	 elementos entre otros dos existentes.
	
//	¿CÓMO SE DECLARA UN VECTOR?
//	Para usar la clase Vector hemos de poner al principo del archivo del código fuente la siguiente sentencia import

	import java.util.;
//	Cuando creamos un vector u objeto de la clase Vector, podemos especificar su dimensión inicial, y cuanto crecerá si rebasamos dicha dimensión.

	    Vector vector=new Vector(20, 5);
//	Tenemos un vector con una dimensión inicial de 20 elementos. Si rebasamos dicha dimensión y guardamos 21 elementos la dimensión del vector crece a 25.

//	Al segundo constructor, solamente se le pasa la dimensión inicial.

	    Vector vector=new Vector(20);
//	Si se rebasa la dimensión inicial guardando 21 elementos, la dimensión del vector se duplica. El programador ha de tener cuidado con este constructor, ya que si se pretende guardar un número grande de elementos se tiene que especificar el incremento de la capacidad del vector, si no se quiere desperdiciar inútilmente la memoria el ordenador.

//	Con el tercer constructor, se crea un vector cuya dimensión inicial es 10.

	    Vector vector=new Vector();
//	La dimensión del vector se duplica si se rebasa la dimensión inicial, por ejemplo, cuando se pretende guardar once elementos
	
	 // 
}
