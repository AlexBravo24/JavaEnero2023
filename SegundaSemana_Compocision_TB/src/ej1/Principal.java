package ej1;

public class Principal {

    public static void main(String[] args) {
    Brocha b1 = new Brocha("Comex","MX110","Sintetica","Grande XL");
    Brocha b2 = new Brocha("Pretul","U882M","Natural","Mediana");
    Escalera ldd = new Escalera("Surtek","SK-ML850Y","Grande","Amarillo-Negro","Aluminio Cepillado");
    Pintura p = new Pintura("Berel","CC90F1212","Acrílica","28","Azul Cielo");
    HerramientaPintor pack = new HerramientaPintor("Maxi-House", 7500, b1, b2, ldd, p);	
    System.out.println(pack);

    }
}
