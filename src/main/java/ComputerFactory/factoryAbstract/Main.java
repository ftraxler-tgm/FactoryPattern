package main.java.ComputerFactory.factoryAbstract;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-05-05
 * @project ComputerFactory
 */
public class Main {

    public static void main(String[] args){
        ComputerStore viennaStore = new ViennaStore();
        ComputerStore berlinStore = new BerlinStore();

        Computer computer = viennaStore.orderComputer("pc");
        System.out.println(computer+"\n");

        computer = berlinStore.orderComputer("pc");
        System.out.println(computer+"\n");

        computer = viennaStore.orderComputer("gaming");
        System.out.println(computer+"\n");

        computer = berlinStore.orderComputer("gaming");
        System.out.println(computer+"\n");
    }
}
