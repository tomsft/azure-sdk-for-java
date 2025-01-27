// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * configuration for Vulnerability Assessment autoprovisioning.
 */
@Fluent
public final class DefenderForServersAwsOfferingVaAutoProvisioningConfiguration
    implements JsonSerializable<DefenderForServersAwsOfferingVaAutoProvisioningConfiguration> {
    /*
     * The Vulnerability Assessment solution to be provisioned. Can be either 'TVM' or 'Qualys'
     */
    private Type type;

    /**
     * Creates an instance of DefenderForServersAwsOfferingVaAutoProvisioningConfiguration class.
     */
    public DefenderForServersAwsOfferingVaAutoProvisioningConfiguration() {
    }

    /**
     * Get the type property: The Vulnerability Assessment solution to be provisioned. Can be either 'TVM' or 'Qualys'.
     * 
     * @return the type value.
     */
    public Type type() {
        return this.type;
    }

    /**
     * Set the type property: The Vulnerability Assessment solution to be provisioned. Can be either 'TVM' or 'Qualys'.
     * 
     * @param type the type value to set.
     * @return the DefenderForServersAwsOfferingVaAutoProvisioningConfiguration object itself.
     */
    public DefenderForServersAwsOfferingVaAutoProvisioningConfiguration withType(Type type) {
        this.type = type;
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
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DefenderForServersAwsOfferingVaAutoProvisioningConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DefenderForServersAwsOfferingVaAutoProvisioningConfiguration if the JsonReader was
     * pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * DefenderForServersAwsOfferingVaAutoProvisioningConfiguration.
     */
    public static DefenderForServersAwsOfferingVaAutoProvisioningConfiguration fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            DefenderForServersAwsOfferingVaAutoProvisioningConfiguration deserializedDefenderForServersAwsOfferingVaAutoProvisioningConfiguration
                = new DefenderForServersAwsOfferingVaAutoProvisioningConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedDefenderForServersAwsOfferingVaAutoProvisioningConfiguration.type
                        = Type.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDefenderForServersAwsOfferingVaAutoProvisioningConfiguration;
        });
    }
}
