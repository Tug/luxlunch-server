package io.swagger.client.api.rxjava;

import io.swagger.client.model.TreezorInlineResponse200;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class BalanceApi {

	private final io.swagger.client.api.BalanceApi delegate;

	public BalanceApi(io.swagger.client.api.BalanceApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.BalanceApi getDelegate() {
	    return delegate;
	}

    /**
     * search balances
     * Get balances that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param walletId Wallet&#39;s ID of wanted balance (optional)
     * @param userId Wallet&#39;s user id of wanted balanced (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getBalances(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer walletId, Integer userId, Handler<AsyncResult<TreezorInlineResponse200>> resultHandler) {
        delegate.getBalances(accessSignature, accessTag, accessUserId, accessUserIp, walletId, userId, resultHandler);
    }

    /**
     * search balances
     * Get balances that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param walletId Wallet&#39;s ID of wanted balance (optional)
     * @param userId Wallet&#39;s user id of wanted balanced (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse200> rxGetBalances(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer walletId, Integer userId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getBalances(accessSignature, accessTag, accessUserId, accessUserIp, walletId, userId, fut);
        }));
    }

    public static BalanceApi newInstance(io.swagger.client.api.BalanceApi arg) {
        return arg != null ? new BalanceApi(arg) : null;
    }
}
