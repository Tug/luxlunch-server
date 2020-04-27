package io.swagger.client.api.rxjava;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20019;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class PayoutApi {

	private final io.swagger.client.api.PayoutApi delegate;

	public PayoutApi(io.swagger.client.api.PayoutApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.PayoutApi getDelegate() {
	    return delegate;
	}

    /**
     * cancel a payout
     * Change pay out status to CANCELED. A VALIDATED pay out can&#39;t be canceled.
     * @param id Payouts internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deletePayout(Long id, Handler<AsyncResult<TreezorInlineResponse20019>> resultHandler) {
        delegate.deletePayout(id, resultHandler);
    }

    /**
     * cancel a payout
     * Change pay out status to CANCELED. A VALIDATED pay out can&#39;t be canceled.
     * @param id Payouts internal id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20019> rxDeletePayout(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deletePayout(id, fut);
        }));
    }
    /**
     * get a payout
     * Get a pay out from the system.
     * @param id Payouts internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getPayout(Long id, Handler<AsyncResult<TreezorInlineResponse20019>> resultHandler) {
        delegate.getPayout(id, resultHandler);
    }

    /**
     * get a payout
     * Get a pay out from the system.
     * @param id Payouts internal id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20019> rxGetPayout(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getPayout(id, fut);
        }));
    }
    /**
     * search payout(s)
     * Get payout(s) that match search criteria. The request must contains at least one of those inputs  payoutId, bankaccountId, beneficiaryId, payoutTypeId, payoutTag
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payoutId Payout&#39;s Id (optional)
     * @param payoutTag Custom data. (optional)
     * @param payoutStatus pay out status; Possible values: * CANCELED * PENDING * VALIDATED  (optional)
     * @param payoutTypeId Pay out type&#39;s id :  | ID | Description | |-----|-----| | 1 | Credit Transfer | | 2 | Direct Debit |  (optional)
     * @param walletId Pay out wallet&#39;s id. (optional)
     * @param userId Pay out user&#39;s id. (optional)
     * @param payoutDate pay out execution date. Format: YYYY-MM-DD HH:MM:SS&#39;  (optional)
     * @param bankaccountId Pay out bank account id. (optional)
     * @param beneficiaryId Pay out beneficiary id. (optional)
     * @param amount Pay out amount. (optional)
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
    public void getPayouts(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer payoutId, String payoutTag, String payoutStatus, Integer payoutTypeId, Integer walletId, Integer userId, OffsetDateTime payoutDate, Integer bankaccountId, Integer beneficiaryId, String amount, String currency, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20019>> resultHandler) {
        delegate.getPayouts(accessSignature, accessTag, accessUserId, accessUserIp, payoutId, payoutTag, payoutStatus, payoutTypeId, walletId, userId, payoutDate, bankaccountId, beneficiaryId, amount, currency, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, resultHandler);
    }

    /**
     * search payout(s)
     * Get payout(s) that match search criteria. The request must contains at least one of those inputs  payoutId, bankaccountId, beneficiaryId, payoutTypeId, payoutTag
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payoutId Payout&#39;s Id (optional)
     * @param payoutTag Custom data. (optional)
     * @param payoutStatus pay out status; Possible values: * CANCELED * PENDING * VALIDATED  (optional)
     * @param payoutTypeId Pay out type&#39;s id :  | ID | Description | |-----|-----| | 1 | Credit Transfer | | 2 | Direct Debit |  (optional)
     * @param walletId Pay out wallet&#39;s id. (optional)
     * @param userId Pay out user&#39;s id. (optional)
     * @param payoutDate pay out execution date. Format: YYYY-MM-DD HH:MM:SS&#39;  (optional)
     * @param bankaccountId Pay out bank account id. (optional)
     * @param beneficiaryId Pay out beneficiary id. (optional)
     * @param amount Pay out amount. (optional)
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
    public Single<TreezorInlineResponse20019> rxGetPayouts(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer payoutId, String payoutTag, String payoutStatus, Integer payoutTypeId, Integer walletId, Integer userId, OffsetDateTime payoutDate, Integer bankaccountId, Integer beneficiaryId, String amount, String currency, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getPayouts(accessSignature, accessTag, accessUserId, accessUserIp, payoutId, payoutTag, payoutStatus, payoutTypeId, walletId, userId, payoutDate, bankaccountId, beneficiaryId, amount, currency, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, fut);
        }));
    }
    /**
     * create a pay out
     * Create a new pay out in the system.
     * @param walletId Pay out wallet id. (required)
     * @param amount Pay out amount. (required)
     * @param currency Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payoutTag Custom data. (optional)
     * @param bankaccountId Pay out bank account&#39;s id. Mandatory id beneficiaryId is not provided. If bankaccountId and beneficiaryId are both provided, the beneficiaryId will be used. (optional)
     * @param beneficiaryId Pay out beneficiary&#39;s id. Mandatory id bankaccountId is not provided. If bankaccountId and beneficiaryId are both provided, the beneficiaryId will be used. (optional)
     * @param label Pay out label that will be displayed in the receiver&#39;s account (140 chars max). (optional)
     * @param supportingFileLink Support file link (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postPayout(Integer walletId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String payoutTag, Integer bankaccountId, Integer beneficiaryId, String label, String supportingFileLink, Handler<AsyncResult<TreezorInlineResponse20019>> resultHandler) {
        delegate.postPayout(walletId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, payoutTag, bankaccountId, beneficiaryId, label, supportingFileLink, resultHandler);
    }

    /**
     * create a pay out
     * Create a new pay out in the system.
     * @param walletId Pay out wallet id. (required)
     * @param amount Pay out amount. (required)
     * @param currency Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payoutTag Custom data. (optional)
     * @param bankaccountId Pay out bank account&#39;s id. Mandatory id beneficiaryId is not provided. If bankaccountId and beneficiaryId are both provided, the beneficiaryId will be used. (optional)
     * @param beneficiaryId Pay out beneficiary&#39;s id. Mandatory id bankaccountId is not provided. If bankaccountId and beneficiaryId are both provided, the beneficiaryId will be used. (optional)
     * @param label Pay out label that will be displayed in the receiver&#39;s account (140 chars max). (optional)
     * @param supportingFileLink Support file link (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20019> rxPostPayout(Integer walletId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String payoutTag, Integer bankaccountId, Integer beneficiaryId, String label, String supportingFileLink) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.postPayout(walletId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, payoutTag, bankaccountId, beneficiaryId, label, supportingFileLink, fut);
        }));
    }

    public static PayoutApi newInstance(io.swagger.client.api.PayoutApi arg) {
        return arg != null ? new PayoutApi(arg) : null;
    }
}
