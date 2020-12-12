/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patronus.core.dto;

import java.util.Map;
import org.hedwig.cms.dto.CMSDTO;

/**
 *
 * @author dgrfi
 */
public class GraphDTO extends CMSDTO{
    private String importFromVGInstanceSlug;
    private String graphTermInstanceSlug;
    private Map<String, Object> graphTermInstance;

    public String getImportFromVGInstanceSlug() {
        return importFromVGInstanceSlug;
    }

    public void setImportFromVGInstanceSlug(String importFromVGInstanceSlug) {
        this.importFromVGInstanceSlug = importFromVGInstanceSlug;
    }

    public String getGraphTermInstanceSlug() {
        return graphTermInstanceSlug;
    }

    public void setGraphTermInstanceSlug(String graphTermInstanceSlug) {
        this.graphTermInstanceSlug = graphTermInstanceSlug;
    }

    public Map<String, Object> getGraphTermInstance() {
        return graphTermInstance;
    }

    public void setGraphTermInstance(Map<String, Object> graphTermInstance) {
        this.graphTermInstance = graphTermInstance;
    }
    
    
    
    
}
