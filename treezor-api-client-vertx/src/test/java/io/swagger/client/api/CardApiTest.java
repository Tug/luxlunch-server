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
import io.swagger.client.model.TreezorInlineResponse2005;
import io.swagger.client.model.TreezorInlineResponse2006;
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
 * API tests for CardApi
 */
@RunWith(VertxUnitRunner.class)
@Ignore
public class CardApiTest {

    private CardApi api;

    @Rule
    public RunTestOnContext rule = new RunTestOnContext();

    @BeforeClass
    public void setupApiClient() {
        JsonObject config = new JsonObject();
        Vertx vertx = rule.vertx();
        Configuration.setupDefaultApiClient(vertx, config);

        api = new CardApiImpl();
    }
    
    /**
     * get a card image
     * Return virtual card&#39;s image
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void cardimagesGetTest(TestContext context) {
        Async async = context.async();
        Integer cardId = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        api.cardimagesGet(cardId, accessSignature, accessTag, accessUserId, accessUserIp, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * create a virtual card
     * Create a new virtual card. To use a card you will need to activate it (/cards/{id}/Activate/).
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void cardsCreateVirtualPostTest(TestContext context) {
        Async async = context.async();
        Integer userId = null;
        Integer walletId = null;
        String permsGroup = null;
        String cardPrint = null;
        String accessSignature = null;
        String cardTag = null;
        Integer batchDeliveryId = null;
        Integer limitAtmYear = null;
        Integer limitAtmMonth = null;
        Integer limitAtmWeek = null;
        Integer limitAtmDay = null;
        Integer limitAtmAll = null;
        Integer limitPaymentYear = null;
        Integer limitPaymentMonth = null;
        Integer limitPaymentWeek = null;
        Integer limitPaymentDay = null;
        Integer limitPaymentAll = null;
        Float paymentDailyLimit = null;
        String pin = null;
        Integer anonymous = null;
        Integer sendToParent = null;
        Integer mccRestrictionGroupId = null;
        Integer merchantRestrictionGroupId = null;
        Integer countryRestrictionGroupId = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        api.cardsCreateVirtualPost(userId, walletId, permsGroup, cardPrint, accessSignature, cardTag, batchDeliveryId, limitAtmYear, limitAtmMonth, limitAtmWeek, limitAtmDay, limitAtmAll, limitPaymentYear, limitPaymentMonth, limitPaymentWeek, limitPaymentDay, limitPaymentAll, paymentDailyLimit, pin, anonymous, sendToParent, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, accessTag, accessUserId, accessUserIp, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * search cards
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void cardsGetTest(TestContext context) {
        Async async = context.async();
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        Integer cardId = null;
        Integer userId = null;
        String embossedName = null;
        String publicToken = null;
        String permsGroup = null;
        Integer isPhysical = null;
        Integer isConverted = null;
        Integer lockStatus = null;
        Integer mccRestrictionGroupId = null;
        Integer merchantRestrictionGroupId = null;
        Integer countryRestrictionGroupId = null;
        Integer pageNumber = null;
        Integer pageCount = null;
        String sortBy = null;
        String sortOrder = null;
        OffsetDateTime createdDateFrom = null;
        OffsetDateTime createdDateTo = null;
        OffsetDateTime updatedDateFrom = null;
        OffsetDateTime updatedDateTo = null;
        api.cardsGet(accessSignature, accessTag, accessUserId, accessUserIp, cardId, userId, embossedName, publicToken, permsGroup, isPhysical, isConverted, lockStatus, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * activate a card
     * The Activate endpoint change card status to activate. An activated card can be freely used. 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void cardsIdActivatePutTest(TestContext context) {
        Async async = context.async();
        Integer id = null;
        String accessToken = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        api.cardsIdActivatePut(id, accessToken, accessSignature, accessTag, accessUserId, accessUserIp, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * change card&#39;s PIN
     * Change card&#39;s PIN code knowing the current one.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void cardsIdChangePINPutTest(TestContext context) {
        Async async = context.async();
        Integer id = null;
        String currentPIN = null;
        String newPIN = null;
        String confirmPIN = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        api.cardsIdChangePINPut(id, currentPIN, newPIN, confirmPIN, accessSignature, accessTag, accessUserId, accessUserIp, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * convert card to virtual
     * Convert a virtual card into a physical one. The converted card will be both virtual and physical. 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void cardsIdConvertVirtualPutTest(TestContext context) {
        Async async = context.async();
        Integer id = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        api.cardsIdConvertVirtualPut(id, accessSignature, accessTag, accessUserId, accessUserIp, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * get a card
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void cardsIdGetTest(TestContext context) {
        Async async = context.async();
        Long id = null;
        api.cardsIdGet(id, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * update card&#39;s limits
     * Update of the card limits.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void cardsIdLimitsPutTest(TestContext context) {
        Async async = context.async();
        Integer id = null;
        String accessSignature = null;
        Integer limitAtmYear = null;
        Integer limitAtmMonth = null;
        Integer limitAtmWeek = null;
        Integer limitAtmDay = null;
        Integer limitAtmAll = null;
        Integer limitPaymentYear = null;
        Integer limitPaymentMonth = null;
        Integer limitPaymentWeek = null;
        Integer limitPaymentDay = null;
        Integer limitPaymentAll = null;
        Float paymentDailyLimit = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        api.cardsIdLimitsPut(id, accessSignature, limitAtmYear, limitAtmMonth, limitAtmWeek, limitAtmDay, limitAtmAll, limitPaymentYear, limitPaymentMonth, limitPaymentWeek, limitPaymentDay, limitPaymentAll, paymentDailyLimit, accessTag, accessUserId, accessUserIp, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * update card&#39;s blocking status
     * Block or unblock a card.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void cardsIdLockUnlockPutTest(TestContext context) {
        Async async = context.async();
        Integer id = null;
        Integer lockStatus = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        api.cardsIdLockUnlockPut(id, lockStatus, accessSignature, accessTag, accessUserId, accessUserIp, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * update card&#39;s options
     * Allows to update card&#39;s permission group.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void cardsIdOptionsPutTest(TestContext context) {
        Async async = context.async();
        Integer id = null;
        Integer foreign = null;
        Integer online = null;
        Integer atm = null;
        Integer nfc = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        api.cardsIdOptionsPut(id, foreign, online, atm, nfc, accessSignature, accessTag, accessUserId, accessUserIp, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * update card informations
     * Actually update mccRestrictionGroupId and merchantRestrictionGroupId of a card
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void cardsIdPutTest(TestContext context) {
        Async async = context.async();
        Integer id = null;
        String accessSignature = null;
        Integer mccRestrictionGroupId = null;
        Integer merchantRestrictionGroupId = null;
        Integer countryRestrictionGroupId = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        api.cardsIdPut(id, accessSignature, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, accessTag, accessUserId, accessUserIp, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * regenerate card
     * If card is Lost or Stolen (card&#39;s status), the card itself will get regenerated. Otherwise only the card image gets recreated. 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void cardsIdRegeneratePutTest(TestContext context) {
        Async async = context.async();
        Integer id = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        api.cardsIdRegeneratePut(id, accessSignature, accessTag, accessUserId, accessUserIp, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * set card&#39;s PIN
     * Overwrite card&#39;s PIN.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void cardsIdSetPINPutTest(TestContext context) {
        Async async = context.async();
        Integer id = null;
        String newPIN = null;
        String confirmPIN = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        api.cardsIdSetPINPut(id, newPIN, confirmPIN, accessSignature, accessTag, accessUserId, accessUserIp, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * unblock card&#39;s PIN
     * Unblock card&#39;s PIN code.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void cardsIdUnblockPINPutTest(TestContext context) {
        Async async = context.async();
        Integer id = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        api.cardsIdUnblockPINPut(id, accessSignature, accessTag, accessUserId, accessUserIp, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Register 3D secure
     * Register a card to 3D secure service. The user&#39;s mobile number must begin by \&quot;+\&quot;, or \&quot;00\&quot;, and the country dialing code.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void cardsRegister3DSPostTest(TestContext context) {
        Async async = context.async();
        Integer cardId = null;
        String accessSignature = null;
        api.cardsRegister3DSPost(cardId, accessSignature, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * create a physical card
     * Create a new physical card. To use a card you will need to activate it (/cards/{id}/Activate/).
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void cardsRequestPhysicalPostTest(TestContext context) {
        Async async = context.async();
        Integer userId = null;
        Integer walletId = null;
        String permsGroup = null;
        String cardTag = null;
        String cardPrint = null;
        String accessSignature = null;
        Integer batchDeliveryId = null;
        Integer limitAtmYear = null;
        Integer limitAtmMonth = null;
        Integer limitAtmWeek = null;
        Integer limitAtmDay = null;
        Integer limitAtmAll = null;
        Integer limitPaymentYear = null;
        Integer limitPaymentMonth = null;
        Integer limitPaymentWeek = null;
        Integer limitPaymentDay = null;
        Integer limitPaymentAll = null;
        Float paymentDailyLimit = null;
        String pin = null;
        Integer anonymous = null;
        Integer sendToParent = null;
        Integer mccRestrictionGroupId = null;
        Integer merchantRestrictionGroupId = null;
        Integer countryRestrictionGroupId = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        api.cardsRequestPhysicalPost(userId, walletId, permsGroup, cardTag, cardPrint, accessSignature, batchDeliveryId, limitAtmYear, limitAtmMonth, limitAtmWeek, limitAtmDay, limitAtmAll, limitPaymentYear, limitPaymentMonth, limitPaymentWeek, limitPaymentDay, limitPaymentAll, paymentDailyLimit, pin, anonymous, sendToParent, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, accessTag, accessUserId, accessUserIp, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
}