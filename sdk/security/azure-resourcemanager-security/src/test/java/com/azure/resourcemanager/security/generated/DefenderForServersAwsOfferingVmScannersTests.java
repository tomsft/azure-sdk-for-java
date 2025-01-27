// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderForServersAwsOfferingVmScanners;
import com.azure.resourcemanager.security.models.ScanningMode;
import com.azure.resourcemanager.security.models.VmScannersBaseConfiguration;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DefenderForServersAwsOfferingVmScannersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderForServersAwsOfferingVmScanners model = BinaryData.fromString(
            "{\"cloudRoleArn\":\"qhy\",\"enabled\":true,\"configuration\":{\"scanningMode\":\"Default\",\"exclusionTags\":{\"oorssatfy\":\"whgkgsoa\",\"as\":\"ipufdmxuqbdq\",\"ixhg\":\"tuxvzfqayopbt\"}}}")
            .toObject(DefenderForServersAwsOfferingVmScanners.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals(ScanningMode.DEFAULT, model.configuration().scanningMode());
        Assertions.assertEquals("whgkgsoa", model.configuration().exclusionTags().get("oorssatfy"));
        Assertions.assertEquals("qhy", model.cloudRoleArn());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderForServersAwsOfferingVmScanners model = new DefenderForServersAwsOfferingVmScanners().withEnabled(true)
            .withConfiguration(new VmScannersBaseConfiguration().withScanningMode(ScanningMode.DEFAULT)
                .withExclusionTags(mapOf("oorssatfy", "whgkgsoa", "as", "ipufdmxuqbdq", "ixhg", "tuxvzfqayopbt")))
            .withCloudRoleArn("qhy");
        model = BinaryData.fromObject(model).toObject(DefenderForServersAwsOfferingVmScanners.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals(ScanningMode.DEFAULT, model.configuration().scanningMode());
        Assertions.assertEquals("whgkgsoa", model.configuration().exclusionTags().get("oorssatfy"));
        Assertions.assertEquals("qhy", model.cloudRoleArn());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
