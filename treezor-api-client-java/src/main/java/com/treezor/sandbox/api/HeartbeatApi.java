package com.treezor.sandbox.api;

import com.treezor.sandbox.model.InlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface HeartbeatApi {

    void getHeartbeat(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<Void>> handler);

}
