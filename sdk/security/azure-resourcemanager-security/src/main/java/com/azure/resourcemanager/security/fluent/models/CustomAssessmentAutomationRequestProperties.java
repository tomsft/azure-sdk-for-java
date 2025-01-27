// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.security.models.SeverityEnum;
import com.azure.resourcemanager.security.models.SupportedCloudEnum;
import java.io.IOException;

/**
 * describes the Custom Assessment Automation properties.
 */
@Fluent
public final class CustomAssessmentAutomationRequestProperties
    implements JsonSerializable<CustomAssessmentAutomationRequestProperties> {
    /*
     * Base 64 encoded KQL query representing the assessment automation results required.
     */
    private String compressedQuery;

    /*
     * Relevant cloud for the custom assessment automation.
     */
    private SupportedCloudEnum supportedCloud = SupportedCloudEnum.AWS;

    /*
     * The severity to relate to the assessments generated by this assessment automation.
     */
    private SeverityEnum severity = SeverityEnum.LOW;

    /*
     * The display name of the assessments generated by this assessment automation.
     */
    private String displayName;

    /*
     * The description to relate to the assessments generated by this assessment automation.
     */
    private String description;

    /*
     * The remediation description to relate to the assessments generated by this assessment automation.
     */
    private String remediationDescription;

    /**
     * Creates an instance of CustomAssessmentAutomationRequestProperties class.
     */
    public CustomAssessmentAutomationRequestProperties() {
    }

    /**
     * Get the compressedQuery property: Base 64 encoded KQL query representing the assessment automation results
     * required.
     * 
     * @return the compressedQuery value.
     */
    public String compressedQuery() {
        return this.compressedQuery;
    }

    /**
     * Set the compressedQuery property: Base 64 encoded KQL query representing the assessment automation results
     * required.
     * 
     * @param compressedQuery the compressedQuery value to set.
     * @return the CustomAssessmentAutomationRequestProperties object itself.
     */
    public CustomAssessmentAutomationRequestProperties withCompressedQuery(String compressedQuery) {
        this.compressedQuery = compressedQuery;
        return this;
    }

    /**
     * Get the supportedCloud property: Relevant cloud for the custom assessment automation.
     * 
     * @return the supportedCloud value.
     */
    public SupportedCloudEnum supportedCloud() {
        return this.supportedCloud;
    }

    /**
     * Set the supportedCloud property: Relevant cloud for the custom assessment automation.
     * 
     * @param supportedCloud the supportedCloud value to set.
     * @return the CustomAssessmentAutomationRequestProperties object itself.
     */
    public CustomAssessmentAutomationRequestProperties withSupportedCloud(SupportedCloudEnum supportedCloud) {
        this.supportedCloud = supportedCloud;
        return this;
    }

    /**
     * Get the severity property: The severity to relate to the assessments generated by this assessment automation.
     * 
     * @return the severity value.
     */
    public SeverityEnum severity() {
        return this.severity;
    }

    /**
     * Set the severity property: The severity to relate to the assessments generated by this assessment automation.
     * 
     * @param severity the severity value to set.
     * @return the CustomAssessmentAutomationRequestProperties object itself.
     */
    public CustomAssessmentAutomationRequestProperties withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the displayName property: The display name of the assessments generated by this assessment automation.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the assessments generated by this assessment automation.
     * 
     * @param displayName the displayName value to set.
     * @return the CustomAssessmentAutomationRequestProperties object itself.
     */
    public CustomAssessmentAutomationRequestProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The description to relate to the assessments generated by this assessment
     * automation.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description to relate to the assessments generated by this assessment
     * automation.
     * 
     * @param description the description value to set.
     * @return the CustomAssessmentAutomationRequestProperties object itself.
     */
    public CustomAssessmentAutomationRequestProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the remediationDescription property: The remediation description to relate to the assessments generated by
     * this assessment automation.
     * 
     * @return the remediationDescription value.
     */
    public String remediationDescription() {
        return this.remediationDescription;
    }

    /**
     * Set the remediationDescription property: The remediation description to relate to the assessments generated by
     * this assessment automation.
     * 
     * @param remediationDescription the remediationDescription value to set.
     * @return the CustomAssessmentAutomationRequestProperties object itself.
     */
    public CustomAssessmentAutomationRequestProperties withRemediationDescription(String remediationDescription) {
        this.remediationDescription = remediationDescription;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("compressedQuery", this.compressedQuery);
        jsonWriter.writeStringField("supportedCloud",
            this.supportedCloud == null ? null : this.supportedCloud.toString());
        jsonWriter.writeStringField("severity", this.severity == null ? null : this.severity.toString());
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("remediationDescription", this.remediationDescription);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomAssessmentAutomationRequestProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomAssessmentAutomationRequestProperties if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CustomAssessmentAutomationRequestProperties.
     */
    public static CustomAssessmentAutomationRequestProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomAssessmentAutomationRequestProperties deserializedCustomAssessmentAutomationRequestProperties
                = new CustomAssessmentAutomationRequestProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("compressedQuery".equals(fieldName)) {
                    deserializedCustomAssessmentAutomationRequestProperties.compressedQuery = reader.getString();
                } else if ("supportedCloud".equals(fieldName)) {
                    deserializedCustomAssessmentAutomationRequestProperties.supportedCloud
                        = SupportedCloudEnum.fromString(reader.getString());
                } else if ("severity".equals(fieldName)) {
                    deserializedCustomAssessmentAutomationRequestProperties.severity
                        = SeverityEnum.fromString(reader.getString());
                } else if ("displayName".equals(fieldName)) {
                    deserializedCustomAssessmentAutomationRequestProperties.displayName = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedCustomAssessmentAutomationRequestProperties.description = reader.getString();
                } else if ("remediationDescription".equals(fieldName)) {
                    deserializedCustomAssessmentAutomationRequestProperties.remediationDescription = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomAssessmentAutomationRequestProperties;
        });
    }
}
