package com.site.joshsurette;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class SuretteConfiguration extends Configuration {

    @NotEmpty
    private String esHost;

    @NotEmpty
    private String esPort;

    @NotEmpty
    private String clusterName;

    @NotEmpty
    private String allowedOrigin;

    @JsonProperty("elasticSearchHost")
    public String getEsHost() {
        return esHost;
    }

    @JsonProperty("elasticSearchHost")
    public void setEsHost(String esHost) {
        this.esHost = esHost;
    }

    @JsonProperty("elasticSearchPort")
    public String getEsPort() {
        return esPort;
    }

    @JsonProperty("elasticSearchPort")
    public void setEsPort(String esPort) {
        this.esPort = esPort;
    }

    @JsonProperty("elasticSearchCluster")
    public String getClusterName() {
        return clusterName;
    }

    @JsonProperty("elasticSearchCluster")
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    @JsonProperty("allowedOrigin")
    public String getAllowedOrigin() { return allowedOrigin; }

    @JsonProperty("allowedOrigin")
    public void setAllowedOrigin(String allowedOrigin) { this.allowedOrigin = allowedOrigin; }
}
