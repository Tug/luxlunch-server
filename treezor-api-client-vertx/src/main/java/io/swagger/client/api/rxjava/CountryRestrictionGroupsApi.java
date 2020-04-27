package io.swagger.client.api.rxjava;

import io.swagger.client.model.TreezorBody4;
import io.swagger.client.model.TreezorBody5;
import io.swagger.client.model.TreezorInlineResponse20011;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class CountryRestrictionGroupsApi {

	private final io.swagger.client.api.CountryRestrictionGroupsApi delegate;

	public CountryRestrictionGroupsApi(io.swagger.client.api.CountryRestrictionGroupsApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.CountryRestrictionGroupsApi getDelegate() {
	    return delegate;
	}

    /**
     * cancel a country group
     * Cancel a country restriction group from the system.
     * @param id country restriction Group internal id. (required)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteCountryRestrictionGroups(Long id, List<String> fields, Handler<AsyncResult<TreezorInlineResponse20011>> resultHandler) {
        delegate.deleteCountryRestrictionGroups(id, fields, resultHandler);
    }

    /**
     * cancel a country group
     * Cancel a country restriction group from the system.
     * @param id country restriction Group internal id. (required)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20011> rxDeleteCountryRestrictionGroups(Long id, List<String> fields) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deleteCountryRestrictionGroups(id, fields, fut);
        }));
    }
    /**
     * search country restriction groups
     * Get country restriction groups that match search criteria.
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
    public void getCountryRestrictionGroups(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<TreezorInlineResponse20011>> resultHandler) {
        delegate.getCountryRestrictionGroups(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder, resultHandler);
    }

    /**
     * search country restriction groups
     * Get country restriction groups that match search criteria.
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
    public Single<TreezorInlineResponse20011> rxGetCountryRestrictionGroups(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getCountryRestrictionGroups(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder, fut);
        }));
    }
    /**
     * get a country group
     * Get a country group from the system.
     * @param id country restriction Group internal id. (required)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getCountryRestrictionGroupsId(Long id, List<String> fields, Handler<AsyncResult<TreezorInlineResponse20011>> resultHandler) {
        delegate.getCountryRestrictionGroupsId(id, fields, resultHandler);
    }

    /**
     * get a country group
     * Get a country group from the system.
     * @param id country restriction Group internal id. (required)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20011> rxGetCountryRestrictionGroupsId(Long id, List<String> fields) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getCountryRestrictionGroupsId(id, fields, fut);
        }));
    }
    /**
     * create a countryRestrictionGroup
     * Create a new country restriction group in the system.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param body  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postCountryRestrictionGroup(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, TreezorBody4 body, Handler<AsyncResult<TreezorInlineResponse20011>> resultHandler) {
        delegate.postCountryRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, body, resultHandler);
    }

    /**
     * create a countryRestrictionGroup
     * Create a new country restriction group in the system.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param body  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20011> rxPostCountryRestrictionGroup(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, TreezorBody4 body) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.postCountryRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, body, fut);
        }));
    }
    /**
     * edit a country restriction group
     * Edit a country restriction group in the system.
     * @param id country group&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void putCountryRestrictionGroups(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody5 body, Handler<AsyncResult<TreezorInlineResponse20011>> resultHandler) {
        delegate.putCountryRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, body, resultHandler);
    }

    /**
     * edit a country restriction group
     * Edit a country restriction group in the system.
     * @param id country group&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20011> rxPutCountryRestrictionGroups(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody5 body) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.putCountryRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, body, fut);
        }));
    }

    public static CountryRestrictionGroupsApi newInstance(io.swagger.client.api.CountryRestrictionGroupsApi arg) {
        return arg != null ? new CountryRestrictionGroupsApi(arg) : null;
    }
}
