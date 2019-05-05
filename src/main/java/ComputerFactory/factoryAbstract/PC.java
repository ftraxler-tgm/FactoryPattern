package main.java.ComputerFactory.factoryAbstract;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-05-05
 * @project ComputerFactory
 */
public class PC extends Computer {

    PartsFactory partsFactory;

    public PC(PartsFactory partsFactory){
        name="Personal Computer";
        cpu=partsFactory.createCpu();
        gpu=partsFactory.createGpu();
        ram=partsFactory.createRam();
        ssd=partsFactory.createSsd();

    }
}
