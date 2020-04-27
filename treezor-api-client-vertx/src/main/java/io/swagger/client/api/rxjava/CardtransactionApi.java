package io.swagger.client.api.rxjava;

import io.swagger.client.model.TreezorInlineResponse20010;
import io.swagger.client.model.TreezorInlineResponse2009;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class CardtransactionApi {

	private final io.swagger.client.api.CardtransactionApi delegate;

	public CardtransactionApi(io.swagger.client.api.CardtransactionApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.CardtransactionApi getDelegate() {
	    return delegate;
	}

    /**
     * get a card transaction
     * get a card transaction
     * @param id Card transactions&#39;s internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getCardtransaction(Long id, Handler<AsyncResult<TreezorInlineResponse20010>> resultHandler) {
        delegate.getCardtransaction(id, resultHandler);
    }

    /**
     * get a card transaction
     * get a card transaction
     * @param id Card transactions&#39;s internal id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20010> rxGetCardtransaction(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getCardtransaction(id, fut);
        }));
    }
    /**
     * search for card transactions
     * Search for documents. The request must contain at least one of those inputs - cardId, paymentId, publicToken, walletId
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param cardtransactionId Card transaction&#39;s Id (optional)
     * @param cardId Card&#39;s Id (optional)
     * @param walletId Card&#39;s wallet Id (optional)
     * @param merchantId Merchant&#39;s Id (optional)
     * @param publicToken Card&#39;s public token (optional)
     * @param paymentId Payment&#39;s Id (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists). required: false (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void readCardTransaction(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer cardtransactionId, Integer cardId, Integer walletId, Integer merchantId, String publicToken, Integer paymentId, Integer pageNumber, Integer pageCount, String sortBy, Handler<AsyncResult<TreezorInlineResponse2009>> resultHandler) {
        delegate.readCardTransaction(accessSignature, accessTag, accessUserId, accessUserIp, cardtransactionId, cardId, walletId, merchantId, publicToken, paymentId, pageNumber, pageCount, sortBy, resultHandler);
    }

    /**
     * search for card transactions
     * Search for documents. The request must contain at least one of those inputs - cardId, paymentId, publicToken, walletId
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param cardtransactionId Card transaction&#39;s Id (optional)
     * @param cardId Card&#39;s Id (optional)
     * @param walletId Card&#39;s wallet Id (optional)
     * @param merchantId Merchant&#39;s Id (optional)
     * @param publicToken Card&#39;s public token (optional)
     * @param paymentId Payment&#39;s Id (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists). required: false (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2009> rxReadCardTransaction(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer cardtransactionId, Integer cardId, Integer walletId, Integer merchantId, String publicToken, Integer paymentId, Integer pageNumber, Integer pageCount, String sortBy) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.readCardTransaction(accessSignature, accessTag, accessUserId, accessUserIp, cardtransactionId, cardId, walletId, merchantId, publicToken, paymentId, pageNumber, pageCount, sortBy, fut);
        }));
    }

    public static CardtransactionApi newInstance(io.swagger.client.api.CardtransactionApi arg) {
        return arg != null ? new CardtransactionApi(arg) : null;
    }
}
