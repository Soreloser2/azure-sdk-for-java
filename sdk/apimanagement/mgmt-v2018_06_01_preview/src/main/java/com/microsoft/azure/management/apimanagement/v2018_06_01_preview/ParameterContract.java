/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operation parameters details.
 */
public class ParameterContract {
    /**
     * Parameter name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Parameter description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Parameter type.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Default parameter value.
     */
    @JsonProperty(value = "defaultValue")
    private String defaultValue;

    /**
     * whether parameter is required or not.
     */
    @JsonProperty(value = "required")
    private Boolean required;

    /**
     * Parameter values.
     */
    @JsonProperty(value = "values")
    private List<String> values;

    /**
     * Get parameter name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set parameter name.
     *
     * @param name the name value to set
     * @return the ParameterContract object itself.
     */
    public ParameterContract withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get parameter description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set parameter description.
     *
     * @param description the description value to set
     * @return the ParameterContract object itself.
     */
    public ParameterContract withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get parameter type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set parameter type.
     *
     * @param type the type value to set
     * @return the ParameterContract object itself.
     */
    public ParameterContract withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get default parameter value.
     *
     * @return the defaultValue value
     */
    public String defaultValue() {
        return this.defaultValue;
    }

    /**
     * Set default parameter value.
     *
     * @param defaultValue the defaultValue value to set
     * @return the ParameterContract object itself.
     */
    public ParameterContract withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * Get whether parameter is required or not.
     *
     * @return the required value
     */
    public Boolean required() {
        return this.required;
    }

    /**
     * Set whether parameter is required or not.
     *
     * @param required the required value to set
     * @return the ParameterContract object itself.
     */
    public ParameterContract withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * Get parameter values.
     *
     * @return the values value
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set parameter values.
     *
     * @param values the values value to set
     * @return the ParameterContract object itself.
     */
    public ParameterContract withValues(List<String> values) {
        this.values = values;
        return this;
    }

}
