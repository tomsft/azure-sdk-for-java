// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.DescendantBehavior;
import com.azure.resourcemanager.security.models.DevOpsPolicyAssignment;
import com.azure.resourcemanager.security.models.DevOpsPolicyType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DevOpsPolicyAssignmentsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningStatusMessage\":\"pz\",\"provisioningStatusUpdateTimeUtc\":\"2021-09-01T01:56:32Z\",\"provisioningState\":\"Succeeded\",\"resourceId\":\"nytkmlfupjzc\",\"descendantBehavior\":\"Override\",\"policy\":{\"policyName\":\"oyxjg\",\"policyId\":\"xuerrda\",\"policyVersion\":\"nytkbcerfcvcp\",\"policyType\":\"Unknown\"},\"assignedAt\":\"2021-02-05T20:05:03Z\"},\"id\":\"kmpwyvlhnh\",\"name\":\"c\",\"type\":\"khlebgjgylsacagi\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DevOpsPolicyAssignment response = manager.devOpsPolicyAssignments()
            .getWithResponse("rjbjngoarsr", "rwiemzcyni", "pypimrxi", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("nytkmlfupjzc", response.properties().resourceId());
        Assertions.assertEquals(DescendantBehavior.OVERRIDE, response.properties().descendantBehavior());
        Assertions.assertEquals("oyxjg", response.properties().policy().policyName());
        Assertions.assertEquals("xuerrda", response.properties().policy().policyId());
        Assertions.assertEquals("nytkbcerfcvcp", response.properties().policy().policyVersion());
        Assertions.assertEquals(DevOpsPolicyType.UNKNOWN, response.properties().policy().policyType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-05T20:05:03Z"), response.properties().assignedAt());
    }
}
