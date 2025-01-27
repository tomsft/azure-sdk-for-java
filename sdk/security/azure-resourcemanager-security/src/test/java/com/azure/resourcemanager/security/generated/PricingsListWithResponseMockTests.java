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
import com.azure.resourcemanager.security.models.Enforce;
import com.azure.resourcemanager.security.models.IsEnabled;
import com.azure.resourcemanager.security.models.PricingList;
import com.azure.resourcemanager.security.models.PricingTier;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PricingsListWithResponseMockTests {
    @Test
    public void testListWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"pricingTier\":\"Free\",\"subPlan\":\"bxkcegcttgxk\",\"freeTrialRemainingTime\":\"PT130H35S\",\"enablementTime\":\"2021-02-22T17:41:49Z\",\"enforce\":\"True\",\"inherited\":\"False\",\"inheritedFrom\":\"qohviawpjfkrarer\",\"resourcesCoverageStatus\":\"PartiallyCovered\",\"extensions\":[{\"name\":\"tpxowgowwdocj\",\"isEnabled\":\"True\"},{\"name\":\"uamegjkfis\",\"isEnabled\":\"True\"},{\"name\":\"exumfavweslo\",\"isEnabled\":\"True\"},{\"name\":\"itxrrsjscosanjs\",\"isEnabled\":\"True\"}],\"deprecated\":false,\"replacedBy\":[\"ogujgb\"]},\"id\":\"clxhwkzfggs\",\"name\":\"zkvdantp\",\"type\":\"uiwaz\"},{\"properties\":{\"pricingTier\":\"Standard\",\"subPlan\":\"hutctcabcpwabz\",\"freeTrialRemainingTime\":\"PT211H17M24S\",\"enablementTime\":\"2021-06-22T12:20:34Z\",\"enforce\":\"True\",\"inherited\":\"False\",\"inheritedFrom\":\"dfzweg\",\"resourcesCoverageStatus\":\"FullyCovered\",\"extensions\":[{\"name\":\"wgweccvufjqvfc\",\"isEnabled\":\"False\"},{\"name\":\"s\",\"isEnabled\":\"False\"},{\"name\":\"yaemkrhbsdgktlu\",\"isEnabled\":\"False\"},{\"name\":\"iqgpqcpenob\",\"isEnabled\":\"False\"}],\"deprecated\":true,\"replacedBy\":[\"spqbvvaer\",\"zsu\"]},\"id\":\"zsautbricvvofe\",\"name\":\"intz\",\"type\":\"nhyyqxckd\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PricingList response = manager.pricings()
            .listWithResponse("vzlhjgmrodblap", "raczvtniwfcubw", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(PricingTier.FREE, response.value().get(0).pricingTier());
        Assertions.assertEquals("bxkcegcttgxk", response.value().get(0).subPlan());
        Assertions.assertEquals(Enforce.TRUE, response.value().get(0).enforce());
        Assertions.assertEquals("tpxowgowwdocj", response.value().get(0).extensions().get(0).name());
        Assertions.assertEquals(IsEnabled.TRUE, response.value().get(0).extensions().get(0).isEnabled());
    }
}
