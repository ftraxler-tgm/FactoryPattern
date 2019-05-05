package main.java.ComputerFactory.factoryMethod;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-05-05
 * @project ComputerFactory
 */
public class Main {

    public static void main(String[] args){
        ComputerStore vstore = new ViennaStore();
        ComputerStore bstore = new BerlinStore();

        Computer vpc=vstore.orderComputer("pc");
        System.out.println(vpc.getName()+"\n");

        Computer bpc=bstore.orderComputer("pc");
        System.out.println(bpc.getName()+"\n");

        Computer vgaming = vstore.orderComputer("gaming");
        System.out.println(vgaming.getName()+"\n");



        Computer bgaming = bstore.orderComputer("gaming");
        System.out.println(bgaming.getName()+"\n");

    }
}
