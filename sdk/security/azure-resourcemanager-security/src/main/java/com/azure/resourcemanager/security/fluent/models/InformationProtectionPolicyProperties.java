// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.security.models.InformationType;
import com.azure.resourcemanager.security.models.SensitivityLabel;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * describes properties of an information protection policy.
 */
@Fluent
public final class InformationProtectionPolicyProperties
    implements JsonSerializable<InformationProtectionPolicyProperties> {
    /*
     * Describes the last UTC time the policy was modified.
     */
    private OffsetDateTime lastModifiedUtc;

    /*
     * Describes the version of the policy.
     */
    private String version;

    /*
     * Dictionary of sensitivity labels.
     */
    private Map<String, SensitivityLabel> labels;

    /*
     * The sensitivity information types.
     */
    private Map<String, InformationType> informationTypes;

    /**
     * Creates an instance of InformationProtectionPolicyProperties class.
     */
    public InformationProtectionPolicyProperties() {
    }

    /**
     * Get the lastModifiedUtc property: Describes the last UTC time the policy was modified.
     * 
     * @return the lastModifiedUtc value.
     */
    public OffsetDateTime lastModifiedUtc() {
        return this.lastModifiedUtc;
    }

    /**
     * Get the version property: Describes the version of the policy.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the labels property: Dictionary of sensitivity labels.
     * 
     * @return the labels value.
     */
    public Map<String, SensitivityLabel> labels() {
        return this.labels;
    }

    /**
     * Set the labels property: Dictionary of sensitivity labels.
     * 
     * @param labels the labels value to set.
     * @return the InformationProtectionPolicyProperties object itself.
     */
    public InformationProtectionPolicyProperties withLabels(Map<String, SensitivityLabel> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the informationTypes property: The sensitivity information types.
     * 
     * @return the informationTypes value.
     */
    public Map<String, InformationType> informationTypes() {
        return this.informationTypes;
    }

    /**
     * Set the informationTypes property: The sensitivity information types.
     * 
     * @param informationTypes the informationTypes value to set.
     * @return the InformationProtectionPolicyProperties object itself.
     */
    public InformationProtectionPolicyProperties withInformationTypes(Map<String, InformationType> informationTypes) {
        this.informationTypes = informationTypes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (labels() != null) {
            labels().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
        if (informationTypes() != null) {
            informationTypes().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("labels", this.labels, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeMapField("informationTypes", this.informationTypes,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InformationProtectionPolicyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InformationProtectionPolicyProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the InformationProtectionPolicyProperties.
     */
    public static InformationProtectionPolicyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InformationProtectionPolicyProperties deserializedInformationProtectionPolicyProperties
                = new InformationProtectionPolicyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("lastModifiedUtc".equals(fieldName)) {
                    deserializedInformationProtectionPolicyProperties.lastModifiedUtc = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("version".equals(fieldName)) {
                    deserializedInformationProtectionPolicyProperties.version = reader.getString();
                } else if ("labels".equals(fieldName)) {
                    Map<String, SensitivityLabel> labels
                        = reader.readMap(reader1 -> SensitivityLabel.fromJson(reader1));
                    deserializedInformationProtectionPolicyProperties.labels = labels;
                } else if ("informationTypes".equals(fieldName)) {
                    Map<String, InformationType> informationTypes
                        = reader.readMap(reader1 -> InformationType.fromJson(reader1));
                    deserializedInformationProtectionPolicyProperties.informationTypes = informationTypes;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInformationProtectionPolicyProperties;
        });
    }
}
