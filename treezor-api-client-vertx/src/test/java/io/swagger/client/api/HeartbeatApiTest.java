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
 * API tests for HeartbeatApi
 */
@RunWith(VertxUnitRunner.class)
@Ignore
public class HeartbeatApiTest {

    private HeartbeatApi api;

    @Rule
    public RunTestOnContext rule = new RunTestOnContext();

    @BeforeClass
    public void setupApiClient() {
        JsonObject config = new JsonObject();
        Vertx vertx = rule.vertx();
        Configuration.setupDefaultApiClient(vertx, config);

        api = new HeartbeatApiImpl();
    }
    
    /**
     * Get the status of the API
     * Get Heartbeat of Treezor API
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getHeartbeatTest(TestContext context) {
        Async async = context.async();
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        api.getHeartbeat(accessSignature, accessTag, accessUserId, accessUserIp, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
}