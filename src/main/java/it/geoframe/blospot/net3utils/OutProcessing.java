package it.geoframe.blospot.net3utils;

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
public abstract class OutProcessing {

    protected void addTimeStepValue(Integer key, double val, Map<Integer, double[]> outval) {
        if (outval.containsKey(key)) add(key, val, outval);
        else outval.put(key, new double[]{val});
    }

	private void add(final Integer key, final double val, final Map<Integer, double[]> outval) {
        double[] valFromOut = outval.get(key);
        double[] tmpval = new double[valFromOut.length+1];
        System.arraycopy(valFromOut, 0, tmpval, 0, valFromOut.length);
        tmpval[tmpval.length - 1] = val;
		outval.replace(key, tmpval);
	}

}
