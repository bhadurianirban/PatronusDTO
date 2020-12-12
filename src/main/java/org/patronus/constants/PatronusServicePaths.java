/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patronus.constants;

import org.hedwig.leviosa.constants.CMSServicePaths;

/**
 *
 * @author bhaduri
 */
public class PatronusServicePaths extends CMSServicePaths{
    public static final String PATRONUS_SERVER = "localhost";
    public static final String PATRONUS_PORT = "8080";
    public static final String PATRONUS_BASE_URI = "PatronusCoreService/rest";
    
    public static final String IMPROVED_PSVG_BASE = "ipsvgcalc";
    
    public static final String CALCULATE_IMPROVED_PSVG = "improved";
    public static final String QUEUE_IMPROVED_PSVG = "queueImproved";
    public static final String DELETE_IMPROVED_PSVG = "deleteIpsvg";
    public static final String GET_IMPROVED_PSVG_RESULTS = "ipsvgResults";
    
    public static final String MFDFA_BASE = "mfdfacalc";
    
    public static final String CALCULATE_MFDFA = "mfdfa";
    public static final String QUEUE_MFDFA_RESULTS = "queuemfdfa";
    public static final String GET_MFDFA_RESULTS = "mfdfaresults";
    public static final String GET_DFA_RESULTS = "dfaresults";
    public static final String DELETE_MFDFA_RESULTS = "deletemfdfa";
    
    public static final String PSVG_BASE = "psvgcalc";
    
    public static final String CALCULATE_PSVG = "psvg";
    public static final String QUEUE_PSVG_RESULTS = "queuepsvg";
    public static final String GET_PSVG_RESULTS = "psvgResults";
    public static final String DELETE_PSVG_RESULTS = "deletepsvg";
    public static final String DELETE_PSVG_VG = "delvisibilitygraph";
    
    public static final String MFDXA_BASE = "mfdxacalc";
    
    public static final String CALCULATE_MFDXA = "mfdxa";
    public static final String QUEUE_MFDXA_RESULTS = "queuemfdxa";
    
    public static final String DATA_SERIES_BASE = "dataseries";
    public static final String DELETE_DATA_SERIES = "delete";
    public static final String GET_DATA_SERIES = "getseries";
    public static final String UPLOAD_DATA_SERIES = "dataseriesupload";
    public static final String CREATE_DATA_SERIES_CMS_INSTANCE = "createseriescms";
    
    public static final String GRAPH_BASE = "graphbase";
    
    public static final String GRAPH_IMPORT_FROM_VG = "importfromvg";
    public static final String GRAPH_DELETE = "deletegraph";
    public static final String GRAPH_UPLOAD = "uploadgraph";
    
    public static final String NETWORK_STATS_CALCULATION = "networkstats";
    public static final String NETWORK_STATS_DELETE = "networkstatsdel";

    
}
