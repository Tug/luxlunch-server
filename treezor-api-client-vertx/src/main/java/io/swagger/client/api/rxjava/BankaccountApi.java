package io.swagger.client.api.rxjava;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse2001;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class BankaccountApi {

	private final io.swagger.client.api.BankaccountApi delegate;

	public BankaccountApi(io.swagger.client.api.BankaccountApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.BankaccountApi getDelegate() {
	    return delegate;
	}

    /**
     * deactivate a bank account
     * Change bank account&#39;s status to CANCELED. If a payout is being validated on this bank account, it can not be canceled.
     * @param id Bank Accounts internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteBankaccount(Long id, Handler<AsyncResult<TreezorInlineResponse2001>> resultHandler) {
        delegate.deleteBankaccount(id, resultHandler);
    }

    /**
     * deactivate a bank account
     * Change bank account&#39;s status to CANCELED. If a payout is being validated on this bank account, it can not be canceled.
     * @param id Bank Accounts internal id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2001> rxDeleteBankaccount(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deleteBankaccount(id, fut);
        }));
    }
    /**
     * get a bank account
     * Get a bank account from the system.
     * @param id Bank Accounts internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getBankaccount(Long id, Handler<AsyncResult<TreezorInlineResponse2001>> resultHandler) {
        delegate.getBankaccount(id, resultHandler);
    }

    /**
     * get a bank account
     * Get a bank account from the system.
     * @param id Bank Accounts internal id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2001> rxGetBankaccount(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getBankaccount(id, fut);
        }));
    }
    /**
     * search bank accounts
     * Get bank accounts that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param bankaccountId bank account id. (optional)
     * @param bankaccountStatus bank account status. Possible values: * CANCELED * PENDING * VALIDATED  (optional)
     * @param userId Bank account owner user&#39;s id (optional)
     * @param bankaccountIBAN Bank account IBAN (optional)
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
    public void getBankaccounts(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer bankaccountId, String bankaccountStatus, Integer userId, String bankaccountIBAN, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse2001>> resultHandler) {
        delegate.getBankaccounts(accessSignature, accessTag, accessUserId, accessUserIp, bankaccountId, bankaccountStatus, userId, bankaccountIBAN, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, resultHandler);
    }

    /**
     * search bank accounts
     * Get bank accounts that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param bankaccountId bank account id. (optional)
     * @param bankaccountStatus bank account status. Possible values: * CANCELED * PENDING * VALIDATED  (optional)
     * @param userId Bank account owner user&#39;s id (optional)
     * @param bankaccountIBAN Bank account IBAN (optional)
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
    public Single<TreezorInlineResponse2001> rxGetBankaccounts(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer bankaccountId, String bankaccountStatus, Integer userId, String bankaccountIBAN, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getBankaccounts(accessSignature, accessTag, accessUserId, accessUserIp, bankaccountId, bankaccountStatus, userId, bankaccountIBAN, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, fut);
        }));
    }
    /**
     * create a bank account
     * Create a new benefeciary bank account in the system.
     * @param userId Owner user&#39;s id. (required)
     * @param bankaccountOwnerName Bank account owner&#39;s name. (required)
     * @param bankaccountOwnerAddress Bank account owner&#39;s address. (required)
     * @param bankaccountIBAN Beneficiary bank account&#39;s IBAN. (required)
     * @param bankaccountBIC Beneficiary bank account&#39;s BIC (or SWIFT). (required)
     * @param bankaccountType Beneficiary bank account&#39;s type. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param bankaccountTag Custom data. (optional)
     * @param name Bank account&#39;s name. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postBankaccount(Integer userId, String bankaccountOwnerName, String bankaccountOwnerAddress, String bankaccountIBAN, String bankaccountBIC, String bankaccountType, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String bankaccountTag, String name, Handler<AsyncResult<TreezorInlineResponse2001>> resultHandler) {
        delegate.postBankaccount(userId, bankaccountOwnerName, bankaccountOwnerAddress, bankaccountIBAN, bankaccountBIC, bankaccountType, accessSignature, accessTag, accessUserId, accessUserIp, bankaccountTag, name, resultHandler);
    }

    /**
     * create a bank account
     * Create a new benefeciary bank account in the system.
     * @param userId Owner user&#39;s id. (required)
     * @param bankaccountOwnerName Bank account owner&#39;s name. (required)
     * @param bankaccountOwnerAddress Bank account owner&#39;s address. (required)
     * @param bankaccountIBAN Beneficiary bank account&#39;s IBAN. (required)
     * @param bankaccountBIC Beneficiary bank account&#39;s BIC (or SWIFT). (required)
     * @param bankaccountType Beneficiary bank account&#39;s type. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param bankaccountTag Custom data. (optional)
     * @param name Bank account&#39;s name. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2001> rxPostBankaccount(Integer userId, String bankaccountOwnerName, String bankaccountOwnerAddress, String bankaccountIBAN, String bankaccountBIC, String bankaccountType, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String bankaccountTag, String name) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.postBankaccount(userId, bankaccountOwnerName, bankaccountOwnerAddress, bankaccountIBAN, bankaccountBIC, bankaccountType, accessSignature, accessTag, accessUserId, accessUserIp, bankaccountTag, name, fut);
        }));
    }

    public static BankaccountApi newInstance(io.swagger.client.api.BankaccountApi arg) {
        return arg != null ? new BankaccountApi(arg) : null;
    }
}
