package com.treezor.sandbox.api;

import com.treezor.sandbox.model.InlineResponse20026;
import com.treezor.sandbox.model.InlineResponseDefault;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface UserApi {

    void deleteUser(Integer id, String origin, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse20026>> handler);

    void getUser(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse20026>> handler);

    void getUsers(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer userId, Integer userTypeId, String userStatus, String userTag, Integer specifiedUSPerson, Integer controllingPersonType, Integer employeeType, String email, String name, String legalName, String parentUserId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<InlineResponse20026>> handler);

    void putUser(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String userTag, Integer specifiedUSPerson, Integer controllingPersonType, Integer employeeType, String title, String firstname, String lastname, String middleNames, String birthday, String email, String address1, String address2, String postcode, String city, String state, String country, String phone, String mobile, String nationality, String nationalityOther, String placeOfBirth, String birthCountry, String occupation, String incomeRange, String legalName, String legalRegistrationNumber, String legalTvaNumber, LocalDate legalRegistrationDate, String legalForm, Integer legalShareCapital, String legalSector, String legalAnnualTurnOver, String legalNetIncomeRange, String legalNumberOfEmployeeRange, Integer effectiveBeneficiary, String language, String taxNumber, String taxResidence, String position, String personalAssets, Handler<AsyncResult<InlineResponse20026>> handler);

    void putUsers(Integer specifiedUSPerson, String email, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer userTypeId, String userTag, Integer parentUserId, String parentType, Integer controllingPersonType, Integer employeeType, Integer entityType, String title, String firstname, String lastname, String middleNames, String birthday, String address1, String address2, String postcode, String city, String state, String country, String phone, String mobile, String nationality, String nationalityOther, String placeOfBirth, String birthCountry, String occupation, String incomeRange, String legalName, String legalRegistrationNumber, String legalTvaNumber, LocalDate legalRegistrationDate, String legalForm, Integer legalShareCapital, String legalSector, String legalAnnualTurnOver, String legalNetIncomeRange, String legalNumberOfEmployeeRange, Integer effectiveBeneficiary, String language, String taxNumber, String taxResidence, String position, String personalAssets, Handler<AsyncResult<InlineResponse20026>> handler);

    void usersIdKycreviewPut(Integer id, String accessToken, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse20026>> handler);

}
