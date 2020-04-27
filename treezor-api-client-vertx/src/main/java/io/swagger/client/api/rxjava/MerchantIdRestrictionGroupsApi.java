package io.swagger.client.api.rxjava;

import io.swagger.client.model.TreezorBody10;
import io.swagger.client.model.TreezorBody11;
import io.swagger.client.model.TreezorBody9;
import io.swagger.client.model.TreezorInlineResponse20016;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class MerchantIdRestrictionGroupsApi {

	private final io.swagger.client.api.MerchantIdRestrictionGroupsApi delegate;

	public MerchantIdRestrictionGroupsApi(io.swagger.client.api.MerchantIdRestrictionGroupsApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.MerchantIdRestrictionGroupsApi getDelegate() {
	    return delegate;
	}

    /**
     * cancel a merchant id restriction group
     * Cancel a merchant id restriction group from the system.
     * @param id Merchant ID restriction Group internal id. (required)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteMerchantIdRestrictionGroups(Long id, List<String> fields, Handler<AsyncResult<TreezorInlineResponse20016>> resultHandler) {
        delegate.deleteMerchantIdRestrictionGroups(id, fields, resultHandler);
    }

    /**
     * cancel a merchant id restriction group
     * Cancel a merchant id restriction group from the system.
     * @param id Merchant ID restriction Group internal id. (required)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20016> rxDeleteMerchantIdRestrictionGroups(Long id, List<String> fields) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deleteMerchantIdRestrictionGroups(id, fields, fut);
        }));
    }
    /**
     * search merchant id restriction  groups
     * Get merchant ID restriction groups that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param filter You can filter the API response by using filter(s). Filterable fields are :   - id   - name   - isWhitelist   - status   - startDate   - createdDate    Filters should be separated by a \&quot;;\&quot;. Example for 3 filters : FILTER1;FILTER2;FILTER3.    A single filter has the following syntax : \&quot;fieldName criterion expression\&quot;.    Where :     - fieldName : the name of a filterable field of this object.      - expression : the values to be included or excluded (see the table below for more information)      - criterion : a filter criterion.    Here are the possible values for criterion :    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     &gt;    |      greater than      |            alphanumeric string           |         100        |   |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |   |     &lt;    |        less than       |            alphanumeric string           |         100        |   |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |   |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getMerchantIdRestrictionGroup(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<TreezorInlineResponse20016>> resultHandler) {
        delegate.getMerchantIdRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder, resultHandler);
    }

    /**
     * search merchant id restriction  groups
     * Get merchant ID restriction groups that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param filter You can filter the API response by using filter(s). Filterable fields are :   - id   - name   - isWhitelist   - status   - startDate   - createdDate    Filters should be separated by a \&quot;;\&quot;. Example for 3 filters : FILTER1;FILTER2;FILTER3.    A single filter has the following syntax : \&quot;fieldName criterion expression\&quot;.    Where :     - fieldName : the name of a filterable field of this object.      - expression : the values to be included or excluded (see the table below for more information)      - criterion : a filter criterion.    Here are the possible values for criterion :    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     &gt;    |      greater than      |            alphanumeric string           |         100        |   |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |   |     &lt;    |        less than       |            alphanumeric string           |         100        |   |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |   |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20016> rxGetMerchantIdRestrictionGroup(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getMerchantIdRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder, fut);
        }));
    }
    /**
     * get a merchant ID restriction group
     * Get a merchant ID restriction group from the system.
     * @param id Merchant ID restriction Group internal id. (required)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getMerchantIdRestrictionGroupsId(Long id, List<String> fields, Handler<AsyncResult<TreezorInlineResponse20016>> resultHandler) {
        delegate.getMerchantIdRestrictionGroupsId(id, fields, resultHandler);
    }

    /**
     * get a merchant ID restriction group
     * Get a merchant ID restriction group from the system.
     * @param id Merchant ID restriction Group internal id. (required)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20016> rxGetMerchantIdRestrictionGroupsId(Long id, List<String> fields) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getMerchantIdRestrictionGroupsId(id, fields, fut);
        }));
    }
    /**
     * edit the merchant ID list for a restriction group
     * Edit the merchant ID list for a restriction group in the system.
     * @param id Merchant ID restriction group&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void merchantIdRestrictionGroupsIdDeltaUpdatePut(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody11 body, Handler<AsyncResult<TreezorInlineResponse20016>> resultHandler) {
        delegate.merchantIdRestrictionGroupsIdDeltaUpdatePut(id, accessSignature, accessTag, accessUserId, accessUserIp, body, resultHandler);
    }

    /**
     * edit the merchant ID list for a restriction group
     * Edit the merchant ID list for a restriction group in the system.
     * @param id Merchant ID restriction group&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20016> rxMerchantIdRestrictionGroupsIdDeltaUpdatePut(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody11 body) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.merchantIdRestrictionGroupsIdDeltaUpdatePut(id, accessSignature, accessTag, accessUserId, accessUserIp, body, fut);
        }));
    }
    /**
     * create a merchantIdRestrictionGroup
     * Create a new merchant ID restriction group in the system.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postMerchantIdRestrictionGroup(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody9 body, Handler<AsyncResult<TreezorInlineResponse20016>> resultHandler) {
        delegate.postMerchantIdRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, body, resultHandler);
    }

    /**
     * create a merchantIdRestrictionGroup
     * Create a new merchant ID restriction group in the system.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20016> rxPostMerchantIdRestrictionGroup(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody9 body) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.postMerchantIdRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, body, fut);
        }));
    }
    /**
     * edit a merchant id restriction group (Deprecated)
     * Edit a merchant id restriction group in the system. (Deprecated. Use PUT /merchantIdRestrictionGroups/{id}/DeltaUpdate/)
     * @param id Merchant ID restriction group&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void putMerchantIdRestrictionGroups(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody10 body, Handler<AsyncResult<TreezorInlineResponse20016>> resultHandler) {
        delegate.putMerchantIdRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, body, resultHandler);
    }

    /**
     * edit a merchant id restriction group (Deprecated)
     * Edit a merchant id restriction group in the system. (Deprecated. Use PUT /merchantIdRestrictionGroups/{id}/DeltaUpdate/)
     * @param id Merchant ID restriction group&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20016> rxPutMerchantIdRestrictionGroups(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody10 body) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.putMerchantIdRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, body, fut);
        }));
    }

    public static MerchantIdRestrictionGroupsApi newInstance(io.swagger.client.api.MerchantIdRestrictionGroupsApi arg) {
        return arg != null ? new MerchantIdRestrictionGroupsApi(arg) : null;
    }
}
