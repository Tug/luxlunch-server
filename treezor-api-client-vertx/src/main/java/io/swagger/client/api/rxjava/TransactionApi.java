package io.swagger.client.api.rxjava;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20022;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class TransactionApi {

	private final io.swagger.client.api.TransactionApi delegate;

	public TransactionApi(io.swagger.client.api.TransactionApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.TransactionApi getDelegate() {
	    return delegate;
	}

    /**
     * get a transaction
     * Get a transaction from the system.
     * @param id Transaction&#39;s internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getTransaction(Long id, Handler<AsyncResult<TreezorInlineResponse20022>> resultHandler) {
        delegate.getTransaction(id, resultHandler);
    }

    /**
     * get a transaction
     * Get a transaction from the system.
     * @param id Transaction&#39;s internal id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20022> rxGetTransaction(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getTransaction(id, fut);
        }));
    }
    /**
     * search transactions
     * Get transactions that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param transactionId Transaction&#39;s Id (optional)
     * @param transactionType Transaction types. Possible values: * Payin * Payout * Transfer * Transfer Refund * Payin Refund * Discount * Bill  (optional)
     * @param walletId Transactions&#39; wallet id. (optional)
     * @param userId Transactions&#39; user id. (optional)
     * @param name Transactions&#39; name. (optional)
     * @param description transactions&#39; description. (optional)
     * @param amount Transactions&#39; amount. (optional)
     * @param currency Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (optional)
     * @param valueDate The value date of the transaction (date applied for the payment) Format : YYYY-MM-DD HH:MM:SS (optional)
     * @param executionDate Date of the execution of the transaction Format : YYYY-MM-DD HH:MM:SS (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param createdDateFrom The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param createdDateTo The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getTransactions(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer transactionId, String transactionType, Integer walletId, Integer userId, String name, String description, String amount, String currency, OffsetDateTime valueDate, OffsetDateTime executionDate, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, Handler<AsyncResult<TreezorInlineResponse20022>> resultHandler) {
        delegate.getTransactions(accessSignature, accessTag, accessUserId, accessUserIp, transactionId, transactionType, walletId, userId, name, description, amount, currency, valueDate, executionDate, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, resultHandler);
    }

    /**
     * search transactions
     * Get transactions that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param transactionId Transaction&#39;s Id (optional)
     * @param transactionType Transaction types. Possible values: * Payin * Payout * Transfer * Transfer Refund * Payin Refund * Discount * Bill  (optional)
     * @param walletId Transactions&#39; wallet id. (optional)
     * @param userId Transactions&#39; user id. (optional)
     * @param name Transactions&#39; name. (optional)
     * @param description transactions&#39; description. (optional)
     * @param amount Transactions&#39; amount. (optional)
     * @param currency Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (optional)
     * @param valueDate The value date of the transaction (date applied for the payment) Format : YYYY-MM-DD HH:MM:SS (optional)
     * @param executionDate Date of the execution of the transaction Format : YYYY-MM-DD HH:MM:SS (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param createdDateFrom The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param createdDateTo The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20022> rxGetTransactions(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer transactionId, String transactionType, Integer walletId, Integer userId, String name, String description, String amount, String currency, OffsetDateTime valueDate, OffsetDateTime executionDate, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getTransactions(accessSignature, accessTag, accessUserId, accessUserIp, transactionId, transactionType, walletId, userId, name, description, amount, currency, valueDate, executionDate, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, fut);
        }));
    }

    public static TransactionApi newInstance(io.swagger.client.api.TransactionApi arg) {
        return arg != null ? new TransactionApi(arg) : null;
    }
}
