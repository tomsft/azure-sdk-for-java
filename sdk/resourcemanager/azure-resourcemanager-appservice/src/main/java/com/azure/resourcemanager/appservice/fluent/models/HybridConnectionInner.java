// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import java.io.IOException;

/**
 * Hybrid Connection contract. This is used to configure a Hybrid Connection.
 */
@Fluent
public final class HybridConnectionInner extends ProxyOnlyResource {
    /*
     * HybridConnection resource specific properties
     */
    private HybridConnectionProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of HybridConnectionInner class.
     */
    public HybridConnectionInner() {
    }

    /**
     * Get the innerProperties property: HybridConnection resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private HybridConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HybridConnectionInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the serviceBusNamespace property: The name of the Service Bus namespace.
     * 
     * @return the serviceBusNamespace value.
     */
    public String serviceBusNamespace() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceBusNamespace();
    }

    /**
     * Set the serviceBusNamespace property: The name of the Service Bus namespace.
     * 
     * @param serviceBusNamespace the serviceBusNamespace value to set.
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withServiceBusNamespace(String serviceBusNamespace) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridConnectionProperties();
        }
        this.innerProperties().withServiceBusNamespace(serviceBusNamespace);
        return this;
    }

    /**
     * Get the relayName property: The name of the Service Bus relay.
     * 
     * @return the relayName value.
     */
    public String relayName() {
        return this.innerProperties() == null ? null : this.innerProperties().relayName();
    }

    /**
     * Set the relayName property: The name of the Service Bus relay.
     * 
     * @param relayName the relayName value to set.
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withRelayName(String relayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridConnectionProperties();
        }
        this.innerProperties().withRelayName(relayName);
        return this;
    }

    /**
     * Get the relayArmUri property: The ARM URI to the Service Bus relay.
     * 
     * @return the relayArmUri value.
     */
    public String relayArmUri() {
        return this.innerProperties() == null ? null : this.innerProperties().relayArmUri();
    }

    /**
     * Set the relayArmUri property: The ARM URI to the Service Bus relay.
     * 
     * @param relayArmUri the relayArmUri value to set.
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withRelayArmUri(String relayArmUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridConnectionProperties();
        }
        this.innerProperties().withRelayArmUri(relayArmUri);
        return this;
    }

    /**
     * Get the hostname property: The hostname of the endpoint.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Set the hostname property: The hostname of the endpoint.
     * 
     * @param hostname the hostname value to set.
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withHostname(String hostname) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridConnectionProperties();
        }
        this.innerProperties().withHostname(hostname);
        return this;
    }

    /**
     * Get the port property: The port of the endpoint.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.innerProperties() == null ? null : this.innerProperties().port();
    }

    /**
     * Set the port property: The port of the endpoint.
     * 
     * @param port the port value to set.
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withPort(Integer port) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridConnectionProperties();
        }
        this.innerProperties().withPort(port);
        return this;
    }

    /**
     * Get the sendKeyName property: The name of the Service Bus key which has Send permissions. This is used to
     * authenticate to Service Bus.
     * 
     * @return the sendKeyName value.
     */
    public String sendKeyName() {
        return this.innerProperties() == null ? null : this.innerProperties().sendKeyName();
    }

    /**
     * Set the sendKeyName property: The name of the Service Bus key which has Send permissions. This is used to
     * authenticate to Service Bus.
     * 
     * @param sendKeyName the sendKeyName value to set.
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withSendKeyName(String sendKeyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridConnectionProperties();
        }
        this.innerProperties().withSendKeyName(sendKeyName);
        return this;
    }

    /**
     * Get the sendKeyValue property: The value of the Service Bus key. This is used to authenticate to Service Bus. In
     * ARM this key will not be returned
     * normally, use the POST /listKeys API instead.
     * 
     * @return the sendKeyValue value.
     */
    public String sendKeyValue() {
        return this.innerProperties() == null ? null : this.innerProperties().sendKeyValue();
    }

    /**
     * Set the sendKeyValue property: The value of the Service Bus key. This is used to authenticate to Service Bus. In
     * ARM this key will not be returned
     * normally, use the POST /listKeys API instead.
     * 
     * @param sendKeyValue the sendKeyValue value to set.
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withSendKeyValue(String sendKeyValue) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridConnectionProperties();
        }
        this.innerProperties().withSendKeyValue(sendKeyValue);
        return this;
    }

    /**
     * Get the serviceBusSuffix property: The suffix for the service bus endpoint. By default this is
     * .servicebus.windows.net.
     * 
     * @return the serviceBusSuffix value.
     */
    public String serviceBusSuffix() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceBusSuffix();
    }

    /**
     * Set the serviceBusSuffix property: The suffix for the service bus endpoint. By default this is
     * .servicebus.windows.net.
     * 
     * @param serviceBusSuffix the serviceBusSuffix value to set.
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withServiceBusSuffix(String serviceBusSuffix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridConnectionProperties();
        }
        this.innerProperties().withServiceBusSuffix(serviceBusSuffix);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HybridConnectionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HybridConnectionInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the HybridConnectionInner.
     */
    public static HybridConnectionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HybridConnectionInner deserializedHybridConnectionInner = new HybridConnectionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedHybridConnectionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedHybridConnectionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedHybridConnectionInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedHybridConnectionInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedHybridConnectionInner.innerProperties = HybridConnectionProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHybridConnectionInner;
        });
    }
}
