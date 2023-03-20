// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.SnapshotPolicy;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SnapshotPoliciesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"etag\":\"lyr\",\"properties\":{\"hourlySchedule\":{\"snapshotsToKeep\":690539216,\"minute\":3097732,\"usedBytes\":143948817696336233},\"dailySchedule\":{\"snapshotsToKeep\":795059025,\"hour\":476633476,\"minute\":842850517,\"usedBytes\":2926690078716426090},\"weeklySchedule\":{\"snapshotsToKeep\":2096767076,\"day\":\"zldmozuxy\",\"hour\":2095359903,\"minute\":1055127895,\"usedBytes\":1611950859305469556},\"monthlySchedule\":{\"snapshotsToKeep\":201650328,\"daysOfMonth\":\"wn\",\"hour\":268742670,\"minute\":1188867128,\"usedBytes\":3403010203724672320},\"enabled\":true,\"provisioningState\":\"to\"},\"location\":\"mi\",\"tags\":{\"jy\":\"ieypef\",\"u\":\"dh\",\"khihihlhzds\":\"lcplc\",\"mvec\":\"tzbsrgnowcjhf\"},\"id\":\"ctxmwoteyowcluq\",\"name\":\"vekqvgqo\",\"type\":\"wifzmp\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        NetAppFilesManager manager =
            NetAppFilesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SnapshotPolicy response =
            manager
                .snapshotPolicies()
                .getWithResponse("vodggxdbee", "mieknlraria", "wiuagydwqf", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("mi", response.location());
        Assertions.assertEquals("ieypef", response.tags().get("jy"));
        Assertions.assertEquals(690539216, response.hourlySchedule().snapshotsToKeep());
        Assertions.assertEquals(3097732, response.hourlySchedule().minute());
        Assertions.assertEquals(143948817696336233L, response.hourlySchedule().usedBytes());
        Assertions.assertEquals(795059025, response.dailySchedule().snapshotsToKeep());
        Assertions.assertEquals(476633476, response.dailySchedule().hour());
        Assertions.assertEquals(842850517, response.dailySchedule().minute());
        Assertions.assertEquals(2926690078716426090L, response.dailySchedule().usedBytes());
        Assertions.assertEquals(2096767076, response.weeklySchedule().snapshotsToKeep());
        Assertions.assertEquals("zldmozuxy", response.weeklySchedule().day());
        Assertions.assertEquals(2095359903, response.weeklySchedule().hour());
        Assertions.assertEquals(1055127895, response.weeklySchedule().minute());
        Assertions.assertEquals(1611950859305469556L, response.weeklySchedule().usedBytes());
        Assertions.assertEquals(201650328, response.monthlySchedule().snapshotsToKeep());
        Assertions.assertEquals("wn", response.monthlySchedule().daysOfMonth());
        Assertions.assertEquals(268742670, response.monthlySchedule().hour());
        Assertions.assertEquals(1188867128, response.monthlySchedule().minute());
        Assertions.assertEquals(3403010203724672320L, response.monthlySchedule().usedBytes());
        Assertions.assertEquals(true, response.enabled());
    }
}