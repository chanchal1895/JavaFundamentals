package com.lti.demos3.extra;

class Animal {
}

class Cow extends Animal {

    public void addHay() {
        System.out.println("Hay");
    }
}

class Bird extends Animal {

    public void addSeed() {
        System.out.println("Seed");
    }
}

class Lion extends Animal {

    public void addMeat() {
        System.out.println("Meat");
    }
}

public class InstanceOfEx {

    public void feedAnimal(Animal animal) {
        if (animal instanceof Cow) {
            ((Cow) animal).addHay();
        } else if (animal instanceof Bird) {
            ((Bird) animal).addSeed();
        } else if (animal instanceof Lion) {
            ((Lion) animal).addMeat();
        } else {
            throw new RuntimeException("Unsupported animal");
        }
    }

    public static void main(String[] args) {
        InstanceOfEx main = new InstanceOfEx();
        main.feedAnimal(new Cow());
        main.feedAnimal(new Bird());
        main.feedAnimal(new Lion());
        main.feedAnimal(new Animal());
    }

}
