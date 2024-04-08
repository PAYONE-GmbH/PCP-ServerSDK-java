/*
 * Commerce Platform API
 * RESTful API for the creation of Commerce Cases with Checkouts and the execution of Payments. 
 *
 * The version of the OpenAPI document: 1.5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package client.api;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.UUID;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

import client.ApiClient;
import client.ApiException;
import client.Configuration;
import client.Pair;
import client.models.PaymentInformationRequest;
import client.models.PaymentInformationResponse;

public class PaymentInformationApi {


  private ApiClient apiClient;

  public PaymentInformationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PaymentInformationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a Payment Information
   * Creates a new Payment Information for the given Checkout.
   * @param merchantId The merchantId identifies uniquely the merchant. (required)
   * @param commerceCaseId Unique identifier of a Commerce Case. (required)
   * @param checkoutId Unique identifier of a Checkout (required)
   * @param paymentInformationRequest  (required)
   * @return PaymentInformationResponse
   * @throws ApiException if fails to make API call
   */
  public PaymentInformationResponse createPaymentInformation(String merchantId, UUID commerceCaseId, UUID checkoutId, PaymentInformationRequest paymentInformationRequest) throws ApiException {
    return this.createPaymentInformation(merchantId, commerceCaseId, checkoutId, paymentInformationRequest, Collections.emptyMap());
  }


  /**
   * Create a Payment Information
   * Creates a new Payment Information for the given Checkout.
   * @param merchantId The merchantId identifies uniquely the merchant. (required)
   * @param commerceCaseId Unique identifier of a Commerce Case. (required)
   * @param checkoutId Unique identifier of a Checkout (required)
   * @param paymentInformationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return PaymentInformationResponse
   * @throws ApiException if fails to make API call
   */
  public PaymentInformationResponse createPaymentInformation(String merchantId, UUID commerceCaseId, UUID checkoutId, PaymentInformationRequest paymentInformationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = paymentInformationRequest;
    
    // verify the required parameter 'merchantId' is set
    if (merchantId == null) {
      throw new ApiException(400, "Missing the required parameter 'merchantId' when calling createPaymentInformation");
    }
    
    // verify the required parameter 'commerceCaseId' is set
    if (commerceCaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'commerceCaseId' when calling createPaymentInformation");
    }
    
    // verify the required parameter 'checkoutId' is set
    if (checkoutId == null) {
      throw new ApiException(400, "Missing the required parameter 'checkoutId' when calling createPaymentInformation");
    }
    
    // verify the required parameter 'paymentInformationRequest' is set
    if (paymentInformationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentInformationRequest' when calling createPaymentInformation");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{merchantId}/commerce-cases/{commerceCaseId}/checkouts/{checkoutId}/payment-information"
      .replaceAll("\\{" + "merchantId" + "\\}", apiClient.escapeString(merchantId.toString()))
      .replaceAll("\\{" + "commerceCaseId" + "\\}", apiClient.escapeString(commerceCaseId.toString()))
      .replaceAll("\\{" + "checkoutId" + "\\}", apiClient.escapeString(checkoutId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<PaymentInformationResponse> localVarReturnType = new TypeReference<PaymentInformationResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Get a Payment Information
   * This endpoint can be used to get a paymentInformation of a Checkout.
   * @param merchantId The merchantId identifies uniquely the merchant. (required)
   * @param commerceCaseId Unique identifier of a Commerce Case. (required)
   * @param checkoutId Unique identifier of a Checkout (required)
   * @param paymentInformationId Unique identifier of a paymentInformation (required)
   * @return PaymentInformationResponse
   * @throws ApiException if fails to make API call
   */
  public PaymentInformationResponse getPaymentInformation(String merchantId, UUID commerceCaseId, UUID checkoutId, UUID paymentInformationId) throws ApiException {
    return this.getPaymentInformation(merchantId, commerceCaseId, checkoutId, paymentInformationId, Collections.emptyMap());
  }


  /**
   * Get a Payment Information
   * This endpoint can be used to get a paymentInformation of a Checkout.
   * @param merchantId The merchantId identifies uniquely the merchant. (required)
   * @param commerceCaseId Unique identifier of a Commerce Case. (required)
   * @param checkoutId Unique identifier of a Checkout (required)
   * @param paymentInformationId Unique identifier of a paymentInformation (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return PaymentInformationResponse
   * @throws ApiException if fails to make API call
   */
  public PaymentInformationResponse getPaymentInformation(String merchantId, UUID commerceCaseId, UUID checkoutId, UUID paymentInformationId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'merchantId' is set
    if (merchantId == null) {
      throw new ApiException(400, "Missing the required parameter 'merchantId' when calling getPaymentInformation");
    }
    
    // verify the required parameter 'commerceCaseId' is set
    if (commerceCaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'commerceCaseId' when calling getPaymentInformation");
    }
    
    // verify the required parameter 'checkoutId' is set
    if (checkoutId == null) {
      throw new ApiException(400, "Missing the required parameter 'checkoutId' when calling getPaymentInformation");
    }
    
    // verify the required parameter 'paymentInformationId' is set
    if (paymentInformationId == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentInformationId' when calling getPaymentInformation");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{merchantId}/commerce-cases/{commerceCaseId}/checkouts/{checkoutId}/payment-information/{paymentInformationId}"
      .replaceAll("\\{" + "merchantId" + "\\}", apiClient.escapeString(merchantId.toString()))
      .replaceAll("\\{" + "commerceCaseId" + "\\}", apiClient.escapeString(commerceCaseId.toString()))
      .replaceAll("\\{" + "checkoutId" + "\\}", apiClient.escapeString(checkoutId.toString()))
      .replaceAll("\\{" + "paymentInformationId" + "\\}", apiClient.escapeString(paymentInformationId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<PaymentInformationResponse> localVarReturnType = new TypeReference<PaymentInformationResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

}
