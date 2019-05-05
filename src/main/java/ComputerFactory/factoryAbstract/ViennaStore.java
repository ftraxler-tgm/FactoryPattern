package main.java.ComputerFactory.factoryAbstract;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-05-05
 * @project ComputerFactory
 */
public class ViennaStore extends ComputerStore {

    Computer createComputer(String type) {
        Computer c=null;
        PartsFactory partsFactory = new ViennaPartsFactory();
       if(type.equals("pc")){
           c=new PC(partsFactory);
           c.setName("Vienna PC");
       }else if(type.equals("gaming")){
           c=new Gaming(partsFactory);
           c.setName("Vienna Gaming");
       }
       return c;
    }
}
