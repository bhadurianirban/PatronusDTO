/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patronus.response;

import org.hedwig.cloud.response.HedwigResponseCode;

/**
 *
 * @author bhaduri
 */
public class FractalResponseCode extends HedwigResponseCode{
    //dataseries responses

    public static int DATA_SERIES_SOME_X_VALUES_MISSING=401;
    public static int DATA_SERIES_SOME_Y_VALUES_MISSING=402;
    public static int DATA_SERIES_UPDATE_ERROR=403;
    public static int DATA_SERIES_UPDATE_CONCURRENCY_PROBLEM=404;
    public static int DATA_SERIES_SEVERE=405;
    public static int DATA_SERIES_FORMAT_PROBLEM=406;
}
