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
 * Remediation details.
 */
@Fluent
public final class Remediation implements JsonSerializable<Remediation> {
    /*
     * Remediation description.
     */
    private String description;

    /*
     * Remediation script.
     */
    private List<String> scripts;

    /*
     * Is remediation automated.
     */
    private Boolean automated;

    /*
     * Optional link to remediate in Azure Portal.
     */
    private String portalLink;

    /**
     * Creates an instance of Remediation class.
     */
    public Remediation() {
    }

    /**
     * Get the description property: Remediation description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Remediation description.
     * 
     * @param description the description value to set.
     * @return the Remediation object itself.
     */
    public Remediation withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the scripts property: Remediation script.
     * 
     * @return the scripts value.
     */
    public List<String> scripts() {
        return this.scripts;
    }

    /**
     * Set the scripts property: Remediation script.
     * 
     * @param scripts the scripts value to set.
     * @return the Remediation object itself.
     */
    public Remediation withScripts(List<String> scripts) {
        this.scripts = scripts;
        return this;
    }

    /**
     * Get the automated property: Is remediation automated.
     * 
     * @return the automated value.
     */
    public Boolean automated() {
        return this.automated;
    }

    /**
     * Set the automated property: Is remediation automated.
     * 
     * @param automated the automated value to set.
     * @return the Remediation object itself.
     */
    public Remediation withAutomated(Boolean automated) {
        this.automated = automated;
        return this;
    }

    /**
     * Get the portalLink property: Optional link to remediate in Azure Portal.
     * 
     * @return the portalLink value.
     */
    public String portalLink() {
        return this.portalLink;
    }

    /**
     * Set the portalLink property: Optional link to remediate in Azure Portal.
     * 
     * @param portalLink the portalLink value to set.
     * @return the Remediation object itself.
     */
    public Remediation withPortalLink(String portalLink) {
        this.portalLink = portalLink;
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
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeArrayField("scripts", this.scripts, (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("automated", this.automated);
        jsonWriter.writeStringField("portalLink", this.portalLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Remediation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Remediation if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the Remediation.
     */
    public static Remediation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Remediation deserializedRemediation = new Remediation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedRemediation.description = reader.getString();
                } else if ("scripts".equals(fieldName)) {
                    List<String> scripts = reader.readArray(reader1 -> reader1.getString());
                    deserializedRemediation.scripts = scripts;
                } else if ("automated".equals(fieldName)) {
                    deserializedRemediation.automated = reader.getNullable(JsonReader::getBoolean);
                } else if ("portalLink".equals(fieldName)) {
                    deserializedRemediation.portalLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRemediation;
        });
    }
}
