/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_03_31_preview;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Task level output for the task that validates connection to SQL Server and
 * also validates source server requirements.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("TaskLevelOutput")
public class ConnectToSourceSqlServerTaskOutputTaskLevel extends ConnectToSourceSqlServerTaskOutput {
    /**
     * Source databases as a map from database name to database id.
     */
    @JsonProperty(value = "databases", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> databases;

    /**
     * Source logins as a map from login name to login id.
     */
    @JsonProperty(value = "Logins", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> logins;

    /**
     * Source agent jobs as a map from agent job name to id.
     */
    @JsonProperty(value = "AgentJobs", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> agentJobs;

    /**
     * Source server version.
     */
    @JsonProperty(value = "sourceServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerVersion;

    /**
     * Source server brand version.
     */
    @JsonProperty(value = "sourceServerBrandVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerBrandVersion;

    /**
     * Validation errors.
     */
    @JsonProperty(value = "validationErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> validationErrors;

    /**
     * Get source databases as a map from database name to database id.
     *
     * @return the databases value
     */
    public Map<String, String> databases() {
        return this.databases;
    }

    /**
     * Get source logins as a map from login name to login id.
     *
     * @return the logins value
     */
    public Map<String, String> logins() {
        return this.logins;
    }

    /**
     * Get source agent jobs as a map from agent job name to id.
     *
     * @return the agentJobs value
     */
    public Map<String, String> agentJobs() {
        return this.agentJobs;
    }

    /**
     * Get source server version.
     *
     * @return the sourceServerVersion value
     */
    public String sourceServerVersion() {
        return this.sourceServerVersion;
    }

    /**
     * Get source server brand version.
     *
     * @return the sourceServerBrandVersion value
     */
    public String sourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }

    /**
     * Get validation errors.
     *
     * @return the validationErrors value
     */
    public List<ReportableException> validationErrors() {
        return this.validationErrors;
    }

}