package mam.rodrigo.oop.animal.domain.model;

public class Tigre extends Felino {

    @Override
    public String comer(Object obj) {
        return "Tigre está comendo...";
    }

    @Override
    public String ronronar() {
        return "rrrrrrrrrrrrrrrrrrrrrr";
    }
}
