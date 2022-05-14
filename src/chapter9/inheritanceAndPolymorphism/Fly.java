package chapter9.inheritanceAndPolymorphism;

public class Fly {
    public static void main(String[] args) {
        Airplane plane = new Airplane();
        Airplane airplane = new Jet();
        Jet jet = (Jet)new Airplane();
        Jet jet2 = new Jet();

    }
}
