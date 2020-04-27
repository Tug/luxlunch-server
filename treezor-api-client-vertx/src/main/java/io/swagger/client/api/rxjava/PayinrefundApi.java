package io.swagger.client.api.rxjava;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20018;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class PayinrefundApi {

	private final io.swagger.client.api.PayinrefundApi delegate;

	public PayinrefundApi(io.swagger.client.api.PayinrefundApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.PayinrefundApi getDelegate() {
	    return delegate;
	}

    /**
     * cancel a pay in refund
     * Change payin refund&#39;s status to CANCELED. A validated payin refund can&#39;t be cancelled.
     * @param id Payinrefund&#39;s internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deletePayinrefund(Long id, Handler<AsyncResult<TreezorInlineResponse20018>> resultHandler) {
        delegate.deletePayinrefund(id, resultHandler);
    }

    /**
     * cancel a pay in refund
     * Change payin refund&#39;s status to CANCELED. A validated payin refund can&#39;t be cancelled.
     * @param id Payinrefund&#39;s internal id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20018> rxDeletePayinrefund(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deletePayinrefund(id, fut);
        }));
    }
    /**
     * get a pay in refund
     * Get a payin refund from the system.
     * @param id Payinrefund&#39;s internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getPayinrefund(Long id, Handler<AsyncResult<TreezorInlineResponse20018>> resultHandler) {
        delegate.getPayinrefund(id, resultHandler);
    }

    /**
     * get a pay in refund
     * Get a payin refund from the system.
     * @param id Payinrefund&#39;s internal id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20018> rxGetPayinrefund(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getPayinrefund(id, fut);
        }));
    }
    /**
     * search pay in refunds
     * Search for payinrefunds in the system.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payinId Payin&#39;s id. (optional)
     * @param payinrefundId Payinrefund&#39;s id. (optional)
     * @param payinrefundTag Custom data. (optional)
     * @param payinrefundStatus Payinrefund&#39;s status. Possible values: * PENDING * CANCELED * VALIDATED (optional)
     * @param walletId Wallet&#39;s id to refund. (optional)
     * @param payinrefundDate payinrefund&#39;s date. Format: YYYY-MM-DD (optional)
     * @param userId User&#39;s id who made refunds. (optional)
     * @param amount Refund&#39;s amount. (optional)
     * @param currency Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (optional)
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
    public void getPayinrefunds(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer payinId, Integer payinrefundId, String payinrefundTag, String payinrefundStatus, Integer walletId, OffsetDateTime payinrefundDate, Integer userId, String amount, String currency, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20018>> resultHandler) {
        delegate.getPayinrefunds(accessSignature, accessTag, accessUserId, accessUserIp, payinId, payinrefundId, payinrefundTag, payinrefundStatus, walletId, payinrefundDate, userId, amount, currency, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, resultHandler);
    }

    /**
     * search pay in refunds
     * Search for payinrefunds in the system.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payinId Payin&#39;s id. (optional)
     * @param payinrefundId Payinrefund&#39;s id. (optional)
     * @param payinrefundTag Custom data. (optional)
     * @param payinrefundStatus Payinrefund&#39;s status. Possible values: * PENDING * CANCELED * VALIDATED (optional)
     * @param walletId Wallet&#39;s id to refund. (optional)
     * @param payinrefundDate payinrefund&#39;s date. Format: YYYY-MM-DD (optional)
     * @param userId User&#39;s id who made refunds. (optional)
     * @param amount Refund&#39;s amount. (optional)
     * @param currency Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (optional)
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
    public Single<TreezorInlineResponse20018> rxGetPayinrefunds(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer payinId, Integer payinrefundId, String payinrefundTag, String payinrefundStatus, Integer walletId, OffsetDateTime payinrefundDate, Integer userId, String amount, String currency, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getPayinrefunds(accessSignature, accessTag, accessUserId, accessUserIp, payinId, payinrefundId, payinrefundTag, payinrefundStatus, walletId, payinrefundDate, userId, amount, currency, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, fut);
        }));
    }
    /**
     * create a pay in refund
     * Create a new payinrefund in the system.
     * @param payinId payin&#39;s id to refund. (required)
     * @param amount Refund amount. (required)
     * @param currency Refund currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payinrefundTag Custom data. (optional)
     * @param comment End user, client or issuer comment. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postPayinrefunds(Integer payinId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String payinrefundTag, String comment, Handler<AsyncResult<TreezorInlineResponse20018>> resultHandler) {
        delegate.postPayinrefunds(payinId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, payinrefundTag, comment, resultHandler);
    }

    /**
     * create a pay in refund
     * Create a new payinrefund in the system.
     * @param payinId payin&#39;s id to refund. (required)
     * @param amount Refund amount. (required)
     * @param currency Refund currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payinrefundTag Custom data. (optional)
     * @param comment End user, client or issuer comment. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20018> rxPostPayinrefunds(Integer payinId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String payinrefundTag, String comment) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.postPayinrefunds(payinId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, payinrefundTag, comment, fut);
        }));
    }

    public static PayinrefundApi newInstance(io.swagger.client.api.PayinrefundApi arg) {
        return arg != null ? new PayinrefundApi(arg) : null;
    }
}
