package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20012;
import io.swagger.client.model.TreezorInlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface DocumentApi {

    void createDocuments(String userId, Integer documentTypeId, String name, byte[] fileContentBase64, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer documentTag, Long residenceId, Handler<AsyncResult<TreezorInlineResponse20012>> handler);

    void deleteDocument(Long id, Handler<AsyncResult<TreezorInlineResponse20012>> handler);

    void getDocument(Long id, Handler<AsyncResult<TreezorInlineResponse20012>> handler);

    void getDocuments(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer documentId, String documentTag, String documentStatus, Integer documentTypeId, String documentType, Integer userId, String userName, String userEmail, String fileName, Integer fileSize, Integer fileType, String isAgent, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20012>> handler);

    void putDocument(Long id, Handler<AsyncResult<TreezorInlineResponse20012>> handler);

}
