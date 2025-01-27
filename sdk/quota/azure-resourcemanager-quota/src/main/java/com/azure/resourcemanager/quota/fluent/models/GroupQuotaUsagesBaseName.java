// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Name of the resource provided by the resource provider. This property is already included in the request URI, so it
 * is a readonly property returned in the response.
 */
@Fluent
public final class GroupQuotaUsagesBaseName implements JsonSerializable<GroupQuotaUsagesBaseName> {
    /*
     * Resource name.
     */
    private String value;

    /*
     * Resource display name.
     */
    private String localizedValue;

    /**
     * Creates an instance of GroupQuotaUsagesBaseName class.
     */
    public GroupQuotaUsagesBaseName() {
    }

    /**
     * Get the value property: Resource name.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Resource name.
     * 
     * @param value the value value to set.
     * @return the GroupQuotaUsagesBaseName object itself.
     */
    public GroupQuotaUsagesBaseName withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localizedValue property: Resource display name.
     * 
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
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
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GroupQuotaUsagesBaseName from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GroupQuotaUsagesBaseName if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GroupQuotaUsagesBaseName.
     */
    public static GroupQuotaUsagesBaseName fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GroupQuotaUsagesBaseName deserializedGroupQuotaUsagesBaseName = new GroupQuotaUsagesBaseName();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedGroupQuotaUsagesBaseName.value = reader.getString();
                } else if ("localizedValue".equals(fieldName)) {
                    deserializedGroupQuotaUsagesBaseName.localizedValue = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGroupQuotaUsagesBaseName;
        });
    }
}
