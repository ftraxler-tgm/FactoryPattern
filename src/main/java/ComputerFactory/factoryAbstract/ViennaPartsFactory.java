package main.java.ComputerFactory.factoryAbstract;

import main.java.ComputerFactory.factoryAbstract.parts.*;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-05-05
 * @project ComputerFactory
 */
public class ViennaPartsFactory implements PartsFactory {

    @Override
    public Cpu createCpu() {
        return new Intel();
    }

    @Override
    public Gpu createGpu() {
        return new Nvidia();
    }

    @Override
    public Ram createRam() {
        return new DDR3();
    }

    @Override
    public Ssd createSsd() {
        return new Samsung();
    }

    @Override
    public Cooling createCooling() {
        return new Air();
    }
}
