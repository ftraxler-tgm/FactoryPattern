package main.java.ComputerFactory.factoryAbstract;

import main.java.ComputerFactory.factoryAbstract.parts.*;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-05-05
 * @project ComputerFactory
 */
public interface PartsFactory {
    public Cpu createCpu();
    public Gpu createGpu();
    public Ram createRam();
    public Ssd createSsd();
    public Cooling createCooling();
}
