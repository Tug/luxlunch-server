/*
 * Treezor
 * Treezor API.  more info [here](https://www.treezor.com). 
 *
 * OpenAPI spec version: 0.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.TreezorInlineResponse20021;
import io.swagger.client.model.TreezorInlineResponseDefault;

import io.swagger.client.Configuration;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.runner.RunWith;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.core.Vertx;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.ext.unit.junit.RunTestOnContext;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.Async;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaxResidenceApi
 */
@RunWith(VertxUnitRunner.class)
@Ignore
public class TaxResidenceApiTest {

    private TaxResidenceApi api;

    @Rule
    public RunTestOnContext rule = new RunTestOnContext();

    @BeforeClass
    public void setupApiClient() {
        JsonObject config = new JsonObject();
        Vertx vertx = rule.vertx();
        Configuration.setupDefaultApiClient(vertx, config);

        api = new TaxResidenceApiImpl();
    }
    
    /**
     * search a residence
     * Search a residence that match search criteria
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void taxResidencesGetTest(TestContext context) {
        Async async = context.async();
        String accessSignature = null;
        Integer id = null;
        Integer userId = null;
        api.taxResidencesGet(accessSignature, id, userId, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * delete a residence
     * Delete a residence that match id
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void taxResidencesIdDeleteTest(TestContext context) {
        Async async = context.async();
        Integer id = null;
        String accessSignature = null;
        api.taxResidencesIdDelete(id, accessSignature, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * read the informations of a residence
     * Read the informations of a residence that match with id
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void taxResidencesIdGetTest(TestContext context) {
        Async async = context.async();
        Integer id = null;
        String accessSignature = null;
        api.taxResidencesIdGet(id, accessSignature, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * update the residence
     * Update a residence already created.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void taxResidencesIdPutTest(TestContext context) {
        Async async = context.async();
        Integer id = null;
        String accessSignature = null;
        Integer userId = null;
        String country = null;
        String taxPayerId = null;
        Boolean liabilityWaiver = null;
        api.taxResidencesIdPut(id, accessSignature, userId, country, taxPayerId, liabilityWaiver, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * create a residence
     * Create a new tax residence.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void taxResidencesPostTest(TestContext context) {
        Async async = context.async();
        Integer userId = null;
        String country = null;
        String accessSignature = null;
        String taxPayerId = null;
        Boolean liabilityWaiver = null;
        api.taxResidencesPost(userId, country, accessSignature, taxPayerId, liabilityWaiver, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
}