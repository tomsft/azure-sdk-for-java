// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.security.models.State;
import java.io.IOException;

/**
 * Regulatory compliance standard details and state.
 */
@Fluent
public final class RegulatoryComplianceStandardInner extends ProxyResource {
    /*
     * Regulatory compliance standard data
     */
    private RegulatoryComplianceStandardProperties innerProperties;

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
     * Creates an instance of RegulatoryComplianceStandardInner class.
     */
    public RegulatoryComplianceStandardInner() {
    }

    /**
     * Get the innerProperties property: Regulatory compliance standard data.
     * 
     * @return the innerProperties value.
     */
    private RegulatoryComplianceStandardProperties innerProperties() {
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
     * Get the state property: Aggregative state based on the standard's supported controls states.
     * 
     * @return the state value.
     */
    public State state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Aggregative state based on the standard's supported controls states.
     * 
     * @param state the state value to set.
     * @return the RegulatoryComplianceStandardInner object itself.
     */
    public RegulatoryComplianceStandardInner withState(State state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RegulatoryComplianceStandardProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the passedControls property: The number of supported regulatory compliance controls of the given standard
     * with a passed state.
     * 
     * @return the passedControls value.
     */
    public Integer passedControls() {
        return this.innerProperties() == null ? null : this.innerProperties().passedControls();
    }

    /**
     * Get the failedControls property: The number of supported regulatory compliance controls of the given standard
     * with a failed state.
     * 
     * @return the failedControls value.
     */
    public Integer failedControls() {
        return this.innerProperties() == null ? null : this.innerProperties().failedControls();
    }

    /**
     * Get the skippedControls property: The number of supported regulatory compliance controls of the given standard
     * with a skipped state.
     * 
     * @return the skippedControls value.
     */
    public Integer skippedControls() {
        return this.innerProperties() == null ? null : this.innerProperties().skippedControls();
    }

    /**
     * Get the unsupportedControls property: The number of regulatory compliance controls of the given standard which
     * are unsupported by automated assessments.
     * 
     * @return the unsupportedControls value.
     */
    public Integer unsupportedControls() {
        return this.innerProperties() == null ? null : this.innerProperties().unsupportedControls();
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
     * Reads an instance of RegulatoryComplianceStandardInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RegulatoryComplianceStandardInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RegulatoryComplianceStandardInner.
     */
    public static RegulatoryComplianceStandardInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RegulatoryComplianceStandardInner deserializedRegulatoryComplianceStandardInner
                = new RegulatoryComplianceStandardInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRegulatoryComplianceStandardInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRegulatoryComplianceStandardInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRegulatoryComplianceStandardInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedRegulatoryComplianceStandardInner.innerProperties
                        = RegulatoryComplianceStandardProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRegulatoryComplianceStandardInner;
        });
    }
}
