package main.java.ComputerFactory.factoryMethod;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-05-05
 * @project ComputerFactory
 */
public class ViennaStore extends ComputerStore{

    Computer createComputer(String type) {
        Computer c=null;
       if(type.equals("pc")){
           c=new ViennaPC();
       }else if(type.equals("gaming")){
           c=new ViennaGaming();
       }
       return c;
    }
}
