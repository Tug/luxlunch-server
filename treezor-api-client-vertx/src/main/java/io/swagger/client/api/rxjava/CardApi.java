package io.swagger.client.api.rxjava;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse2005;
import io.swagger.client.model.TreezorInlineResponse2006;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class CardApi {

	private final io.swagger.client.api.CardApi delegate;

	public CardApi(io.swagger.client.api.CardApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.CardApi getDelegate() {
	    return delegate;
	}

    /**
     * get a card image
     * Return virtual card&#39;s image
     * @param cardId Vitual card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardimagesGet(Integer cardId, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2006>> resultHandler) {
        delegate.cardimagesGet(cardId, accessSignature, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * get a card image
     * Return virtual card&#39;s image
     * @param cardId Vitual card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2006> rxCardimagesGet(Integer cardId, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardimagesGet(cardId, accessSignature, accessTag, accessUserId, accessUserIp, fut);
        }));
    }
    /**
     * create a virtual card
     * Create a new virtual card. To use a card you will need to activate it (/cards/{id}/Activate/).
     * @param userId User&#39;s id of cardholder (required)
     * @param walletId Wallet&#39;s Id in which to create the card (required)
     * @param permsGroup Permissions group of the card. There is 4 usages which create 16 possible groups:  | group | NFC | ATM | On-line | Foreign | |-----|-----|-----|-----|------| |TRZ-CU-001|KO|KO|KO|KO| |TRZ-CU-002|KO|KO|KO|OK| |TRZ-CU-003|KO|KO|OK|KO| |TRZ-CU-004|KO|KO|OK|OK| |TRZ-CU-005|KO|OK|KO|KO| |TRZ-CU-006|KO|OK|KO|OK| |TRZ-CU-007|KO|OK|OK|KO| |TRZ-CU-008|KO|OK|OK|OK| |TRZ-CU-009|OK|KO|KO|KO| |TRZ-CU-010|OK|KO|KO|OK| |TRZ-CU-011|OK|KO|OK|KO| |TRZ-CU-012|OK|KO|OK|OK| |TRZ-CU-013|OK|OK|KO|KO| |TRZ-CU-014|OK|OK|KO|OK| |TRZ-CU-015|OK|OK|OK|KO| |TRZ-CU-016|OK|OK|OK|OK|  (required)
     * @param cardPrint Card appareance code, also used to choose the program ID of the card (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param cardTag Custom field (optional)
     * @param batchDeliveryId Batch regroupement identifier (must be between 1 and 238327) NOT YET OPERATIONAL (optional)
     * @param limitAtmYear ATM operations limit for a sliding year. No default value. (optional)
     * @param limitAtmMonth ATM operations limit for a sliding month. No default value. (optional)
     * @param limitAtmWeek ATM operations limit for a sliding week. Default value 2000â‚¬. (optional)
     * @param limitAtmDay ATM operations limit for a single day. Default value 1000â‚¬. (optional)
     * @param limitAtmAll ATM operations limit from beginning. No default value. (optional)
     * @param limitPaymentYear POS operations limit for a sliding year. No default value. (optional)
     * @param limitPaymentMonth POS operations limit for a sliding month. No default value. (optional)
     * @param limitPaymentWeek POS operations limit for a sliding week. Default value 3000â‚¬. (optional)
     * @param limitPaymentDay POS operations limit for a single day. Default value 2000â‚¬. (optional)
     * @param limitPaymentAll POS operations limit from beginning. No default value. (optional)
     * @param paymentDailyLimit POS operations limit for a single day including cents. The decimal delimiter must be \&quot;.\&quot;. No default value. (optional)
     * @param pin Card&#39;s PIN code value. (optional)
     * @param anonymous Card is anonymous. If value is 1 there will be no embossed name. (optional)
     * @param sendToParent If you put the value 1 the delivery address will be the parent user&#39;s. (optional)
     * @param mccRestrictionGroupId mccRestrictionGroupId you want to apply (optional)
     * @param merchantRestrictionGroupId merchantRestrictionGroupId you want to apply (optional)
     * @param countryRestrictionGroupId countryRestrictionGroupId you want to apply (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsCreateVirtualPost(Integer userId, Integer walletId, String permsGroup, String cardPrint, String accessSignature, String cardTag, Integer batchDeliveryId, Integer limitAtmYear, Integer limitAtmMonth, Integer limitAtmWeek, Integer limitAtmDay, Integer limitAtmAll, Integer limitPaymentYear, Integer limitPaymentMonth, Integer limitPaymentWeek, Integer limitPaymentDay, Integer limitPaymentAll, Float paymentDailyLimit, String pin, Integer anonymous, Integer sendToParent, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        delegate.cardsCreateVirtualPost(userId, walletId, permsGroup, cardPrint, accessSignature, cardTag, batchDeliveryId, limitAtmYear, limitAtmMonth, limitAtmWeek, limitAtmDay, limitAtmAll, limitPaymentYear, limitPaymentMonth, limitPaymentWeek, limitPaymentDay, limitPaymentAll, paymentDailyLimit, pin, anonymous, sendToParent, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * create a virtual card
     * Create a new virtual card. To use a card you will need to activate it (/cards/{id}/Activate/).
     * @param userId User&#39;s id of cardholder (required)
     * @param walletId Wallet&#39;s Id in which to create the card (required)
     * @param permsGroup Permissions group of the card. There is 4 usages which create 16 possible groups:  | group | NFC | ATM | On-line | Foreign | |-----|-----|-----|-----|------| |TRZ-CU-001|KO|KO|KO|KO| |TRZ-CU-002|KO|KO|KO|OK| |TRZ-CU-003|KO|KO|OK|KO| |TRZ-CU-004|KO|KO|OK|OK| |TRZ-CU-005|KO|OK|KO|KO| |TRZ-CU-006|KO|OK|KO|OK| |TRZ-CU-007|KO|OK|OK|KO| |TRZ-CU-008|KO|OK|OK|OK| |TRZ-CU-009|OK|KO|KO|KO| |TRZ-CU-010|OK|KO|KO|OK| |TRZ-CU-011|OK|KO|OK|KO| |TRZ-CU-012|OK|KO|OK|OK| |TRZ-CU-013|OK|OK|KO|KO| |TRZ-CU-014|OK|OK|KO|OK| |TRZ-CU-015|OK|OK|OK|KO| |TRZ-CU-016|OK|OK|OK|OK|  (required)
     * @param cardPrint Card appareance code, also used to choose the program ID of the card (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param cardTag Custom field (optional)
     * @param batchDeliveryId Batch regroupement identifier (must be between 1 and 238327) NOT YET OPERATIONAL (optional)
     * @param limitAtmYear ATM operations limit for a sliding year. No default value. (optional)
     * @param limitAtmMonth ATM operations limit for a sliding month. No default value. (optional)
     * @param limitAtmWeek ATM operations limit for a sliding week. Default value 2000â‚¬. (optional)
     * @param limitAtmDay ATM operations limit for a single day. Default value 1000â‚¬. (optional)
     * @param limitAtmAll ATM operations limit from beginning. No default value. (optional)
     * @param limitPaymentYear POS operations limit for a sliding year. No default value. (optional)
     * @param limitPaymentMonth POS operations limit for a sliding month. No default value. (optional)
     * @param limitPaymentWeek POS operations limit for a sliding week. Default value 3000â‚¬. (optional)
     * @param limitPaymentDay POS operations limit for a single day. Default value 2000â‚¬. (optional)
     * @param limitPaymentAll POS operations limit from beginning. No default value. (optional)
     * @param paymentDailyLimit POS operations limit for a single day including cents. The decimal delimiter must be \&quot;.\&quot;. No default value. (optional)
     * @param pin Card&#39;s PIN code value. (optional)
     * @param anonymous Card is anonymous. If value is 1 there will be no embossed name. (optional)
     * @param sendToParent If you put the value 1 the delivery address will be the parent user&#39;s. (optional)
     * @param mccRestrictionGroupId mccRestrictionGroupId you want to apply (optional)
     * @param merchantRestrictionGroupId merchantRestrictionGroupId you want to apply (optional)
     * @param countryRestrictionGroupId countryRestrictionGroupId you want to apply (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2005> rxCardsCreateVirtualPost(Integer userId, Integer walletId, String permsGroup, String cardPrint, String accessSignature, String cardTag, Integer batchDeliveryId, Integer limitAtmYear, Integer limitAtmMonth, Integer limitAtmWeek, Integer limitAtmDay, Integer limitAtmAll, Integer limitPaymentYear, Integer limitPaymentMonth, Integer limitPaymentWeek, Integer limitPaymentDay, Integer limitPaymentAll, Float paymentDailyLimit, String pin, Integer anonymous, Integer sendToParent, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardsCreateVirtualPost(userId, walletId, permsGroup, cardPrint, accessSignature, cardTag, batchDeliveryId, limitAtmYear, limitAtmMonth, limitAtmWeek, limitAtmDay, limitAtmAll, limitPaymentYear, limitPaymentMonth, limitPaymentWeek, limitPaymentDay, limitPaymentAll, paymentDailyLimit, pin, anonymous, sendToParent, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, accessTag, accessUserId, accessUserIp, fut);
        }));
    }
    /**
     * search cards
     * 
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param cardId Card&#39;s id (optional)
     * @param userId User&#39;s id of cardholder (optional)
     * @param embossedName Embossed name of the card (optional)
     * @param publicToken Public token of the card (optional)
     * @param permsGroup Permissions group of the card. There is 4 usages which create 16 possible groups:  | group | NFC | ATM | On-line | Foreign | |-----|-----|-----|-----|------| |TRZ-CU-001|KO|KO|KO|KO| |TRZ-CU-002|KO|KO|KO|OK| |TRZ-CU-003|KO|KO|OK|KO| |TRZ-CU-004|KO|KO|OK|OK| |TRZ-CU-005|KO|OK|KO|KO| |TRZ-CU-006|KO|OK|KO|OK| |TRZ-CU-007|KO|OK|OK|KO| |TRZ-CU-008|KO|OK|OK|OK| |TRZ-CU-009|OK|KO|KO|KO| |TRZ-CU-010|OK|KO|KO|OK| |TRZ-CU-011|OK|KO|OK|KO| |TRZ-CU-012|OK|KO|OK|OK| |TRZ-CU-013|OK|OK|KO|KO| |TRZ-CU-014|OK|OK|KO|OK| |TRZ-CU-015|OK|OK|OK|KO| |TRZ-CU-016|OK|OK|OK|OK|  (optional)
     * @param isPhysical | Value | Type | | --- | --- | | 1 | Physical card| | 0 | Virtual card |  (optional)
     * @param isConverted | Value | Type | | --- | --- | | 1 | Physical card converted in a virtual card| | 0 | Not converted |  (optional)
     * @param lockStatus | Value | Type | | --- | --- | | 1 | Card blocked | | 0 | Card Unblocked | | 2 | Lost card | | 3 | Stolen card |  (optional)
     * @param mccRestrictionGroupId mccRestrictionGroupId of the card (optional)
     * @param merchantRestrictionGroupId merchantRestrictionGroupId of the card (optional)
     * @param countryRestrictionGroupId countryRestrictionGroupId of the card (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param createdDateFrom The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param createdDateTo The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateFrom The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateTo The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsGet(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer cardId, Integer userId, String embossedName, String publicToken, String permsGroup, Integer isPhysical, Integer isConverted, Integer lockStatus, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        delegate.cardsGet(accessSignature, accessTag, accessUserId, accessUserIp, cardId, userId, embossedName, publicToken, permsGroup, isPhysical, isConverted, lockStatus, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, resultHandler);
    }

    /**
     * search cards
     * 
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param cardId Card&#39;s id (optional)
     * @param userId User&#39;s id of cardholder (optional)
     * @param embossedName Embossed name of the card (optional)
     * @param publicToken Public token of the card (optional)
     * @param permsGroup Permissions group of the card. There is 4 usages which create 16 possible groups:  | group | NFC | ATM | On-line | Foreign | |-----|-----|-----|-----|------| |TRZ-CU-001|KO|KO|KO|KO| |TRZ-CU-002|KO|KO|KO|OK| |TRZ-CU-003|KO|KO|OK|KO| |TRZ-CU-004|KO|KO|OK|OK| |TRZ-CU-005|KO|OK|KO|KO| |TRZ-CU-006|KO|OK|KO|OK| |TRZ-CU-007|KO|OK|OK|KO| |TRZ-CU-008|KO|OK|OK|OK| |TRZ-CU-009|OK|KO|KO|KO| |TRZ-CU-010|OK|KO|KO|OK| |TRZ-CU-011|OK|KO|OK|KO| |TRZ-CU-012|OK|KO|OK|OK| |TRZ-CU-013|OK|OK|KO|KO| |TRZ-CU-014|OK|OK|KO|OK| |TRZ-CU-015|OK|OK|OK|KO| |TRZ-CU-016|OK|OK|OK|OK|  (optional)
     * @param isPhysical | Value | Type | | --- | --- | | 1 | Physical card| | 0 | Virtual card |  (optional)
     * @param isConverted | Value | Type | | --- | --- | | 1 | Physical card converted in a virtual card| | 0 | Not converted |  (optional)
     * @param lockStatus | Value | Type | | --- | --- | | 1 | Card blocked | | 0 | Card Unblocked | | 2 | Lost card | | 3 | Stolen card |  (optional)
     * @param mccRestrictionGroupId mccRestrictionGroupId of the card (optional)
     * @param merchantRestrictionGroupId merchantRestrictionGroupId of the card (optional)
     * @param countryRestrictionGroupId countryRestrictionGroupId of the card (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param createdDateFrom The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param createdDateTo The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateFrom The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateTo The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2005> rxCardsGet(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer cardId, Integer userId, String embossedName, String publicToken, String permsGroup, Integer isPhysical, Integer isConverted, Integer lockStatus, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardsGet(accessSignature, accessTag, accessUserId, accessUserIp, cardId, userId, embossedName, publicToken, permsGroup, isPhysical, isConverted, lockStatus, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, fut);
        }));
    }
    /**
     * activate a card
     * The Activate endpoint change card status to activate. An activated card can be freely used. 
     * @param id Card&#39;s id. (required)
     * @param accessToken Access token must be defined here or in Authorization HTTP header. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdActivatePut(Integer id, String accessToken, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        delegate.cardsIdActivatePut(id, accessToken, accessSignature, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * activate a card
     * The Activate endpoint change card status to activate. An activated card can be freely used. 
     * @param id Card&#39;s id. (required)
     * @param accessToken Access token must be defined here or in Authorization HTTP header. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2005> rxCardsIdActivatePut(Integer id, String accessToken, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardsIdActivatePut(id, accessToken, accessSignature, accessTag, accessUserId, accessUserIp, fut);
        }));
    }
    /**
     * change card&#39;s PIN
     * Change card&#39;s PIN code knowing the current one.
     * @param id Card&#39;s id. (required)
     * @param currentPIN Card&#39;s current PIN (required)
     * @param newPIN Card&#39;s new PIN (required)
     * @param confirmPIN Card&#39;s new PIN confirmation value (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdChangePINPut(Integer id, String currentPIN, String newPIN, String confirmPIN, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        delegate.cardsIdChangePINPut(id, currentPIN, newPIN, confirmPIN, accessSignature, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * change card&#39;s PIN
     * Change card&#39;s PIN code knowing the current one.
     * @param id Card&#39;s id. (required)
     * @param currentPIN Card&#39;s current PIN (required)
     * @param newPIN Card&#39;s new PIN (required)
     * @param confirmPIN Card&#39;s new PIN confirmation value (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2005> rxCardsIdChangePINPut(Integer id, String currentPIN, String newPIN, String confirmPIN, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardsIdChangePINPut(id, currentPIN, newPIN, confirmPIN, accessSignature, accessTag, accessUserId, accessUserIp, fut);
        }));
    }
    /**
     * convert card to virtual
     * Convert a virtual card into a physical one. The converted card will be both virtual and physical. 
     * @param id Card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdConvertVirtualPut(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        delegate.cardsIdConvertVirtualPut(id, accessSignature, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * convert card to virtual
     * Convert a virtual card into a physical one. The converted card will be both virtual and physical. 
     * @param id Card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2005> rxCardsIdConvertVirtualPut(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardsIdConvertVirtualPut(id, accessSignature, accessTag, accessUserId, accessUserIp, fut);
        }));
    }
    /**
     * get a card
     * 
     * @param id Card&#39;s id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdGet(Long id, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        delegate.cardsIdGet(id, resultHandler);
    }

    /**
     * get a card
     * 
     * @param id Card&#39;s id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2005> rxCardsIdGet(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardsIdGet(id, fut);
        }));
    }
    /**
     * update card&#39;s limits
     * Update of the card limits.
     * @param id Card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param limitAtmYear ATM year limit (optional)
     * @param limitAtmMonth ATM month limit (optional)
     * @param limitAtmWeek ATM week limit (optional)
     * @param limitAtmDay ATM day limit (optional)
     * @param limitAtmAll ATM from beginning limit (optional)
     * @param limitPaymentYear Payment year limit (optional)
     * @param limitPaymentMonth Payment month limit (optional)
     * @param limitPaymentWeek Payment week limit (optional)
     * @param limitPaymentDay Payment day limit (optional)
     * @param limitPaymentAll Payment from beginning limit (optional)
     * @param paymentDailyLimit Payment day limit including cents. The decimal delimiter must be \&quot;.\&quot; (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdLimitsPut(Integer id, String accessSignature, Integer limitAtmYear, Integer limitAtmMonth, Integer limitAtmWeek, Integer limitAtmDay, Integer limitAtmAll, Integer limitPaymentYear, Integer limitPaymentMonth, Integer limitPaymentWeek, Integer limitPaymentDay, Integer limitPaymentAll, Float paymentDailyLimit, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        delegate.cardsIdLimitsPut(id, accessSignature, limitAtmYear, limitAtmMonth, limitAtmWeek, limitAtmDay, limitAtmAll, limitPaymentYear, limitPaymentMonth, limitPaymentWeek, limitPaymentDay, limitPaymentAll, paymentDailyLimit, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * update card&#39;s limits
     * Update of the card limits.
     * @param id Card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param limitAtmYear ATM year limit (optional)
     * @param limitAtmMonth ATM month limit (optional)
     * @param limitAtmWeek ATM week limit (optional)
     * @param limitAtmDay ATM day limit (optional)
     * @param limitAtmAll ATM from beginning limit (optional)
     * @param limitPaymentYear Payment year limit (optional)
     * @param limitPaymentMonth Payment month limit (optional)
     * @param limitPaymentWeek Payment week limit (optional)
     * @param limitPaymentDay Payment day limit (optional)
     * @param limitPaymentAll Payment from beginning limit (optional)
     * @param paymentDailyLimit Payment day limit including cents. The decimal delimiter must be \&quot;.\&quot; (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2005> rxCardsIdLimitsPut(Integer id, String accessSignature, Integer limitAtmYear, Integer limitAtmMonth, Integer limitAtmWeek, Integer limitAtmDay, Integer limitAtmAll, Integer limitPaymentYear, Integer limitPaymentMonth, Integer limitPaymentWeek, Integer limitPaymentDay, Integer limitPaymentAll, Float paymentDailyLimit, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardsIdLimitsPut(id, accessSignature, limitAtmYear, limitAtmMonth, limitAtmWeek, limitAtmDay, limitAtmAll, limitPaymentYear, limitPaymentMonth, limitPaymentWeek, limitPaymentDay, limitPaymentAll, paymentDailyLimit, accessTag, accessUserId, accessUserIp, fut);
        }));
    }
    /**
     * update card&#39;s blocking status
     * Block or unblock a card.
     * @param id Card&#39;s id. (required)
     * @param lockStatus | Value | Type | | --- | --- | | 1 | Block the card| | 0 | Unblock the card | | 2 | Lost card | | 3 | Stolen card |  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdLockUnlockPut(Integer id, Integer lockStatus, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        delegate.cardsIdLockUnlockPut(id, lockStatus, accessSignature, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * update card&#39;s blocking status
     * Block or unblock a card.
     * @param id Card&#39;s id. (required)
     * @param lockStatus | Value | Type | | --- | --- | | 1 | Block the card| | 0 | Unblock the card | | 2 | Lost card | | 3 | Stolen card |  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2005> rxCardsIdLockUnlockPut(Integer id, Integer lockStatus, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardsIdLockUnlockPut(id, lockStatus, accessSignature, accessTag, accessUserId, accessUserIp, fut);
        }));
    }
    /**
     * update card&#39;s options
     * Allows to update card&#39;s permission group.
     * @param id Card&#39;s id. (required)
     * @param foreign Card usable abroad (required)
     * @param online Card usable on-line (required)
     * @param atm Card usable on ATM (withdrawals) (required)
     * @param nfc Card usable on contactless compatible POS machine machine\&quot; (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdOptionsPut(Integer id, Integer foreign, Integer online, Integer atm, Integer nfc, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        delegate.cardsIdOptionsPut(id, foreign, online, atm, nfc, accessSignature, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * update card&#39;s options
     * Allows to update card&#39;s permission group.
     * @param id Card&#39;s id. (required)
     * @param foreign Card usable abroad (required)
     * @param online Card usable on-line (required)
     * @param atm Card usable on ATM (withdrawals) (required)
     * @param nfc Card usable on contactless compatible POS machine machine\&quot; (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2005> rxCardsIdOptionsPut(Integer id, Integer foreign, Integer online, Integer atm, Integer nfc, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardsIdOptionsPut(id, foreign, online, atm, nfc, accessSignature, accessTag, accessUserId, accessUserIp, fut);
        }));
    }
    /**
     * update card informations
     * Actually update mccRestrictionGroupId and merchantRestrictionGroupId of a card
     * @param id Card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param mccRestrictionGroupId card&#39;s mccRestrictionGroupId (optional)
     * @param merchantRestrictionGroupId card&#39;s merchantRestrictionGroupId (optional)
     * @param countryRestrictionGroupId card&#39;s countryRestrictionGroupId (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdPut(Integer id, String accessSignature, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        delegate.cardsIdPut(id, accessSignature, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * update card informations
     * Actually update mccRestrictionGroupId and merchantRestrictionGroupId of a card
     * @param id Card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param mccRestrictionGroupId card&#39;s mccRestrictionGroupId (optional)
     * @param merchantRestrictionGroupId card&#39;s merchantRestrictionGroupId (optional)
     * @param countryRestrictionGroupId card&#39;s countryRestrictionGroupId (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2005> rxCardsIdPut(Integer id, String accessSignature, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardsIdPut(id, accessSignature, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, accessTag, accessUserId, accessUserIp, fut);
        }));
    }
    /**
     * regenerate card
     * If card is Lost or Stolen (card&#39;s status), the card itself will get regenerated. Otherwise only the card image gets recreated. 
     * @param id Card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdRegeneratePut(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        delegate.cardsIdRegeneratePut(id, accessSignature, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * regenerate card
     * If card is Lost or Stolen (card&#39;s status), the card itself will get regenerated. Otherwise only the card image gets recreated. 
     * @param id Card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2005> rxCardsIdRegeneratePut(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardsIdRegeneratePut(id, accessSignature, accessTag, accessUserId, accessUserIp, fut);
        }));
    }
    /**
     * set card&#39;s PIN
     * Overwrite card&#39;s PIN.
     * @param id Card&#39;s id. (required)
     * @param newPIN Card&#39;s new PIN. (required)
     * @param confirmPIN Card&#39;s new PIN confirmation value (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdSetPINPut(Integer id, String newPIN, String confirmPIN, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        delegate.cardsIdSetPINPut(id, newPIN, confirmPIN, accessSignature, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * set card&#39;s PIN
     * Overwrite card&#39;s PIN.
     * @param id Card&#39;s id. (required)
     * @param newPIN Card&#39;s new PIN. (required)
     * @param confirmPIN Card&#39;s new PIN confirmation value (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2005> rxCardsIdSetPINPut(Integer id, String newPIN, String confirmPIN, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardsIdSetPINPut(id, newPIN, confirmPIN, accessSignature, accessTag, accessUserId, accessUserIp, fut);
        }));
    }
    /**
     * unblock card&#39;s PIN
     * Unblock card&#39;s PIN code.
     * @param id Card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdUnblockPINPut(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        delegate.cardsIdUnblockPINPut(id, accessSignature, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * unblock card&#39;s PIN
     * Unblock card&#39;s PIN code.
     * @param id Card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2005> rxCardsIdUnblockPINPut(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardsIdUnblockPINPut(id, accessSignature, accessTag, accessUserId, accessUserIp, fut);
        }));
    }
    /**
     * Register 3D secure
     * Register a card to 3D secure service. The user&#39;s mobile number must begin by \&quot;+\&quot;, or \&quot;00\&quot;, and the country dialing code.
     * @param cardId Card&#39;s ID to register (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsRegister3DSPost(Integer cardId, String accessSignature, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        delegate.cardsRegister3DSPost(cardId, accessSignature, resultHandler);
    }

    /**
     * Register 3D secure
     * Register a card to 3D secure service. The user&#39;s mobile number must begin by \&quot;+\&quot;, or \&quot;00\&quot;, and the country dialing code.
     * @param cardId Card&#39;s ID to register (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2005> rxCardsRegister3DSPost(Integer cardId, String accessSignature) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardsRegister3DSPost(cardId, accessSignature, fut);
        }));
    }
    /**
     * create a physical card
     * Create a new physical card. To use a card you will need to activate it (/cards/{id}/Activate/).
     * @param userId User&#39;s id of cardholder (required)
     * @param walletId Wallet&#39;s Id in which to create the card (required)
     * @param permsGroup Permissions group of the card. There is 4 usages which create 16 possible groups:  | group | NFC | ATM | On-line | Foreign | |-----|-----|-----|-----|------| |TRZ-CU-001|KO|KO|KO|KO| |TRZ-CU-002|KO|KO|KO|OK| |TRZ-CU-003|KO|KO|OK|KO| |TRZ-CU-004|KO|KO|OK|OK| |TRZ-CU-005|KO|OK|KO|KO| |TRZ-CU-006|KO|OK|KO|OK| |TRZ-CU-007|KO|OK|OK|KO| |TRZ-CU-008|KO|OK|OK|OK| |TRZ-CU-009|OK|KO|KO|KO| |TRZ-CU-010|OK|KO|KO|OK| |TRZ-CU-011|OK|KO|OK|KO| |TRZ-CU-012|OK|KO|OK|OK| |TRZ-CU-013|OK|OK|KO|KO| |TRZ-CU-014|OK|OK|KO|OK| |TRZ-CU-015|OK|OK|OK|KO| |TRZ-CU-016|OK|OK|OK|OK|  (required)
     * @param cardTag Custom field (required)
     * @param cardPrint Card appearance code, also used to choose the program ID of the card (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param batchDeliveryId Batch regroupement identifier (must be between 1 and 238327) NOT YET OPERATIONAL (optional)
     * @param limitAtmYear ATM operations limit for a sliding year. No default value. (optional)
     * @param limitAtmMonth ATM operations limit for a sliding month. No default value. (optional)
     * @param limitAtmWeek ATM operations limit for a sliding week. Default value 2000â‚¬. (optional)
     * @param limitAtmDay ATM operations limit for a single day. Default value 1000â‚¬. (optional)
     * @param limitAtmAll ATM operations limit from beginning. No default value. (optional)
     * @param limitPaymentYear POS operations limit for a sliding year. No default value. (optional)
     * @param limitPaymentMonth POS operations limit for a sliding month. No default value. (optional)
     * @param limitPaymentWeek POS operations limit for a sliding week. Default value 3000â‚¬. (optional)
     * @param limitPaymentDay POS operations limit for a single day. Default value 2000â‚¬. (optional)
     * @param limitPaymentAll POS operations limit from beginning. No default value. (optional)
     * @param paymentDailyLimit POS operations limit for a single day including cents. The decimal delimiter must be \&quot;.\&quot;. No default value. (optional)
     * @param pin Card&#39;s PIN code value. Default random PIN. (optional)
     * @param anonymous Card is anonymous. If value is 1 there will be no embossed name. (optional)
     * @param sendToParent If you put the value 1 the delivery address will be the parent user&#39;s. (optional)
     * @param mccRestrictionGroupId mccRestrictionGroupId you want to apply (optional)
     * @param merchantRestrictionGroupId merchantRestrictionGroupId you want to apply (optional)
     * @param countryRestrictionGroupId countryRestrictionGroupId you want to apply (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsRequestPhysicalPost(Integer userId, Integer walletId, String permsGroup, String cardTag, String cardPrint, String accessSignature, Integer batchDeliveryId, Integer limitAtmYear, Integer limitAtmMonth, Integer limitAtmWeek, Integer limitAtmDay, Integer limitAtmAll, Integer limitPaymentYear, Integer limitPaymentMonth, Integer limitPaymentWeek, Integer limitPaymentDay, Integer limitPaymentAll, Float paymentDailyLimit, String pin, Integer anonymous, Integer sendToParent, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        delegate.cardsRequestPhysicalPost(userId, walletId, permsGroup, cardTag, cardPrint, accessSignature, batchDeliveryId, limitAtmYear, limitAtmMonth, limitAtmWeek, limitAtmDay, limitAtmAll, limitPaymentYear, limitPaymentMonth, limitPaymentWeek, limitPaymentDay, limitPaymentAll, paymentDailyLimit, pin, anonymous, sendToParent, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * create a physical card
     * Create a new physical card. To use a card you will need to activate it (/cards/{id}/Activate/).
     * @param userId User&#39;s id of cardholder (required)
     * @param walletId Wallet&#39;s Id in which to create the card (required)
     * @param permsGroup Permissions group of the card. There is 4 usages which create 16 possible groups:  | group | NFC | ATM | On-line | Foreign | |-----|-----|-----|-----|------| |TRZ-CU-001|KO|KO|KO|KO| |TRZ-CU-002|KO|KO|KO|OK| |TRZ-CU-003|KO|KO|OK|KO| |TRZ-CU-004|KO|KO|OK|OK| |TRZ-CU-005|KO|OK|KO|KO| |TRZ-CU-006|KO|OK|KO|OK| |TRZ-CU-007|KO|OK|OK|KO| |TRZ-CU-008|KO|OK|OK|OK| |TRZ-CU-009|OK|KO|KO|KO| |TRZ-CU-010|OK|KO|KO|OK| |TRZ-CU-011|OK|KO|OK|KO| |TRZ-CU-012|OK|KO|OK|OK| |TRZ-CU-013|OK|OK|KO|KO| |TRZ-CU-014|OK|OK|KO|OK| |TRZ-CU-015|OK|OK|OK|KO| |TRZ-CU-016|OK|OK|OK|OK|  (required)
     * @param cardTag Custom field (required)
     * @param cardPrint Card appearance code, also used to choose the program ID of the card (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param batchDeliveryId Batch regroupement identifier (must be between 1 and 238327) NOT YET OPERATIONAL (optional)
     * @param limitAtmYear ATM operations limit for a sliding year. No default value. (optional)
     * @param limitAtmMonth ATM operations limit for a sliding month. No default value. (optional)
     * @param limitAtmWeek ATM operations limit for a sliding week. Default value 2000â‚¬. (optional)
     * @param limitAtmDay ATM operations limit for a single day. Default value 1000â‚¬. (optional)
     * @param limitAtmAll ATM operations limit from beginning. No default value. (optional)
     * @param limitPaymentYear POS operations limit for a sliding year. No default value. (optional)
     * @param limitPaymentMonth POS operations limit for a sliding month. No default value. (optional)
     * @param limitPaymentWeek POS operations limit for a sliding week. Default value 3000â‚¬. (optional)
     * @param limitPaymentDay POS operations limit for a single day. Default value 2000â‚¬. (optional)
     * @param limitPaymentAll POS operations limit from beginning. No default value. (optional)
     * @param paymentDailyLimit POS operations limit for a single day including cents. The decimal delimiter must be \&quot;.\&quot;. No default value. (optional)
     * @param pin Card&#39;s PIN code value. Default random PIN. (optional)
     * @param anonymous Card is anonymous. If value is 1 there will be no embossed name. (optional)
     * @param sendToParent If you put the value 1 the delivery address will be the parent user&#39;s. (optional)
     * @param mccRestrictionGroupId mccRestrictionGroupId you want to apply (optional)
     * @param merchantRestrictionGroupId merchantRestrictionGroupId you want to apply (optional)
     * @param countryRestrictionGroupId countryRestrictionGroupId you want to apply (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2005> rxCardsRequestPhysicalPost(Integer userId, Integer walletId, String permsGroup, String cardTag, String cardPrint, String accessSignature, Integer batchDeliveryId, Integer limitAtmYear, Integer limitAtmMonth, Integer limitAtmWeek, Integer limitAtmDay, Integer limitAtmAll, Integer limitPaymentYear, Integer limitPaymentMonth, Integer limitPaymentWeek, Integer limitPaymentDay, Integer limitPaymentAll, Float paymentDailyLimit, String pin, Integer anonymous, Integer sendToParent, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardsRequestPhysicalPost(userId, walletId, permsGroup, cardTag, cardPrint, accessSignature, batchDeliveryId, limitAtmYear, limitAtmMonth, limitAtmWeek, limitAtmDay, limitAtmAll, limitPaymentYear, limitPaymentMonth, limitPaymentWeek, limitPaymentDay, limitPaymentAll, paymentDailyLimit, pin, anonymous, sendToParent, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, accessTag, accessUserId, accessUserIp, fut);
        }));
    }

    public static CardApi newInstance(io.swagger.client.api.CardApi arg) {
        return arg != null ? new CardApi(arg) : null;
    }
}
