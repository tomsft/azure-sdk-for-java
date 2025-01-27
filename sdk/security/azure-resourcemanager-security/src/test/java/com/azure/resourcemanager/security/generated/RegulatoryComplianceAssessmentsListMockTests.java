// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.RegulatoryComplianceAssessment;
import com.azure.resourcemanager.security.models.State;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class RegulatoryComplianceAssessmentsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"description\":\"aep\",\"assessmentType\":\"ajubo\",\"assessmentDetailsLink\":\"ywevtjrieikmw\",\"state\":\"Passed\",\"passedResources\":2072885485,\"failedResources\":384792107,\"skippedResources\":704432888,\"unsupportedResources\":1354441009},\"id\":\"gucbmt\",\"name\":\"ed\",\"type\":\"cnnstjcyy\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<RegulatoryComplianceAssessment> response = manager.regulatoryComplianceAssessments()
            .list("cwtewfhxwyrkb", "ehzlry", "jpch", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(State.PASSED, response.iterator().next().state());
    }
}
