// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.ApiCollectionProperties;

public final class ApiCollectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiCollectionProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Updating\",\"displayName\":\"nfczmnniixyxvq\",\"discoveredVia\":\"nosjtgirnbgmgmd\",\"baseUrl\":\"rgmyn\",\"numberOfApiEndpoints\":712542815159447001,\"numberOfInactiveApiEndpoints\":4180446089952921195,\"numberOfUnauthenticatedApiEndpoints\":744878349130960674,\"numberOfExternalApiEndpoints\":630648436413344613,\"numberOfApiEndpointsWithSensitiveDataExposed\":3054233998108151724,\"sensitivityLabel\":\"xwet\"}")
            .toObject(ApiCollectionProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiCollectionProperties model = new ApiCollectionProperties();
        model = BinaryData.fromObject(model).toObject(ApiCollectionProperties.class);
    }
}
