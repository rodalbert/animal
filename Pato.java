package mam.rodrigo.oop.animal.domain.model;

import mam.rodrigo.oop.animal.domain.Domestico;

public class Pato extends Animal implements Domestico {

    @Override
    public String brincar() {
        return "Qua Qua...";
    }

    @Override
    public String comer(Object obj) {
        return "Pato comendo...";
    }
}
