package io.swagger.client.api.rxjava;

import io.swagger.client.model.TreezorInlineResponse2007;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class CardDigitalizationsApi {

	private final io.swagger.client.api.CardDigitalizationsApi delegate;

	public CardDigitalizationsApi(io.swagger.client.api.CardDigitalizationsApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.CardDigitalizationsApi getDelegate() {
	    return delegate;
	}

    /**
     * Get a card digitalizations based on its internal id
     * Get a card digitalizations based on its internal id
     * @param id Card digitalization internal id. (required)
     * @param fields fields to output separated by commas. Possible fields are id, externalId, cardId, detailsFromGPS, status, createdDate, modifiedDate (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardDigitalizationsId(Long id, String fields, Handler<AsyncResult<TreezorInlineResponse2007>> resultHandler) {
        delegate.cardDigitalizationsId(id, fields, resultHandler);
    }

    /**
     * Get a card digitalizations based on its internal id
     * Get a card digitalizations based on its internal id
     * @param id Card digitalization internal id. (required)
     * @param fields fields to output separated by commas. Possible fields are id, externalId, cardId, detailsFromGPS, status, createdDate, modifiedDate (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2007> rxCardDigitalizationsId(Long id, String fields) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardDigitalizationsId(id, fields, fut);
        }));
    }
    /**
     * Deletes a payment Token
     * Deletes a payment Token
     * @param id Card digitalization internal id. (required)
     * @param reasonCode The reason code for the action. Possible values are :  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | F | Issuer or cardholder confirmed fraudulent token transactions (Deprecated) | | T | Issuer or cardholder confirmed fraudulent token transactions | | C | Account closed | | Z | Other |  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deletecardDigitalizationsId(Long id, String reasonCode, Handler<AsyncResult<TreezorInlineResponse2007>> resultHandler) {
        delegate.deletecardDigitalizationsId(id, reasonCode, resultHandler);
    }

    /**
     * Deletes a payment Token
     * Deletes a payment Token
     * @param id Card digitalization internal id. (required)
     * @param reasonCode The reason code for the action. Possible values are :  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | F | Issuer or cardholder confirmed fraudulent token transactions (Deprecated) | | T | Issuer or cardholder confirmed fraudulent token transactions | | C | Account closed | | Z | Other |  (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2007> rxDeletecardDigitalizationsId(Long id, String reasonCode) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deletecardDigitalizationsId(id, reasonCode, fut);
        }));
    }
    /**
     * Update the status of a payment Token
     * Update the status of a payment Token
     * @param id Card digitalization internal id. (required)
     * @param status The new status for the payment Token. Possible values are :  | Status | Description | | ---- | ----------- | | unsuspend | Unsuspend | | suspend | Suspend |  (required)
     * @param reasonCode The reason code for the action. Possible values are : - For a suspension :  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other |  - For an unsuspension :  | Reason code | Description | | ---- | ----------- | | F | Cardholder reported token device found or not stolen | | T | Issuer or cardholder confirmed no fraudulent token transactions | | Z | Other |  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void putcardDigitalizationsId(Long id, String status, String reasonCode, Handler<AsyncResult<TreezorInlineResponse2007>> resultHandler) {
        delegate.putcardDigitalizationsId(id, status, reasonCode, resultHandler);
    }

    /**
     * Update the status of a payment Token
     * Update the status of a payment Token
     * @param id Card digitalization internal id. (required)
     * @param status The new status for the payment Token. Possible values are :  | Status | Description | | ---- | ----------- | | unsuspend | Unsuspend | | suspend | Suspend |  (required)
     * @param reasonCode The reason code for the action. Possible values are : - For a suspension :  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other |  - For an unsuspension :  | Reason code | Description | | ---- | ----------- | | F | Cardholder reported token device found or not stolen | | T | Issuer or cardholder confirmed no fraudulent token transactions | | Z | Other |  (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2007> rxPutcardDigitalizationsId(Long id, String status, String reasonCode) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.putcardDigitalizationsId(id, status, reasonCode, fut);
        }));
    }
    /**
     * search for card digitalizations
     * Search for card digitalizations.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param filter Filterable fields are : - id - externalId - cardId - status - detailsFromGPS - createdDate - modifiedDate  More info [here](https://agent.treezor.com/filterv2).  (optional)
     * @param fields fields to output separated by commas. Possible fields are id, externalId, cardId, detailsFromGPS, status, createdDate, modifiedDate (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void readcardDigitalizations(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String filter, String fields, Handler<AsyncResult<TreezorInlineResponse2007>> resultHandler) {
        delegate.readcardDigitalizations(accessSignature, accessTag, accessUserId, accessUserIp, filter, fields, resultHandler);
    }

    /**
     * search for card digitalizations
     * Search for card digitalizations.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param filter Filterable fields are : - id - externalId - cardId - status - detailsFromGPS - createdDate - modifiedDate  More info [here](https://agent.treezor.com/filterv2).  (optional)
     * @param fields fields to output separated by commas. Possible fields are id, externalId, cardId, detailsFromGPS, status, createdDate, modifiedDate (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2007> rxReadcardDigitalizations(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String filter, String fields) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.readcardDigitalizations(accessSignature, accessTag, accessUserId, accessUserIp, filter, fields, fut);
        }));
    }

    public static CardDigitalizationsApi newInstance(io.swagger.client.api.CardDigitalizationsApi arg) {
        return arg != null ? new CardDigitalizationsApi(arg) : null;
    }
}
