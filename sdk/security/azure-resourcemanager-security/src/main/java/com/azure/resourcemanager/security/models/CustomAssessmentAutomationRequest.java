// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.security.fluent.models.CustomAssessmentAutomationRequestProperties;
import java.io.IOException;

/**
 * Custom Assessment Automation request.
 */
@Fluent
public final class CustomAssessmentAutomationRequest extends ProxyResource {
    /*
     * describes Custom Assessment Automation request properties.
     */
    private CustomAssessmentAutomationRequestProperties innerProperties;

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
     * Creates an instance of CustomAssessmentAutomationRequest class.
     */
    public CustomAssessmentAutomationRequest() {
    }

    /**
     * Get the innerProperties property: describes Custom Assessment Automation request properties.
     * 
     * @return the innerProperties value.
     */
    private CustomAssessmentAutomationRequestProperties innerProperties() {
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
     * Get the compressedQuery property: Base 64 encoded KQL query representing the assessment automation results
     * required.
     * 
     * @return the compressedQuery value.
     */
    public String compressedQuery() {
        return this.innerProperties() == null ? null : this.innerProperties().compressedQuery();
    }

    /**
     * Set the compressedQuery property: Base 64 encoded KQL query representing the assessment automation results
     * required.
     * 
     * @param compressedQuery the compressedQuery value to set.
     * @return the CustomAssessmentAutomationRequest object itself.
     */
    public CustomAssessmentAutomationRequest withCompressedQuery(String compressedQuery) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomAssessmentAutomationRequestProperties();
        }
        this.innerProperties().withCompressedQuery(compressedQuery);
        return this;
    }

    /**
     * Get the supportedCloud property: Relevant cloud for the custom assessment automation.
     * 
     * @return the supportedCloud value.
     */
    public SupportedCloudEnum supportedCloud() {
        return this.innerProperties() == null ? null : this.innerProperties().supportedCloud();
    }

    /**
     * Set the supportedCloud property: Relevant cloud for the custom assessment automation.
     * 
     * @param supportedCloud the supportedCloud value to set.
     * @return the CustomAssessmentAutomationRequest object itself.
     */
    public CustomAssessmentAutomationRequest withSupportedCloud(SupportedCloudEnum supportedCloud) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomAssessmentAutomationRequestProperties();
        }
        this.innerProperties().withSupportedCloud(supportedCloud);
        return this;
    }

    /**
     * Get the severity property: The severity to relate to the assessments generated by this assessment automation.
     * 
     * @return the severity value.
     */
    public SeverityEnum severity() {
        return this.innerProperties() == null ? null : this.innerProperties().severity();
    }

    /**
     * Set the severity property: The severity to relate to the assessments generated by this assessment automation.
     * 
     * @param severity the severity value to set.
     * @return the CustomAssessmentAutomationRequest object itself.
     */
    public CustomAssessmentAutomationRequest withSeverity(SeverityEnum severity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomAssessmentAutomationRequestProperties();
        }
        this.innerProperties().withSeverity(severity);
        return this;
    }

    /**
     * Get the displayName property: The display name of the assessments generated by this assessment automation.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name of the assessments generated by this assessment automation.
     * 
     * @param displayName the displayName value to set.
     * @return the CustomAssessmentAutomationRequest object itself.
     */
    public CustomAssessmentAutomationRequest withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomAssessmentAutomationRequestProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the description property: The description to relate to the assessments generated by this assessment
     * automation.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description to relate to the assessments generated by this assessment
     * automation.
     * 
     * @param description the description value to set.
     * @return the CustomAssessmentAutomationRequest object itself.
     */
    public CustomAssessmentAutomationRequest withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomAssessmentAutomationRequestProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the remediationDescription property: The remediation description to relate to the assessments generated by
     * this assessment automation.
     * 
     * @return the remediationDescription value.
     */
    public String remediationDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().remediationDescription();
    }

    /**
     * Set the remediationDescription property: The remediation description to relate to the assessments generated by
     * this assessment automation.
     * 
     * @param remediationDescription the remediationDescription value to set.
     * @return the CustomAssessmentAutomationRequest object itself.
     */
    public CustomAssessmentAutomationRequest withRemediationDescription(String remediationDescription) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomAssessmentAutomationRequestProperties();
        }
        this.innerProperties().withRemediationDescription(remediationDescription);
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
     * Reads an instance of CustomAssessmentAutomationRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomAssessmentAutomationRequest if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CustomAssessmentAutomationRequest.
     */
    public static CustomAssessmentAutomationRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomAssessmentAutomationRequest deserializedCustomAssessmentAutomationRequest
                = new CustomAssessmentAutomationRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedCustomAssessmentAutomationRequest.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedCustomAssessmentAutomationRequest.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedCustomAssessmentAutomationRequest.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedCustomAssessmentAutomationRequest.innerProperties
                        = CustomAssessmentAutomationRequestProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomAssessmentAutomationRequest;
        });
    }
}
