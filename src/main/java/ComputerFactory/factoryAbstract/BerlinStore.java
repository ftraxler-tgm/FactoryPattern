package main.java.ComputerFactory.factoryAbstract;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-05-05
 * @project ComputerFactory
 */
public class BerlinStore extends ComputerStore {


    Computer createComputer(String type) {
        Computer c=null;
        BerlinPartsFactory berlinPartsFactory = new BerlinPartsFactory();
        if(type.equals("pc")){
            c=new PC(berlinPartsFactory);
            c.setName("Berlin PC");

        }else if(type.equals("gaming")){
            c=new Gaming(berlinPartsFactory);
            c.setName("Berlin Gaming");
        }
        return c;
    }


}
