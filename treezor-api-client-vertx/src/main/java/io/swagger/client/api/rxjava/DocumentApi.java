package io.swagger.client.api.rxjava;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20012;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class DocumentApi {

	private final io.swagger.client.api.DocumentApi delegate;

	public DocumentApi(io.swagger.client.api.DocumentApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.DocumentApi getDelegate() {
	    return delegate;
	}

    /**
     * create a document
     * Search for documents.
     * @param userId Document user&#39;s id. (required)
     * @param documentTypeId Type of document.  | documentTypeId | Description | | --- | --- | | 2 | Police record | | 4 | Company Registration | | 6 | CV | | 7 | Sworn statement | | 8 | Turnover | | 9 | Identity card | | 11 | Bank Identity Statement | | 12 | Proof of address| | 13 | Mobile phone invoice| | 14 | Invoice, other than Mobile phone invoice| | 15 | A residence permit| | 16 | A driving licence| | 17 | A passport| | 18 | A proxy granting an employee| | 19 | A company registration official paper| | 20 | Official tax certificate| | 21 | Employee payment notice| | 22 | User bank statement| | 23 | Business legal status| | 24 | Tax Statement| | 25 | Exemption Statement|  (required)
     * @param name Document&#39;s name. (required)
     * @param fileContentBase64 Document file content. base64 encoded. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param documentTag Custom data. (optional)
     * @param residenceId Document residence Id. The field is mandatory when the document is of type id 24 or 25. Otherwise it should not be provided. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void createDocuments(String userId, Integer documentTypeId, String name, byte[] fileContentBase64, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer documentTag, Long residenceId, Handler<AsyncResult<TreezorInlineResponse20012>> resultHandler) {
        delegate.createDocuments(userId, documentTypeId, name, fileContentBase64, accessSignature, accessTag, accessUserId, accessUserIp, documentTag, residenceId, resultHandler);
    }

    /**
     * create a document
     * Search for documents.
     * @param userId Document user&#39;s id. (required)
     * @param documentTypeId Type of document.  | documentTypeId | Description | | --- | --- | | 2 | Police record | | 4 | Company Registration | | 6 | CV | | 7 | Sworn statement | | 8 | Turnover | | 9 | Identity card | | 11 | Bank Identity Statement | | 12 | Proof of address| | 13 | Mobile phone invoice| | 14 | Invoice, other than Mobile phone invoice| | 15 | A residence permit| | 16 | A driving licence| | 17 | A passport| | 18 | A proxy granting an employee| | 19 | A company registration official paper| | 20 | Official tax certificate| | 21 | Employee payment notice| | 22 | User bank statement| | 23 | Business legal status| | 24 | Tax Statement| | 25 | Exemption Statement|  (required)
     * @param name Document&#39;s name. (required)
     * @param fileContentBase64 Document file content. base64 encoded. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param documentTag Custom data. (optional)
     * @param residenceId Document residence Id. The field is mandatory when the document is of type id 24 or 25. Otherwise it should not be provided. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20012> rxCreateDocuments(String userId, Integer documentTypeId, String name, byte[] fileContentBase64, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer documentTag, Long residenceId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.createDocuments(userId, documentTypeId, name, fileContentBase64, accessSignature, accessTag, accessUserId, accessUserIp, documentTag, residenceId, fut);
        }));
    }
    /**
     * delete document
     * Remove a document from the system.
     * @param id Document&#39;s internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteDocument(Long id, Handler<AsyncResult<TreezorInlineResponse20012>> resultHandler) {
        delegate.deleteDocument(id, resultHandler);
    }

    /**
     * delete document
     * Remove a document from the system.
     * @param id Document&#39;s internal id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20012> rxDeleteDocument(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deleteDocument(id, fut);
        }));
    }
    /**
     * get a document
     * get a document
     * @param id Document&#39;s internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getDocument(Long id, Handler<AsyncResult<TreezorInlineResponse20012>> resultHandler) {
        delegate.getDocument(id, resultHandler);
    }

    /**
     * get a document
     * get a document
     * @param id Document&#39;s internal id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20012> rxGetDocument(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getDocument(id, fut);
        }));
    }
    /**
     * search documents
     * Search for documents.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param documentId Document&#39;s unique id. (optional)
     * @param documentTag Custom data. (optional)
     * @param documentStatus The status of the document. Possible values: * PENDING * CANCELED * VALIDATED  (optional)
     * @param documentTypeId Document type id. (optional)
     * @param documentType Document&#39;s type. (optional)
     * @param userId Document user&#39;s id. (optional)
     * @param userName Document user&#39;s name. (optional)
     * @param userEmail Document user&#39;s email. (optional)
     * @param fileName Document&#39;s name. (optional)
     * @param fileSize Document&#39;s size. (optional)
     * @param fileType Document&#39;s type. (optional)
     * @param isAgent is agent field. (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param createdDateFrom The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param createdDateTo The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateFrom The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateTo The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getDocuments(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer documentId, String documentTag, String documentStatus, Integer documentTypeId, String documentType, Integer userId, String userName, String userEmail, String fileName, Integer fileSize, Integer fileType, String isAgent, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20012>> resultHandler) {
        delegate.getDocuments(accessSignature, accessTag, accessUserId, accessUserIp, documentId, documentTag, documentStatus, documentTypeId, documentType, userId, userName, userEmail, fileName, fileSize, fileType, isAgent, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, resultHandler);
    }

    /**
     * search documents
     * Search for documents.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param documentId Document&#39;s unique id. (optional)
     * @param documentTag Custom data. (optional)
     * @param documentStatus The status of the document. Possible values: * PENDING * CANCELED * VALIDATED  (optional)
     * @param documentTypeId Document type id. (optional)
     * @param documentType Document&#39;s type. (optional)
     * @param userId Document user&#39;s id. (optional)
     * @param userName Document user&#39;s name. (optional)
     * @param userEmail Document user&#39;s email. (optional)
     * @param fileName Document&#39;s name. (optional)
     * @param fileSize Document&#39;s size. (optional)
     * @param fileType Document&#39;s type. (optional)
     * @param isAgent is agent field. (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param createdDateFrom The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param createdDateTo The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateFrom The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateTo The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20012> rxGetDocuments(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer documentId, String documentTag, String documentStatus, Integer documentTypeId, String documentType, Integer userId, String userName, String userEmail, String fileName, Integer fileSize, Integer fileType, String isAgent, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getDocuments(accessSignature, accessTag, accessUserId, accessUserIp, documentId, documentTag, documentStatus, documentTypeId, documentType, userId, userName, userEmail, fileName, fileSize, fileType, isAgent, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, fut);
        }));
    }
    /**
     * update a document
     * Update a document.
     * @param id Document&#39;s internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void putDocument(Long id, Handler<AsyncResult<TreezorInlineResponse20012>> resultHandler) {
        delegate.putDocument(id, resultHandler);
    }

    /**
     * update a document
     * Update a document.
     * @param id Document&#39;s internal id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20012> rxPutDocument(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.putDocument(id, fut);
        }));
    }

    public static DocumentApi newInstance(io.swagger.client.api.DocumentApi arg) {
        return arg != null ? new DocumentApi(arg) : null;
    }
}
