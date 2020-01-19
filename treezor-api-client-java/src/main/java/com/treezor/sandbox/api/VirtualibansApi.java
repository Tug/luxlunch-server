package com.treezor.sandbox.api;

import com.treezor.sandbox.model.InlineResponse20027;
import com.treezor.sandbox.model.InlineResponseDefault;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface VirtualibansApi {

    void getvirtualiban(Long id, Handler<AsyncResult<InlineResponse20027>> handler);

    void getvirtualibans(LocalDate validFrom, String accessSignature, String accessTag, Integer accessUserId, Integer accessUserIP, Integer virtualIbanId, Integer walletId, Integer typeId, Integer tag, String reference, LocalDate validTo, String maxUsage, Float maxAmount, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<InlineResponse20027>> handler);

    void postVirtualIban(Integer walletId, Integer typeId, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer tag, String reference, LocalDate validFrom, LocalDate validTo, Integer maxUsage, Float maxAmount, Handler<AsyncResult<InlineResponse20027>> handler);

    void putVirtualIban(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String reference, LocalDate validFrom, LocalDate validTo, Integer maxUsage, Float maxAmount, Handler<AsyncResult<InlineResponse20027>> handler);

}
