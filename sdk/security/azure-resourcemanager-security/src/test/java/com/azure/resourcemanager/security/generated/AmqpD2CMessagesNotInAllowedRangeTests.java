// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AmqpD2CMessagesNotInAllowedRange;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class AmqpD2CMessagesNotInAllowedRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmqpD2CMessagesNotInAllowedRange model = BinaryData.fromString(
            "{\"ruleType\":\"AmqpD2CMessagesNotInAllowedRange\",\"timeWindowSize\":\"PT62H56M2S\",\"minThreshold\":1553900618,\"maxThreshold\":1450047752,\"displayName\":\"vxfaqufqizj\",\"description\":\"pwooajeyyj\",\"isEnabled\":false}")
            .toObject(AmqpD2CMessagesNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(1553900618, model.minThreshold());
        Assertions.assertEquals(1450047752, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT62H56M2S"), model.timeWindowSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmqpD2CMessagesNotInAllowedRange model = new AmqpD2CMessagesNotInAllowedRange().withIsEnabled(false)
            .withMinThreshold(1553900618)
            .withMaxThreshold(1450047752)
            .withTimeWindowSize(Duration.parse("PT62H56M2S"));
        model = BinaryData.fromObject(model).toObject(AmqpD2CMessagesNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(1553900618, model.minThreshold());
        Assertions.assertEquals(1450047752, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT62H56M2S"), model.timeWindowSize());
    }
}
