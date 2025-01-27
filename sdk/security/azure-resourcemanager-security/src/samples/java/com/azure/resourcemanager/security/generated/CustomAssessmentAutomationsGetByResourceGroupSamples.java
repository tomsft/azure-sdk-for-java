// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for CustomAssessmentAutomations GetByResourceGroup.
 */
public final class CustomAssessmentAutomationsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2021-07-01-preview/examples/
     * CustomAssessmentAutomations/customAssessmentAutomationGet_example.json
     */
    /**
     * Sample code: Get a Custom Assessment Automation.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getACustomAssessmentAutomation(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.customAssessmentAutomations()
            .getByResourceGroupWithResponse("TestResourceGroup", "MyCustomAssessmentAutomation",
                com.azure.core.util.Context.NONE);
    }
}
