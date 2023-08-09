package org.google_pso;

import java.util.HashMap;
import java.util.Map;

public class JSONConfig {
    private String project;
    private String region;
    private String template;

    private String templateType;
    private String templatespec;
    private String jobName;
    private String jobDescription;

    private Map<String,String> pipelineOptions;
    private Labels labels;

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

    public Map<String, String> getPipelineOptions() {
        return pipelineOptions;
    }

    public void setPipelineOptions(Map<String, String> pipelineOptions) {
        this.pipelineOptions = pipelineOptions;
    }

    public Labels getLabels() {
        return labels;
    }

    public void setLabels(Labels labels) {
        this.labels = labels;
    }
}
