package org.google_pso;

import java.util.Map;

public class Labels {
    private String sinks;
    private String topology;
    private String dataformats;
    private String datasizecategory;
    private String datasize;
    private Map<String,String> additionallabels;

    public String getSinks() {
        return sinks;
    }

    public void setSinks(String sinks) {
        this.sinks = sinks;
    }

    public String getTopology() {
        return topology;
    }

    public void setTopology(String topology) {
        this.topology = topology;
    }

    public String getDataformats() {
        return dataformats;
    }

    public void setDataformats(String dataformats) {
        this.dataformats = dataformats;
    }

    public String getDatasizecategory() {
        return datasizecategory;
    }

    public void setDatasizecategory(String datasizecategory) {
        this.datasizecategory = datasizecategory;
    }

    public String getDatasize() {
        return datasize;
    }

    public void setDatasize(String datasize) {
        this.datasize = datasize;
    }

    public Map<String, String> getAdditionallabels() {
        return additionallabels;
    }

    public void setAdditionallabels(Map<String, String> additionallabels) {
        this.additionallabels = additionallabels;
    }
}
