// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storageimportexport.fluent.LocationsClient;
import com.azure.resourcemanager.storageimportexport.fluent.models.LocationInner;
import com.azure.resourcemanager.storageimportexport.models.Location;
import com.azure.resourcemanager.storageimportexport.models.Locations;

public final class LocationsImpl implements Locations {
    private static final ClientLogger LOGGER = new ClientLogger(LocationsImpl.class);

    private final LocationsClient innerClient;

    private final com.azure.resourcemanager.storageimportexport.StorageImportExportManager serviceManager;

    public LocationsImpl(LocationsClient innerClient,
        com.azure.resourcemanager.storageimportexport.StorageImportExportManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Location> list() {
        PagedIterable<LocationInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new LocationImpl(inner1, this.manager()));
    }

    public PagedIterable<Location> list(Context context) {
        PagedIterable<LocationInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new LocationImpl(inner1, this.manager()));
    }

    public Response<Location> getWithResponse(String locationName, Context context) {
        Response<LocationInner> inner = this.serviceClient().getWithResponse(locationName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new LocationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Location get(String locationName) {
        LocationInner inner = this.serviceClient().get(locationName);
        if (inner != null) {
            return new LocationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private LocationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storageimportexport.StorageImportExportManager manager() {
        return this.serviceManager;
    }
}
