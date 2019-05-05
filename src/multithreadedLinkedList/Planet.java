package multithreadedLinkedList;

public class Planet {
    private String name;

    private int distanceToSun;
    private int mass;
    private int diameter;

    public Planet nextDistanceToSun;
    public Planet nextMass;
    public Planet nextDiameter;

    public Planet(String name, int distanceToSun, int mass, int diameter) {
        this.name = name;
        this.distanceToSun = distanceToSun;
        this.mass = mass;
        this.diameter = diameter;
    }

    public String getName() {
        return this.name;
    }

    public int getDistanceToSun() {
        return this.distanceToSun;
    }

    public int getMass() {
        return this.mass;
    }

    public int getDiameter() {
        return this.diameter;
    }
}
