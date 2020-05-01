
package reino;

/**
 *
 * @author Juliana
 */
public class Hierarquia {

    public static void main(String[] args) {
        Homem homem = new Homem();
        
        homem.reino = "Animalia";
        homem.filo = "Chordata";
        homem.classe = "Mammalia";
        homem.ordem = "Primata";
        homem.familia = "Hominidae";
        homem.genero = "Homo";
        homem.especie = "Homo sapiens";
        
        System.out.println("Hierarquia que envolve o homem: ");
        System.out.println("Reino: " + homem.reino);
        System.out.println("Filo: " + homem.filo);
        System.out.println("Classe: " + homem.classe);
        System.out.println("Ordem: " + homem.ordem);
        System.out.println("Familia: "+ homem.familia);
        System.out.println("Genero: " + homem.genero);
        System.out.println("Especie: " + homem.especie);
        System.out.println("\n");
        
        Cao cao = new Cao();
        
        cao.reino = "Animalia";
        cao.filo = "Chordata";
        cao.classe = "Mammalia";
        cao.ordem = "Carnivora";
        cao.familia = "Canidae";
        cao.genero = "Canis";
        cao.especie = "Canis familiaris";
        
        System.out.println("Hierarquia que envolve o cão: ");
        System.out.println("Reino: " + cao.reino);
        System.out.println("Filo: " + cao.filo);
        System.out.println("Classe: " + cao.classe);
        System.out.println("Ordem: " + cao.ordem);
        System.out.println("Familia: "+ cao.familia);
        System.out.println("Genero: " + cao.genero);
        System.out.println("Especie: " + cao.especie);
        System.out.println("\n");
        
        Mosca mosca = new Mosca();
        
        mosca.reino = "Animalia";
        mosca.filo = "Arthropoda";
        mosca.classe = "Insecta";
        mosca.ordem = "Diptera";
        mosca.familia = "Muscidae";
        mosca.genero = "Musca";
        mosca.especie = "Musca domestica";
        
        System.out.println("Hierarquia que envolve a Mosca: ");
        System.out.println("Reino: " + mosca.reino);
        System.out.println("Filo: " + mosca.filo);
        System.out.println("Classe: " + mosca.classe);
        System.out.println("Ordem: " + mosca.ordem);
        System.out.println("Familia: "+ mosca.familia);
        System.out.println("Genero: " + mosca.genero);
        System.out.println("Especie: " + mosca.especie);
        
        
    }
    
}
