package it.geoframe.blogspot.net3utils;
 
/*
 * $Id$
 * 
 * This file is part of the Object Modeling System (OMS),
 * 2007-2011, Olaf David, Colorado State University
 *
 * OMS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * OMS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with OMS.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.Map;

/**
 *
 * @author sidereus
 */
public abstract class InputProcessing {

    protected void getSingleTimeStepData(Integer key, double val, Map<Integer, double[]> outval) {
        double[] tmpval = new double[]{val};
        outval.put(key, tmpval);
    }

    protected void removeTimeStepFromBuffer(Integer key, double[] val, Map<Integer, double[]> inval) {
        double[] newval = new double[val.length - 1];
        System.arraycopy(val, 1, newval, 0, newval.length);
        inval.replace(key, newval);
    }

}
