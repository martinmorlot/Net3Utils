package it.geoframe.blospot.net3utils;

/*
 * GNU GPL v3 License
 *
 * Copyright 2021 Riccardo Rigon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * 
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import oms3.annotations.*;

/**
 *
 * @author Niccolo' Tubini
 *
 */
public class HashMapSum {

	@Description("Input hashmap (HM) from the above subbasin")
	@In
    public Map<Integer, double[]> inHMFromAboveVert1;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert2;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
    public Map<Integer, double[]> inHMFromAboveVert3;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
    public Map<Integer, double[]> inHMFromAboveVert4;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
    public Map<Integer, double[]> inHMFromAboveVert5;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
    public Map<Integer, double[]> inHMFromAboveVert6;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert7;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert8;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert9;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert10;
		
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert11;
		
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert12;
	
	@Description("Input hashmap (HM) of the current subbasin")
	@In
    public Map<Integer, double[]> inHMComputation;

	@Description("Output hashmap (HM) computed as the sum of the input values of the HM provided as input. The HM ID is the ID of the current subbasin.")
	@Out
    public HashMap<Integer, double[]> outHMSum;

    @Execute
    public void exec() {

        outHMSum = new HashMap<Integer, double[]>();

		Iterator<Entry<Integer, double[]>> iter;
		Entry<Integer, double[]> e;
		Integer ID;
		double value = 0.0;


		if( inHMFromAboveVert1!=null ){
			iter = inHMFromAboveVert1.entrySet().iterator();
			e = iter.next();
			ID = e.getKey();
			value += e.getValue()[0];
		}
	
		if( inHMFromAboveVert2!=null){
			iter = inHMFromAboveVert2.entrySet().iterator();
			e = iter.next();
			ID = e.getKey();
			value += e.getValue()[0];
		}
	
		if( inHMFromAboveVert3!=null){
			iter = inHMFromAboveVert3.entrySet().iterator();
			e = iter.next();
		    ID = e.getKey();
		    value += e.getValue()[0];
		}
	
		if( inHMFromAboveVert4!=null){
			iter = inHMFromAboveVert4.entrySet().iterator();		
			e = iter.next();
			ID = e.getKey();
			value += e.getValue()[0];
		}
	
		if( inHMFromAboveVert5!=null){
			iter = inHMFromAboveVert5.entrySet().iterator();		
			e = iter.next();
			ID = e.getKey();
			value += e.getValue()[0];
		}
	
		if( inHMFromAboveVert6!=null){
			iter = inHMFromAboveVert6.entrySet().iterator();
			e = iter.next();
			ID = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert7!=null){
			iter = inHMFromAboveVert7.entrySet().iterator();
			e = iter.next();
			ID = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert8!=null){
			iter = inHMFromAboveVert8.entrySet().iterator();
			e = iter.next();
			ID = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert9!=null){
			iter = inHMFromAboveVert9.entrySet().iterator();
			e = iter.next();
			ID = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert10!=null){
			iter = inHMFromAboveVert10.entrySet().iterator();
			e = iter.next();
			ID = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert11!=null){
			iter = inHMFromAboveVert11.entrySet().iterator();
			e = iter.next();
			ID = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert12!=null){
			iter = inHMFromAboveVert12.entrySet().iterator();
			e = iter.next();
			ID = e.getKey();
		    value += e.getValue()[0];
		}
	
	
	    Iterator<Entry<Integer, double[]>> iterComputation = inHMComputation.entrySet().iterator();
		Entry<Integer, double[]> eComputation = iterComputation.next();
		Integer keyComputation = eComputation.getKey();
		double valComputation = eComputation.getValue()[0];
		outHMSum.put(keyComputation, new double[]{valComputation+value});


    }

}

