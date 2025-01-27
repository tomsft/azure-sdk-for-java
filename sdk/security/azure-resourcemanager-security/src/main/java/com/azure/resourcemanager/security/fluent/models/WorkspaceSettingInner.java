// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Configures where to store the OMS agent data for workspaces under a scope.
 */
@Fluent
public final class WorkspaceSettingInner extends ProxyResource {
    /*
     * Workspace setting data
     */
    private WorkspaceSettingProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of WorkspaceSettingInner class.
     */
    public WorkspaceSettingInner() {
    }

    /**
     * Get the innerProperties property: Workspace setting data.
     * 
     * @return the innerProperties value.
     */
    private WorkspaceSettingProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the workspaceId property: The full Azure ID of the workspace to save the data in.
     * 
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.innerProperties() == null ? null : this.innerProperties().workspaceId();
    }

    /**
     * Set the workspaceId property: The full Azure ID of the workspace to save the data in.
     * 
     * @param workspaceId the workspaceId value to set.
     * @return the WorkspaceSettingInner object itself.
     */
    public WorkspaceSettingInner withWorkspaceId(String workspaceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspaceSettingProperties();
        }
        this.innerProperties().withWorkspaceId(workspaceId);
        return this;
    }

    /**
     * Get the scope property: All the VMs in this scope will send their security data to the mentioned workspace unless
     * overridden by a setting with more specific scope.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Set the scope property: All the VMs in this scope will send their security data to the mentioned workspace unless
     * overridden by a setting with more specific scope.
     * 
     * @param scope the scope value to set.
     * @return the WorkspaceSettingInner object itself.
     */
    public WorkspaceSettingInner withScope(String scope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspaceSettingProperties();
        }
        this.innerProperties().withScope(scope);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkspaceSettingInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkspaceSettingInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WorkspaceSettingInner.
     */
    public static WorkspaceSettingInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkspaceSettingInner deserializedWorkspaceSettingInner = new WorkspaceSettingInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedWorkspaceSettingInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedWorkspaceSettingInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedWorkspaceSettingInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedWorkspaceSettingInner.innerProperties = WorkspaceSettingProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkspaceSettingInner;
        });
    }
}
