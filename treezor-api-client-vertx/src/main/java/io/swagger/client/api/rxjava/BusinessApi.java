package io.swagger.client.api.rxjava;

import io.swagger.client.model.TreezorError;
import io.swagger.client.model.TreezorInlineResponse2003;
import io.swagger.client.model.TreezorInlineResponse2004;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class BusinessApi {

	private final io.swagger.client.api.BusinessApi delegate;

	public BusinessApi(io.swagger.client.api.BusinessApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.BusinessApi getDelegate() {
	    return delegate;
	}

    /**
     * get business information
     * The get business information endpoint returns all already known business information. End user will have then to verify/correct it. 
     * @param country In which country to search. Format [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param externalId External unique business id. As given in businesssearch reponse. (optional)
     * @param registrationNumber Unique business registration number. (optional)
     * @param vatNumber Unique business VAT number. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void businessinformationsGet(String country, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String externalId, String registrationNumber, String vatNumber, Handler<AsyncResult<TreezorInlineResponse2004>> resultHandler) {
        delegate.businessinformationsGet(country, accessSignature, accessTag, accessUserId, accessUserIp, externalId, registrationNumber, vatNumber, resultHandler);
    }

    /**
     * get business information
     * The get business information endpoint returns all already known business information. End user will have then to verify/correct it. 
     * @param country In which country to search. Format [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param externalId External unique business id. As given in businesssearch reponse. (optional)
     * @param registrationNumber Unique business registration number. (optional)
     * @param vatNumber Unique business VAT number. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse2004> rxBusinessinformationsGet(String country, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String externalId, String registrationNumber, String vatNumber) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.businessinformationsGet(country, accessSignature, accessTag, accessUserId, accessUserIp, externalId, registrationNumber, vatNumber, fut);
        }));
    }
    /**
     * search businesses
     * The search endpoint returns some business information. 
     * @param country In which country to search. Format [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param nameExact Business exact name. Exclusive with nameMatchBeginning and nameClosestKeywords.  (optional)
     * @param nameMatchBeginning Business names begin with. Exclusive with nameExact and nameClosestKeywords.  (optional)
     * @param nameClosestKeywords Business names closed to keywords. Exclusive with nameExact and nameMatchBeginning.  (optional)
     * @param registrationNumber Business registration number. (optional)
     * @param vatNumber Business VAT number. (optional)
     * @param phoneNumber Business phone number. (optional)
     * @param addressStreet Business&#39; street address. (optional)
     * @param addressCity Business&#39; city address. (optional)
     * @param addressPostalCode Business&#39; postal code address. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void businesssearchsGet(String country, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String nameExact, String nameMatchBeginning, String nameClosestKeywords, String registrationNumber, String vatNumber, String phoneNumber, String addressStreet, String addressCity, String addressPostalCode, Handler<AsyncResult<List<TreezorInlineResponse2003>>> resultHandler) {
        delegate.businesssearchsGet(country, accessSignature, accessTag, accessUserId, accessUserIp, nameExact, nameMatchBeginning, nameClosestKeywords, registrationNumber, vatNumber, phoneNumber, addressStreet, addressCity, addressPostalCode, resultHandler);
    }

    /**
     * search businesses
     * The search endpoint returns some business information. 
     * @param country In which country to search. Format [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param nameExact Business exact name. Exclusive with nameMatchBeginning and nameClosestKeywords.  (optional)
     * @param nameMatchBeginning Business names begin with. Exclusive with nameExact and nameClosestKeywords.  (optional)
     * @param nameClosestKeywords Business names closed to keywords. Exclusive with nameExact and nameMatchBeginning.  (optional)
     * @param registrationNumber Business registration number. (optional)
     * @param vatNumber Business VAT number. (optional)
     * @param phoneNumber Business phone number. (optional)
     * @param addressStreet Business&#39; street address. (optional)
     * @param addressCity Business&#39; city address. (optional)
     * @param addressPostalCode Business&#39; postal code address. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<List<TreezorInlineResponse2003>> rxBusinesssearchsGet(String country, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String nameExact, String nameMatchBeginning, String nameClosestKeywords, String registrationNumber, String vatNumber, String phoneNumber, String addressStreet, String addressCity, String addressPostalCode) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.businesssearchsGet(country, accessSignature, accessTag, accessUserId, accessUserIp, nameExact, nameMatchBeginning, nameClosestKeywords, registrationNumber, vatNumber, phoneNumber, addressStreet, addressCity, addressPostalCode, fut);
        }));
    }

    public static BusinessApi newInstance(io.swagger.client.api.BusinessApi arg) {
        return arg != null ? new BusinessApi(arg) : null;
    }
}
