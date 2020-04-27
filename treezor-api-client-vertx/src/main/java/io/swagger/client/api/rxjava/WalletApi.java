package io.swagger.client.api.rxjava;

import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20028;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class WalletApi {

	private final io.swagger.client.api.WalletApi delegate;

	public WalletApi(io.swagger.client.api.WalletApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.WalletApi getDelegate() {
	    return delegate;
	}

    /**
     * delete a wallet
     * Change wallet&#39;s status to **CANCELED**.
     * @param id Wallet&#39;s id (required)
     * @param origin Request&#39;s origin. Possible values are: * OPERATOR * USER  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteWallet(Integer id, String origin, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse20028>> resultHandler) {
        delegate.deleteWallet(id, origin, accessSignature, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * delete a wallet
     * Change wallet&#39;s status to **CANCELED**.
     * @param id Wallet&#39;s id (required)
     * @param origin Request&#39;s origin. Possible values are: * OPERATOR * USER  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20028> rxDeleteWallet(Integer id, String origin, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deleteWallet(id, origin, accessSignature, accessTag, accessUserId, accessUserIp, fut);
        }));
    }
    /**
     * get a wallet
     * 
     * @param id Object internal id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getWallet(Long id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse20028>> resultHandler) {
        delegate.getWallet(id, accessSignature, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * get a wallet
     * 
     * @param id Object internal id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20028> rxGetWallet(Long id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getWallet(id, accessSignature, accessTag, accessUserId, accessUserIp, fut);
        }));
    }
    /**
     * search wallets
     * Get wallets from the system that match the search criteria. The request must contains at least one of those inputs :walletId eventAlias, userId, walletTypeId, walletTag
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIP Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param walletId Wallet&#39;s unique id. (optional)
     * @param walletStatus Wallet&#39;s status:  * **validated**: Wallet is active. It is possible to deposit to or retrieve money from the wallet.  * **cancelled**: Wallet is closed. No action possible, there is no money in the wallet, it was closed by an operator or by the user.  * **pending**: Wallet being validated (e.g. suspected fraud, late submission of documents&#39; validation ... KYC ). In this case, it is not possible to use the wallet for transactions. (optional)
     * @param userId Wallet owner&#39;s id. (optional)
     * @param parentUserId Parent user id of the wallet owner (optional)
     * @param walletTag Custom data. (optional)
     * @param walletTypeId Wallet type id. The following values are defined:  | Id | Description | |----|----| | 9 | Electronic Money Wallet | | 10 | Payment Account Wallet | | 13 | Mirror Wallet | | 14 | Electronic Money Card (Internal only) |  (optional)
     * @param eventAlias Short url wallet name. It&#39;s automatically generated by the system, but it could be modified and customised by the user. For example: www.domain.com/wallet&#x3D;mywedding  (optional)
     * @param eventPayinStartDate  Wallet activation date. The date from which you can deposit money on the wallet. Format : YYYY-MM-DD HH:MM:SS (optional)
     * @param eventPayinEndDate Deadline to money deposit on the wallet. Format : YYYY-MM-DD HH:MM:SS  (optional)
     * @param tariffId Wallet pricing id. (optional)
     * @param payinCount Number of payin done on the wallet. (optional)
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
    public void getWallets(String accessSignature, String accessTag, Integer accessUserId, Integer accessUserIP, Integer walletId, String walletStatus, Integer userId, Integer parentUserId, String walletTag, Integer walletTypeId, String eventAlias, OffsetDateTime eventPayinStartDate, OffsetDateTime eventPayinEndDate, Integer tariffId, Integer payinCount, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20028>> resultHandler) {
        delegate.getWallets(accessSignature, accessTag, accessUserId, accessUserIP, walletId, walletStatus, userId, parentUserId, walletTag, walletTypeId, eventAlias, eventPayinStartDate, eventPayinEndDate, tariffId, payinCount, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, resultHandler);
    }

    /**
     * search wallets
     * Get wallets from the system that match the search criteria. The request must contains at least one of those inputs :walletId eventAlias, userId, walletTypeId, walletTag
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIP Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param walletId Wallet&#39;s unique id. (optional)
     * @param walletStatus Wallet&#39;s status:  * **validated**: Wallet is active. It is possible to deposit to or retrieve money from the wallet.  * **cancelled**: Wallet is closed. No action possible, there is no money in the wallet, it was closed by an operator or by the user.  * **pending**: Wallet being validated (e.g. suspected fraud, late submission of documents&#39; validation ... KYC ). In this case, it is not possible to use the wallet for transactions. (optional)
     * @param userId Wallet owner&#39;s id. (optional)
     * @param parentUserId Parent user id of the wallet owner (optional)
     * @param walletTag Custom data. (optional)
     * @param walletTypeId Wallet type id. The following values are defined:  | Id | Description | |----|----| | 9 | Electronic Money Wallet | | 10 | Payment Account Wallet | | 13 | Mirror Wallet | | 14 | Electronic Money Card (Internal only) |  (optional)
     * @param eventAlias Short url wallet name. It&#39;s automatically generated by the system, but it could be modified and customised by the user. For example: www.domain.com/wallet&#x3D;mywedding  (optional)
     * @param eventPayinStartDate  Wallet activation date. The date from which you can deposit money on the wallet. Format : YYYY-MM-DD HH:MM:SS (optional)
     * @param eventPayinEndDate Deadline to money deposit on the wallet. Format : YYYY-MM-DD HH:MM:SS  (optional)
     * @param tariffId Wallet pricing id. (optional)
     * @param payinCount Number of payin done on the wallet. (optional)
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
    public Single<TreezorInlineResponse20028> rxGetWallets(String accessSignature, String accessTag, Integer accessUserId, Integer accessUserIP, Integer walletId, String walletStatus, Integer userId, Integer parentUserId, String walletTag, Integer walletTypeId, String eventAlias, OffsetDateTime eventPayinStartDate, OffsetDateTime eventPayinEndDate, Integer tariffId, Integer payinCount, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getWallets(accessSignature, accessTag, accessUserId, accessUserIP, walletId, walletStatus, userId, parentUserId, walletTag, walletTypeId, eventAlias, eventPayinStartDate, eventPayinEndDate, tariffId, payinCount, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, fut);
        }));
    }
    /**
     * create a wallet
     * Create a new wallet in the system..
     * @param walletTypeId Wallet type id. The following values are defined:  | Id | Description | |----|----| | 9 | Electronic Money Wallet | | 10 | Payment Account Wallet | | 13 | Mirror Wallet | | 14 | Electronic Money Card (Internal only) |  (required)
     * @param tariffId Wallet pricing id. (required)
     * @param userId Wallet owner&#39;s id. (required)
     * @param currency The currency that will be used for all wallet money transactions format : ISO 4217 3-letter code for each currency : Euro &#x3D; EUR ; US Dollar &#x3D; USD Ã¢â‚¬Â¦ Default currency will be same as the wallet  (required)
     * @param eventName Event name that will be used as wallet name. For example, in a wedding list: Wedding of X and Y  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIP Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param jointUserId Wallet co-owner&#39;s id. This user will not be allowed to collect the money from the wallet.  (optional)
     * @param walletTag Custom data (optional)
     * @param eventAlias Short url wallet name. It&#39;s automatically generated by the system, but it could be modified and customised by the user. For example: www.domain.com/wallet&#x3D;mywedding. Please note that the eventAlias must be unique.  (optional)
     * @param eventDate Wallet event date. Format : YYYY-MM-DD. Default: Created date + 7 days.  (optional)
     * @param eventMessage It can be a description of the wallet. (optional)
     * @param eventPayinStartDate  Wallet activation date. The date from which you can deposit money on the wallet. Format : YYYY-MM-DD. If null, the default date will be the created date of the wallet. (optional)
     * @param eventPayinEndDate Deadline to money deposit on the wallet. Format : YYYY-MM-DD. If null, the money can be deposited indefinitely on the wallet  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postWallets(Integer walletTypeId, Integer tariffId, Integer userId, String currency, String eventName, String accessSignature, String accessTag, Integer accessUserId, Integer accessUserIP, Integer jointUserId, String walletTag, String eventAlias, LocalDate eventDate, String eventMessage, LocalDate eventPayinStartDate, LocalDate eventPayinEndDate, Handler<AsyncResult<TreezorInlineResponse20028>> resultHandler) {
        delegate.postWallets(walletTypeId, tariffId, userId, currency, eventName, accessSignature, accessTag, accessUserId, accessUserIP, jointUserId, walletTag, eventAlias, eventDate, eventMessage, eventPayinStartDate, eventPayinEndDate, resultHandler);
    }

    /**
     * create a wallet
     * Create a new wallet in the system..
     * @param walletTypeId Wallet type id. The following values are defined:  | Id | Description | |----|----| | 9 | Electronic Money Wallet | | 10 | Payment Account Wallet | | 13 | Mirror Wallet | | 14 | Electronic Money Card (Internal only) |  (required)
     * @param tariffId Wallet pricing id. (required)
     * @param userId Wallet owner&#39;s id. (required)
     * @param currency The currency that will be used for all wallet money transactions format : ISO 4217 3-letter code for each currency : Euro &#x3D; EUR ; US Dollar &#x3D; USD Ã¢â‚¬Â¦ Default currency will be same as the wallet  (required)
     * @param eventName Event name that will be used as wallet name. For example, in a wedding list: Wedding of X and Y  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIP Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param jointUserId Wallet co-owner&#39;s id. This user will not be allowed to collect the money from the wallet.  (optional)
     * @param walletTag Custom data (optional)
     * @param eventAlias Short url wallet name. It&#39;s automatically generated by the system, but it could be modified and customised by the user. For example: www.domain.com/wallet&#x3D;mywedding. Please note that the eventAlias must be unique.  (optional)
     * @param eventDate Wallet event date. Format : YYYY-MM-DD. Default: Created date + 7 days.  (optional)
     * @param eventMessage It can be a description of the wallet. (optional)
     * @param eventPayinStartDate  Wallet activation date. The date from which you can deposit money on the wallet. Format : YYYY-MM-DD. If null, the default date will be the created date of the wallet. (optional)
     * @param eventPayinEndDate Deadline to money deposit on the wallet. Format : YYYY-MM-DD. If null, the money can be deposited indefinitely on the wallet  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20028> rxPostWallets(Integer walletTypeId, Integer tariffId, Integer userId, String currency, String eventName, String accessSignature, String accessTag, Integer accessUserId, Integer accessUserIP, Integer jointUserId, String walletTag, String eventAlias, LocalDate eventDate, String eventMessage, LocalDate eventPayinStartDate, LocalDate eventPayinEndDate) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.postWallets(walletTypeId, tariffId, userId, currency, eventName, accessSignature, accessTag, accessUserId, accessUserIP, jointUserId, walletTag, eventAlias, eventDate, eventMessage, eventPayinStartDate, eventPayinEndDate, fut);
        }));
    }
    /**
     * update a wallet
     * Modifiy wallet information
     * @param id Object internal id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param walletTypeId Change wallet type id (optional)
     * @param eventName Change event name (optional)
     * @param eventAlias Change event alias. Please note that the eventAlias must be unique. (optional)
     * @param eventDate Change event date (optional)
     * @param eventMessage Change event message (optional)
     * @param eventPayinStartDate Change event payin starting date (optional)
     * @param eventPayinEndDate Change event payin end date (optional)
     * @param urlImage Change URL image (optional)
     * @param imageName Change image name (optional)
     * @param tariffId Change tariff id (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void putWallet(Long id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String walletTypeId, String eventName, String eventAlias, String eventDate, String eventMessage, String eventPayinStartDate, String eventPayinEndDate, String urlImage, String imageName, String tariffId, Handler<AsyncResult<TreezorInlineResponse20028>> resultHandler) {
        delegate.putWallet(id, accessSignature, accessTag, accessUserId, accessUserIp, walletTypeId, eventName, eventAlias, eventDate, eventMessage, eventPayinStartDate, eventPayinEndDate, urlImage, imageName, tariffId, resultHandler);
    }

    /**
     * update a wallet
     * Modifiy wallet information
     * @param id Object internal id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param walletTypeId Change wallet type id (optional)
     * @param eventName Change event name (optional)
     * @param eventAlias Change event alias. Please note that the eventAlias must be unique. (optional)
     * @param eventDate Change event date (optional)
     * @param eventMessage Change event message (optional)
     * @param eventPayinStartDate Change event payin starting date (optional)
     * @param eventPayinEndDate Change event payin end date (optional)
     * @param urlImage Change URL image (optional)
     * @param imageName Change image name (optional)
     * @param tariffId Change tariff id (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20028> rxPutWallet(Long id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String walletTypeId, String eventName, String eventAlias, String eventDate, String eventMessage, String eventPayinStartDate, String eventPayinEndDate, String urlImage, String imageName, String tariffId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.putWallet(id, accessSignature, accessTag, accessUserId, accessUserIp, walletTypeId, eventName, eventAlias, eventDate, eventMessage, eventPayinStartDate, eventPayinEndDate, urlImage, imageName, tariffId, fut);
        }));
    }

    public static WalletApi newInstance(io.swagger.client.api.WalletApi arg) {
        return arg != null ? new WalletApi(arg) : null;
    }
}
