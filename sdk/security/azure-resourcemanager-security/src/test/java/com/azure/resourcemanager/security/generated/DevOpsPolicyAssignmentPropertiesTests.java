// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DescendantBehavior;
import com.azure.resourcemanager.security.models.DevOpsPolicyAssignmentProperties;
import com.azure.resourcemanager.security.models.DevOpsPolicyDescriptor;
import com.azure.resourcemanager.security.models.DevOpsPolicyType;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class DevOpsPolicyAssignmentPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DevOpsPolicyAssignmentProperties model = BinaryData.fromString(
            "{\"provisioningStatusMessage\":\"qi\",\"provisioningStatusUpdateTimeUtc\":\"2021-04-15T04:16:26Z\",\"provisioningState\":\"Failed\",\"resourceId\":\"udfbsfarf\",\"descendantBehavior\":\"Unknown\",\"policy\":{\"policyName\":\"kjxnqpvwgfstmhq\",\"policyId\":\"izmdksa\",\"policyVersion\":\"fcluqvo\",\"policyType\":\"Pipeline\"},\"assignedAt\":\"2021-02-21T06:42:02Z\"}")
            .toObject(DevOpsPolicyAssignmentProperties.class);
        Assertions.assertEquals("udfbsfarf", model.resourceId());
        Assertions.assertEquals(DescendantBehavior.UNKNOWN, model.descendantBehavior());
        Assertions.assertEquals("kjxnqpvwgfstmhq", model.policy().policyName());
        Assertions.assertEquals("izmdksa", model.policy().policyId());
        Assertions.assertEquals("fcluqvo", model.policy().policyVersion());
        Assertions.assertEquals(DevOpsPolicyType.PIPELINE, model.policy().policyType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-21T06:42:02Z"), model.assignedAt());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DevOpsPolicyAssignmentProperties model = new DevOpsPolicyAssignmentProperties().withResourceId("udfbsfarf")
            .withDescendantBehavior(DescendantBehavior.UNKNOWN)
            .withPolicy(new DevOpsPolicyDescriptor().withPolicyName("kjxnqpvwgfstmhq")
                .withPolicyId("izmdksa")
                .withPolicyVersion("fcluqvo")
                .withPolicyType(DevOpsPolicyType.PIPELINE))
            .withAssignedAt(OffsetDateTime.parse("2021-02-21T06:42:02Z"));
        model = BinaryData.fromObject(model).toObject(DevOpsPolicyAssignmentProperties.class);
        Assertions.assertEquals("udfbsfarf", model.resourceId());
        Assertions.assertEquals(DescendantBehavior.UNKNOWN, model.descendantBehavior());
        Assertions.assertEquals("kjxnqpvwgfstmhq", model.policy().policyName());
        Assertions.assertEquals("izmdksa", model.policy().policyId());
        Assertions.assertEquals("fcluqvo", model.policy().policyVersion());
        Assertions.assertEquals(DevOpsPolicyType.PIPELINE, model.policy().policyType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-21T06:42:02Z"), model.assignedAt());
    }
}
