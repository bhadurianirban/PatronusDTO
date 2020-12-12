/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patronus.core.dto;

/**
 *
 * @author bhaduri
 */
public class DFAResultDTO {

    private String mfdfaresulsslug;
    private int resultid;
    private double scale;
    private double fluctuations;

    public String getMfdfaresulsslug() {
        return mfdfaresulsslug;
    }

    public void setMfdfaresulsslug(String mfdfaresulsslug) {
        this.mfdfaresulsslug = mfdfaresulsslug;
    }

    public int getResultid() {
        return resultid;
    }

    public void setResultid(int resultid) {
        this.resultid = resultid;
    }

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public double getFluctuations() {
        return fluctuations;
    }

    public void setFluctuations(double fluctuations) {
        this.fluctuations = fluctuations;
    }
    
}
