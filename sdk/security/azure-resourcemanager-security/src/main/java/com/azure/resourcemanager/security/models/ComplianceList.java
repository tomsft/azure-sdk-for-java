// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.security.fluent.models.ComplianceInner;
import java.io.IOException;
import java.util.List;

/**
 * List of Compliance objects response.
 */
@Fluent
public final class ComplianceList implements JsonSerializable<ComplianceList> {
    /*
     * List of Compliance objects
     */
    private List<ComplianceInner> value;

    /*
     * The URI to fetch the next page.
     */
    private String nextLink;

    /**
     * Creates an instance of ComplianceList class.
     */
    public ComplianceList() {
    }

    /**
     * Get the value property: List of Compliance objects.
     * 
     * @return the value value.
     */
    public List<ComplianceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Compliance objects.
     * 
     * @param value the value value to set.
     * @return the ComplianceList object itself.
     */
    public ComplianceList withValue(List<ComplianceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ComplianceList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ComplianceList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ComplianceList.
     */
    public static ComplianceList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ComplianceList deserializedComplianceList = new ComplianceList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ComplianceInner> value = reader.readArray(reader1 -> ComplianceInner.fromJson(reader1));
                    deserializedComplianceList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedComplianceList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedComplianceList;
        });
    }
}
