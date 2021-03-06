// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.fluent.inner.OperationListResultInner;
import com.azure.resourcemanager.containerservice.fluent.inner.OperationValueInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Operations. */
public final class OperationsClient {
    private final ClientLogger logger = new ClientLogger(OperationsClient.class);

    /** The proxy service used to perform REST calls. */
    private final OperationsService service;

    /** The service client containing this operation class. */
    private final ContainerServiceManagementClient client;

    /**
     * Initializes an instance of OperationsClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsClient(ContainerServiceManagementClient client) {
        this.service =
            RestProxy.create(OperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ContainerServiceManagementClientOperations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ContainerServiceMana")
    private interface OperationsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/providers/Microsoft.ContainerService/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OperationListResultInner>> list(
            @HostParam("$host") String endpoint, @QueryParam("api-version") String apiVersion, Context context);
    }

    /**
     * Gets a list of compute operations.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of compute operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<OperationValueInner>> listSinglePageAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2020-06-01";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), apiVersion, context))
            .<PagedResponse<OperationValueInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a list of compute operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of compute operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<OperationValueInner>> listSinglePageAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2020-06-01";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Gets a list of compute operations.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of compute operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<OperationValueInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync());
    }

    /**
     * Gets a list of compute operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of compute operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<OperationValueInner> listAsync(Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(context));
    }

    /**
     * Gets a list of compute operations.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of compute operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<OperationValueInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Gets a list of compute operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of compute operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<OperationValueInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }
}
