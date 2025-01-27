// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.CategoryConfiguration;
import com.azure.resourcemanager.security.models.RuleCategory;
import org.junit.jupiter.api.Assertions;

public final class CategoryConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CategoryConfiguration model
            = BinaryData.fromString("{\"minimumSeverityLevel\":\"kzjv\",\"category\":\"Containers\"}")
                .toObject(CategoryConfiguration.class);
        Assertions.assertEquals("kzjv", model.minimumSeverityLevel());
        Assertions.assertEquals(RuleCategory.CONTAINERS, model.category());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CategoryConfiguration model
            = new CategoryConfiguration().withMinimumSeverityLevel("kzjv").withCategory(RuleCategory.CONTAINERS);
        model = BinaryData.fromObject(model).toObject(CategoryConfiguration.class);
        Assertions.assertEquals("kzjv", model.minimumSeverityLevel());
        Assertions.assertEquals(RuleCategory.CONTAINERS, model.category());
    }
}
