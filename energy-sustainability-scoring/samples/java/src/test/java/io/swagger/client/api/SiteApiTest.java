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

import io.swagger.client.model.Error;
import io.swagger.client.model.Site;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for SiteApi
 */
@Ignore
public class SiteApiTest {

    private final SiteApi api = new SiteApi();

    /**
     * List all Sites
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listSitesTest() throws Exception {
        List<Site> response = api.listSites();

        // TODO: test validations
    }
}