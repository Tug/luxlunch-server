package io.swagger.client.api.rxjava;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20024;
import io.swagger.client.model.TreezorInlineResponse20025;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class TransferrefundApi {

	private final io.swagger.client.api.TransferrefundApi delegate;

	public TransferrefundApi(io.swagger.client.api.TransferrefundApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.TransferrefundApi getDelegate() {
	    return delegate;
	}

    /**
     * cancel a transfer refund
     * Change transfer refund&#39;s status to CANCELED. A validated transfer refund can&#39;t be cancelled.
     * @param id Transferrefunds internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteTransferrefund(Long id, Handler<AsyncResult<TreezorInlineResponse20024>> resultHandler) {
        delegate.deleteTransferrefund(id, resultHandler);
    }

    /**
     * cancel a transfer refund
     * Change transfer refund&#39;s status to CANCELED. A validated transfer refund can&#39;t be cancelled.
     * @param id Transferrefunds internal id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20024> rxDeleteTransferrefund(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deleteTransferrefund(id, fut);
        }));
    }
    /**
     * get a transfer refund
     * Get a transfer refund from the system.
     * @param id Trasnfert refund internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getTransferrefund(Long id, Handler<AsyncResult<TreezorInlineResponse20024>> resultHandler) {
        delegate.getTransferrefund(id, resultHandler);
    }

    /**
     * get a transfer refund
     * Get a transfer refund from the system.
     * @param id Trasnfert refund internal id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20024> rxGetTransferrefund(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getTransferrefund(id, fut);
        }));
    }
    /**
     * search transfer refunds
     * Get transfer refunds that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param transferrefundId Transfer refund id. (optional)
     * @param transferrefundTag Custom data. (optional)
     * @param transferrefundStatus Transfer refund status. Possible values: * PENDING * CANCELED * VALIDATED  (optional)
     * @param walletId Refunded wallet&#39;s id. (optional)
     * @param transferId Initial transfer&#39;s id. (optional)
     * @param transferrefundDate transfert refund&#39;s date. Format: YYYY-MM-DD HH:MM:SS  (optional)
     * @param userId User&#39;s id of who has made the transfer refund. (optional)
     * @param amount Refund amount. (optional)
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
    public void getTransferrefunds(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer transferrefundId, String transferrefundTag, String transferrefundStatus, Integer walletId, Integer transferId, Integer transferrefundDate, Integer userId, String amount, String currency, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20024>> resultHandler) {
        delegate.getTransferrefunds(accessSignature, accessTag, accessUserId, accessUserIp, transferrefundId, transferrefundTag, transferrefundStatus, walletId, transferId, transferrefundDate, userId, amount, currency, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, resultHandler);
    }

    /**
     * search transfer refunds
     * Get transfer refunds that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param transferrefundId Transfer refund id. (optional)
     * @param transferrefundTag Custom data. (optional)
     * @param transferrefundStatus Transfer refund status. Possible values: * PENDING * CANCELED * VALIDATED  (optional)
     * @param walletId Refunded wallet&#39;s id. (optional)
     * @param transferId Initial transfer&#39;s id. (optional)
     * @param transferrefundDate transfert refund&#39;s date. Format: YYYY-MM-DD HH:MM:SS  (optional)
     * @param userId User&#39;s id of who has made the transfer refund. (optional)
     * @param amount Refund amount. (optional)
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
    public Single<TreezorInlineResponse20024> rxGetTransferrefunds(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer transferrefundId, String transferrefundTag, String transferrefundStatus, Integer walletId, Integer transferId, Integer transferrefundDate, Integer userId, String amount, String currency, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getTransferrefunds(accessSignature, accessTag, accessUserId, accessUserIp, transferrefundId, transferrefundTag, transferrefundStatus, walletId, transferId, transferrefundDate, userId, amount, currency, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, fut);
        }));
    }
    /**
     * create a transfer refund
     * Create a new transfer refund in the system.
     * @param transferId transfer&#39;s id to refund. (required)
     * @param amount Refund amount (required)
     * @param currency Transfert&#39;s currency. Debited wallet and credited wallet must share same currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param transferrefundTag Custom data. (optional)
     * @param comment End user, client or issuer comment. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postTransferrefunds(Integer transferId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String transferrefundTag, String comment, Handler<AsyncResult<TreezorInlineResponse20025>> resultHandler) {
        delegate.postTransferrefunds(transferId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, transferrefundTag, comment, resultHandler);
    }

    /**
     * create a transfer refund
     * Create a new transfer refund in the system.
     * @param transferId transfer&#39;s id to refund. (required)
     * @param amount Refund amount (required)
     * @param currency Transfert&#39;s currency. Debited wallet and credited wallet must share same currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param transferrefundTag Custom data. (optional)
     * @param comment End user, client or issuer comment. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20025> rxPostTransferrefunds(Integer transferId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String transferrefundTag, String comment) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.postTransferrefunds(transferId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, transferrefundTag, comment, fut);
        }));
    }

    public static TransferrefundApi newInstance(io.swagger.client.api.TransferrefundApi arg) {
        return arg != null ? new TransferrefundApi(arg) : null;
    }
}
