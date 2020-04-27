package io.swagger.client.api.rxjava;

import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class HeartbeatApi {

	private final io.swagger.client.api.HeartbeatApi delegate;

	public HeartbeatApi(io.swagger.client.api.HeartbeatApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.HeartbeatApi getDelegate() {
	    return delegate;
	}

    /**
     * Get the status of the API
     * Get Heartbeat of Treezor API
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getHeartbeat(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<Void>> resultHandler) {
        delegate.getHeartbeat(accessSignature, accessTag, accessUserId, accessUserIp, resultHandler);
    }

    /**
     * Get the status of the API
     * Get Heartbeat of Treezor API
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Void> rxGetHeartbeat(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getHeartbeat(accessSignature, accessTag, accessUserId, accessUserIp, fut);
        }));
    }

    public static HeartbeatApi newInstance(io.swagger.client.api.HeartbeatApi arg) {
        return arg != null ? new HeartbeatApi(arg) : null;
    }
}
