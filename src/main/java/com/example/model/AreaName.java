package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AreaName {
    @JsonProperty("Connection")
    CONNECTION("Connection"),
    @JsonProperty("Relationships")
    REALATIONSHIPS("Relationships"),
    @JsonProperty("Career")
    CAREER("Career"),
    @JsonProperty("Wealth")
    WEALTH("Wealth");

    private String area;

    public String getAreaName()
    {
        return this.area;
    }

    private AreaName(String area) {
        this.area = area;
    }
}
