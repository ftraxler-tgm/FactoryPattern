package main.java.ComputerFactory.factoryAbstract;

import main.java.ComputerFactory.factoryAbstract.parts.*;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-05-05
 * @project ComputerFactory
 */
public class BerlinPartsFactory implements PartsFactory {
    @Override
    public Cpu createCpu() {
        return new Amd();
    }

    @Override
    public Gpu createGpu() {
        return new AmdG();
    }

    @Override
    public Ram createRam() {
        return new DDR4();
    }

    @Override
    public Ssd createSsd() {
        return new Kingston();
    }

    @Override
    public Cooling createCooling() {
        return new Water();
    }
}
