package org.google_pso;

import java.util.HashMap;

public class JSONConfig {
    private String project;
    private String region;
    private String template;

    private String templateType;
    private String templatespec;
    private String jobName;
    private String jobDescription;

    private HashMap<String,String> pipelineOptions;
    private HashMap<String,String> labels;

    public String getProject() {
        return this.project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTemplate() {
        return this.template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }
    public String getTemplatespec() {
        return templatespec;
    }

    public void setTemplatespec(String templatespec) {
        this.templatespec = templatespec;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public HashMap<String, String> getPipelineOptions() {
        return pipelineOptions;
    }

    public void setPipelineOptions(HashMap<String, String> pipelineOptions) {
        this.pipelineOptions = pipelineOptions;
    }

    public HashMap<String, String> getLabels() {
        return labels;
    }

    public void setLabels(HashMap<String, String> labels) {
        this.labels = labels;
    }
}
