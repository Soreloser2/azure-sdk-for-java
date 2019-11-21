/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation.ApplicationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation.HDInsightManager;
import java.util.Map;

/**
 * Type representing Application.
 */
public interface Application extends HasInner<ApplicationInner>, Indexable, Refreshable<Application>, Updatable<Application.Update>, HasManager<HDInsightManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    ApplicationProperties properties();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Application definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCluster, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Application definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Application definition.
         */
        interface Blank extends WithCluster {
        }

        /**
         * The stage of the application definition allowing to specify Cluster.
         */
        interface WithCluster {
           /**
            * Specifies resourceGroupName, clusterName.
            * @param resourceGroupName The name of the resource group
            * @param clusterName The name of the cluster
            * @return the next definition stage
            */
            WithCreate withExistingCluster(String resourceGroupName, String clusterName);
        }

        /**
         * The stage of the application definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag The ETag for the application
             * @return the next definition stage
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the application definition allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties The properties of the application
             * @return the next definition stage
             */
            WithCreate withProperties(ApplicationProperties properties);
        }

        /**
         * The stage of the application definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags for the application
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Application>, DefinitionStages.WithEtag, DefinitionStages.WithProperties, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a Application update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Application>, UpdateStages.WithEtag, UpdateStages.WithProperties, UpdateStages.WithTags {
    }

    /**
     * Grouping of Application update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the application update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag The ETag for the application
             * @return the next update stage
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the application update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties The properties of the application
             * @return the next update stage
             */
            Update withProperties(ApplicationProperties properties);
        }

        /**
         * The stage of the application update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags for the application
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}