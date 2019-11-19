/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_01_01.ExportResultFormat;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ApiExportResultValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * API Export result.
 */
public class ApiExportResultInner {
    /**
     * ResourceId of the API which was exported.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Format in which the Api Details are exported to the Storage Blob with
     * Sas Key valid for 5 minutes. Possible values include: 'Swagger', 'Wsdl',
     * 'Wadl', 'OpenApi'.
     */
    @JsonProperty(value = "format")
    private ExportResultFormat exportResultFormat;

    /**
     * The object defining the schema of the exported Api Detail.
     */
    @JsonProperty(value = "value")
    private ApiExportResultValue value;

    /**
     * Get resourceId of the API which was exported.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resourceId of the API which was exported.
     *
     * @param id the id value to set
     * @return the ApiExportResultInner object itself.
     */
    public ApiExportResultInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get format in which the Api Details are exported to the Storage Blob with Sas Key valid for 5 minutes. Possible values include: 'Swagger', 'Wsdl', 'Wadl', 'OpenApi'.
     *
     * @return the exportResultFormat value
     */
    public ExportResultFormat exportResultFormat() {
        return this.exportResultFormat;
    }

    /**
     * Set format in which the Api Details are exported to the Storage Blob with Sas Key valid for 5 minutes. Possible values include: 'Swagger', 'Wsdl', 'Wadl', 'OpenApi'.
     *
     * @param exportResultFormat the exportResultFormat value to set
     * @return the ApiExportResultInner object itself.
     */
    public ApiExportResultInner withExportResultFormat(ExportResultFormat exportResultFormat) {
        this.exportResultFormat = exportResultFormat;
        return this;
    }

    /**
     * Get the object defining the schema of the exported Api Detail.
     *
     * @return the value value
     */
    public ApiExportResultValue value() {
        return this.value;
    }

    /**
     * Set the object defining the schema of the exported Api Detail.
     *
     * @param value the value value to set
     * @return the ApiExportResultInner object itself.
     */
    public ApiExportResultInner withValue(ApiExportResultValue value) {
        this.value = value;
        return this;
    }

}