// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** Details of the data collection options specified. */
@Immutable
public final class AksServiceCreateRequestDataCollection extends ModelDataCollection {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(AksServiceCreateRequestDataCollection.class);

    /** {@inheritDoc} */
    @Override
    public AksServiceCreateRequestDataCollection withEventHubEnabled(Boolean eventHubEnabled) {
        super.withEventHubEnabled(eventHubEnabled);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceCreateRequestDataCollection withStorageEnabled(Boolean storageEnabled) {
        super.withStorageEnabled(storageEnabled);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
