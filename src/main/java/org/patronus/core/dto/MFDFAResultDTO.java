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
public class MFDFAResultDTO {
    private String mfdfaresulsslug;
    private int resultid;
    private double hq;
    private double dq;

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

    public double getHq() {
        return hq;
    }

    public void setHq(double hq) {
        this.hq = hq;
    }

    public double getDq() {
        return dq;
    }

    public void setDq(double dq) {
        this.dq = dq;
    }
    
}
