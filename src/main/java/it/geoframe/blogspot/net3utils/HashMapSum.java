package it.geoframe.blogspot.net3utils;

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
import java.lang.Math;

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
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
    public Map<Integer, double[]> inHMFromAboveVert13;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert14;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
    public Map<Integer, double[]> inHMFromAboveVert15;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
    public Map<Integer, double[]> inHMFromAboveVert16;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert17;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert18;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert19;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert20;
		
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert21;
	
		
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert22;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
    public Map<Integer, double[]> inHMFromAboveVert23;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert24;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
    public Map<Integer, double[]> inHMFromAboveVert25;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
    public Map<Integer, double[]> inHMFromAboveVert26;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert27;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert28;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert29;
	
	@Description("Input hashmap (HM) from the above subbasin")
	@In
	public Map<Integer, double[]> inHMFromAboveVert30;
	
	@Description("Input hashmap (HM) of the current subbasin")
	@In
    public Map<Integer, double[]> inHMComputation1;
    
	@Description("Input hashmap (HM) of the current subbasin")
	@In
    public Map<Integer, double[]> inHMComputation2;

	@Description("Output hashmap (HM) computed as the sum of the input values of the HM provided as input. The HM ID is the ID of the current subbasin.")
	@Out
    public HashMap<Integer, double[]> outHMSum;
    
    @Description("Output log hashmap (HM) computed as the log of the sum of the input values of the HM provided as input. The HM ID is the ID of the current subbasin.")
	@Out
    public HashMap<Integer, double[]> outHMSumLog;
    
    @Description("Output sqrt hashmap (HM) computed as the log of the sum of the input values of the HM provided as input. The HM ID is the ID of the current subbasin.")
	@Out
    public HashMap<Integer, double[]> outHMSumSqrt;


    @Execute
    public void exec() {

        outHMSum = new HashMap<Integer, double[]>();
        outHMSumLog = new HashMap<Integer, double[]>();
        outHMSumSqrt = new HashMap<Integer, double[]>();

		Iterator<Entry<Integer, double[]>> iter;
		Entry<Integer, double[]> e;
//		Integer ID;
		Integer to_key = -9999;

		double value = 0.0;


		if( inHMFromAboveVert1!=null ){
			iter = inHMFromAboveVert1.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
			value += e.getValue()[0];
		}
	
		if( inHMFromAboveVert2!=null){
			iter = inHMFromAboveVert2.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
			value += e.getValue()[0];
		}
	
		if( inHMFromAboveVert3!=null){
			iter = inHMFromAboveVert3.entrySet().iterator();
			e = iter.next();
		    to_key = e.getKey();
		    value += e.getValue()[0];
		}
	
		if( inHMFromAboveVert4!=null){
			iter = inHMFromAboveVert4.entrySet().iterator();		
			e = iter.next();
			to_key = e.getKey();
			value += e.getValue()[0];
		}
	
		if( inHMFromAboveVert5!=null){
			iter = inHMFromAboveVert5.entrySet().iterator();		
			e = iter.next();
			to_key = e.getKey();
			value += e.getValue()[0];
		}
	
		if( inHMFromAboveVert6!=null){
			iter = inHMFromAboveVert6.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert7!=null){
			iter = inHMFromAboveVert7.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert8!=null){
			iter = inHMFromAboveVert8.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert9!=null){
			iter = inHMFromAboveVert9.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert10!=null){
			iter = inHMFromAboveVert10.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert11!=null){
			iter = inHMFromAboveVert11.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert12!=null){
			iter = inHMFromAboveVert12.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert13!=null){
			iter = inHMFromAboveVert13.entrySet().iterator();
			e = iter.next();
		    to_key = e.getKey();
		    value += e.getValue()[0];
		}
	
		if( inHMFromAboveVert14!=null){
			iter = inHMFromAboveVert14.entrySet().iterator();		
			e = iter.next();
			to_key = e.getKey();
			value += e.getValue()[0];
		}
	
		if( inHMFromAboveVert15!=null){
			iter = inHMFromAboveVert15.entrySet().iterator();		
			e = iter.next();
			to_key = e.getKey();
			value += e.getValue()[0];
		}
	
		if( inHMFromAboveVert16!=null){
			iter = inHMFromAboveVert16.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert17!=null){
			iter = inHMFromAboveVert17.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert18!=null){
			iter = inHMFromAboveVert18.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert19!=null){
			iter = inHMFromAboveVert19.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert20!=null){
			iter = inHMFromAboveVert20.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert21!=null){
			iter = inHMFromAboveVert21.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert22!=null){
			iter = inHMFromAboveVert22.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert23!=null){
			iter = inHMFromAboveVert23.entrySet().iterator();
			e = iter.next();
		    to_key = e.getKey();
		    value += e.getValue()[0];
		}
	
		if( inHMFromAboveVert24!=null){
			iter = inHMFromAboveVert24.entrySet().iterator();		
			e = iter.next();
			to_key = e.getKey();
			value += e.getValue()[0];
		}
	
		if( inHMFromAboveVert25!=null){
			iter = inHMFromAboveVert5.entrySet().iterator();		
			e = iter.next();
			to_key = e.getKey();
			value += e.getValue()[0];
		}
	
		if( inHMFromAboveVert26!=null){
			iter = inHMFromAboveVert26.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert27!=null){
			iter = inHMFromAboveVert27.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert28!=null){
			iter = inHMFromAboveVert28.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert29!=null){
			iter = inHMFromAboveVert29.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
		
		if( inHMFromAboveVert30!=null){
			iter = inHMFromAboveVert30.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
		    value += e.getValue()[0];
		}
	
	
		if( inHMComputation1!=null){
			iter = inHMComputation1.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
			value += e.getValue()[0];
		}

		if( inHMComputation2!=null){
			iter = inHMComputation2.entrySet().iterator();
			e = iter.next();
			to_key = e.getKey();
			value += e.getValue()[0];
		}

		outHMSum.put(to_key, new double[]{value});
		
		outHMSumLog.put(to_key, new double[]{Math.log10(value)});
		
		outHMSumSqrt.put(to_key, new double[]{Math.sqrt(value)});
    }

}

