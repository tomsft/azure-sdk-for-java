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
import com.azure.resourcemanager.security.models.AllowedConnectionsResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AllowedConnectionsListByHomeRegionMockTests {
    @Test
    public void testListByHomeRegion() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"calculatedDateTime\":\"2021-10-15T08:18:43Z\",\"connectableResources\":[{\"id\":\"pmrrhyjx\",\"inboundConnectedResources\":[{}],\"outboundConnectedResources\":[{},{},{},{}]}]},\"location\":\"zvwaeztt\",\"id\":\"jqyfy\",\"name\":\"qlyyslg\",\"type\":\"f\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<AllowedConnectionsResource> response
            = manager.allowedConnections().listByHomeRegion("xrxhxmlfouqp", com.azure.core.util.Context.NONE);

    }
}
