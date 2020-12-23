package mam.rodrigo.oop.animal.domain.model;

import mam.rodrigo.oop.animal.domain.Domestico;

public class Gato extends Felino implements Domestico {

    @Override
    public String ronronar() {
        return "Bixano ronronando....";
    }

    @Override
    public String comer(Object obj) {
        return "Bixano comendo....";
    }

    @Override // Anotação
    public String brincar() {
        return "Bixano dormindo.....";
    }
}
