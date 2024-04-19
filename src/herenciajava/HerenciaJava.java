
package herenciajava;


public class HerenciaJava {

   
    public static void main(String[] args) {
        
        //crear objeto clase padre
        Humano adulto=new Humano();
        adulto.setNombre("Freddy");
        adulto.comer(adulto.getNombre());
        adulto.dormir();
        
        System.out.println("");
        
        //crear objeto clase hija
        Hombre padre=new Hombre();
        padre.setNombre("Nicolas");
        padre.comer(padre.getNombre());
        padre.dormir();
        padre.afeitarse();
        
        System.out.println(""); 
        
        //crear obbjeto clase hija->Mujer
        Mujer madre=new Mujer();
        madre.setNombre("Gloria");
        madre.comer(madre.getNombre());
        madre.dormir();
        madre.maquillarse(madre.getNombre());
        
        
    }
    
}
