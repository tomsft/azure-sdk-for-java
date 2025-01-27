// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.billingbenefits.fluent.SavingsPlanOrderAliasClient;
import com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanOrderAliasModelInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in SavingsPlanOrderAliasClient.
 */
public final class SavingsPlanOrderAliasClientImpl implements SavingsPlanOrderAliasClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final SavingsPlanOrderAliasService service;

    /**
     * The service client containing this operation class.
     */
    private final BillingBenefitsRPImpl client;

    /**
     * Initializes an instance of SavingsPlanOrderAliasClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    SavingsPlanOrderAliasClientImpl(BillingBenefitsRPImpl client) {
        this.service = RestProxy.create(SavingsPlanOrderAliasService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingBenefitsRPSavingsPlanOrderAlias to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "BillingBenefitsRPSav")
    public interface SavingsPlanOrderAliasService {
        @Headers({ "Content-Type: application/json" })
        @Put("/providers/Microsoft.BillingBenefits/savingsPlanOrderAliases/{savingsPlanOrderAliasName}")
        @ExpectedResponses({ 200, 201 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> create(@HostParam("$host") String endpoint,
            @PathParam("savingsPlanOrderAliasName") String savingsPlanOrderAliasName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") SavingsPlanOrderAliasModelInner body, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/providers/Microsoft.BillingBenefits/savingsPlanOrderAliases/{savingsPlanOrderAliasName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SavingsPlanOrderAliasModelInner>> get(@HostParam("$host") String endpoint,
            @PathParam("savingsPlanOrderAliasName") String savingsPlanOrderAliasName,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Create a savings plan. Learn more about permissions needed at https://go.microsoft.com/fwlink/?linkid=2215851.
     * 
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @param body Request body for creating a savings plan order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return savings plan order alias along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(String savingsPlanOrderAliasName,
        SavingsPlanOrderAliasModelInner body) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (savingsPlanOrderAliasName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter savingsPlanOrderAliasName is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.create(this.client.getEndpoint(), savingsPlanOrderAliasName,
                this.client.getApiVersion(), body, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Create a savings plan. Learn more about permissions needed at https://go.microsoft.com/fwlink/?linkid=2215851.
     * 
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @param body Request body for creating a savings plan order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return savings plan order alias along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(String savingsPlanOrderAliasName,
        SavingsPlanOrderAliasModelInner body, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (savingsPlanOrderAliasName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter savingsPlanOrderAliasName is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.create(this.client.getEndpoint(), savingsPlanOrderAliasName, this.client.getApiVersion(), body,
            accept, context);
    }

    /**
     * Create a savings plan. Learn more about permissions needed at https://go.microsoft.com/fwlink/?linkid=2215851.
     * 
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @param body Request body for creating a savings plan order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of savings plan order alias.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<SavingsPlanOrderAliasModelInner>, SavingsPlanOrderAliasModelInner>
        beginCreateAsync(String savingsPlanOrderAliasName, SavingsPlanOrderAliasModelInner body) {
        Mono<Response<Flux<ByteBuffer>>> mono = createWithResponseAsync(savingsPlanOrderAliasName, body);
        return this.client.<SavingsPlanOrderAliasModelInner, SavingsPlanOrderAliasModelInner>getLroResult(mono,
            this.client.getHttpPipeline(), SavingsPlanOrderAliasModelInner.class, SavingsPlanOrderAliasModelInner.class,
            this.client.getContext());
    }

    /**
     * Create a savings plan. Learn more about permissions needed at https://go.microsoft.com/fwlink/?linkid=2215851.
     * 
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @param body Request body for creating a savings plan order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of savings plan order alias.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<SavingsPlanOrderAliasModelInner>, SavingsPlanOrderAliasModelInner>
        beginCreateAsync(String savingsPlanOrderAliasName, SavingsPlanOrderAliasModelInner body, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono = createWithResponseAsync(savingsPlanOrderAliasName, body, context);
        return this.client.<SavingsPlanOrderAliasModelInner, SavingsPlanOrderAliasModelInner>getLroResult(mono,
            this.client.getHttpPipeline(), SavingsPlanOrderAliasModelInner.class, SavingsPlanOrderAliasModelInner.class,
            context);
    }

    /**
     * Create a savings plan. Learn more about permissions needed at https://go.microsoft.com/fwlink/?linkid=2215851.
     * 
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @param body Request body for creating a savings plan order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of savings plan order alias.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<SavingsPlanOrderAliasModelInner>, SavingsPlanOrderAliasModelInner>
        beginCreate(String savingsPlanOrderAliasName, SavingsPlanOrderAliasModelInner body) {
        return this.beginCreateAsync(savingsPlanOrderAliasName, body).getSyncPoller();
    }

    /**
     * Create a savings plan. Learn more about permissions needed at https://go.microsoft.com/fwlink/?linkid=2215851.
     * 
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @param body Request body for creating a savings plan order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of savings plan order alias.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<SavingsPlanOrderAliasModelInner>, SavingsPlanOrderAliasModelInner>
        beginCreate(String savingsPlanOrderAliasName, SavingsPlanOrderAliasModelInner body, Context context) {
        return this.beginCreateAsync(savingsPlanOrderAliasName, body, context).getSyncPoller();
    }

    /**
     * Create a savings plan. Learn more about permissions needed at https://go.microsoft.com/fwlink/?linkid=2215851.
     * 
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @param body Request body for creating a savings plan order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return savings plan order alias on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SavingsPlanOrderAliasModelInner> createAsync(String savingsPlanOrderAliasName,
        SavingsPlanOrderAliasModelInner body) {
        return beginCreateAsync(savingsPlanOrderAliasName, body).last().flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Create a savings plan. Learn more about permissions needed at https://go.microsoft.com/fwlink/?linkid=2215851.
     * 
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @param body Request body for creating a savings plan order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return savings plan order alias on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SavingsPlanOrderAliasModelInner> createAsync(String savingsPlanOrderAliasName,
        SavingsPlanOrderAliasModelInner body, Context context) {
        return beginCreateAsync(savingsPlanOrderAliasName, body, context).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Create a savings plan. Learn more about permissions needed at https://go.microsoft.com/fwlink/?linkid=2215851.
     * 
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @param body Request body for creating a savings plan order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return savings plan order alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SavingsPlanOrderAliasModelInner create(String savingsPlanOrderAliasName,
        SavingsPlanOrderAliasModelInner body) {
        return createAsync(savingsPlanOrderAliasName, body).block();
    }

    /**
     * Create a savings plan. Learn more about permissions needed at https://go.microsoft.com/fwlink/?linkid=2215851.
     * 
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @param body Request body for creating a savings plan order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return savings plan order alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SavingsPlanOrderAliasModelInner create(String savingsPlanOrderAliasName,
        SavingsPlanOrderAliasModelInner body, Context context) {
        return createAsync(savingsPlanOrderAliasName, body, context).block();
    }

    /**
     * Get a savings plan.
     * 
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a savings plan along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SavingsPlanOrderAliasModelInner>> getWithResponseAsync(String savingsPlanOrderAliasName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (savingsPlanOrderAliasName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter savingsPlanOrderAliasName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), savingsPlanOrderAliasName,
                this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a savings plan.
     * 
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a savings plan along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SavingsPlanOrderAliasModelInner>> getWithResponseAsync(String savingsPlanOrderAliasName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (savingsPlanOrderAliasName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter savingsPlanOrderAliasName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), savingsPlanOrderAliasName, this.client.getApiVersion(), accept,
            context);
    }

    /**
     * Get a savings plan.
     * 
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a savings plan on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SavingsPlanOrderAliasModelInner> getAsync(String savingsPlanOrderAliasName) {
        return getWithResponseAsync(savingsPlanOrderAliasName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a savings plan.
     * 
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a savings plan along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SavingsPlanOrderAliasModelInner> getWithResponse(String savingsPlanOrderAliasName,
        Context context) {
        return getWithResponseAsync(savingsPlanOrderAliasName, context).block();
    }

    /**
     * Get a savings plan.
     * 
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a savings plan.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SavingsPlanOrderAliasModelInner get(String savingsPlanOrderAliasName) {
        return getWithResponse(savingsPlanOrderAliasName, Context.NONE).getValue();
    }
}
