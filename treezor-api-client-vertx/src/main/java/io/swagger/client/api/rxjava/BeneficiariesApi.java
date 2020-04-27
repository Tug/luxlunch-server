package io.swagger.client.api.rxjava;

import io.swagger.client.model.TreezorBody;
import io.swagger.client.model.TreezorBody1;
import io.swagger.client.model.TreezorInlineResponse2002;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class BeneficiariesApi {

	private final io.swagger.client.api.BeneficiariesApi delegate;

	public BeneficiariesApi(io.swagger.client.api.BeneficiariesApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.BeneficiariesApi getDelegate() {
	    return delegate;
	}

    /**
     * search beneficiary bank accounts
     * Get beneficiary bank accounts that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param filter You can filter the API response by using filter(s). Filterable fields are :  - id  - tag  - userId  - isActive  - nickName  - address  - iban (encrypted IBAN)  - IbanInClear  - bic  - sepaCreditorIdentifier  - usableForSct  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters : FILTER1;FILTER2;FILTER3. A single filter has the following syntax : \&quot;fieldName criterion expression\&quot;. Where :  - fieldName : the name of a filterable field of this object.   - expression : the values to be included or excluded (see the table below for more information)   - criterion : a filter criterion.  Here are the possible values for criterion :   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  (optional)
     * @param id Beneficiary bank account id. (optional)
     * @param userId Owner user&#39;s id. (deprecated, you must use the parameter filter) (optional)
     * @param iban Beneficiary bank account IBAN. (deprecated, you must use the parameter filter) (optional)
     * @param bic Beneficiary bank account BIC. (deprecated, you must use the parameter filter) (optional)
     * @param nickName Beneficiary bank account&#39;s nick name. (deprecated, you must use the parameter filter) (optional)
     * @param name Beneficiary bank account owner&#39;s name. (deprecated, you must use the parameter filter) (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getBeneficiaries(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer id, Integer userId, String iban, String bic, String nickName, String name, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<TreezorInlineResponse2002>> resultHandler) {
        delegate.getBeneficiaries(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, id, userId, iban, bic, nickName, name, pageNumber, pageCount, sortBy, sortOrder, resultHandler);
    }

    /**
     * search beneficiary bank accounts
     * Get beneficiary bank accounts that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param filter You can filter the API response by using filter(s). Filterable fields are :  - id  - tag  - userId  - isActive  - nickName  - address  - iban (encrypted IBAN)  - IbanInClear  - bic  - sepaCreditorIdentifier  - usableForSct  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters : FILTER1;FILTER2;FILTER3. A single filter has the following syntax : \&quot;fieldName criterion expression\&quot;. Where :  - fieldName : the name of a filterable field of this object.   - expression : the values to be included or excluded (see the table below for more information)   - criterion : a filter criterion.  Here are the possible values for criterion :   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  (optional)
     * @param id Beneficiary bank account id. (optional)
     * @param userId Owner user&#39;s id. (deprecated, you must use the parameter filter) (optional)
     * @param iban Beneficiary bank account IBAN. (deprecated, you must use the parameter filter) (optional)
     * @param bic Beneficiary bank account BIC. (deprecated, you must use the parameter filter) (optional)
     * @param nickName Beneficiary bank account&#39;s nick name. (deprecated, you must use the parameter filter) (optional)
     * @param name Beneficiary bank account owner&#39;s name. (deprecated, you must use the parameter filter) (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2002> rxGetBeneficiaries(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer id, Integer userId, String iban, String bic, String nickName, String name, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getBeneficiaries(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, id, userId, iban, bic, nickName, name, pageNumber, pageCount, sortBy, sortOrder, fut);
        }));
    }
    /**
     * get a beneficiary bank account
     * Get a beneficiary bank account from the system.
     * @param id Beneficiary Bank Accounts internal id. (required)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getBeneficiary(Long id, List<String> fields, Handler<AsyncResult<TreezorInlineResponse2002>> resultHandler) {
        delegate.getBeneficiary(id, fields, resultHandler);
    }

    /**
     * get a beneficiary bank account
     * Get a beneficiary bank account from the system.
     * @param id Beneficiary Bank Accounts internal id. (required)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2002> rxGetBeneficiary(Long id, List<String> fields) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getBeneficiary(id, fields, fut);
        }));
    }
    /**
     * create a beneficiary
     * Create a new benefeciary bank account in the system.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postBeneficiary(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody body, Handler<AsyncResult<TreezorInlineResponse2002>> resultHandler) {
        delegate.postBeneficiary(accessSignature, accessTag, accessUserId, accessUserIp, body, resultHandler);
    }

    /**
     * create a beneficiary
     * Create a new benefeciary bank account in the system.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2002> rxPostBeneficiary(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody body) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.postBeneficiary(accessSignature, accessTag, accessUserId, accessUserIp, body, fut);
        }));
    }
    /**
     * edit a beneficiary
     * Edit a benefeciary bank account in the system.
     * @param id Beneficiary&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void putBeneficiary(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody1 body, Handler<AsyncResult<TreezorInlineResponse2002>> resultHandler) {
        delegate.putBeneficiary(id, accessSignature, accessTag, accessUserId, accessUserIp, body, resultHandler);
    }

    /**
     * edit a beneficiary
     * Edit a benefeciary bank account in the system.
     * @param id Beneficiary&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2002> rxPutBeneficiary(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody1 body) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.putBeneficiary(id, accessSignature, accessTag, accessUserId, accessUserIp, body, fut);
        }));
    }

    public static BeneficiariesApi newInstance(io.swagger.client.api.BeneficiariesApi arg) {
        return arg != null ? new BeneficiariesApi(arg) : null;
    }
}
