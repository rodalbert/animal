package mam.rodrigo.oop.animal.domain.factory;

import mam.rodrigo.oop.animal.domain.model.*;

public class AnimalFactory { // concreta

    public Animal[] createList() {
        return new Animal[] { new Cao(), new Leao(), new Lobo(), new Gato(), new Tigre(), new Pato() };
    }
}
