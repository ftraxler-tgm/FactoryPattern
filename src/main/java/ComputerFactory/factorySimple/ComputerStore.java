package main.java.ComputerFactory.factorySimple;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-05-05
 * @project ComputerFactory
 */
public class ComputerStore {
    ComputerFactory  factory;

    public ComputerStore(ComputerFactory factory){
        this.factory=factory;
    }
    public  Computer orderComputer(String type){
        Computer c;
        c=factory.createComputer(type);
        c.connect();
        c.start();

        return c;
    }
}
