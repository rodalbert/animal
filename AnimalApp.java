package mam.rodrigo.oop.animal.app;

import mam.rodrigo.oop.animal.domain.Domestico;
import mam.rodrigo.oop.animal.domain.factory.AnimalFactory;
import mam.rodrigo.oop.animal.domain.model.*;

public class AnimalApp {

    public static void main(String[] args) {
        final AnimalFactory factory = new AnimalFactory();
        // Array // Container (mais de um valor dentro)
        Animal[] animais = factory.createList();
        Object obj = new Object();

        for (Animal a : animais) {
            System.out.println(a.comer(obj)); // Polimorfismo

            if (a instanceof Canino) {
                Canino c = (Canino) a; // Castin // Polimorfismog
                System.out.println(c.uivar());
            }

            if (a instanceof Felino) {
                System.out.println(((Felino) a).ronronar()); // Casting // Polimorfismo
            }

            if (a instanceof Domestico) {
                System.out.println(((Domestico) a).brincar()); // Casting // Polimorfismo
            }
        }
    }
}
