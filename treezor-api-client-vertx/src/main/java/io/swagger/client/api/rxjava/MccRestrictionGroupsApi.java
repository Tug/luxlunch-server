package io.swagger.client.api.rxjava;

import io.swagger.client.model.TreezorBody7;
import io.swagger.client.model.TreezorBody8;
import io.swagger.client.model.TreezorInlineResponse20015;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class MccRestrictionGroupsApi {

	private final io.swagger.client.api.MccRestrictionGroupsApi delegate;

	public MccRestrictionGroupsApi(io.swagger.client.api.MccRestrictionGroupsApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.MccRestrictionGroupsApi getDelegate() {
	    return delegate;
	}

    /**
     * cancel a mcc group
     * Cancel a mcc restriction group from the system.
     * @param id MCC restriction Group internal id. (required)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteMccRestrictionGroups(Long id, List<String> fields, Handler<AsyncResult<TreezorInlineResponse20015>> resultHandler) {
        delegate.deleteMccRestrictionGroups(id, fields, resultHandler);
    }

    /**
     * cancel a mcc group
     * Cancel a mcc restriction group from the system.
     * @param id MCC restriction Group internal id. (required)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20015> rxDeleteMccRestrictionGroups(Long id, List<String> fields) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deleteMccRestrictionGroups(id, fields, fut);
        }));
    }
    /**
     * search mcc restriction groups
     * Get mcc restriction groups that match search criteria.
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
    public void getMccRestrictionGroups(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<TreezorInlineResponse20015>> resultHandler) {
        delegate.getMccRestrictionGroups(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder, resultHandler);
    }

    /**
     * search mcc restriction groups
     * Get mcc restriction groups that match search criteria.
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
    public Single<TreezorInlineResponse20015> rxGetMccRestrictionGroups(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getMccRestrictionGroups(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder, fut);
        }));
    }
    /**
     * get a mcc group
     * Get a mcc group from the system.
     * @param id MCC restriction Group internal id. (required)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getMccRestrictionGroupsId(Long id, List<String> fields, Handler<AsyncResult<TreezorInlineResponse20015>> resultHandler) {
        delegate.getMccRestrictionGroupsId(id, fields, resultHandler);
    }

    /**
     * get a mcc group
     * Get a mcc group from the system.
     * @param id MCC restriction Group internal id. (required)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20015> rxGetMccRestrictionGroupsId(Long id, List<String> fields) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getMccRestrictionGroupsId(id, fields, fut);
        }));
    }
    /**
     * create a mccRestrictionGroup
     * Create a new mcc restriction group in the system.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param body  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postMccRestrictionGroup(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, TreezorBody7 body, Handler<AsyncResult<TreezorInlineResponse20015>> resultHandler) {
        delegate.postMccRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, body, resultHandler);
    }

    /**
     * create a mccRestrictionGroup
     * Create a new mcc restriction group in the system.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param body  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20015> rxPostMccRestrictionGroup(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, TreezorBody7 body) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.postMccRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, body, fut);
        }));
    }
    /**
     * edit a mcc restriction group
     * Edit a mcc restriction group in the system.
     * @param id MCC group&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void putMccRestrictionGroups(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody8 body, Handler<AsyncResult<TreezorInlineResponse20015>> resultHandler) {
        delegate.putMccRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, body, resultHandler);
    }

    /**
     * edit a mcc restriction group
     * Edit a mcc restriction group in the system.
     * @param id MCC group&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20015> rxPutMccRestrictionGroups(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody8 body) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.putMccRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, body, fut);
        }));
    }

    public static MccRestrictionGroupsApi newInstance(io.swagger.client.api.MccRestrictionGroupsApi arg) {
        return arg != null ? new MccRestrictionGroupsApi(arg) : null;
    }
}
