package main.java.ComputerFactory.factorySimple;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-05-05
 * @project ComputerFactory
 */
public class ComputerFactory {

    public Computer createComputer(String type){
        Computer c = null;

        if(type.equals("pc")){
            c=new PC();

        }else if(type.equals("gaming")){
            c=new Gaming();
        }
        return c;
    }
}
