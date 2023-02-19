package AlmacenYVerduleria;

public class Main {
    public static void main(String[] args) {

        Lacteo lacteo = new Lacteo("Leche", 5200,3,5);
        System.out.println("==========LACTEOS==========");
        System.out.println(lacteo);
        System.out.println("====================");
        Lacteo lacteo2 = new Lacteo("Queso", 10200,1,16);
        System.out.println(lacteo2);
        System.out.println("==========================");

        Fruta fruta = new Fruta("Mandarina", 800,240.4,"Naranja");
        System.out.println("==========FRUTAS==========");
        System.out.println(fruta);
        System.out.println("====================");
        Fruta fruta2 = new Fruta("Sandía", 4000, 1200, "verde");
        System.out.println(fruta2);
        System.out.println("==========================");

        Limpieza limpieza = new Limpieza("Limpia Vidrios", 11900, "Ácido acético, alcohol, agua", 0.8);
        System.out.println("==========LIMPIEZA==========");
        System.out.println(limpieza);
        System.out.println("====================");
        Limpieza limpieza2 = new Limpieza("Jabón rey", 3200, "NaOH, NaCl, H2O", 0.5);
        System.out.println(limpieza2);
        System.out.println("==========================");

        NoPerecible noPerecible = new NoPerecible("Lentejas", 5200,600, 1166);
        System.out.println("==========NoPerecibles==========");
        System.out.println(noPerecible);
        System.out.println("====================");
        NoPerecible noPerecible2 = new NoPerecible("Fríjoles", 7350, 1000, 3470);
        System.out.println(noPerecible2);
        System.out.println("==========================");








    }
}
