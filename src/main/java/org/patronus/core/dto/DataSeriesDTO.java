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
public class DataSeriesDTO {
    private int seriesid;
    private long dataindex;
    private double xvalue;
    private double yvalue;
    private double xvaluePos;
    private double yvaluePos;
    private double ycumulative;

    public int getSeriesid() {
        return seriesid;
    }

    public void setSeriesid(int seriesid) {
        this.seriesid = seriesid;
    }

    public long getDataindex() {
        return dataindex;
    }

    public void setDataindex(long dataindex) {
        this.dataindex = dataindex;
    }

    public double getXvalue() {
        return xvalue;
    }

    public void setXvalue(double xvalue) {
        this.xvalue = xvalue;
    }

    public double getYvalue() {
        return yvalue;
    }

    public void setYvalue(double yvalue) {
        this.yvalue = yvalue;
    }

    public double getXvaluePos() {
        return xvaluePos;
    }

    public void setXvaluePos(double xvaluePos) {
        this.xvaluePos = xvaluePos;
    }

    public double getYvaluePos() {
        return yvaluePos;
    }

    public void setYvaluePos(double yvaluePos) {
        this.yvaluePos = yvaluePos;
    }

    public double getYcumulative() {
        return ycumulative;
    }

    public void setYcumulative(double ycumulative) {
        this.ycumulative = ycumulative;
    }
    
}
