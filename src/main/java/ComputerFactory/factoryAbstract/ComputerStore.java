package main.java.ComputerFactory.factoryAbstract;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-05-05
 * @project ComputerFactory
 */
public abstract class ComputerStore {


    abstract Computer createComputer(String type);

    public Computer orderComputer(String type){
        Computer c = createComputer(type);
        c.connect();
        c.start();
        return c;
    }
}
