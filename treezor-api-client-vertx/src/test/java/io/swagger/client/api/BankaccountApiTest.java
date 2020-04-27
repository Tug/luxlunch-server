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

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse2001;
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
 * API tests for BankaccountApi
 */
@RunWith(VertxUnitRunner.class)
@Ignore
public class BankaccountApiTest {

    private BankaccountApi api;

    @Rule
    public RunTestOnContext rule = new RunTestOnContext();

    @BeforeClass
    public void setupApiClient() {
        JsonObject config = new JsonObject();
        Vertx vertx = rule.vertx();
        Configuration.setupDefaultApiClient(vertx, config);

        api = new BankaccountApiImpl();
    }
    
    /**
     * deactivate a bank account
     * Change bank account&#39;s status to CANCELED. If a payout is being validated on this bank account, it can not be canceled.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void deleteBankaccountTest(TestContext context) {
        Async async = context.async();
        Long id = null;
        api.deleteBankaccount(id, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * get a bank account
     * Get a bank account from the system.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getBankaccountTest(TestContext context) {
        Async async = context.async();
        Long id = null;
        api.getBankaccount(id, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * search bank accounts
     * Get bank accounts that match search criteria.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getBankaccountsTest(TestContext context) {
        Async async = context.async();
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        Integer bankaccountId = null;
        String bankaccountStatus = null;
        Integer userId = null;
        String bankaccountIBAN = null;
        Integer pageNumber = null;
        Integer pageCount = null;
        String sortBy = null;
        String sortOrder = null;
        OffsetDateTime createdDateFrom = null;
        OffsetDateTime createdDateTo = null;
        OffsetDateTime updatedDateFrom = null;
        OffsetDateTime updatedDateTo = null;
        api.getBankaccounts(accessSignature, accessTag, accessUserId, accessUserIp, bankaccountId, bankaccountStatus, userId, bankaccountIBAN, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * create a bank account
     * Create a new benefeciary bank account in the system.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void postBankaccountTest(TestContext context) {
        Async async = context.async();
        Integer userId = null;
        String bankaccountOwnerName = null;
        String bankaccountOwnerAddress = null;
        String bankaccountIBAN = null;
        String bankaccountBIC = null;
        String bankaccountType = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        String bankaccountTag = null;
        String name = null;
        api.postBankaccount(userId, bankaccountOwnerName, bankaccountOwnerAddress, bankaccountIBAN, bankaccountBIC, bankaccountType, accessSignature, accessTag, accessUserId, accessUserIp, bankaccountTag, name, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
}