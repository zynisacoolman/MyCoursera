package com.example.zyn.mycoursera;

/**
 * Created by zyn on 15-6-18.
 */
public class courseBean {
    /**
     *
     */
    private String name;
    private String smallIcon;
    private String universities;
    private String estimatedClassWorkload;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSmallIcon() {
        return smallIcon;
    }

    public void setSmallIcon(String smallIcon) {
        this.smallIcon = smallIcon;
    }

    public String getUniversities() {
        return universities;
    }

    public void setUniversities(String universities) {
        this.universities = universities;
    }

    public String getWorkloads() {
        return estimatedClassWorkload;
    }

    public void setWorkloads(String workloads) {
        this.estimatedClassWorkload = workloads;
    }
}
