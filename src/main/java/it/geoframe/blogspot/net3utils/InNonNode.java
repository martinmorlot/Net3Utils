package it.geoframe.blogspot.net3utils;

import java.util.HashMap;
import java.util.Map;

import oms3.annotations.Execute;
import oms3.annotations.In;
import oms3.annotations.Out;

public class InNonNode extends InputProcessing {

    @In public Map<Integer, double[]> inval1;
    @Out public Map<Integer, double[]> outval = new HashMap<Integer, double[]>();
    @In public Integer to_key;

    @Execute
    public void run() {
        for (Map.Entry<Integer, double[]> inMapEntry : inval1.entrySet()) {
            Integer key = inMapEntry.getKey();
            double[] val = inMapEntry.getValue();

            getSingleTimeStepData(to_key, val[0], outval);
            removeTimeStepFromBuffer(key, val, inval1);
        }
    }
}
