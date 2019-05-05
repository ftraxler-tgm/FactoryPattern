package main.java.ComputerFactory.factoryMethod;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-05-05
 * @project ComputerFactory
 */
public abstract class Computer {
    String name;
    String cpu;
    String gpu;
    String ram;
    String ssd;


    public String getName() {
        return name;
    }
    public void connect(){System.out.println("Cables connected");}
    public void start(){System.out.println("Successfully started");}


    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                '}';
    }
}
