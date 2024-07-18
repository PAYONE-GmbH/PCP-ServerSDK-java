/*
 * This source file was generated by the Gradle 'init' task
 */

package com.payone.commerce.platform.lib.endpoints;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.payone.commerce.platform.lib.ApiResponseException;
import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.models.CommerceCaseResponse;
import com.payone.commerce.platform.lib.models.CreateCommerceCaseRequest;
import com.payone.commerce.platform.lib.models.CreateCommerceCaseResponse;
import com.payone.commerce.platform.lib.models.Customer;
import com.payone.commerce.platform.lib.models.ErrorResponse;
import com.payone.commerce.platform.lib.queries.GetCommerceCasesQuery;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class CommerceCaseApiClient extends BaseApiClient {

    public CommerceCaseApiClient(CommunicatorConfiguration config) throws InvalidKeyException {
        super(config);
    }

    public CreateCommerceCaseResponse createCommerceCaseRequest(String merchantId, CreateCommerceCaseRequest payload)
            throws ApiResponseException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException("Merchant ID is required");
        }

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host(this.getConfig().getHost())
                .addPathSegment("v1")
                .addPathSegment(merchantId)
                .addPathSegment("commerce-cases")
                .build();

        String jsonString = getJsonMapper().writeValueAsString(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header("Content-Type", formBody.contentType().toString())
                .build();

        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);

        Response response = this.getClient().newCall(request).execute();

        try {
            if (!response.isSuccessful()) {
                if (response.code() != 400) {
                    throw new RuntimeException("Api error: " + response.code());
                }
                ErrorResponse error = getJsonMapper().readValue(response.body().string(), ErrorResponse.class);
                throw new ApiResponseException(error);
            }
            return getJsonMapper().readValue(response.body().string(), CreateCommerceCaseResponse.class);
        } catch (JsonMappingException e) {
            throw new RuntimeException("Excepted valid JSON response, but failed to parse", e);
        }

    }

    public List<CommerceCaseResponse> getAllCommerceCaseRequest(String merchantId)
            throws ApiResponseException, IOException {
        return getAllCommerceCaseRequest(merchantId, null);
    }

    public List<CommerceCaseResponse> getAllCommerceCaseRequest(String merchantId,
            GetCommerceCasesQuery queryParams) throws ApiResponseException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException("Merchant ID is required");
        }

        HttpUrl.Builder urlBuilder = new HttpUrl.Builder()
                .scheme("https")
                .host(this.getConfig().getHost())
                .addPathSegment("v1")
                .addPathSegment(merchantId)
                .addPathSegment("commerce-cases");

        if (queryParams != null) {
            for (Map.Entry<String, String> entry : queryParams.toQueryMap().entrySet()) {
                urlBuilder.addQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        HttpUrl url = urlBuilder.build();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);

        Response response = this.getClient().newCall(request).execute();

        try {
            if (!response.isSuccessful()) {
                if (response.code() != 400) {
                    throw new RuntimeException("Api error: " + response.code());
                }
                ErrorResponse error = getJsonMapper().readValue(response.body().string(), ErrorResponse.class);
                throw new ApiResponseException(error);
            }
            return getJsonMapper().readValue(response.body().string(),
                    new TypeReference<List<CommerceCaseResponse>>() {
                    });
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Excepted valid JSON response, but failed to parse", e);
        }

    }

    public CommerceCaseResponse getCommerceCaseRequest(String merchantId,
            String commerceCaseId) throws ApiResponseException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException("Merchant ID is required");
        }
        if (commerceCaseId == null) {
            throw new IllegalArgumentException("Commerce Case ID is required");
        }

        HttpUrl.Builder urlBuilder = new HttpUrl.Builder()
                .scheme("https")
                .host(this.getConfig().getHost())
                .addPathSegment("v1")
                .addPathSegment(merchantId)
                .addPathSegment("commerce-cases")
                .addPathSegment(commerceCaseId);

        HttpUrl url = urlBuilder.build();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);

        Response response = this.getClient().newCall(request).execute();

        try {
            if (!response.isSuccessful()) {
                if (response.code() != 400) {
                    throw new RuntimeException("Api error: " + response.code());
                }
                ErrorResponse error = getJsonMapper().readValue(response.body().string(), ErrorResponse.class);
                throw new ApiResponseException(error);
            }
            return getJsonMapper().readValue(response.body().string(), CommerceCaseResponse.class);
        } catch (JsonMappingException e) {
            throw new RuntimeException("Excepted valid JSON response, but failed to parse", e);
        }

    }

    public void updateCommerceCaseRequest(String merchantId, String commerceCaseId,
            Customer payload) throws IOException, ApiResponseException {
        if (merchantId == null) {
            throw new IllegalArgumentException("Merchant ID is required");
        }
        if (commerceCaseId == null) {
            throw new IllegalArgumentException("Commerce Case ID is required");
        }

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host(this.getConfig().getHost())
                .addPathSegment("v1")
                .addPathSegment(merchantId)
                .addPathSegment("commerce-cases")
                .addPathSegment(commerceCaseId)
                .build();

        String jsonString = null;
        try {
            jsonString = getJsonMapper().writeValueAsString(payload);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to encode payload as json", e);
        }

        RequestBody formBody = RequestBody.create("{\"customer\":" + jsonString + "}", JSON);

        Request request = new Request.Builder()
                .url(url)
                .patch(formBody)
                .header("Content-Type", formBody.contentType().toString())
                .build();

        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);

        Response response = this.getClient().newCall(request).execute();
        try {
            if (!response.isSuccessful()) {
                if (response.code() != 400) {
                    throw new RuntimeException("Api error: " + response.code());
                }
                ErrorResponse error = getJsonMapper().readValue(response.body().string(), ErrorResponse.class);
                throw new ApiResponseException(error);
            }

        } catch (JsonMappingException e) {
            throw new RuntimeException("Excepted valid JSON response, but failed to parse", e);
        }

    }
}
