package io.swagger.client.api.rxjava;

import io.swagger.client.model.TreezorInlineResponse20021;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class TaxResidenceApi {

	private final io.swagger.client.api.TaxResidenceApi delegate;

	public TaxResidenceApi(io.swagger.client.api.TaxResidenceApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.TaxResidenceApi getDelegate() {
	    return delegate;
	}

    /**
     * search a residence
     * Search a residence that match search criteria
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). (optional)
     * @param id id of the residence (optional)
     * @param userId User&#39;s id residence (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void taxResidencesGet(String accessSignature, Integer id, Integer userId, Handler<AsyncResult<TreezorInlineResponse20021>> resultHandler) {
        delegate.taxResidencesGet(accessSignature, id, userId, resultHandler);
    }

    /**
     * search a residence
     * Search a residence that match search criteria
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). (optional)
     * @param id id of the residence (optional)
     * @param userId User&#39;s id residence (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20021> rxTaxResidencesGet(String accessSignature, Integer id, Integer userId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.taxResidencesGet(accessSignature, id, userId, fut);
        }));
    }
    /**
     * delete a residence
     * Delete a residence that match id
     * @param id id of the residence (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void taxResidencesIdDelete(Integer id, String accessSignature, Handler<AsyncResult<TreezorInlineResponse20021>> resultHandler) {
        delegate.taxResidencesIdDelete(id, accessSignature, resultHandler);
    }

    /**
     * delete a residence
     * Delete a residence that match id
     * @param id id of the residence (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20021> rxTaxResidencesIdDelete(Integer id, String accessSignature) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.taxResidencesIdDelete(id, accessSignature, fut);
        }));
    }
    /**
     * read the informations of a residence
     * Read the informations of a residence that match with id
     * @param id id of the residence (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void taxResidencesIdGet(Integer id, String accessSignature, Handler<AsyncResult<TreezorInlineResponse20021>> resultHandler) {
        delegate.taxResidencesIdGet(id, accessSignature, resultHandler);
    }

    /**
     * read the informations of a residence
     * Read the informations of a residence that match with id
     * @param id id of the residence (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20021> rxTaxResidencesIdGet(Integer id, String accessSignature) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.taxResidencesIdGet(id, accessSignature, fut);
        }));
    }
    /**
     * update the residence
     * Update a residence already created.
     * @param id residence id (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). (optional)
     * @param userId User&#39;s id residence (optional)
     * @param country country of the resident (optional)
     * @param taxPayerId Tax payer&#39;s id (optional)
     * @param liabilityWaiver Tax declaration (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void taxResidencesIdPut(Integer id, String accessSignature, Integer userId, String country, String taxPayerId, Boolean liabilityWaiver, Handler<AsyncResult<TreezorInlineResponse20021>> resultHandler) {
        delegate.taxResidencesIdPut(id, accessSignature, userId, country, taxPayerId, liabilityWaiver, resultHandler);
    }

    /**
     * update the residence
     * Update a residence already created.
     * @param id residence id (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). (optional)
     * @param userId User&#39;s id residence (optional)
     * @param country country of the resident (optional)
     * @param taxPayerId Tax payer&#39;s id (optional)
     * @param liabilityWaiver Tax declaration (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20021> rxTaxResidencesIdPut(Integer id, String accessSignature, Integer userId, String country, String taxPayerId, Boolean liabilityWaiver) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.taxResidencesIdPut(id, accessSignature, userId, country, taxPayerId, liabilityWaiver, fut);
        }));
    }
    /**
     * create a residence
     * Create a new tax residence.
     * @param userId User&#39;s id residence (required)
     * @param country country of the resident (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). (optional)
     * @param taxPayerId Tax payer&#39;s id (optional)
     * @param liabilityWaiver When there is no taxPayerId for a residence, this field shall be set to true. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void taxResidencesPost(Integer userId, String country, String accessSignature, String taxPayerId, Boolean liabilityWaiver, Handler<AsyncResult<TreezorInlineResponse20021>> resultHandler) {
        delegate.taxResidencesPost(userId, country, accessSignature, taxPayerId, liabilityWaiver, resultHandler);
    }

    /**
     * create a residence
     * Create a new tax residence.
     * @param userId User&#39;s id residence (required)
     * @param country country of the resident (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). (optional)
     * @param taxPayerId Tax payer&#39;s id (optional)
     * @param liabilityWaiver When there is no taxPayerId for a residence, this field shall be set to true. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20021> rxTaxResidencesPost(Integer userId, String country, String accessSignature, String taxPayerId, Boolean liabilityWaiver) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.taxResidencesPost(userId, country, accessSignature, taxPayerId, liabilityWaiver, fut);
        }));
    }

    public static TaxResidenceApi newInstance(io.swagger.client.api.TaxResidenceApi arg) {
        return arg != null ? new TaxResidenceApi(arg) : null;
    }
}
