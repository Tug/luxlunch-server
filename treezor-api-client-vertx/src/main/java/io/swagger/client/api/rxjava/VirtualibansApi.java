package io.swagger.client.api.rxjava;

import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20027;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class VirtualibansApi {

	private final io.swagger.client.api.VirtualibansApi delegate;

	public VirtualibansApi(io.swagger.client.api.VirtualibansApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.VirtualibansApi getDelegate() {
	    return delegate;
	}

    /**
     * get a virtualiban by Id
     * Get a virtualiban from the system by its id.
     * @param id VirtualIban&#39;s id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getvirtualiban(Long id, Handler<AsyncResult<TreezorInlineResponse20027>> resultHandler) {
        delegate.getvirtualiban(id, resultHandler);
    }

    /**
     * get a virtualiban by Id
     * Get a virtualiban from the system by its id.
     * @param id VirtualIban&#39;s id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20027> rxGetvirtualiban(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getvirtualiban(id, fut);
        }));
    }
    /**
     * search virtualibans
     * Get virtualiban that match search criteria.
     * @param validFrom The beginning date of validity. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIP Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param virtualIbanId VirtualIban&#39;s id. (optional)
     * @param walletId VirtualIban&#39;s wallet id. (optional)
     * @param typeId VirtualIban&#39;s type id. (optional)
     * @param tag A tag generated by the client (optional)
     * @param reference The client&#39;s internal reference of the vitual IBAN. (optional)
     * @param validTo The limit date of validity. (optional)
     * @param maxUsage The maximum number of usage authorized. (optional)
     * @param maxAmount The maximum amount authorized. (optional)
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
    public void getvirtualibans(LocalDate validFrom, String accessSignature, String accessTag, Integer accessUserId, Integer accessUserIP, Integer virtualIbanId, Integer walletId, Integer typeId, Integer tag, String reference, LocalDate validTo, String maxUsage, Float maxAmount, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<TreezorInlineResponse20027>> resultHandler) {
        delegate.getvirtualibans(validFrom, accessSignature, accessTag, accessUserId, accessUserIP, virtualIbanId, walletId, typeId, tag, reference, validTo, maxUsage, maxAmount, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, pageNumber, pageCount, sortBy, sortOrder, resultHandler);
    }

    /**
     * search virtualibans
     * Get virtualiban that match search criteria.
     * @param validFrom The beginning date of validity. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIP Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param virtualIbanId VirtualIban&#39;s id. (optional)
     * @param walletId VirtualIban&#39;s wallet id. (optional)
     * @param typeId VirtualIban&#39;s type id. (optional)
     * @param tag A tag generated by the client (optional)
     * @param reference The client&#39;s internal reference of the vitual IBAN. (optional)
     * @param validTo The limit date of validity. (optional)
     * @param maxUsage The maximum number of usage authorized. (optional)
     * @param maxAmount The maximum amount authorized. (optional)
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
    public Single<TreezorInlineResponse20027> rxGetvirtualibans(LocalDate validFrom, String accessSignature, String accessTag, Integer accessUserId, Integer accessUserIP, Integer virtualIbanId, Integer walletId, Integer typeId, Integer tag, String reference, LocalDate validTo, String maxUsage, Float maxAmount, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getvirtualibans(validFrom, accessSignature, accessTag, accessUserId, accessUserIP, virtualIbanId, walletId, typeId, tag, reference, validTo, maxUsage, maxAmount, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, pageNumber, pageCount, sortBy, sortOrder, fut);
        }));
    }
    /**
     * create a virtual IBAN
     * Create a new virtual IBAN in in the system.
     * @param walletId The Id Of the Wallet. The Wallet must be in validated status. The wallet must be of type \&quot;payment\&quot; or \&quot;electronic money\&quot; (required)
     * @param typeId | Type Id | Virtual IBAN Type| | ---| --- | | 1 | DEBIT | | 2 | CREDIT |  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param tag A tag generated by the client (optional)
     * @param reference The client&#39;s internal reference of the vitual IBAN. Less than 255 characters. (optional)
     * @param validFrom The beginning date of validity. The beginning date must not be less than today&#39;s date. (optional)
     * @param validTo The limit date of validity. Cannot be less or equal to the validFrom date. (optional)
     * @param maxUsage The maximum number of usage authorized. If you want to set no maximum usage limitation you can omit the parameter or set it to null. If you want to limit usage please send an integer in that field. This integer cannot be less than 1. (optional)
     * @param maxAmount The maximum amount authorized.If you want to set no maximum usage amount limitation you can omit the parameter or set it to null. If you want to limit the amount please send a DECIMAL (with a point as separator) in that field. This decimal cannot be less than 0.00. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postVirtualIban(Integer walletId, Integer typeId, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer tag, String reference, LocalDate validFrom, LocalDate validTo, Integer maxUsage, Float maxAmount, Handler<AsyncResult<TreezorInlineResponse20027>> resultHandler) {
        delegate.postVirtualIban(walletId, typeId, accessSignature, accessTag, accessUserId, accessUserIp, tag, reference, validFrom, validTo, maxUsage, maxAmount, resultHandler);
    }

    /**
     * create a virtual IBAN
     * Create a new virtual IBAN in in the system.
     * @param walletId The Id Of the Wallet. The Wallet must be in validated status. The wallet must be of type \&quot;payment\&quot; or \&quot;electronic money\&quot; (required)
     * @param typeId | Type Id | Virtual IBAN Type| | ---| --- | | 1 | DEBIT | | 2 | CREDIT |  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param tag A tag generated by the client (optional)
     * @param reference The client&#39;s internal reference of the vitual IBAN. Less than 255 characters. (optional)
     * @param validFrom The beginning date of validity. The beginning date must not be less than today&#39;s date. (optional)
     * @param validTo The limit date of validity. Cannot be less or equal to the validFrom date. (optional)
     * @param maxUsage The maximum number of usage authorized. If you want to set no maximum usage limitation you can omit the parameter or set it to null. If you want to limit usage please send an integer in that field. This integer cannot be less than 1. (optional)
     * @param maxAmount The maximum amount authorized.If you want to set no maximum usage amount limitation you can omit the parameter or set it to null. If you want to limit the amount please send a DECIMAL (with a point as separator) in that field. This decimal cannot be less than 0.00. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20027> rxPostVirtualIban(Integer walletId, Integer typeId, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer tag, String reference, LocalDate validFrom, LocalDate validTo, Integer maxUsage, Float maxAmount) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.postVirtualIban(walletId, typeId, accessSignature, accessTag, accessUserId, accessUserIp, tag, reference, validFrom, validTo, maxUsage, maxAmount, fut);
        }));
    }
    /**
     * update a Virtual IBAN
     * Update Virtual IBAN&#39;s information.
     * @param id VirtualIban&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param reference The client&#39;s internal reference of the vitual IBAN. (optional)
     * @param validFrom The beginning date of validity. Date of validity can be changed. It must follow the rules explained in the POST endpoint. (optional)
     * @param validTo The limit date of validity. It must follow the rules of creation. It must follow the rules explained in the POST endpoint. (optional)
     * @param maxUsage The maximum number of usage authorized. It must follow the rules explained in the POST endpoint AND the maximum usage cannot be strictly less than the transaction counter of the Virtual Iban. (optional)
     * @param maxAmount The maximum amount authorized. It must follow the rules explained in the POST endpoint AND the maximum amount cannot be strictly less than the cumulated amount of this Virtual Iban. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void putVirtualIban(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String reference, LocalDate validFrom, LocalDate validTo, Integer maxUsage, Float maxAmount, Handler<AsyncResult<TreezorInlineResponse20027>> resultHandler) {
        delegate.putVirtualIban(id, accessSignature, accessTag, accessUserId, accessUserIp, reference, validFrom, validTo, maxUsage, maxAmount, resultHandler);
    }

    /**
     * update a Virtual IBAN
     * Update Virtual IBAN&#39;s information.
     * @param id VirtualIban&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param reference The client&#39;s internal reference of the vitual IBAN. (optional)
     * @param validFrom The beginning date of validity. Date of validity can be changed. It must follow the rules explained in the POST endpoint. (optional)
     * @param validTo The limit date of validity. It must follow the rules of creation. It must follow the rules explained in the POST endpoint. (optional)
     * @param maxUsage The maximum number of usage authorized. It must follow the rules explained in the POST endpoint AND the maximum usage cannot be strictly less than the transaction counter of the Virtual Iban. (optional)
     * @param maxAmount The maximum amount authorized. It must follow the rules explained in the POST endpoint AND the maximum amount cannot be strictly less than the cumulated amount of this Virtual Iban. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20027> rxPutVirtualIban(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String reference, LocalDate validFrom, LocalDate validTo, Integer maxUsage, Float maxAmount) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.putVirtualIban(id, accessSignature, accessTag, accessUserId, accessUserIp, reference, validFrom, validTo, maxUsage, maxAmount, fut);
        }));
    }

    public static VirtualibansApi newInstance(io.swagger.client.api.VirtualibansApi arg) {
        return arg != null ? new VirtualibansApi(arg) : null;
    }
}