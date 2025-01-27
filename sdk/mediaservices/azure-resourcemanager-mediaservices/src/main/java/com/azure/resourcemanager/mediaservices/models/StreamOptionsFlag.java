// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for StreamOptionsFlag.
 */
public final class StreamOptionsFlag extends ExpandableStringEnum<StreamOptionsFlag> {
    /**
     * Static value Default for StreamOptionsFlag.
     */
    public static final StreamOptionsFlag DEFAULT = fromString("Default");

    /**
     * Static value LowLatency for StreamOptionsFlag.
     */
    public static final StreamOptionsFlag LOW_LATENCY = fromString("LowLatency");

    /**
     * Static value LowLatencyV2 for StreamOptionsFlag.
     */
    public static final StreamOptionsFlag LOW_LATENCY_V2 = fromString("LowLatencyV2");

    /**
     * Creates a new instance of StreamOptionsFlag value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public StreamOptionsFlag() {
    }

    /**
     * Creates or finds a StreamOptionsFlag from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding StreamOptionsFlag.
     */
    public static StreamOptionsFlag fromString(String name) {
        return fromString(name, StreamOptionsFlag.class);
    }

    /**
     * Gets known StreamOptionsFlag values.
     * 
     * @return known StreamOptionsFlag values.
     */
    public static Collection<StreamOptionsFlag> values() {
        return values(StreamOptionsFlag.class);
    }
}
