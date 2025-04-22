
class God {
    public static Human[] create() {
        Human adam = new Man("Adam");
        Human eva = new Woman("Eva");
        Human humanos[] = { adam, eva };
        System.out.println("Laboratorio 8 - sis324: Limachi Villarroel Alan Nicolas");
        return humanos;

    }
}
// code

// Clase Human, la clase base
class Human {
    String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Subclase Man
class Man extends Human {
    public Man(String name) {
        super(name);
    }
}

// Subclase Woman
class Woman extends Human {
    public Woman(String name) {
        super(name);
    }
}