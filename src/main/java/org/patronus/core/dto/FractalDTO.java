/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patronus.core.dto;

import java.util.List;
import java.util.Map;
import org.hedwig.cms.dto.CMSDTO;


/**
 *
 * @author dgrfiv
 */

public class FractalDTO extends CMSDTO{


    private String paramSlug;
    private String dataSeriesSlug;
    private String dataSeriesSlugSecond;
    
    
    private Map<String, Object> fractalTermInstance;

    private String calcType;
    private String csvFilePath;
    private List<IpsvgResultsDTO> ipsvgResultsDTOs;
    private List<MFDFAResultDTO> mfdfaResultDTOs;
    private List<DFAResultDTO> dfaResultDTOs;
    private List<PSVGResultDTO> psvgResultDTOs;
    private List<DataSeriesDTO> dataseriesDTOList;





    
    public String getParamSlug() {
        return paramSlug;
    }

    public void setParamSlug(String paramSlug) {
        this.paramSlug = paramSlug;
    }

    
    public String getDataSeriesSlug() {
        return dataSeriesSlug;
    }

    public void setDataSeriesSlug(String dataSeriesSlug) {
        this.dataSeriesSlug = dataSeriesSlug;
    }

    
    public String getDataSeriesSlugSecond() {
        return dataSeriesSlugSecond;
    }

    public void setDataSeriesSlugSecond(String dataSeriesSlugSecond) {
        this.dataSeriesSlugSecond = dataSeriesSlugSecond;
    }

    public Map<String, Object> getFractalTermInstance() {
        return fractalTermInstance;
    }

    public void setFractalTermInstance(Map<String, Object> fractalTermInstance) {
        this.fractalTermInstance = fractalTermInstance;
    }


    


    
    public String getCalcType() {
        return calcType;
    }

    public void setCalcType(String calcType) {
        this.calcType = calcType;
    }

    
    public String getCsvFilePath() {
        return csvFilePath;
    }

    public void setCsvFilePath(String csvFilePath) {
        this.csvFilePath = csvFilePath;
    }

    public List<IpsvgResultsDTO> getIpsvgResultsDTOs() {
        return ipsvgResultsDTOs;
    }

    public void setIpsvgResultsDTOs(List<IpsvgResultsDTO> ipsvgResultsDTOs) {
        this.ipsvgResultsDTOs = ipsvgResultsDTOs;
    }

    public List<MFDFAResultDTO> getMfdfaResultDTOs() {
        return mfdfaResultDTOs;
    }

    public void setMfdfaResultDTOs(List<MFDFAResultDTO> mfdfaResultDTOs) {
        this.mfdfaResultDTOs = mfdfaResultDTOs;
    }

    public List<PSVGResultDTO> getPsvgResultDTOs() {
        return psvgResultDTOs;
    }

    public void setPsvgResultDTOs(List<PSVGResultDTO> psvgResultDTOs) {
        this.psvgResultDTOs = psvgResultDTOs;
    }

    public List<DataSeriesDTO> getDataseriesDTOList() {
        return dataseriesDTOList;
    }

    public void setDataseriesDTOList(List<DataSeriesDTO> dataseriesDTOList) {
        this.dataseriesDTOList = dataseriesDTOList;
    }

    public List<DFAResultDTO> getDfaResultDTOs() {
        return dfaResultDTOs;
    }

    public void setDfaResultDTOs(List<DFAResultDTO> dfaResultDTOs) {
        this.dfaResultDTOs = dfaResultDTOs;
    }

    
}
