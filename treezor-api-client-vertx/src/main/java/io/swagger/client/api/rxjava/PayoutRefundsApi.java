package io.swagger.client.api.rxjava;

import io.swagger.client.model.TreezorInlineResponse20020;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class PayoutRefundsApi {

	private final io.swagger.client.api.PayoutRefundsApi delegate;

	public PayoutRefundsApi(io.swagger.client.api.PayoutRefundsApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.PayoutRefundsApi getDelegate() {
	    return delegate;
	}

    /**
     * search pay outs refund
     * Get pay out refund that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics). (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics). (optional)
     * @param id PayoutRefund id (optional)
     * @param tag PayoutRefund tag (optional)
     * @param codeStatus PayoutRefund Code Status (optional)
     * @param informationStatus PayoutRefund Information Status (optional)
     * @param payoutId Payout Id (optional)
     * @param pageNumber The page number (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getPayoutRefunds(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer id, String tag, String codeStatus, String informationStatus, Integer payoutId, Integer pageNumber, Handler<AsyncResult<TreezorInlineResponse20020>> resultHandler) {
        delegate.getPayoutRefunds(accessSignature, accessTag, accessUserId, accessUserIp, id, tag, codeStatus, informationStatus, payoutId, pageNumber, resultHandler);
    }

    /**
     * search pay outs refund
     * Get pay out refund that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics). (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics). (optional)
     * @param id PayoutRefund id (optional)
     * @param tag PayoutRefund tag (optional)
     * @param codeStatus PayoutRefund Code Status (optional)
     * @param informationStatus PayoutRefund Information Status (optional)
     * @param payoutId Payout Id (optional)
     * @param pageNumber The page number (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20020> rxGetPayoutRefunds(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer id, String tag, String codeStatus, String informationStatus, Integer payoutId, Integer pageNumber) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getPayoutRefunds(accessSignature, accessTag, accessUserId, accessUserIp, id, tag, codeStatus, informationStatus, payoutId, pageNumber, fut);
        }));
    }

    public static PayoutRefundsApi newInstance(io.swagger.client.api.PayoutRefundsApi arg) {
        return arg != null ? new PayoutRefundsApi(arg) : null;
    }
}
