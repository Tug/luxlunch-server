package io.swagger.client.api.rxjava;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20023;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class TransferApi {

	private final io.swagger.client.api.TransferApi delegate;

	public TransferApi(io.swagger.client.api.TransferApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.TransferApi getDelegate() {
	    return delegate;
	}

    /**
     * cancel a transfer
     * Change transfer&#39;s status to CANCELED. A validated transfer can&#39;t be cancelled.
     * @param id Transfert internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteTransfer(Long id, Handler<AsyncResult<TreezorInlineResponse20023>> resultHandler) {
        delegate.deleteTransfer(id, resultHandler);
    }

    /**
     * cancel a transfer
     * Change transfer&#39;s status to CANCELED. A validated transfer can&#39;t be cancelled.
     * @param id Transfert internal id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20023> rxDeleteTransfer(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deleteTransfer(id, fut);
        }));
    }
    /**
     * get a transfer
     * Get a transfert from the system.
     * @param id Transfers internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getTransfer(Long id, Handler<AsyncResult<TreezorInlineResponse20023>> resultHandler) {
        delegate.getTransfer(id, resultHandler);
    }

    /**
     * get a transfer
     * Get a transfert from the system.
     * @param id Transfers internal id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20023> rxGetTransfer(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getTransfer(id, fut);
        }));
    }
    /**
     * search transfers
     * Search for transfers in the system. The request must contains at least one of those inputs  walletId, beneficiaryWalletId, userId, beneficiaryUserId, transferId, transferTag
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param transferId Transfer&#39;s id. (optional)
     * @param transferTag Custom data. (optional)
     * @param transferStatus Transfer&#39;s status. Possible values: * PENDING * CANCELED * VALIDATED  (optional)
     * @param walletId Debited wallet&#39;s id. (optional)
     * @param beneficiaryWalletId Credited wallet&#39;s id. (optional)
     * @param userId Debited wallet user&#39;s id. (optional)
     * @param beneficiaryUserId Credited wallet user&#39;s id. (optional)
     * @param transferDate Transfert&#39;s date. Format : YYYY-MM-DD HH:MM:SS  (optional)
     * @param amount Transfert&#39;s amount. (optional)
     * @param currency Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (optional)
     * @param transferTypeId The Type Id of the Transfer:  | ID | Description | |-----|-----| | 1 | Wallet to wallet | | 2 | Card transaction | | 3 | Client fees | | 4 | Credit note |  (optional)
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
    public void getTransfers(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer transferId, String transferTag, String transferStatus, Integer walletId, Integer beneficiaryWalletId, Integer userId, Integer beneficiaryUserId, OffsetDateTime transferDate, String amount, String currency, Integer transferTypeId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20023>> resultHandler) {
        delegate.getTransfers(accessSignature, accessTag, accessUserId, accessUserIp, transferId, transferTag, transferStatus, walletId, beneficiaryWalletId, userId, beneficiaryUserId, transferDate, amount, currency, transferTypeId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, resultHandler);
    }

    /**
     * search transfers
     * Search for transfers in the system. The request must contains at least one of those inputs  walletId, beneficiaryWalletId, userId, beneficiaryUserId, transferId, transferTag
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param transferId Transfer&#39;s id. (optional)
     * @param transferTag Custom data. (optional)
     * @param transferStatus Transfer&#39;s status. Possible values: * PENDING * CANCELED * VALIDATED  (optional)
     * @param walletId Debited wallet&#39;s id. (optional)
     * @param beneficiaryWalletId Credited wallet&#39;s id. (optional)
     * @param userId Debited wallet user&#39;s id. (optional)
     * @param beneficiaryUserId Credited wallet user&#39;s id. (optional)
     * @param transferDate Transfert&#39;s date. Format : YYYY-MM-DD HH:MM:SS  (optional)
     * @param amount Transfert&#39;s amount. (optional)
     * @param currency Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (optional)
     * @param transferTypeId The Type Id of the Transfer:  | ID | Description | |-----|-----| | 1 | Wallet to wallet | | 2 | Card transaction | | 3 | Client fees | | 4 | Credit note |  (optional)
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
    public Single<TreezorInlineResponse20023> rxGetTransfers(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer transferId, String transferTag, String transferStatus, Integer walletId, Integer beneficiaryWalletId, Integer userId, Integer beneficiaryUserId, OffsetDateTime transferDate, String amount, String currency, Integer transferTypeId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getTransfers(accessSignature, accessTag, accessUserId, accessUserIp, transferId, transferTag, transferStatus, walletId, beneficiaryWalletId, userId, beneficiaryUserId, transferDate, amount, currency, transferTypeId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, fut);
        }));
    }
    /**
     * create a transfer
     * Create a new transfer in the system.
     * @param walletId Debited wallet&#39;s ID (required)
     * @param beneficiaryWalletId Credited wallet&#39;s ID (required)
     * @param amount Transfer&#39;s amount (required)
     * @param currency Transfert&#39;s currency. Debited wallet and credited wallet must share same currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param transferTag Custom data. (optional)
     * @param label Custom data. (optional)
     * @param transferTypeId The Type Id of the Transfer:  | ID | Description | |-----|-----| | 1 | Wallet to wallet (default value) | | 3 | Client fees | | 4 | Credit note |  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postTransfers(Integer walletId, Integer beneficiaryWalletId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String transferTag, String label, Integer transferTypeId, Handler<AsyncResult<TreezorInlineResponse20023>> resultHandler) {
        delegate.postTransfers(walletId, beneficiaryWalletId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, transferTag, label, transferTypeId, resultHandler);
    }

    /**
     * create a transfer
     * Create a new transfer in the system.
     * @param walletId Debited wallet&#39;s ID (required)
     * @param beneficiaryWalletId Credited wallet&#39;s ID (required)
     * @param amount Transfer&#39;s amount (required)
     * @param currency Transfert&#39;s currency. Debited wallet and credited wallet must share same currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param transferTag Custom data. (optional)
     * @param label Custom data. (optional)
     * @param transferTypeId The Type Id of the Transfer:  | ID | Description | |-----|-----| | 1 | Wallet to wallet (default value) | | 3 | Client fees | | 4 | Credit note |  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20023> rxPostTransfers(Integer walletId, Integer beneficiaryWalletId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String transferTag, String label, Integer transferTypeId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.postTransfers(walletId, beneficiaryWalletId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, transferTag, label, transferTypeId, fut);
        }));
    }

    public static TransferApi newInstance(io.swagger.client.api.TransferApi arg) {
        return arg != null ? new TransferApi(arg) : null;
    }
}
