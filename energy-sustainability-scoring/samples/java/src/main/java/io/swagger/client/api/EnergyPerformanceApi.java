/*
 * Energy Scoring
 * Schneider Electric provides OpenESX Energy Scoring API for its customer to integrate EcoStruxure services with their own Energy Scoring Provider of choice in order to evaluate buildings energy consumption and provide scores
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.CertificationProvider;
import io.swagger.client.model.CertificationScore;
import io.swagger.client.model.Error;
import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.Timeserie;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnergyPerformanceApi {
    private ApiClient apiClient;

    public EnergyPerformanceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EnergyPerformanceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createCertificationScores
     * @param siteId  (required)
     * @param body Energy Score resource to be created (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createCertificationScoresCall(String siteId, List<CertificationScore> body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/sites/{site-id}/certification-scores"
            .replaceAll("\\{" + "site-id" + "\\}", apiClient.escapeString(siteId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Oauth2AuthCode" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createCertificationScoresValidateBeforeCall(String siteId, List<CertificationScore> body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'siteId' is set
        if (siteId == null) {
            throw new ApiException("Missing the required parameter 'siteId' when calling createCertificationScores(Async)");
        }
        
        com.squareup.okhttp.Call call = createCertificationScoresCall(siteId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates Certification Score resources
     * 
     * @param siteId  (required)
     * @param body Energy Score resource to be created (optional)
     * @return List&lt;CertificationScore&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CertificationScore> createCertificationScores(String siteId, List<CertificationScore> body) throws ApiException {
        ApiResponse<List<CertificationScore>> resp = createCertificationScoresWithHttpInfo(siteId, body);
        return resp.getData();
    }

    /**
     * Creates Certification Score resources
     * 
     * @param siteId  (required)
     * @param body Energy Score resource to be created (optional)
     * @return ApiResponse&lt;List&lt;CertificationScore&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CertificationScore>> createCertificationScoresWithHttpInfo(String siteId, List<CertificationScore> body) throws ApiException {
        com.squareup.okhttp.Call call = createCertificationScoresValidateBeforeCall(siteId, body, null, null);
        Type localVarReturnType = new TypeToken<List<CertificationScore>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates Certification Score resources (asynchronously)
     * 
     * @param siteId  (required)
     * @param body Energy Score resource to be created (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createCertificationScoresAsync(String siteId, List<CertificationScore> body, final ApiCallback<List<CertificationScore>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createCertificationScoresValidateBeforeCall(siteId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CertificationScore>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createEnergyCertification
     * @param siteId  (required)
     * @param body Certification Provider resource to be created (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createEnergyCertificationCall(String siteId, CertificationProvider body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/sites/{site-id}/certification-providers"
            .replaceAll("\\{" + "site-id" + "\\}", apiClient.escapeString(siteId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Oauth2AuthCode" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createEnergyCertificationValidateBeforeCall(String siteId, CertificationProvider body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'siteId' is set
        if (siteId == null) {
            throw new ApiException("Missing the required parameter 'siteId' when calling createEnergyCertification(Async)");
        }
        
        com.squareup.okhttp.Call call = createEnergyCertificationCall(siteId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates an Certification Provider resource
     * Creates an Certification resource, to associate a site to an Certification Scoring Provider
     * @param siteId  (required)
     * @param body Certification Provider resource to be created (optional)
     * @return CertificationProvider
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CertificationProvider createEnergyCertification(String siteId, CertificationProvider body) throws ApiException {
        ApiResponse<CertificationProvider> resp = createEnergyCertificationWithHttpInfo(siteId, body);
        return resp.getData();
    }

    /**
     * Creates an Certification Provider resource
     * Creates an Certification resource, to associate a site to an Certification Scoring Provider
     * @param siteId  (required)
     * @param body Certification Provider resource to be created (optional)
     * @return ApiResponse&lt;CertificationProvider&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CertificationProvider> createEnergyCertificationWithHttpInfo(String siteId, CertificationProvider body) throws ApiException {
        com.squareup.okhttp.Call call = createEnergyCertificationValidateBeforeCall(siteId, body, null, null);
        Type localVarReturnType = new TypeToken<CertificationProvider>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates an Certification Provider resource (asynchronously)
     * Creates an Certification resource, to associate a site to an Certification Scoring Provider
     * @param siteId  (required)
     * @param body Certification Provider resource to be created (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createEnergyCertificationAsync(String siteId, CertificationProvider body, final ApiCallback<CertificationProvider> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createEnergyCertificationValidateBeforeCall(siteId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CertificationProvider>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listMetrics
     * @param siteId  (required)
     * @param updatedAtGte  (optional)
     * @param updatedAtLt  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listMetricsCall(String siteId, OffsetDateTime updatedAtGte, OffsetDateTime updatedAtLt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/sites/{site-id}/timeseries"
            .replaceAll("\\{" + "site-id" + "\\}", apiClient.escapeString(siteId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (updatedAtGte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("updatedAt[gte]", updatedAtGte));
        if (updatedAtLt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("updatedAt[lt]", updatedAtLt));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Oauth2AuthCode" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listMetricsValidateBeforeCall(String siteId, OffsetDateTime updatedAtGte, OffsetDateTime updatedAtLt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'siteId' is set
        if (siteId == null) {
            throw new ApiException("Missing the required parameter 'siteId' when calling listMetrics(Async)");
        }
        
        com.squareup.okhttp.Call call = listMetricsCall(siteId, updatedAtGte, updatedAtLt, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List all Metrics
     * 
     * @param siteId  (required)
     * @param updatedAtGte  (optional)
     * @param updatedAtLt  (optional)
     * @return List&lt;Timeserie&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Timeserie> listMetrics(String siteId, OffsetDateTime updatedAtGte, OffsetDateTime updatedAtLt) throws ApiException {
        ApiResponse<List<Timeserie>> resp = listMetricsWithHttpInfo(siteId, updatedAtGte, updatedAtLt);
        return resp.getData();
    }

    /**
     * List all Metrics
     * 
     * @param siteId  (required)
     * @param updatedAtGte  (optional)
     * @param updatedAtLt  (optional)
     * @return ApiResponse&lt;List&lt;Timeserie&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Timeserie>> listMetricsWithHttpInfo(String siteId, OffsetDateTime updatedAtGte, OffsetDateTime updatedAtLt) throws ApiException {
        com.squareup.okhttp.Call call = listMetricsValidateBeforeCall(siteId, updatedAtGte, updatedAtLt, null, null);
        Type localVarReturnType = new TypeToken<List<Timeserie>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List all Metrics (asynchronously)
     * 
     * @param siteId  (required)
     * @param updatedAtGte  (optional)
     * @param updatedAtLt  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMetricsAsync(String siteId, OffsetDateTime updatedAtGte, OffsetDateTime updatedAtLt, final ApiCallback<List<Timeserie>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listMetricsValidateBeforeCall(siteId, updatedAtGte, updatedAtLt, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Timeserie>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
