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
import java.util.List;

/**
 * Rule results properties.
 */
@Fluent
public final class RuleResultsProperties implements JsonSerializable<RuleResultsProperties> {
    /*
     * Expected results in the baseline.
     */
    private List<List<String>> results;

    /**
     * Creates an instance of RuleResultsProperties class.
     */
    public RuleResultsProperties() {
    }

    /**
     * Get the results property: Expected results in the baseline.
     * 
     * @return the results value.
     */
    public List<List<String>> results() {
        return this.results;
    }

    /**
     * Set the results property: Expected results in the baseline.
     * 
     * @param results the results value to set.
     * @return the RuleResultsProperties object itself.
     */
    public RuleResultsProperties withResults(List<List<String>> results) {
        this.results = results;
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
        jsonWriter.writeArrayField("results", this.results,
            (writer, element) -> writer.writeArray(element, (writer1, element1) -> writer1.writeString(element1)));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RuleResultsProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RuleResultsProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RuleResultsProperties.
     */
    public static RuleResultsProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RuleResultsProperties deserializedRuleResultsProperties = new RuleResultsProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("results".equals(fieldName)) {
                    List<List<String>> results
                        = reader.readArray(reader1 -> reader1.readArray(reader2 -> reader2.getString()));
                    deserializedRuleResultsProperties.results = results;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRuleResultsProperties;
        });
    }
}
