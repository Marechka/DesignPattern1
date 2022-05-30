package activityMonitor.adapters;

import activityMonitor.SensorI;
import libs.CpuUtilizationSensor;

public class cpuUtilAdapter implements SensorI {
    private CpuUtilizationSensor cpu;

    cpuUtilAdapter( CpuUtilizationSensor cpu) {
        this.cpu = cpu;
    }

    public double getValue() {
        
        return cpu.readValue();
    }

    public String report() {
        return cpu.getReport();
    }


    public String getColor() {
        r
    }



}
