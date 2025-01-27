// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.JitNetworkAccessPolicyProperties;
import com.azure.resourcemanager.security.fluent.models.JitNetworkAccessRequestInner;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicyVirtualMachine;
import com.azure.resourcemanager.security.models.JitNetworkAccessPortRule;
import com.azure.resourcemanager.security.models.JitNetworkAccessRequestPort;
import com.azure.resourcemanager.security.models.JitNetworkAccessRequestVirtualMachine;
import com.azure.resourcemanager.security.models.Protocol;
import com.azure.resourcemanager.security.models.Status;
import com.azure.resourcemanager.security.models.StatusReason;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class JitNetworkAccessPolicyPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JitNetworkAccessPolicyProperties model = BinaryData.fromString(
            "{\"virtualMachines\":[{\"id\":\"hlr\",\"ports\":[{\"number\":1371551123,\"protocol\":\"UDP\",\"allowedSourceAddressPrefix\":\"ofldseacdhz\",\"allowedSourceAddressPrefixes\":[\"brfgdrwji\",\"ewhfjsrwqrxetf\",\"cwv\"],\"maxRequestAccessDuration\":\"r\"},{\"number\":879752953,\"protocol\":\"TCP\",\"allowedSourceAddressPrefix\":\"tycnawthvmaxg\",\"allowedSourceAddressPrefixes\":[\"eamc\",\"hudfjecehok\",\"cpqtwloesq\"],\"maxRequestAccessDuration\":\"ggvrbnyrukoilaci\"}],\"publicIpAddress\":\"wjleip\"}],\"requests\":[{\"virtualMachines\":[{\"id\":\"yxpzruzythqk\",\"ports\":[{\"number\":1855538040,\"endTimeUtc\":\"2021-08-03T00:04:35Z\",\"status\":\"Revoked\",\"statusReason\":\"Expired\"},{\"number\":1862409090,\"endTimeUtc\":\"2021-05-17T15:38:01Z\",\"status\":\"Revoked\",\"statusReason\":\"NewerRequestInitiated\"},{\"number\":1961557231,\"endTimeUtc\":\"2021-11-20T23:44:43Z\",\"status\":\"Revoked\",\"statusReason\":\"NewerRequestInitiated\"}]},{\"id\":\"xdm\",\"ports\":[{\"number\":114465876,\"endTimeUtc\":\"2021-11-16T23:48:23Z\",\"status\":\"Initiated\",\"statusReason\":\"Expired\"},{\"number\":1054335638,\"endTimeUtc\":\"2021-10-23T11:56:51Z\",\"status\":\"Revoked\",\"statusReason\":\"UserRequested\"},{\"number\":1377447657,\"endTimeUtc\":\"2021-03-25T10:50:22Z\",\"status\":\"Initiated\",\"statusReason\":\"Expired\"}]},{\"id\":\"mffhmjpddnyxfzuv\",\"ports\":[{\"number\":35101534,\"endTimeUtc\":\"2021-10-05T13:43:26Z\",\"status\":\"Initiated\",\"statusReason\":\"NewerRequestInitiated\"},{\"number\":817806781,\"endTimeUtc\":\"2021-04-11T20:16:51Z\",\"status\":\"Initiated\",\"statusReason\":\"Expired\"},{\"number\":464329614,\"endTimeUtc\":\"2021-11-02T04:55:23Z\",\"status\":\"Revoked\",\"statusReason\":\"NewerRequestInitiated\"}]}],\"startTimeUtc\":\"2021-06-14T07:35:17Z\",\"requestor\":\"mdyfoebojtj\",\"justification\":\"g\"}],\"provisioningState\":\"ohoqkpjtnqjilayw\"}")
            .toObject(JitNetworkAccessPolicyProperties.class);
        Assertions.assertEquals("hlr", model.virtualMachines().get(0).id());
        Assertions.assertEquals(1371551123, model.virtualMachines().get(0).ports().get(0).number());
        Assertions.assertEquals(Protocol.UDP, model.virtualMachines().get(0).ports().get(0).protocol());
        Assertions.assertEquals("ofldseacdhz",
            model.virtualMachines().get(0).ports().get(0).allowedSourceAddressPrefix());
        Assertions.assertEquals("brfgdrwji",
            model.virtualMachines().get(0).ports().get(0).allowedSourceAddressPrefixes().get(0));
        Assertions.assertEquals("r", model.virtualMachines().get(0).ports().get(0).maxRequestAccessDuration());
        Assertions.assertEquals("wjleip", model.virtualMachines().get(0).publicIpAddress());
        Assertions.assertEquals("yxpzruzythqk", model.requests().get(0).virtualMachines().get(0).id());
        Assertions.assertEquals(1855538040, model.requests().get(0).virtualMachines().get(0).ports().get(0).number());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-03T00:04:35Z"),
            model.requests().get(0).virtualMachines().get(0).ports().get(0).endTimeUtc());
        Assertions.assertEquals(Status.REVOKED,
            model.requests().get(0).virtualMachines().get(0).ports().get(0).status());
        Assertions.assertEquals(StatusReason.EXPIRED,
            model.requests().get(0).virtualMachines().get(0).ports().get(0).statusReason());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-14T07:35:17Z"), model.requests().get(0).startTimeUtc());
        Assertions.assertEquals("mdyfoebojtj", model.requests().get(0).requestor());
        Assertions.assertEquals("g", model.requests().get(0).justification());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JitNetworkAccessPolicyProperties model
            = new JitNetworkAccessPolicyProperties()
                .withVirtualMachines(
                    Arrays
                        .asList(
                            new JitNetworkAccessPolicyVirtualMachine().withId("hlr")
                                .withPorts(Arrays.asList(
                                    new JitNetworkAccessPortRule().withNumber(1371551123)
                                        .withProtocol(Protocol.UDP)
                                        .withAllowedSourceAddressPrefix("ofldseacdhz")
                                        .withAllowedSourceAddressPrefixes(Arrays.asList("brfgdrwji", "ewhfjsrwqrxetf",
                                            "cwv"))
                                        .withMaxRequestAccessDuration("r"),
                                    new JitNetworkAccessPortRule().withNumber(879752953)
                                        .withProtocol(Protocol.TCP)
                                        .withAllowedSourceAddressPrefix("tycnawthvmaxg")
                                        .withAllowedSourceAddressPrefixes(Arrays.asList("eamc", "hudfjecehok",
                                            "cpqtwloesq"))
                                        .withMaxRequestAccessDuration("ggvrbnyrukoilaci")))
                                .withPublicIpAddress("wjleip")))
                .withRequests(
                    Arrays
                        .asList(
                            new JitNetworkAccessRequestInner()
                                .withVirtualMachines(
                                    Arrays
                                        .asList(
                                            new JitNetworkAccessRequestVirtualMachine().withId("yxpzruzythqk")
                                                .withPorts(
                                                    Arrays.asList(
                                                        new JitNetworkAccessRequestPort().withNumber(1855538040)
                                                            .withEndTimeUtc(
                                                                OffsetDateTime.parse("2021-08-03T00:04:35Z"))
                                                            .withStatus(Status.REVOKED)
                                                            .withStatusReason(StatusReason.EXPIRED),
                                                        new JitNetworkAccessRequestPort().withNumber(1862409090)
                                                            .withEndTimeUtc(
                                                                OffsetDateTime.parse("2021-05-17T15:38:01Z"))
                                                            .withStatus(Status.REVOKED)
                                                            .withStatusReason(StatusReason.NEWER_REQUEST_INITIATED),
                                                        new JitNetworkAccessRequestPort().withNumber(1961557231)
                                                            .withEndTimeUtc(
                                                                OffsetDateTime.parse("2021-11-20T23:44:43Z"))
                                                            .withStatus(Status.REVOKED)
                                                            .withStatusReason(StatusReason.NEWER_REQUEST_INITIATED))),
                                            new JitNetworkAccessRequestVirtualMachine().withId("xdm")
                                                .withPorts(
                                                    Arrays.asList(
                                                        new JitNetworkAccessRequestPort().withNumber(114465876)
                                                            .withEndTimeUtc(
                                                                OffsetDateTime.parse("2021-11-16T23:48:23Z"))
                                                            .withStatus(Status.INITIATED)
                                                            .withStatusReason(StatusReason.EXPIRED),
                                                        new JitNetworkAccessRequestPort().withNumber(1054335638)
                                                            .withEndTimeUtc(
                                                                OffsetDateTime.parse("2021-10-23T11:56:51Z"))
                                                            .withStatus(Status.REVOKED)
                                                            .withStatusReason(StatusReason.USER_REQUESTED),
                                                        new JitNetworkAccessRequestPort().withNumber(1377447657)
                                                            .withEndTimeUtc(
                                                                OffsetDateTime.parse("2021-03-25T10:50:22Z"))
                                                            .withStatus(Status.INITIATED)
                                                            .withStatusReason(StatusReason.EXPIRED))),
                                            new JitNetworkAccessRequestVirtualMachine().withId("mffhmjpddnyxfzuv")
                                                .withPorts(
                                                    Arrays.asList(
                                                        new JitNetworkAccessRequestPort().withNumber(35101534)
                                                            .withEndTimeUtc(
                                                                OffsetDateTime.parse("2021-10-05T13:43:26Z"))
                                                            .withStatus(Status.INITIATED)
                                                            .withStatusReason(StatusReason.NEWER_REQUEST_INITIATED),
                                                        new JitNetworkAccessRequestPort().withNumber(817806781)
                                                            .withEndTimeUtc(
                                                                OffsetDateTime.parse("2021-04-11T20:16:51Z"))
                                                            .withStatus(Status.INITIATED)
                                                            .withStatusReason(StatusReason.EXPIRED),
                                                        new JitNetworkAccessRequestPort().withNumber(464329614)
                                                            .withEndTimeUtc(
                                                                OffsetDateTime.parse("2021-11-02T04:55:23Z"))
                                                            .withStatus(Status.REVOKED)
                                                            .withStatusReason(StatusReason.NEWER_REQUEST_INITIATED)))))
                                .withStartTimeUtc(OffsetDateTime.parse("2021-06-14T07:35:17Z"))
                                .withRequestor("mdyfoebojtj")
                                .withJustification("g")));
        model = BinaryData.fromObject(model).toObject(JitNetworkAccessPolicyProperties.class);
        Assertions.assertEquals("hlr", model.virtualMachines().get(0).id());
        Assertions.assertEquals(1371551123, model.virtualMachines().get(0).ports().get(0).number());
        Assertions.assertEquals(Protocol.UDP, model.virtualMachines().get(0).ports().get(0).protocol());
        Assertions.assertEquals("ofldseacdhz",
            model.virtualMachines().get(0).ports().get(0).allowedSourceAddressPrefix());
        Assertions.assertEquals("brfgdrwji",
            model.virtualMachines().get(0).ports().get(0).allowedSourceAddressPrefixes().get(0));
        Assertions.assertEquals("r", model.virtualMachines().get(0).ports().get(0).maxRequestAccessDuration());
        Assertions.assertEquals("wjleip", model.virtualMachines().get(0).publicIpAddress());
        Assertions.assertEquals("yxpzruzythqk", model.requests().get(0).virtualMachines().get(0).id());
        Assertions.assertEquals(1855538040, model.requests().get(0).virtualMachines().get(0).ports().get(0).number());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-03T00:04:35Z"),
            model.requests().get(0).virtualMachines().get(0).ports().get(0).endTimeUtc());
        Assertions.assertEquals(Status.REVOKED,
            model.requests().get(0).virtualMachines().get(0).ports().get(0).status());
        Assertions.assertEquals(StatusReason.EXPIRED,
            model.requests().get(0).virtualMachines().get(0).ports().get(0).statusReason());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-14T07:35:17Z"), model.requests().get(0).startTimeUtc());
        Assertions.assertEquals("mdyfoebojtj", model.requests().get(0).requestor());
        Assertions.assertEquals("g", model.requests().get(0).justification());
    }
}
