// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.appconfiguration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GetKeyValueHeaders model. */
@Fluent
public final class GetKeyValueHeaders {
    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The Sync-Token property.
     */
    @JsonProperty(value = "Sync-Token")
    private String syncToken;

    private static final HttpHeaderName SYNC_TOKEN = HttpHeaderName.fromString("Sync-Token");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of GetKeyValueHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public GetKeyValueHeaders(HttpHeaders rawHeaders) {
        this.eTag = rawHeaders.getValue(HttpHeaderName.ETAG);
        this.syncToken = rawHeaders.getValue(SYNC_TOKEN);
    }

    /**
     * Get the eTag property: The ETag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     *
     * @param eTag the eTag value to set.
     * @return the GetKeyValueHeaders object itself.
     */
    public GetKeyValueHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the syncToken property: The Sync-Token property.
     *
     * @return the syncToken value.
     */
    public String getSyncToken() {
        return this.syncToken;
    }

    /**
     * Set the syncToken property: The Sync-Token property.
     *
     * @param syncToken the syncToken value to set.
     * @return the GetKeyValueHeaders object itself.
     */
    public GetKeyValueHeaders setSyncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }
}