package main.java.ComputerFactory.factorySimple;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-05-05
 * @project ComputerFactory
 */
public class Main {


    public static void main(String[] args){
        ComputerFactory factory = new ComputerFactory();
        ComputerStore store = new ComputerStore(factory);

        Computer pc = store.orderComputer("pc");
        System.out.println(pc.getName());

        Computer gaming = store.orderComputer("gaming");
        System.out.println(gaming.getName());

    }

}
