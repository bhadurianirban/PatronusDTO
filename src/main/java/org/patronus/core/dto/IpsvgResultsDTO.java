/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patronus.core.dto;

/**
 *
 * @author dgrfiv
 */
public class IpsvgResultsDTO {
    private String ipsvgResultsSlug;
    private int resultId;
    private int lengthOfGaps;
    private double psvgForGaps;

    public String getIpsvgResultsSlug() {
        return ipsvgResultsSlug;
    }

    public void setIpsvgResultsSlug(String ipsvgResultsSlug) {
        this.ipsvgResultsSlug = ipsvgResultsSlug;
    }

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public int getLengthOfGaps() {
        return lengthOfGaps;
    }

    public void setLengthOfGaps(int lengthOfGaps) {
        this.lengthOfGaps = lengthOfGaps;
    }

    public double getPsvgForGaps() {
        return psvgForGaps;
    }

    public void setPsvgForGaps(double psvgForGaps) {
        this.psvgForGaps = psvgForGaps;
    }
    
}
