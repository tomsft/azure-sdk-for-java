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
 * The governance email weekly notification configuration.
 */
@Fluent
public final class GovernanceRuleEmailNotification implements JsonSerializable<GovernanceRuleEmailNotification> {
    /*
     * Defines whether manager email notifications are disabled
     */
    private Boolean disableManagerEmailNotification;

    /*
     * Defines whether owner email notifications are disabled
     */
    private Boolean disableOwnerEmailNotification;

    /**
     * Creates an instance of GovernanceRuleEmailNotification class.
     */
    public GovernanceRuleEmailNotification() {
    }

    /**
     * Get the disableManagerEmailNotification property: Defines whether manager email notifications are disabled.
     * 
     * @return the disableManagerEmailNotification value.
     */
    public Boolean disableManagerEmailNotification() {
        return this.disableManagerEmailNotification;
    }

    /**
     * Set the disableManagerEmailNotification property: Defines whether manager email notifications are disabled.
     * 
     * @param disableManagerEmailNotification the disableManagerEmailNotification value to set.
     * @return the GovernanceRuleEmailNotification object itself.
     */
    public GovernanceRuleEmailNotification
        withDisableManagerEmailNotification(Boolean disableManagerEmailNotification) {
        this.disableManagerEmailNotification = disableManagerEmailNotification;
        return this;
    }

    /**
     * Get the disableOwnerEmailNotification property: Defines whether owner email notifications are disabled.
     * 
     * @return the disableOwnerEmailNotification value.
     */
    public Boolean disableOwnerEmailNotification() {
        return this.disableOwnerEmailNotification;
    }

    /**
     * Set the disableOwnerEmailNotification property: Defines whether owner email notifications are disabled.
     * 
     * @param disableOwnerEmailNotification the disableOwnerEmailNotification value to set.
     * @return the GovernanceRuleEmailNotification object itself.
     */
    public GovernanceRuleEmailNotification withDisableOwnerEmailNotification(Boolean disableOwnerEmailNotification) {
        this.disableOwnerEmailNotification = disableOwnerEmailNotification;
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
        jsonWriter.writeBooleanField("disableManagerEmailNotification", this.disableManagerEmailNotification);
        jsonWriter.writeBooleanField("disableOwnerEmailNotification", this.disableOwnerEmailNotification);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GovernanceRuleEmailNotification from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GovernanceRuleEmailNotification if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GovernanceRuleEmailNotification.
     */
    public static GovernanceRuleEmailNotification fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GovernanceRuleEmailNotification deserializedGovernanceRuleEmailNotification
                = new GovernanceRuleEmailNotification();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("disableManagerEmailNotification".equals(fieldName)) {
                    deserializedGovernanceRuleEmailNotification.disableManagerEmailNotification
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("disableOwnerEmailNotification".equals(fieldName)) {
                    deserializedGovernanceRuleEmailNotification.disableOwnerEmailNotification
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGovernanceRuleEmailNotification;
        });
    }
}
