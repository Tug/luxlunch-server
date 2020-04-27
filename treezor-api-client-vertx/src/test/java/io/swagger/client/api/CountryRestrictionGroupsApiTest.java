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

import io.swagger.client.model.TreezorBody4;
import io.swagger.client.model.TreezorBody5;
import io.swagger.client.model.TreezorInlineResponse20011;
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
 * API tests for CountryRestrictionGroupsApi
 */
@RunWith(VertxUnitRunner.class)
@Ignore
public class CountryRestrictionGroupsApiTest {

    private CountryRestrictionGroupsApi api;

    @Rule
    public RunTestOnContext rule = new RunTestOnContext();

    @BeforeClass
    public void setupApiClient() {
        JsonObject config = new JsonObject();
        Vertx vertx = rule.vertx();
        Configuration.setupDefaultApiClient(vertx, config);

        api = new CountryRestrictionGroupsApiImpl();
    }
    
    /**
     * cancel a country group
     * Cancel a country restriction group from the system.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void deleteCountryRestrictionGroupsTest(TestContext context) {
        Async async = context.async();
        Long id = null;
        List<String> fields = null;
        api.deleteCountryRestrictionGroups(id, fields, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * search country restriction groups
     * Get country restriction groups that match search criteria.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getCountryRestrictionGroupsTest(TestContext context) {
        Async async = context.async();
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        List<String> fields = null;
        String filter = null;
        Integer pageNumber = null;
        Integer pageCount = null;
        String sortBy = null;
        String sortOrder = null;
        api.getCountryRestrictionGroups(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * get a country group
     * Get a country group from the system.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getCountryRestrictionGroupsIdTest(TestContext context) {
        Async async = context.async();
        Long id = null;
        List<String> fields = null;
        api.getCountryRestrictionGroupsId(id, fields, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * create a countryRestrictionGroup
     * Create a new country restriction group in the system.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void postCountryRestrictionGroupTest(TestContext context) {
        Async async = context.async();
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        List<String> fields = null;
        TreezorBody4 body = null;
        api.postCountryRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * edit a country restriction group
     * Edit a country restriction group in the system.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void putCountryRestrictionGroupsTest(TestContext context) {
        Async async = context.async();
        Integer id = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        TreezorBody5 body = null;
        api.putCountryRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
}