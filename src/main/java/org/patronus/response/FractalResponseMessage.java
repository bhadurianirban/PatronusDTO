/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patronus.response;

import org.hedwig.cloud.response.HedwigResponseCode;
import org.hedwig.cloud.response.HedwigResponseMessage;

/**
 *
 * @author bhaduri
 */
public class FractalResponseMessage extends HedwigResponseMessage{

    public FractalResponseMessage() {
        responseMessageMap.put(FractalResponseCode.DATA_SERIES_SOME_X_VALUES_MISSING,"The series is a XY series but some X values are missing.");
        responseMessageMap.put(FractalResponseCode.DATA_SERIES_SOME_Y_VALUES_MISSING,"The series is a XY series but some Y values are missing.");
        responseMessageMap.put(FractalResponseCode.DATA_SERIES_UPDATE_ERROR,"Problem loading table from temp file.");
        responseMessageMap.put(FractalResponseCode.DATA_SERIES_UPDATE_CONCURRENCY_PROBLEM,"Concurrency problem. Please try again after some time.");
        responseMessageMap.put(FractalResponseCode.DATA_SERIES_SEVERE,"Fatal error contact admin.");
        responseMessageMap.put(FractalResponseCode.DATA_SERIES_FORMAT_PROBLEM,"Dataseries format problem.Check Guidelines");
    }
    
}
