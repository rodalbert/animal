package mam.rodrigo.oop.animal.domain.model;

import mam.rodrigo.oop.animal.domain.Domestico;

public class Cao extends Canino implements Domestico {

    @Override
    public String uivar() {
        return "Cao uivando...";
    }

    @Override
    public String comer(Object obj) {
        return "Cao comendo: " + obj;
    }

    @Override
    public String brincar() {
        return "Cao brincando...........";
    }
}
