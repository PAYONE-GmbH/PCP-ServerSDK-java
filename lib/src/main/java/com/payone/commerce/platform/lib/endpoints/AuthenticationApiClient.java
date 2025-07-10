package com.payone.commerce.platform.lib.endpoints;

import java.io.IOException;
import java.security.InvalidKeyException;

import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.errors.ApiErrorResponseException;
import com.payone.commerce.platform.lib.errors.ApiResponseRetrievalException;
import com.payone.commerce.platform.lib.models.AuthenticationToken;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;

public class AuthenticationApiClient extends BaseApiClient {

    public AuthenticationApiClient(CommunicatorConfiguration config) throws InvalidKeyException {
        super(config);
    }

    /**
     * Generate an authentication JWT token for a merchant.
     *
     * @param merchantId The Merchant Id (required)
     * @param requestId  Optional X-Request-ID header value (may be null)
     * @return AuthenticationToken
     * @throws ApiErrorResponseException
     * @throws ApiResponseRetrievalException
     * @throws IOException
     */
    public AuthenticationToken getAuthenticationTokens(String merchantId, String requestId)
            throws ApiErrorResponseException, ApiResponseRetrievalException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException(MERCHANT_ID_REQUIRED_ERROR);
        }

        HttpUrl url = new HttpUrl.Builder()
                .scheme(HTTPS_SCHEME)
                .host(this.getConfig().getHost())
                .addPathSegment(PCP_PATH_SEGMENT_VERSION)
                .addPathSegment(merchantId)
                .addPathSegment("authentication-tokens")
                .build();

        RequestBody formBody = RequestBody.create(new byte[0], JSON);

        Request.Builder requestBuilder = new Request.Builder()
                .url(url)
                .post(formBody)
                .header(CONTENT_TYPE_HEADER_NAME, JSON.toString());

        if (requestId != null) {
            requestBuilder.header("X-Request-ID", requestId);
        }

        Request request = requestBuilder.build();
        return this.makeApiCall(request, AuthenticationToken.class);
    }

}
