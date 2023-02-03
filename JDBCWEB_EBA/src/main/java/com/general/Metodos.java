package com.general;

import java.util.List;

public interface Metodos {
	
	String save(Object ob);
	String edit (Object ob);
	String delete (int id);
	Object search (int id);
	
	List mostrar();
	

}
