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
import com.azure.resourcemanager.security.models.GetSensitivitySettingsResponse;
import com.azure.resourcemanager.security.models.MipIntegrationStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SensitivitySettingsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"sensitiveInfoTypesIds\":[\"1127a83c-df85-488d-93bd-3e40fcd0adc4\",\"1a30e1c7-e9eb-4d65-9bce-0e5d73e78478\",\"937faa71-be0b-4fba-a276-50ea1db0c50b\",\"299157e8-a6f6-4625-8f17-35b946273f8d\"],\"sensitivityThresholdLabelOrder\":53.555878,\"sensitivityThresholdLabelId\":\"b588ad11-bf3f-4df7-8c62-b812d8aabd2f\",\"mipInformation\":{\"mipIntegrationStatus\":\"Ok\",\"labels\":[{\"name\":\"hawkmibuydwi\",\"id\":\"3e828864-7df9-451d-ab33-469bb116613e\",\"order\":39.98521},{\"name\":\"updyttqm\",\"id\":\"036ec79c-8847-4371-b683-008a3b982aec\",\"order\":51.10358},{\"name\":\"l\",\"id\":\"709a1823-01fe-4595-b2b8-b0309c9b8149\",\"order\":52.05425}],\"customInfoTypes\":[{\"name\":\"tuqmtxynoflqob\",\"id\":\"398e274e-7f0d-460d-a342-daa896b41bce\",\"description\":\"ngxebihexhnk\"},{\"name\":\"giqcdolrpg\",\"id\":\"fd84b2bb-2a86-4b74-a187-21c56dcb122a\",\"description\":\"jlbsmndafbncuyj\"},{\"name\":\"kcnhpplzhc\",\"id\":\"ed8c6c56-251a-4097-a01f-529773e3ea99\",\"description\":\"jziuucrlnewnuwk\"}],\"builtInInfoTypes\":[{\"name\":\"et\",\"id\":\"6952c281-e45d-4ebf-866e-df46a4b2a1e2\",\"type\":\"dyxzlvwywjvr\"},{\"name\":\"qpwwlzpddarc\",\"id\":\"d6a8a468-078e-4698-ac31-1ce2754a9682\",\"type\":\"whslxebaja\"},{\"name\":\"n\",\"id\":\"7f7f392a-3e6f-4a1c-9d6b-5fd294a2851c\",\"type\":\"bd\"}]}},\"id\":\"prwkampyhw\",\"name\":\"bldz\",\"type\":\"iudrcycmwhuzym\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        GetSensitivitySettingsResponse response
            = manager.sensitivitySettings().getWithResponse(com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals(UUID.fromString("1127a83c-df85-488d-93bd-3e40fcd0adc4"),
            response.properties().sensitiveInfoTypesIds().get(0));
        Assertions.assertEquals(53.555878F, response.properties().sensitivityThresholdLabelOrder());
        Assertions.assertEquals(UUID.fromString("b588ad11-bf3f-4df7-8c62-b812d8aabd2f"),
            response.properties().sensitivityThresholdLabelId());
        Assertions.assertEquals(MipIntegrationStatus.OK, response.properties().mipInformation().mipIntegrationStatus());
        Assertions.assertEquals("hawkmibuydwi", response.properties().mipInformation().labels().get(0).name());
        Assertions.assertEquals(UUID.fromString("3e828864-7df9-451d-ab33-469bb116613e"),
            response.properties().mipInformation().labels().get(0).id());
        Assertions.assertEquals(39.98521F, response.properties().mipInformation().labels().get(0).order());
        Assertions.assertEquals("tuqmtxynoflqob",
            response.properties().mipInformation().customInfoTypes().get(0).name());
        Assertions.assertEquals(UUID.fromString("398e274e-7f0d-460d-a342-daa896b41bce"),
            response.properties().mipInformation().customInfoTypes().get(0).id());
        Assertions.assertEquals("ngxebihexhnk",
            response.properties().mipInformation().customInfoTypes().get(0).description());
        Assertions.assertEquals("et", response.properties().mipInformation().builtInInfoTypes().get(0).name());
        Assertions.assertEquals(UUID.fromString("6952c281-e45d-4ebf-866e-df46a4b2a1e2"),
            response.properties().mipInformation().builtInInfoTypes().get(0).id());
        Assertions.assertEquals("dyxzlvwywjvr",
            response.properties().mipInformation().builtInInfoTypes().get(0).type());
    }
}
