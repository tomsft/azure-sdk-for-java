// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.models.RefreshConfiguration;
import com.azure.resourcemanager.streamanalytics.models.UpdatableUdfRefreshType;
import org.junit.jupiter.api.Assertions;

public final class RefreshConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RefreshConfiguration model = BinaryData.fromString(
            "{\"pathPattern\":\"mcl\",\"dateFormat\":\"ijcoejctb\",\"timeFormat\":\"qsqsy\",\"refreshInterval\":\"kbfkg\",\"refreshType\":\"Nonblocking\"}")
            .toObject(RefreshConfiguration.class);
        Assertions.assertEquals("mcl", model.pathPattern());
        Assertions.assertEquals("ijcoejctb", model.dateFormat());
        Assertions.assertEquals("qsqsy", model.timeFormat());
        Assertions.assertEquals("kbfkg", model.refreshInterval());
        Assertions.assertEquals(UpdatableUdfRefreshType.NONBLOCKING, model.refreshType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RefreshConfiguration model = new RefreshConfiguration().withPathPattern("mcl")
            .withDateFormat("ijcoejctb")
            .withTimeFormat("qsqsy")
            .withRefreshInterval("kbfkg")
            .withRefreshType(UpdatableUdfRefreshType.NONBLOCKING);
        model = BinaryData.fromObject(model).toObject(RefreshConfiguration.class);
        Assertions.assertEquals("mcl", model.pathPattern());
        Assertions.assertEquals("ijcoejctb", model.dateFormat());
        Assertions.assertEquals("qsqsy", model.timeFormat());
        Assertions.assertEquals("kbfkg", model.refreshInterval());
        Assertions.assertEquals(UpdatableUdfRefreshType.NONBLOCKING, model.refreshType());
    }
}
