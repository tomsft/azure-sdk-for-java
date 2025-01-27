// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Encryption key containing details about key to encrypt different keys.
 */
@Fluent
public final class KeyEncryptionKey implements JsonSerializable<KeyEncryptionKey> {
    /*
     * Type of encryption key used for key encryption.
     */
    private KekType kekType;

    /*
     * Managed identity properties used for key encryption.
     */
    private IdentityProperties identityProperties;

    /*
     * Key encryption key. It is required in case of Customer managed KekType.
     */
    private String kekUrl;

    /*
     * Kek vault resource id. It is required in case of Customer managed KekType.
     */
    private String kekVaultResourceId;

    /**
     * Creates an instance of KeyEncryptionKey class.
     */
    public KeyEncryptionKey() {
    }

    /**
     * Get the kekType property: Type of encryption key used for key encryption.
     * 
     * @return the kekType value.
     */
    public KekType kekType() {
        return this.kekType;
    }

    /**
     * Set the kekType property: Type of encryption key used for key encryption.
     * 
     * @param kekType the kekType value to set.
     * @return the KeyEncryptionKey object itself.
     */
    public KeyEncryptionKey withKekType(KekType kekType) {
        this.kekType = kekType;
        return this;
    }

    /**
     * Get the identityProperties property: Managed identity properties used for key encryption.
     * 
     * @return the identityProperties value.
     */
    public IdentityProperties identityProperties() {
        return this.identityProperties;
    }

    /**
     * Set the identityProperties property: Managed identity properties used for key encryption.
     * 
     * @param identityProperties the identityProperties value to set.
     * @return the KeyEncryptionKey object itself.
     */
    public KeyEncryptionKey withIdentityProperties(IdentityProperties identityProperties) {
        this.identityProperties = identityProperties;
        return this;
    }

    /**
     * Get the kekUrl property: Key encryption key. It is required in case of Customer managed KekType.
     * 
     * @return the kekUrl value.
     */
    public String kekUrl() {
        return this.kekUrl;
    }

    /**
     * Set the kekUrl property: Key encryption key. It is required in case of Customer managed KekType.
     * 
     * @param kekUrl the kekUrl value to set.
     * @return the KeyEncryptionKey object itself.
     */
    public KeyEncryptionKey withKekUrl(String kekUrl) {
        this.kekUrl = kekUrl;
        return this;
    }

    /**
     * Get the kekVaultResourceId property: Kek vault resource id. It is required in case of Customer managed KekType.
     * 
     * @return the kekVaultResourceId value.
     */
    public String kekVaultResourceId() {
        return this.kekVaultResourceId;
    }

    /**
     * Set the kekVaultResourceId property: Kek vault resource id. It is required in case of Customer managed KekType.
     * 
     * @param kekVaultResourceId the kekVaultResourceId value to set.
     * @return the KeyEncryptionKey object itself.
     */
    public KeyEncryptionKey withKekVaultResourceId(String kekVaultResourceId) {
        this.kekVaultResourceId = kekVaultResourceId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (kekType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property kekType in model KeyEncryptionKey"));
        }
        if (identityProperties() != null) {
            identityProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KeyEncryptionKey.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kekType", this.kekType == null ? null : this.kekType.toString());
        jsonWriter.writeJsonField("identityProperties", this.identityProperties);
        jsonWriter.writeStringField("kekUrl", this.kekUrl);
        jsonWriter.writeStringField("kekVaultResourceID", this.kekVaultResourceId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyEncryptionKey from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyEncryptionKey if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the KeyEncryptionKey.
     */
    public static KeyEncryptionKey fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeyEncryptionKey deserializedKeyEncryptionKey = new KeyEncryptionKey();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kekType".equals(fieldName)) {
                    deserializedKeyEncryptionKey.kekType = KekType.fromString(reader.getString());
                } else if ("identityProperties".equals(fieldName)) {
                    deserializedKeyEncryptionKey.identityProperties = IdentityProperties.fromJson(reader);
                } else if ("kekUrl".equals(fieldName)) {
                    deserializedKeyEncryptionKey.kekUrl = reader.getString();
                } else if ("kekVaultResourceID".equals(fieldName)) {
                    deserializedKeyEncryptionKey.kekVaultResourceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeyEncryptionKey;
        });
    }
}
