package io.swagger.client.api.rxjava;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20017;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class PayinApi {

	private final io.swagger.client.api.PayinApi delegate;

	public PayinApi(io.swagger.client.api.PayinApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.PayinApi getDelegate() {
	    return delegate;
	}

    /**
     * delete a pay in
     * Deactivate a payin in the system.
     * @param id Payin&#39;s id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deletePayin(Long id, Handler<AsyncResult<TreezorInlineResponse20017>> resultHandler) {
        delegate.deletePayin(id, resultHandler);
    }

    /**
     * delete a pay in
     * Deactivate a payin in the system.
     * @param id Payin&#39;s id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20017> rxDeletePayin(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deletePayin(id, fut);
        }));
    }
    /**
     * get a pay in
     * Get a payin from the system by its id.
     * @param id Payin&#39;s id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getPayin(Long id, Handler<AsyncResult<TreezorInlineResponse20017>> resultHandler) {
        delegate.getPayin(id, resultHandler);
    }

    /**
     * get a pay in
     * Get a payin from the system by its id.
     * @param id Payin&#39;s id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20017> rxGetPayin(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getPayin(id, fut);
        }));
    }
    /**
     * search pay ins
     * Get payins that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIP Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payinId Payin&#39;s id. (optional)
     * @param walletId Payin&#39;s wallet id. (optional)
     * @param payinTag Client custom data. (optional)
     * @param payinStatus Payins&#39;s status. (optional)
     * @param userId User&#39;s id who performed the operation (debited). (optional)
     * @param userName User&#39;s name who performed the operation (debited). (optional)
     * @param userEmail User&#39;s email who performed the operation (debited). (optional)
     * @param beneficiaryUserId User&#39;s id who received the operation (credited). (optional)
     * @param eventAlias Wallet eventAlias of the payin (credited wallet). (optional)
     * @param walletTypeId Payin&#39;s wallet type id. (optional)
     * @param paymentMethodId Payin&#39;s payment method id. (optional)
     * @param createdDateFrom The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param createdDateTo The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateFrom The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateTo The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : createdDate. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getPayins(String accessSignature, String accessTag, Integer accessUserId, Integer accessUserIP, Integer payinId, Integer walletId, String payinTag, String payinStatus, Integer userId, String userName, String userEmail, Integer beneficiaryUserId, String eventAlias, Integer walletTypeId, String paymentMethodId, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<TreezorInlineResponse20017>> resultHandler) {
        delegate.getPayins(accessSignature, accessTag, accessUserId, accessUserIP, payinId, walletId, payinTag, payinStatus, userId, userName, userEmail, beneficiaryUserId, eventAlias, walletTypeId, paymentMethodId, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, pageNumber, pageCount, sortBy, sortOrder, resultHandler);
    }

    /**
     * search pay ins
     * Get payins that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIP Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payinId Payin&#39;s id. (optional)
     * @param walletId Payin&#39;s wallet id. (optional)
     * @param payinTag Client custom data. (optional)
     * @param payinStatus Payins&#39;s status. (optional)
     * @param userId User&#39;s id who performed the operation (debited). (optional)
     * @param userName User&#39;s name who performed the operation (debited). (optional)
     * @param userEmail User&#39;s email who performed the operation (debited). (optional)
     * @param beneficiaryUserId User&#39;s id who received the operation (credited). (optional)
     * @param eventAlias Wallet eventAlias of the payin (credited wallet). (optional)
     * @param walletTypeId Payin&#39;s wallet type id. (optional)
     * @param paymentMethodId Payin&#39;s payment method id. (optional)
     * @param createdDateFrom The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param createdDateTo The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateFrom The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateTo The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : createdDate. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20017> rxGetPayins(String accessSignature, String accessTag, Integer accessUserId, Integer accessUserIP, Integer payinId, Integer walletId, String payinTag, String payinStatus, Integer userId, String userName, String userEmail, Integer beneficiaryUserId, String eventAlias, Integer walletTypeId, String paymentMethodId, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getPayins(accessSignature, accessTag, accessUserId, accessUserIP, payinId, walletId, payinTag, payinStatus, userId, userName, userEmail, beneficiaryUserId, eventAlias, walletTypeId, paymentMethodId, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, pageNumber, pageCount, sortBy, sortOrder, fut);
        }));
    }
    /**
     * create a pay in
     * Create a new pay in in the system.
     * @param walletId Credited wallet&#39;s ID (required)
     * @param userId User&#39;s id who makes the pay in. NB : this parameter should should not be transmitted in the case of payin of method Sepa Direct Debit Core (21). It will be set automatically by the system.  (required)
     * @param paymentMethodId | Id | Payment by | | ---| --- | | 3 | Check | | 11 | Card | | 14 | Oneclick card (without payment form) | | 21 | Sepa Direct Debit Core | | 23 | Full Hosted HTML Payment Form. Please note that if you use this paymentMethodId the flieds paymentAcceptedUrl, paymentRefusedUrl, paymentWaitingUrl, paymentCanceledUrl and paymentExceptionUrl are mandatory. CSS of the payment page can be customized | | 24 | IFrame Payment Form. Please note that if you use this paymentMethodId the flieds paymentAcceptedUrl, paymentRefusedUrl, paymentWaitingUrl, paymentCanceledUrl and paymentExceptionUrl are mandatory. CSS of the payment page can be customized| | 25 | Payment made through an SDK - You cannot directly create a payin directly with this method id. The payin will be automatically created by the system. |  (required)
     * @param amount Pay in amount. (required)
     * @param currency Payin currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217). Must be the same as the wallet&#39;s.  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payinTag Client custom data. (optional)
     * @param oneclickcardId Oneclick card&#39;s id. Mandatory if payment method is 14. Useless otherwise. (optional)
     * @param paymentAcceptedUrl Url where cardholder is redirected if payment is successful. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. (optional)
     * @param paymentWaitingUrl Url where cardholder is redirected to wait payment processing. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. (optional)
     * @param paymentRefusedUrl Url where cardholder is redirected if payment is refused. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. (optional)
     * @param paymentCanceledUrl Url where cardholder is redirected if payment is canceled. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. (optional)
     * @param paymentExceptionUrl Url where cardholder is redirected if the payment process raised an exception. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. (optional)
     * @param distributorFee Distributor fee (optional)
     * @param messageToUser Message to send to wallet&#39;s user. In the case of a Sepa Direct Debit Core payment method this parameter will be the reconciliation information transmitted to the Debtor (ie. Invoice number ...). In this case it cannot be more than 140 characters. (optional)
     * @param language Language for the third party interface. (optional)
     * @param createdIp User&#39;s IP address (optional)
     * @param payinDate The date at which the SDD should be presented. This parameter is mandatory when performing a payin of method SDD Core. Format is YYYY-MM-DD The date should follow some requirements (Traget 2 working day) :    - Be a weekday (Monday to Friday)   - January 1st is excluded   - May 1st is excluded   - December 25 is excluded   - December 26th is excluded   - Easter day is excluded   - Easter Monday is excluded   - Good Friday is excluded  (optional)
     * @param mandateId The id of the mandate. This parameter is mandatory when performing a payin with method SDD Core. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postPayin(Integer walletId, Integer userId, Integer paymentMethodId, Float amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String payinTag, Integer oneclickcardId, String paymentAcceptedUrl, String paymentWaitingUrl, String paymentRefusedUrl, String paymentCanceledUrl, String paymentExceptionUrl, Float distributorFee, String messageToUser, String language, String createdIp, String payinDate, Integer mandateId, Handler<AsyncResult<TreezorInlineResponse20017>> resultHandler) {
        delegate.postPayin(walletId, userId, paymentMethodId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, payinTag, oneclickcardId, paymentAcceptedUrl, paymentWaitingUrl, paymentRefusedUrl, paymentCanceledUrl, paymentExceptionUrl, distributorFee, messageToUser, language, createdIp, payinDate, mandateId, resultHandler);
    }

    /**
     * create a pay in
     * Create a new pay in in the system.
     * @param walletId Credited wallet&#39;s ID (required)
     * @param userId User&#39;s id who makes the pay in. NB : this parameter should should not be transmitted in the case of payin of method Sepa Direct Debit Core (21). It will be set automatically by the system.  (required)
     * @param paymentMethodId | Id | Payment by | | ---| --- | | 3 | Check | | 11 | Card | | 14 | Oneclick card (without payment form) | | 21 | Sepa Direct Debit Core | | 23 | Full Hosted HTML Payment Form. Please note that if you use this paymentMethodId the flieds paymentAcceptedUrl, paymentRefusedUrl, paymentWaitingUrl, paymentCanceledUrl and paymentExceptionUrl are mandatory. CSS of the payment page can be customized | | 24 | IFrame Payment Form. Please note that if you use this paymentMethodId the flieds paymentAcceptedUrl, paymentRefusedUrl, paymentWaitingUrl, paymentCanceledUrl and paymentExceptionUrl are mandatory. CSS of the payment page can be customized| | 25 | Payment made through an SDK - You cannot directly create a payin directly with this method id. The payin will be automatically created by the system. |  (required)
     * @param amount Pay in amount. (required)
     * @param currency Payin currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217). Must be the same as the wallet&#39;s.  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payinTag Client custom data. (optional)
     * @param oneclickcardId Oneclick card&#39;s id. Mandatory if payment method is 14. Useless otherwise. (optional)
     * @param paymentAcceptedUrl Url where cardholder is redirected if payment is successful. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. (optional)
     * @param paymentWaitingUrl Url where cardholder is redirected to wait payment processing. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. (optional)
     * @param paymentRefusedUrl Url where cardholder is redirected if payment is refused. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. (optional)
     * @param paymentCanceledUrl Url where cardholder is redirected if payment is canceled. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. (optional)
     * @param paymentExceptionUrl Url where cardholder is redirected if the payment process raised an exception. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. (optional)
     * @param distributorFee Distributor fee (optional)
     * @param messageToUser Message to send to wallet&#39;s user. In the case of a Sepa Direct Debit Core payment method this parameter will be the reconciliation information transmitted to the Debtor (ie. Invoice number ...). In this case it cannot be more than 140 characters. (optional)
     * @param language Language for the third party interface. (optional)
     * @param createdIp User&#39;s IP address (optional)
     * @param payinDate The date at which the SDD should be presented. This parameter is mandatory when performing a payin of method SDD Core. Format is YYYY-MM-DD The date should follow some requirements (Traget 2 working day) :    - Be a weekday (Monday to Friday)   - January 1st is excluded   - May 1st is excluded   - December 25 is excluded   - December 26th is excluded   - Easter day is excluded   - Easter Monday is excluded   - Good Friday is excluded  (optional)
     * @param mandateId The id of the mandate. This parameter is mandatory when performing a payin with method SDD Core. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20017> rxPostPayin(Integer walletId, Integer userId, Integer paymentMethodId, Float amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String payinTag, Integer oneclickcardId, String paymentAcceptedUrl, String paymentWaitingUrl, String paymentRefusedUrl, String paymentCanceledUrl, String paymentExceptionUrl, Float distributorFee, String messageToUser, String language, String createdIp, String payinDate, Integer mandateId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.postPayin(walletId, userId, paymentMethodId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, payinTag, oneclickcardId, paymentAcceptedUrl, paymentWaitingUrl, paymentRefusedUrl, paymentCanceledUrl, paymentExceptionUrl, distributorFee, messageToUser, language, createdIp, payinDate, mandateId, fut);
        }));
    }

    public static PayinApi newInstance(io.swagger.client.api.PayinApi arg) {
        return arg != null ? new PayinApi(arg) : null;
    }
}
