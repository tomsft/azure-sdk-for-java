// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The Defender for CSPM Docker Hub offering configurations.
 */
@Immutable
public final class DefenderCspmDockerHubOffering extends CloudOffering {
    /*
     * The type of the security offering.
     */
    private OfferingType offeringType = OfferingType.DEFENDER_CSPM_DOCKER_HUB;

    /**
     * Creates an instance of DefenderCspmDockerHubOffering class.
     */
    public DefenderCspmDockerHubOffering() {
    }

    /**
     * Get the offeringType property: The type of the security offering.
     * 
     * @return the offeringType value.
     */
    @Override
    public OfferingType offeringType() {
        return this.offeringType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("offeringType", this.offeringType == null ? null : this.offeringType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DefenderCspmDockerHubOffering from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DefenderCspmDockerHubOffering if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DefenderCspmDockerHubOffering.
     */
    public static DefenderCspmDockerHubOffering fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DefenderCspmDockerHubOffering deserializedDefenderCspmDockerHubOffering
                = new DefenderCspmDockerHubOffering();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedDefenderCspmDockerHubOffering.withDescription(reader.getString());
                } else if ("offeringType".equals(fieldName)) {
                    deserializedDefenderCspmDockerHubOffering.offeringType
                        = OfferingType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDefenderCspmDockerHubOffering;
        });
    }
}
