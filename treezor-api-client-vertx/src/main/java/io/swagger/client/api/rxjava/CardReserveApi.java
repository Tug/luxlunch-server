package io.swagger.client.api.rxjava;

import io.swagger.client.model.TreezorBody2;
import io.swagger.client.model.TreezorBody3;
import io.swagger.client.model.TreezorInlineResponse2008;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class CardReserveApi {

	private final io.swagger.client.api.CardReserveApi delegate;

	public CardReserveApi(io.swagger.client.api.CardReserveApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.CardReserveApi getDelegate() {
	    return delegate;
	}

    /**
     * add an amount to the reserved amount of a card
     * add an amount to the reserved amount of a card
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://www.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardReserveAddTo(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody2 body, Handler<AsyncResult<Float>> resultHandler) {
        delegate.cardReserveAddTo(accessSignature, accessTag, accessUserId, accessUserIp, body, resultHandler);
    }

    /**
     * add an amount to the reserved amount of a card
     * add an amount to the reserved amount of a card
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://www.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Float> rxCardReserveAddTo(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody2 body) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardReserveAddTo(accessSignature, accessTag, accessUserId, accessUserIp, body, fut);
        }));
    }
    /**
     * check reserved amount
     * Check if an amount can be substract to the reserved amount
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://www.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardReserveCheck(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody3 body, Handler<AsyncResult<Boolean>> resultHandler) {
        delegate.cardReserveCheck(accessSignature, accessTag, accessUserId, accessUserIp, body, resultHandler);
    }

    /**
     * check reserved amount
     * Check if an amount can be substract to the reserved amount
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://www.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Boolean> rxCardReserveCheck(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody3 body) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardReserveCheck(accessSignature, accessTag, accessUserId, accessUserIp, body, fut);
        }));
    }
    /**
     * get the reserved amount of a card
     * get the reserved amount of a card
     * @param id the cardId of the reserved amount you want to pick up (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://www.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardReserveGet(Long id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2008>> resultHandler) {
        delegate.cardReserveGet(id, accessSignature, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * get the reserved amount of a card
     * get the reserved amount of a card
     * @param id the cardId of the reserved amount you want to pick up (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://www.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2008> rxCardReserveGet(Long id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.cardReserveGet(id, accessSignature, accessTag, accessUserId, accessUserIp, fut);
        }));
    }

    public static CardReserveApi newInstance(io.swagger.client.api.CardReserveApi arg) {
        return arg != null ? new CardReserveApi(arg) : null;
    }
}
