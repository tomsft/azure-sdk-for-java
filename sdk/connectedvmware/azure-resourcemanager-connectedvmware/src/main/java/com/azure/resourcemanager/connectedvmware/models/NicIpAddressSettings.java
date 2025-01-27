// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * IP address information for a virtual network adapter reported by the fabric.
 */
@Immutable
public final class NicIpAddressSettings implements JsonSerializable<NicIpAddressSettings> {
    /*
     * Gets the ip address allocation method.
     */
    private String allocationMethod;

    /*
     * Gets the ip address for the nic.
     */
    private String ipAddress;

    /*
     * Gets the mask.
     */
    private String subnetMask;

    /**
     * Creates an instance of NicIpAddressSettings class.
     */
    public NicIpAddressSettings() {
    }

    /**
     * Get the allocationMethod property: Gets the ip address allocation method.
     * 
     * @return the allocationMethod value.
     */
    public String allocationMethod() {
        return this.allocationMethod;
    }

    /**
     * Get the ipAddress property: Gets the ip address for the nic.
     * 
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Get the subnetMask property: Gets the mask.
     * 
     * @return the subnetMask value.
     */
    public String subnetMask() {
        return this.subnetMask;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NicIpAddressSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NicIpAddressSettings if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NicIpAddressSettings.
     */
    public static NicIpAddressSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NicIpAddressSettings deserializedNicIpAddressSettings = new NicIpAddressSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("allocationMethod".equals(fieldName)) {
                    deserializedNicIpAddressSettings.allocationMethod = reader.getString();
                } else if ("ipAddress".equals(fieldName)) {
                    deserializedNicIpAddressSettings.ipAddress = reader.getString();
                } else if ("subnetMask".equals(fieldName)) {
                    deserializedNicIpAddressSettings.subnetMask = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNicIpAddressSettings;
        });
    }
}
