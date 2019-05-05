package main.java.ComputerFactory.factoryAbstract;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-05-05
 * @project ComputerFactory
 */
public class Gaming extends Computer {

    PartsFactory partsFactory;
    public Gaming(PartsFactory partsFactory){
        this.partsFactory=partsFactory;

        name="Gaming";
        cpu=partsFactory.createCpu();
        gpu=partsFactory.createGpu();
        ram=partsFactory.createRam();
        ssd=partsFactory.createSsd();
        cooling=partsFactory.createCooling();
    }
}
