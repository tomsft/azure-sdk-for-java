// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.RuleResultsInner;
import com.azure.resourcemanager.security.fluent.models.RulesResultsInner;
import com.azure.resourcemanager.security.models.RuleResultsProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RulesResultsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RulesResultsInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"results\":[[\"ffhmouwqlgzr\",\"zeeyebi\",\"ikayuhqlbjbsybb\"]]},\"id\":\"wrv\",\"name\":\"ldgmfpgvmpip\",\"type\":\"slthaq\"},{\"properties\":{\"results\":[[\"wutwbdsre\",\"pdrhne\",\"yowqkdwytisibir\"],[\"pikpz\",\"mejzanlfzxia\",\"rmbzo\"],[\"kixrj\",\"cirgzp\",\"rlazszrnw\"],[\"indfpwpjyl\"]]},\"id\":\"bt\",\"name\":\"h\",\"type\":\"lsj\"}]}")
            .toObject(RulesResultsInner.class);
        Assertions.assertEquals("ffhmouwqlgzr", model.value().get(0).properties().results().get(0).get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RulesResultsInner model = new RulesResultsInner().withValue(Arrays.asList(
            new RuleResultsInner().withProperties(new RuleResultsProperties()
                .withResults(Arrays.asList(Arrays.asList("ffhmouwqlgzr", "zeeyebi", "ikayuhqlbjbsybb")))),
            new RuleResultsInner().withProperties(new RuleResultsProperties()
                .withResults(Arrays.asList(Arrays.asList("wutwbdsre", "pdrhne", "yowqkdwytisibir"),
                    Arrays.asList("pikpz", "mejzanlfzxia", "rmbzo"), Arrays.asList("kixrj", "cirgzp", "rlazszrnw"),
                    Arrays.asList("indfpwpjyl"))))));
        model = BinaryData.fromObject(model).toObject(RulesResultsInner.class);
        Assertions.assertEquals("ffhmouwqlgzr", model.value().get(0).properties().results().get(0).get(0));
    }
}
