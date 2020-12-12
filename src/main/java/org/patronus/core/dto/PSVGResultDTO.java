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
public class PSVGResultDTO {
    private String psvgresultsslug;
    private int resultid;
    private Integer degreeval;
    private Integer nodeswithdegval;
    private Double probofdegreeval;
    private Double logofdegreeval;
    private Double logofprobofdegreeval;
    private Short required;

    public String getPsvgresultsslug() {
        return psvgresultsslug;
    }

    public void setPsvgresultsslug(String psvgresultsslug) {
        this.psvgresultsslug = psvgresultsslug;
    }

    public int getResultid() {
        return resultid;
    }

    public void setResultid(int resultid) {
        this.resultid = resultid;
    }

    public Integer getDegreeval() {
        return degreeval;
    }

    public void setDegreeval(Integer degreeval) {
        this.degreeval = degreeval;
    }

    public Integer getNodeswithdegval() {
        return nodeswithdegval;
    }

    public void setNodeswithdegval(Integer nodeswithdegval) {
        this.nodeswithdegval = nodeswithdegval;
    }

    public Double getProbofdegreeval() {
        return probofdegreeval;
    }

    public void setProbofdegreeval(Double probofdegreeval) {
        this.probofdegreeval = probofdegreeval;
    }

    public Double getLogofdegreeval() {
        return logofdegreeval;
    }

    public void setLogofdegreeval(Double logofdegreeval) {
        this.logofdegreeval = logofdegreeval;
    }

    public Double getLogofprobofdegreeval() {
        return logofprobofdegreeval;
    }

    public void setLogofprobofdegreeval(Double logofprobofdegreeval) {
        this.logofprobofdegreeval = logofprobofdegreeval;
    }

    public Short getRequired() {
        return required;
    }

    public void setRequired(Short required) {
        this.required = required;
    }
    
}
