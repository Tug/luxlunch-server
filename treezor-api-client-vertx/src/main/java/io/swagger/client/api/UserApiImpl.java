package io.swagger.client.api;

import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20026;
import io.swagger.client.model.TreezorInlineResponseDefault;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonObject;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.*;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;


public class UserApiImpl implements UserApi {

    private ApiClient apiClient;

    public UserApiImpl() {
        this(null);
    }

    public UserApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * delete a user
     * Change user&#39;s status to **CANCELED**.
     * @param id User&#39;s ID (required)
     * @param origin Origin of the request.  Possible values: * OPERATOR * USER  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteUser(Integer id, String origin, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse20026>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling deleteUser"));
            return;
        }
        
        // verify the required parameter 'origin' is set
        if (origin == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'origin' when calling deleteUser"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/users/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "origin", origin));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20026> localVarReturnType = new TypeReference<TreezorInlineResponse20026>() {};
        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * get an user
     * Get user&#39;s information for given user&#39;s id.
     * @param id User&#39;s ID (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getUser(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse20026>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling getUser"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/users/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20026> localVarReturnType = new TypeReference<TreezorInlineResponse20026>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * search users
     * Get users from the system.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param userId User&#39;s unique ID (optional)
     * @param userTypeId User&#39;s type. (optional)
     * @param userStatus User&#39;s status. (optional)
     * @param userTag Custom data that you can add to this item. (optional)
     * @param specifiedUSPerson Est considéré comme ayant la nationalité ou la citoyenneté américaine : Tout citoyen des États-Unis : une personne est présumée citoyen des Etats-Unis dès lors qu’elle possède un passeport américain ou qu’elle est née sur le territoire des Etats-Unis, même lorsqu’un tel lieu de naissance figure sur un passeport d’un autre pays, ou que la personne possède également une autre nationalité ou a sa résidence dans un autre pays. Une condition néanmoins : la personne ne doit pas avoir renoncé à la citoyenneté américaine ; • Tout résident légal des États-Unis, quelle que soit sa nationalité : (i) quiconque est considéré comme résident fiscal aux Etats-Unis aux termes de la loi fédérale américaine, (ii) quiconque demande à être traité comme résident fiscal aux Etats-Unis, ou (iii) quiconque est considéré comme résident fiscal aux termes de la loi de cet Etat américain. • Toute personne titulaire d’une carte de séjour permanent (green card) aux Etats-Unis ou résidant de façon permanente aux Etats-Unis ou y ayant passé une période suffisamment longue au cours des trois dernières années.  (optional)
     * @param controllingPersonType Type of relationship (optional)
     * @param employeeType Type of user&#39;s role (optional)
     * @param email User&#39;s email address (must be valid). (optional)
     * @param name User&#39;s Name. (optional)
     * @param legalName Business name (optional)
     * @param parentUserId User id of user&#39;s parent (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value: createdDate. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param createdDateFrom The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param createdDateTo The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateFrom The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateTo The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getUsers(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer userId, Integer userTypeId, String userStatus, String userTag, Integer specifiedUSPerson, Integer controllingPersonType, Integer employeeType, String email, String name, String legalName, String parentUserId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20026>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/users";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userTypeId", userTypeId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userStatus", userStatus));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userTag", userTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "specifiedUSPerson", specifiedUSPerson));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "controllingPersonType", controllingPersonType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "employeeType", employeeType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalName", legalName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "parentUserId", parentUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageCount", pageCount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortBy", sortBy));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortOrder", sortOrder));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdDateFrom", createdDateFrom));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdDateTo", createdDateTo));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "updatedDateFrom", updatedDateFrom));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "updatedDateTo", updatedDateTo));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20026> localVarReturnType = new TypeReference<TreezorInlineResponse20026>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * update a user
     * Update user&#39;s information.
     * @param id User&#39;s ID (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param userTag Custom data. (optional)
     * @param specifiedUSPerson Est considéré comme ayant la nationalité ou la citoyenneté américaine : Tout citoyen des États-Unis : une personne est présumée citoyen des Etats-Unis dès lors qu’elle possède un passeport américain ou qu’elle est née sur le territoire des Etats-Unis, même lorsqu’un tel lieu de naissance figure sur un passeport d’un autre pays, ou que la personne possède également une autre nationalité ou a sa résidence dans un autre pays. Une condition néanmoins : la personne ne doit pas avoir renoncé à la citoyenneté américaine ; • Tout résident légal des États-Unis, quelle que soit sa nationalité : (i) quiconque est considéré comme résident fiscal aux Etats-Unis aux termes de la loi fédérale américaine, (ii) quiconque demande à être traité comme résident fiscal aux Etats-Unis, ou (iii) quiconque est considéré comme résident fiscal aux termes de la loi de cet Etat américain. • Toute personne titulaire d’une carte de séjour permanent (green card) aux Etats-Unis ou résidant de façon permanente aux Etats-Unis ou y ayant passé une période suffisamment longue au cours des trois dernières années.  | Value | Type | | --- | --- | | 0 | No | | 1 | Yes |  (optional)
     * @param controllingPersonType Type of relationship  | Value | Type | | --- | --- | | 1 | Shareholder | | 2 | Other_relationship | | 3 | Director | | 4 | None (default) |  (optional)
     * @param employeeType Type of relationship. Possible values:      | Value | Type |     | --- | --- |     | 1 | Leader |     | 2 | Employee |     | 3 | None (default)|  (optional)
     * @param title User&#39;s title. Possible values: * M * MME * MLLE  (optional)
     * @param firstname User&#39;s first name (optional)
     * @param lastname User&#39;s last name (optional)
     * @param middleNames User&#39;s middle names (optional)
     * @param birthday User&#39;s birth date. Format YYYY-MM-DD (optional)
     * @param email User&#39;s email address (must be valid). (optional)
     * @param address1 User&#39;s postal address (main) (optional)
     * @param address2 User&#39;s postal address (complement) (optional)
     * @param postcode User&#39;s postcode (optional)
     * @param city User&#39;s city (optional)
     * @param state User&#39;s state (optional)
     * @param country User&#39;s country (optional)
     * @param phone User&#39;s phone number (optional)
     * @param mobile User&#39;s mobile phone number (optional)
     * @param nationality User&#39;s nationality (optional)
     * @param nationalityOther User&#39;s other nationality (optional)
     * @param placeOfBirth User&#39;s place of birth (optional)
     * @param birthCountry User&#39;s country of birth (optional)
     * @param occupation User&#39;s occupation (optional)
     * @param incomeRange Customer income range (optional)
     * @param legalName Business name (optional)
     * @param legalRegistrationNumber Business registration number (optional)
     * @param legalTvaNumber Business VAT number (optional)
     * @param legalRegistrationDate Business registration date (optional)
     * @param legalForm | Code | Category | Details (in french) | | ---- | ----- | ---- | | 1000 | Individual company | Entrepreneur Individuel a Responsabilité Limitée (EIRL) | | 1100 | Individual company | Artisan-Commerçant | | 1200 | Individual company | Commerçant | | 1300 | Individual company | Artisan | | 1400 | Liberal profession | Officier public ou ministériel | | 1500 | Liberal profession | Profession libérale | | 1600 | Farm operator  | Exploitant agricole | | 1700 | Liberal profession | Agent commercial | | 1800 | Partner Director | Associé-gérant | | 1900 | Individual company | Personne physique | | 2110 | Indivision and others | Indivision entre personnes physiques | | 2120 | Indivision and others | Indivision avec personne morale | | 2210 | Indivision and others | Société créée de fait entre personnes physiques | | 2220 | Indivision and others | Société créée de fait avec personne morale | | 2310 | Indivision and others | Société en participation entre personnes physiques | | 2320 | Indivision and others | Société en participation avec personne morale | | 2385 | Indivision and others | Société en participation de professions libérales | | 2400 | Indivision and others | Fiducie | | 2700 | Diverse | Paroisse hors zone concordataire | | 2900 | Economic Interest Grouping | Autre groupement de droit privé non doté de la personnalité morale | | 3110 | Foreign company | Représentation ou agence commerciale d&#39;état ou organisme public étranger  immatriculé au RCS | | 3120 | Foreign company | Société étrangère immatriculée au RCS | | 3205 | Foreign company | Organisation internationale | | 3210 | Foreign company | Etat collectivité ou établissement public étranger | | 3220 | Foreign company | Société étrangère non immatriculée au RCS | | 3290 | Foreign company | (Autre) personne morale de droit étranger | | 4110 | Administrations, Instituions | Etablissement public national à caractère industriel ou commercial doté d&#39;un comptable public | | 4120 | Administrations, Instituions | Etablissement public national à caractère industriel ou commercial non doté d&#39;un comptable public | | 4130 | Administrations, Instituions | Exploitant public | | 4140 | Administrations, Instituions | Etablissement public local à caractère industriel ou commercial | | 4150 | Administrations, Instituions | Régie d&#39;une collectivité locale à caractère industriel ou commercial | | 4160 | Administrations, Instituions | Institution Banque de France | | 5191 | De facto undivided ownership company | Société de caution mutuelle | | 5192 | Diverse | Société coopérative de banque populaire | | 5193 | De facto undivided ownership company | Caisse de crédit maritime mutuel | | 5194 | De facto undivided ownership company | Caisse (fédérale) de crédit mutuel | | 5195 | Association fondation | Association coopérative inscrite (droit local Alsace Moselle) | | 5196 | De facto undivided ownership company | Caisse d&#39;épargne et de prévoyance à forme coopérative | | 5202 | General partnership | Société en nom collectif | | 5203 | General partnership | Société en nom collectif coopérative | | 5306 | Limited company | Société en commandite simple | | 5307 | Limited company | Société en commandite simple coopérative | | 5308 | Limited company | Société en commandite par actions | | 5309 | Limited company | Société en commandite par actions coopérative | | 5385 | Limited company | Société d&#39;exercice libéral en commandite par action | | 5410 | Limited Liability Company  | SARL nationale | | 5415 | Limited Liability Company  | SARL d&#39;économie mixte | | 5422 | Limited Liability Company  | SARL immobilière pour le commerce et l&#39;industrie (SICOMI) | | 5426 | Limited Liability Company  | Société immobilière de gestion | | 5430 | Limited Liability Company  | Safer en SARL | | 5431 | Limited Liability Company  | SARL mixte d&#39;intérêt agricole (SIMA) | | 5432 | Limited Liability Company  | SARL d&#39;intérêt collectif agricole (SICA) | | 5442 | Limited Liability Company  | SARL d&#39;attribution | | 5443 | Limited Liability Company  | SARL coopérative de construction | | 5451 | Limited Liability Company  | SARL coopérative de consommation | | 5453 | Limited Liability Company  | SARL coopérative artisanale | | 5454 | Limited Liability Company  | SARL coopérative d&#39;intérêt maritime | | 5455 | Limited Liability Company  | SARL coopérative de transports | | 5458 | Limited Liability Company  | SARL coopérative ouvrière de production et de crédit (SCOP) | | 5459 | Limited Liability Company  | SARL union de sociétés coopératives | | 5460 | Limited Liability Company  | SARL coopérative | | 5485 | Limited Liability Company  | Société d&#39;exercice libéral à responsabilité limitée | | 5498 | Limited Liability Company  | SARL unipersonnelle | | 5499 | Limited Liability Company  | SARL | | 5505 | Limited company | SA à participation ouvrière à conseil d&#39;administration | | 5510 | Limited company | SA nationale à conseil d&#39;administration | | 5515 | Limited company | SA d&#39;économie mixte à conseil d&#39;administration | | 5520 | Limited company | Société d&#39;investissement à capital variable (SICAV) à conseil d&#39;administration | | 5522 | Limited company | Société anonyme immobilière pour le commerce et l&#39;industrie (SICOMI)  à conseil d&#39;administration | | 5525 | Limited company | Société anonyme immobilière d&#39;investissement à conseil d&#39;administration | | 5530 | Limited company | Safer anonyme à conseil d&#39;administration | | 5531 | Limited company | Société anonyme mixte d&#39;intérêt agricole (SMIA) à conseil d&#39;administration | | 5532 | Limited company | Société anonyme mixte d&#39;intérêt collectif agricole (SICA) à conseil d&#39;administration | | 5542 | Limited company | Société anonyme d&#39;attribution à conseil d&#39;administration | | 5543 | Limited company | Société anonyme coopérative de construction à conseil d&#39;administration | | 5546 | Limited company | SA de HLM à conseil d&#39;administration | | 5547 | Limited company | SA coopérative de production de HLM à conseil d&#39;administration | | 5548 | Limited company | SA de crédit immobilier à conseil d&#39;administration | | 5551 | Limited company | SA coopérative de consommation à conseil d&#39;administration | | 5552 | Limited company | SA coopérative de commerçants détaillants à conseil d&#39;administration | | 5553 | Limited company | SA coopérative artisanale à conseil d&#39;administration | | 5554 | Limited company | SA coopérative (d&#39;intérêt) maritime à conseil d&#39;administration | | 5555 | Limited company | SA coopérative de transports à conseil d&#39;administration | | 5558 | Limited company | SCOP à conseil d&#39;administration | | 5559 | Limited company | SA union de sociétés coopératives à conseil d&#39;administration | | 5560 | Limited company | SA coopérative à conseil d&#39;administration | | 5585 | Limited company | Société d&#39;exercice libéral à forme anonyme à conseil d&#39;administration | | 5599 | Limited company | SA à conseil d&#39;administration | | 5605 | Limited company | SA à participation ouvrière à directoire | | 5610 | Limited company | SA nationale à directoire | | 5615 | Limited company | SA d&#39;économie mixte à directoire | | 5620 | Limited company | SICAV | | 5622 | Limited company | SICOMI | | 5625 | Limited company | Société immobilière d&#39;investissement anonyme à directoire | | 5630 | Limited company | Safer anonyme à directoire | | 5631 | Limited company | Société anonyme mixte d&#39;intérêt agricole (SMIA) | | 5632 | Limited company | SICA | | 5642 | Limited company | Société anonyme d&#39;attribution à directoire | | 5643 | Limited company | Société anonyme coopérative de construction à directoire | | 5646 | Limited company | S.A. HLM à directoire | | 5647 | Limited company | Société coopérative de production de HLM anonyme à directoire | | 5648 | Limited company | SA de crédit immobilier à directoire | | 5651 | Limited company | SA coopérative de consommation à directoire | | 5652 | Limited company | SA coopérative de commerçants détaillants à directoire | | 5653 | Limited company | SA coopérative artisanale à directoire | | 5654 | Limited company | SA coopérative (d&#39;intérêt) maritime à directoire | | 5655 | Limited company | SA coopérative de transport à directoire | | 5658 | Limited company | SCOP | | 5659 | Limited company | SA union de sociétés coopératives à directoire | | 5660 | Limited company | SA coopérative à directoire | | 5685 | Limited company | Société d&#39;exercice libéral à forme anonyme à directoire | | 5699 | Limited company | (Autre) SA à directoire | | 5710 | Limited company | SAS | | 5720 | Limited company | SASU | | 5785 | Limited company | Société d&#39;exercice libéral par action simplifiée | | 5800 | Diverse | Société européenne | | 6100 | De facto undivided ownership company | Caisse d&#39;épargne et de prévoyance | | 6210 | Economic Interest Grouping | GEIE | | 6220 | Economic Interest Grouping | GIE | | 6316 | Diverse | CUMA | | 6317 | Diverse | Société coopérative agricole | | 6318 | Diverse | Union de sociétés coopératives agricoles | | 6411 | De facto undivided ownership company | Société d&#39;assurance mutuelle | | 6521 | Civils companies (without SCI) | SCPI | | 6532 | Civils companies (without SCI) | SICA | | 6533 | Civils companies (without SCI) | GAEC | | 6534 | Civils companies (without SCI) | Groupement foncier agricole | | 6535 | Civils companies (without SCI) | Groupement agricole foncier | | 6536 | Civils companies (without SCI) | Groupement forestier | | 6537 | Civils companies (without SCI) | Groupement pastoral | | 6538 | Civils companies (without SCI) | Groupement foncier rural | | 6539 | Civils companies (without SCI) | Société civile foncière | | 6540 | Civils companies | SCI | | 6541 | Civils companies | SCI de construction vente | | 6542 | Civils companies (without SCI) | Société civile d&#39;attribution | | 6543 | Civils companies (without SCI) | Société civile coopérative de construction | | 6544 | Civils companies | Société civile d&#39;accession progressive à la propriété | | 6551 | Civils companies (without SCI) | Société civile coopérative de consommation | | 6554 | Civils companies (without SCI) | Société civile coopérative (d&#39;intérêt) maritime | | 6558 | Civils companies (without SCI) | Société civile coopérative entre médecins | | 6560 | Civils companies (without SCI) | SCP | | 6561 | Civils companies (without SCI) | SCP d&#39;avocats | | 6562 | Civils companies (without SCI) | SCP d&#39;avocats aux conseil | | 6563 | Civils companies (without SCI) | SCP d&#39;avoués d&#39;appel | | 6564 | Civils companies (without SCI) | SCP d&#39;huissiers | | 6565 | Civils companies (without SCI) | SCP de notaires | | 6566 | Civils companies (without SCI) | SCP de commissaires-priseurs | | 6567 | Civils companies (without SCI) | SCP de greffiers de tribunal de commerce | | 6568 | Civils companies (without SCI) | SCP de conseils juridiques | | 6569 | Civils companies (without SCI) | SCP de commissaires aux comptes | | 6571 | Civils companies (without SCI) | SCP de médecins | | 6572 | Civils companies (without SCI) | SCP de dentistes | | 6573 | Civils companies (without SCI) | SCP d&#39;infirmiers | | 6574 | Civils companies (without SCI) | SCP de masseurs kinésithérapeutes | | 6575 | Civils companies (without SCI) | SCP de directeurs de laboratoire d&#39;analyse médicale | | 6576 | Civils companies (without SCI) | SCP de vétérinaires | | 6577 | Civils companies (without SCI) | SCP de géomètres-experts | | 6578 | Civils companies (without SCI) | SCP d&#39;architectes | | 6585 | Civils companies (without SCI) | SCP | | 6588 | Civils companies (without SCI) | Société civile laitière | | 6589 | Civils companies (without SCI) | Société civile de moyens | | 6595 | Civils companies (without SCI) | Caisse (locale) de crédit mutuel | | 6596 | Civils companies (without SCI) | Caisse de crédit agricole mutuel | | 6597 | Civils companies (without SCI) | Société civile d&#39;exploitation agricole | | 6598 | Farm operator  | Exploitation agricole à responsabilité limitée | | 6599 | Civils companies (without SCI) | Autre société civile | | 6901 | Diverse | Autres personnes de droit privé inscrites au registre du commerce et des sociétés | | 7111 | Administrations, Instituions | Autorité constitutionnelle | | 7112 | Administrations, Instituions | Autorité administrative indépendante | | 7113 | Administrations, Instituions | Ministère | | 7120 | Administrations, Instituions | Service central d&#39;un ministère | | 7150 | Administrations, Instituions | Service du ministère de la Défense | | 7160 | Administrations, Instituions | Service déconcentré à compétence nation . D&#39;un ministère (hors Défense) | | 7171 | Administrations, Instituions | Service déconcentré de l&#39;Etat à compétence (inter) régionale | | 7172 | Administrations, Instituions | Service déconcentré de l&#39;Etat à compétence (inter) départementale | | 7179 | Administrations, Instituions | (Autre) Service déconcentré de l&#39;Etat à compétence territoriale | | 7190 | Administrations, Instituions | Ecole nationale non dotée de la personnalité morale | | 7210 | Administrations, Instituions | Commune | | 7220 | Administrations, Instituions | Département | | 7225 | Administrations, Instituions | Territoire d&#39;Outre-Mer | | 7229 | Administrations, Instituions | (Autre) Collectivité territoriale | | 7230 | Administrations, Instituions | Région | | 7312 | Administrations, Instituions | Commune associée | | 7313 | Administrations, Instituions | Section de commune | | 7314 | Administrations, Instituions | Ensemble urbain | | 7321 | Administrations, Instituions | Association syndicale autorisée | | 7322 | Administrations, Instituions | Association foncière urbaine | | 7323 | Administrations, Instituions | Association foncière de remembrement | | 7331 | Administrations, Instituions | Etablissement public local d&#39;enseignement | | 7340 | Administrations, Instituions | Pôle métropolitain | | 7341 | Administrations, Instituions | Secteur de commune | | 7342 | Administrations, Instituions | District urbain | | 7343 | Administrations, Instituions | Communauté urbaine | | 7344 | Administrations, Instituions | Métropole | | 7345 | Administrations, Instituions | Syndicat intercommunal à vocation multiple (SIVOM) | | 7346 | Administrations, Instituions | Communauté de commune | | 7347 | Administrations, Instituions | Communauté de villes | | 7348 | Administrations, Instituions | Communauté d&#39;agglomération | | 7349 | Administrations, Instituions | Autre établissement public local de coopération non spécialisé ou entente | | 7351 | Administrations, Instituions | Institution interdépartementale ou entente | | 7352 | Administrations, Instituions | Institution interrégionale ou entente | | 7353 | Administrations, Instituions | Syndicat intercommunal à vocation unique (SIVU) | | 7354 | Administrations, Instituions | Syndicat mixte communal | | 7355 | Administrations, Instituions | Autre syndicat mixte | | 7356 | Administrations, Instituions | Commission syndicale pour la gestion des biens indivis des communes | | 7361 | Administrations, Instituions | Centre communal d&#39;action sociale | | 7362 | Administrations, Instituions | Caisse des écoles | | 7363 | Administrations, Instituions | Caisse de crédit municipal | | 7364 | Administrations, Instituions | Etablissement d&#39;hospitalisation | | 7365 | Administrations, Instituions | Syndicat inter hospitalier | | 7366 | Administrations, Instituions | Etablissement public local social et médico-social | | 7371 | Administrations, Instituions | Office public d&#39;habitation à loyer modéré (OPHLM) | | 7372 | Administrations, Instituions | Service départemental d&#39;incendie | | 7373 | Administrations, Instituions | Etablissement public local culturel | | 7378 | Administrations, Instituions | Régie d&#39;une collectivité locale à caractère administratif | | 7379 | Administrations, Instituions | (Autre) Etablissement public administratif local | | 7381 | Administrations, Instituions | Organisme consulaire | | 7382 | Administrations, Instituions | Etablissement public national ayant fonction d&#39;administration centrale | | 7383 | Administrations, Instituions | Etablissement public national à caractère scientifique  culturel et professionnel | | 7384 | Administrations, Instituions | Autre établissement public national d&#39;enseignement | | 7385 | Administrations, Instituions | Autre établissement public national administratif à compétence territoriale limitée | | 7389 | Administrations, Instituions | Etablissement public national à caractère administratif | | 7410 | Administrations, Instituions | Groupement d&#39;intérêt public (GIP) | | 7430 | Administrations, Instituions | Etablissement public des cultes d&#39;Alsace-Lorraine | | 7450 | Administrations, Instituions | Etablissement public, cercle et foyer dans les armées | | 7470 | Administrations, Instituions | Groupement de coopération sanitaire à gestion publique | | 7490 | Administrations, Instituions | Autre personne morale de droit administratif | | 8110 | Administrations, Instituions | Régime général de la sécurité sociale | | 8120 | Administrations, Instituions | Régime spécial de sécurité sociale | | 8130 | Administrations, Instituions | Institution de retraite complémentaire | | 8140 | Administrations, Instituions | Mutualité sociale agricole | | 8150 | Administrations, Instituions | Régime maladie des non-salariés non agricoles | | 8160 | Administrations, Instituions | Régime vieillesse ne dépendant pas du régime général de la sécurité sociale | | 8170 | Administrations, Instituions | Régime d&#39;assurance chômage | | 8190 | Administrations, Instituions | Autre régime de prévoyance sociale | | 8210 | De facto undivided ownership company | Mutuelle | | 8250 | De facto undivided ownership company | Assurance mutuelle agricole | | 8290 | De facto undivided ownership company | Autre organisme mutualiste | | 8310 | Association fondation | Comité central d&#39;entreprise | | 8311 | Association fondation | Comité d&#39;établissement | | 8410 | Association fondation | Syndicat de salariés | | 8420 | Association fondation | Syndicat patronal | | 8450 | Association fondation | Ordre professionnel ou assimilé | | 8470 | Association fondation | Centre technique industriel ou comité professionnel du développement économique | | 8490 | Association fondation | Autre organisme professionnel | | 8510 | Administrations, Instituions | Institution de prévoyance | | 8520 | Administrations, Instituions | Institution de retraite supplémentaire | | 9110 | Condominium syndicate | Syndicat de copropriété | | 9150 | Association fondation | Association syndicale libre | | 9210 | Association fondation | Association non déclarée | | 9220 | Association fondation | Association déclarée | | 9221 | Association fondation | Association déclarée \&quot;entreprises d&#39;insertion par l&#39;économique\&quot; | | 9222 | Association fondation | Association intermédiaire | | 9223 | Association fondation | Groupement d&#39;employeurs | | 9224 | Association fondation | Association d&#39;avocats à responsabilité professionnelle individuelle | | 9230 | Association fondation | Association déclarée  reconnue d&#39;utilité publique | | 9240 | Association fondation | Congrégation | | 9260 | Association fondation | Association de droit local | | 9300 | Association fondation | Fondation | | 9900 | Diverse | Autre personne morale de droit privé | | 9970 | Diverse | Groupement de coopération sanitaire à gestion privée |  (optional)
     * @param legalShareCapital Business share capital (optional)
     * @param legalSector Business sector. NAF code in France (optional)
     * @param legalAnnualTurnOver Business annual turnover (in k€) (optional)
     * @param legalNetIncomeRange Business net income range (in k€) (optional)
     * @param legalNumberOfEmployeeRange Business number of employees range (optional)
     * @param effectiveBeneficiary Business effective beneficiary (optional)
     * @param language User&#39;s prefered language (ISO 639-1) (optional)
     * @param taxNumber User&#39;s tax identification number. If the taxResidence is not set to FR, the field is mandatory. (optional)
     * @param taxResidence User&#39;s tax residence country code (2 char code following ISO 3166 norm). (optional)
     * @param position User&#39;s position  (deprecated, you must use the parameter occupation). (optional)
     * @param personalAssets User&#39;s personal assets range exprimed in K€. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void putUser(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String userTag, Integer specifiedUSPerson, Integer controllingPersonType, Integer employeeType, String title, String firstname, String lastname, String middleNames, String birthday, String email, String address1, String address2, String postcode, String city, String state, String country, String phone, String mobile, String nationality, String nationalityOther, String placeOfBirth, String birthCountry, String occupation, String incomeRange, String legalName, String legalRegistrationNumber, String legalTvaNumber, LocalDate legalRegistrationDate, String legalForm, Integer legalShareCapital, String legalSector, String legalAnnualTurnOver, String legalNetIncomeRange, String legalNumberOfEmployeeRange, Integer effectiveBeneficiary, String language, String taxNumber, String taxResidence, String position, String personalAssets, Handler<AsyncResult<TreezorInlineResponse20026>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling putUser"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/users/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userTag", userTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "specifiedUSPerson", specifiedUSPerson));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "controllingPersonType", controllingPersonType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "employeeType", employeeType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstname", firstname));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastname", lastname));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "middleNames", middleNames));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "birthday", birthday));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address1", address1));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address2", address2));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "postcode", postcode));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "city", city));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "phone", phone));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "mobile", mobile));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nationality", nationality));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nationalityOther", nationalityOther));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "placeOfBirth", placeOfBirth));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "birthCountry", birthCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "occupation", occupation));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "incomeRange", incomeRange));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalName", legalName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalRegistrationNumber", legalRegistrationNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalTvaNumber", legalTvaNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalRegistrationDate", legalRegistrationDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalForm", legalForm));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalShareCapital", legalShareCapital));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalSector", legalSector));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalAnnualTurnOver", legalAnnualTurnOver));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalNetIncomeRange", legalNetIncomeRange));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalNumberOfEmployeeRange", legalNumberOfEmployeeRange));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "effectiveBeneficiary", effectiveBeneficiary));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxNumber", taxNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxResidence", taxResidence));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "position", position));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "personalAssets", personalAssets));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20026> localVarReturnType = new TypeReference<TreezorInlineResponse20026>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * create user
     * Create a new user in the system.
     * @param specifiedUSPerson Est considéré comme ayant la nationalité ou la citoyenneté américaine : Tout citoyen des États-Unis : une personne est présumée citoyen des Etats-Unis dès lors qu’elle possède un passeport américain ou qu’elle est née sur le territoire des Etats-Unis, même lorsqu’un tel lieu de naissance figure sur un passeport d’un autre pays, ou que la personne possède également une autre nationalité ou a sa résidence dans un autre pays. Une condition néanmoins : la personne ne doit pas avoir renoncé à la citoyenneté américaine ; • Tout résident légal des États-Unis, quelle que soit sa nationalité : (i) quiconque est considéré comme résident fiscal aux Etats-Unis aux termes de la loi fédérale américaine, (ii) quiconque demande à être traité comme résident fiscal aux Etats-Unis, ou (iii) quiconque est considéré comme résident fiscal aux termes de la loi de cet Etat américain. • Toute personne titulaire d’une carte de séjour permanent (green card) aux Etats-Unis ou résidant de façon permanente aux Etats-Unis ou y ayant passé une période suffisamment longue au cours des trois dernières années :  | Value | Type | | --- | --- | | 0 | No | | 1 | Yes |  (required)
     * @param email User&#39;s email address (must be valid). (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param userTypeId User&#39;s type. Possible values:  | Value | Type | | --- | --- | | 1 | Natural person (default)| | 2 | Business entity | | 3 | Non - governmental organization | | 4 | Governmental organization |  (optional)
     * @param userTag Custom data. (optional)
     * @param parentUserId User id of user&#39;s parent if any. (optional)
     * @param parentType Type of bound between parent and current user : * shareholder * employee * leader  (deprecated you must use the controllingPersonType and employeeType parameters)  (optional)
     * @param controllingPersonType Type of relationship :  | Value | Type | | --- | --- | | 1 | Shareholder | | 2 | Other_relationship | | 3 | Director | | 4 | None (default) |  (optional)
     * @param employeeType Type of user&#39;s role :  | Value | Type | | --- | --- | | 1 | Leader | | 2 | Employee | | 3 | None (default)|  (optional)
     * @param entityType Type of user&#39;s entity type :    | Value | Type |   | --- | --- |   | 1 | Reporting Financial Institution |   | 2 | Non-Reporting Financial Institution |   | 3 | Active Non-Financial Entity - Governmental entities, Int. organizations |   | 4 | Active Non-Financial Entity - Other |   | 5 | Passive Non-Financial Entity - Investment entity that is not Participating Jurisdiction FI |  (optional)
     * @param title User&#39;s title. Possible values: * M * MME * MLLE  (optional)
     * @param firstname User&#39;s first name (optional)
     * @param lastname User&#39;s last name (optional)
     * @param middleNames User&#39;s middle names (optional)
     * @param birthday User&#39;s birth date. Format YYYY-MM-DD (optional)
     * @param address1 User&#39;s postal address (main). Can not contain carriage return. (optional)
     * @param address2 User&#39;s postal address (complement). Can not contain carriage return. (optional)
     * @param postcode User&#39;s postcode (optional)
     * @param city User&#39;s city (optional)
     * @param state User&#39;s state (optional)
     * @param country User&#39;s country (optional)
     * @param phone User&#39;s phone number (optional)
     * @param mobile User&#39;s mobile phone number (optional)
     * @param nationality User&#39;s nationality (optional)
     * @param nationalityOther User&#39;s other nationality (optional)
     * @param placeOfBirth User&#39;s place of birth (optional)
     * @param birthCountry User&#39;s country of birth (optional)
     * @param occupation User&#39;s occupation (optional)
     * @param incomeRange Customer income range (optional)
     * @param legalName Business name (optional)
     * @param legalRegistrationNumber Business registration number (optional)
     * @param legalTvaNumber Business VAT number (optional)
     * @param legalRegistrationDate Business registration date (optional)
     * @param legalForm | Code | Category | Details (in french) | | ---- | ----- | ---- | | 1000 | Individual company | Entrepreneur Individuel a Responsabilité Limitée (EIRL) | | 1100 | Individual company | Artisan-Commerçant | | 1200 | Individual company | Commerçant | | 1300 | Individual company | Artisan | | 1400 | Liberal profession | Officier public ou ministériel | | 1500 | Liberal profession | Profession libérale | | 1600 | Farm operator  | Exploitant agricole | | 1700 | Liberal profession | Agent commercial | | 1800 | Partner Director | Associé-gérant | | 1900 | Individual company | Personne physique | | 2110 | Indivision and others | Indivision entre personnes physiques | | 2120 | Indivision and others | Indivision avec personne morale | | 2210 | Indivision and others | Société créée de fait entre personnes physiques | | 2220 | Indivision and others | Société créée de fait avec personne morale | | 2310 | Indivision and others | Société en participation entre personnes physiques | | 2320 | Indivision and others | Société en participation avec personne morale | | 2385 | Indivision and others | Société en participation de professions libérales | | 2400 | Indivision and others | Fiducie | | 2700 | Diverse | Paroisse hors zone concordataire | | 2900 | Economic Interest Grouping | Autre groupement de droit privé non doté de la personnalité morale | | 3110 | Foreign company | Représentation ou agence commerciale d&#39;état ou organisme public étranger  immatriculé au RCS | | 3120 | Foreign company | Société étrangère immatriculée au RCS | | 3205 | Foreign company | Organisation internationale | | 3210 | Foreign company | Etat collectivité ou établissement public étranger | | 3220 | Foreign company | Société étrangère non immatriculée au RCS | | 3290 | Foreign company | (Autre) personne morale de droit étranger | | 4110 | Administrations, Instituions | Etablissement public national à caractère industriel ou commercial doté d&#39;un comptable public | | 4120 | Administrations, Instituions | Etablissement public national à caractère industriel ou commercial non doté d&#39;un comptable public | | 4130 | Administrations, Instituions | Exploitant public | | 4140 | Administrations, Instituions | Etablissement public local à caractère industriel ou commercial | | 4150 | Administrations, Instituions | Régie d&#39;une collectivité locale à caractère industriel ou commercial | | 4160 | Administrations, Instituions | Institution Banque de France | | 5191 | De facto undivided ownership company | Société de caution mutuelle | | 5192 | Diverse | Société coopérative de banque populaire | | 5193 | De facto undivided ownership company | Caisse de crédit maritime mutuel | | 5194 | De facto undivided ownership company | Caisse (fédérale) de crédit mutuel | | 5195 | Association fondation | Association coopérative inscrite (droit local Alsace Moselle) | | 5196 | De facto undivided ownership company | Caisse d&#39;épargne et de prévoyance à forme coopérative | | 5202 | General partnership | Société en nom collectif | | 5203 | General partnership | Société en nom collectif coopérative | | 5306 | Limited company | Société en commandite simple | | 5307 | Limited company | Société en commandite simple coopérative | | 5308 | Limited company | Société en commandite par actions | | 5309 | Limited company | Société en commandite par actions coopérative | | 5385 | Limited company | Société d&#39;exercice libéral en commandite par action | | 5410 | Limited Liability Company  | SARL nationale | | 5415 | Limited Liability Company  | SARL d&#39;économie mixte | | 5422 | Limited Liability Company  | SARL immobilière pour le commerce et l&#39;industrie (SICOMI) | | 5426 | Limited Liability Company  | Société immobilière de gestion | | 5430 | Limited Liability Company  | Safer en SARL | | 5431 | Limited Liability Company  | SARL mixte d&#39;intérêt agricole (SIMA) | | 5432 | Limited Liability Company  | SARL d&#39;intérêt collectif agricole (SICA) | | 5442 | Limited Liability Company  | SARL d&#39;attribution | | 5443 | Limited Liability Company  | SARL coopérative de construction | | 5451 | Limited Liability Company  | SARL coopérative de consommation | | 5453 | Limited Liability Company  | SARL coopérative artisanale | | 5454 | Limited Liability Company  | SARL coopérative d&#39;intérêt maritime | | 5455 | Limited Liability Company  | SARL coopérative de transports | | 5458 | Limited Liability Company  | SARL coopérative ouvrière de production et de crédit (SCOP) | | 5459 | Limited Liability Company  | SARL union de sociétés coopératives | | 5460 | Limited Liability Company  | SARL coopérative | | 5485 | Limited Liability Company  | Société d&#39;exercice libéral à responsabilité limitée | | 5498 | Limited Liability Company  | SARL unipersonnelle | | 5499 | Limited Liability Company  | SARL | | 5505 | Limited company | SA à participation ouvrière à conseil d&#39;administration | | 5510 | Limited company | SA nationale à conseil d&#39;administration | | 5515 | Limited company | SA d&#39;économie mixte à conseil d&#39;administration | | 5520 | Limited company | Société d&#39;investissement à capital variable (SICAV) à conseil d&#39;administration | | 5522 | Limited company | Société anonyme immobilière pour le commerce et l&#39;industrie (SICOMI)  à conseil d&#39;administration | | 5525 | Limited company | Société anonyme immobilière d&#39;investissement à conseil d&#39;administration | | 5530 | Limited company | Safer anonyme à conseil d&#39;administration | | 5531 | Limited company | Société anonyme mixte d&#39;intérêt agricole (SMIA) à conseil d&#39;administration | | 5532 | Limited company | Société anonyme mixte d&#39;intérêt collectif agricole (SICA) à conseil d&#39;administration | | 5542 | Limited company | Société anonyme d&#39;attribution à conseil d&#39;administration | | 5543 | Limited company | Société anonyme coopérative de construction à conseil d&#39;administration | | 5546 | Limited company | SA de HLM à conseil d&#39;administration | | 5547 | Limited company | SA coopérative de production de HLM à conseil d&#39;administration | | 5548 | Limited company | SA de crédit immobilier à conseil d&#39;administration | | 5551 | Limited company | SA coopérative de consommation à conseil d&#39;administration | | 5552 | Limited company | SA coopérative de commerçants détaillants à conseil d&#39;administration | | 5553 | Limited company | SA coopérative artisanale à conseil d&#39;administration | | 5554 | Limited company | SA coopérative (d&#39;intérêt) maritime à conseil d&#39;administration | | 5555 | Limited company | SA coopérative de transports à conseil d&#39;administration | | 5558 | Limited company | SCOP à conseil d&#39;administration | | 5559 | Limited company | SA union de sociétés coopératives à conseil d&#39;administration | | 5560 | Limited company | SA coopérative à conseil d&#39;administration | | 5585 | Limited company | Société d&#39;exercice libéral à forme anonyme à conseil d&#39;administration | | 5599 | Limited company | SA à conseil d&#39;administration | | 5605 | Limited company | SA à participation ouvrière à directoire | | 5610 | Limited company | SA nationale à directoire | | 5615 | Limited company | SA d&#39;économie mixte à directoire | | 5620 | Limited company | SICAV | | 5622 | Limited company | SICOMI | | 5625 | Limited company | Société immobilière d&#39;investissement anonyme à directoire | | 5630 | Limited company | Safer anonyme à directoire | | 5631 | Limited company | Société anonyme mixte d&#39;intérêt agricole (SMIA) | | 5632 | Limited company | SICA | | 5642 | Limited company | Société anonyme d&#39;attribution à directoire | | 5643 | Limited company | Société anonyme coopérative de construction à directoire | | 5646 | Limited company | S.A. HLM à directoire | | 5647 | Limited company | Société coopérative de production de HLM anonyme à directoire | | 5648 | Limited company | SA de crédit immobilier à directoire | | 5651 | Limited company | SA coopérative de consommation à directoire | | 5652 | Limited company | SA coopérative de commerçants détaillants à directoire | | 5653 | Limited company | SA coopérative artisanale à directoire | | 5654 | Limited company | SA coopérative (d&#39;intérêt) maritime à directoire | | 5655 | Limited company | SA coopérative de transport à directoire | | 5658 | Limited company | SCOP | | 5659 | Limited company | SA union de sociétés coopératives à directoire | | 5660 | Limited company | SA coopérative à directoire | | 5685 | Limited company | Société d&#39;exercice libéral à forme anonyme à directoire | | 5699 | Limited company | (Autre) SA à directoire | | 5710 | Limited company | SAS | | 5720 | Limited company | SASU | | 5785 | Limited company | Société d&#39;exercice libéral par action simplifiée | | 5800 | Diverse | Société européenne | | 6100 | De facto undivided ownership company | Caisse d&#39;épargne et de prévoyance | | 6210 | Economic Interest Grouping | GEIE | | 6220 | Economic Interest Grouping | GIE | | 6316 | Diverse | CUMA | | 6317 | Diverse | Société coopérative agricole | | 6318 | Diverse | Union de sociétés coopératives agricoles | | 6411 | De facto undivided ownership company | Société d&#39;assurance mutuelle | | 6521 | Civils companies (without SCI) | SCPI | | 6532 | Civils companies (without SCI) | SICA | | 6533 | Civils companies (without SCI) | GAEC | | 6534 | Civils companies (without SCI) | Groupement foncier agricole | | 6535 | Civils companies (without SCI) | Groupement agricole foncier | | 6536 | Civils companies (without SCI) | Groupement forestier | | 6537 | Civils companies (without SCI) | Groupement pastoral | | 6538 | Civils companies (without SCI) | Groupement foncier rural | | 6539 | Civils companies (without SCI) | Société civile foncière | | 6540 | Civils companies | SCI | | 6541 | Civils companies | SCI de construction vente | | 6542 | Civils companies (without SCI) | Société civile d&#39;attribution | | 6543 | Civils companies (without SCI) | Société civile coopérative de construction | | 6544 | Civils companies | Société civile d&#39;accession progressive à la propriété | | 6551 | Civils companies (without SCI) | Société civile coopérative de consommation | | 6554 | Civils companies (without SCI) | Société civile coopérative (d&#39;intérêt) maritime | | 6558 | Civils companies (without SCI) | Société civile coopérative entre médecins | | 6560 | Civils companies (without SCI) | SCP | | 6561 | Civils companies (without SCI) | SCP d&#39;avocats | | 6562 | Civils companies (without SCI) | SCP d&#39;avocats aux conseil | | 6563 | Civils companies (without SCI) | SCP d&#39;avoués d&#39;appel | | 6564 | Civils companies (without SCI) | SCP d&#39;huissiers | | 6565 | Civils companies (without SCI) | SCP de notaires | | 6566 | Civils companies (without SCI) | SCP de commissaires-priseurs | | 6567 | Civils companies (without SCI) | SCP de greffiers de tribunal de commerce | | 6568 | Civils companies (without SCI) | SCP de conseils juridiques | | 6569 | Civils companies (without SCI) | SCP de commissaires aux comptes | | 6571 | Civils companies (without SCI) | SCP de médecins | | 6572 | Civils companies (without SCI) | SCP de dentistes | | 6573 | Civils companies (without SCI) | SCP d&#39;infirmiers | | 6574 | Civils companies (without SCI) | SCP de masseurs kinésithérapeutes | | 6575 | Civils companies (without SCI) | SCP de directeurs de laboratoire d&#39;analyse médicale | | 6576 | Civils companies (without SCI) | SCP de vétérinaires | | 6577 | Civils companies (without SCI) | SCP de géomètres-experts | | 6578 | Civils companies (without SCI) | SCP d&#39;architectes | | 6585 | Civils companies (without SCI) | SCP | | 6588 | Civils companies (without SCI) | Société civile laitière | | 6589 | Civils companies (without SCI) | Société civile de moyens | | 6595 | Civils companies (without SCI) | Caisse (locale) de crédit mutuel | | 6596 | Civils companies (without SCI) | Caisse de crédit agricole mutuel | | 6597 | Civils companies (without SCI) | Société civile d&#39;exploitation agricole | | 6598 | Farm operator  | Exploitation agricole à responsabilité limitée | | 6599 | Civils companies (without SCI) | Autre société civile | | 6901 | Diverse | Autres personnes de droit privé inscrites au registre du commerce et des sociétés | | 7111 | Administrations, Instituions | Autorité constitutionnelle | | 7112 | Administrations, Instituions | Autorité administrative indépendante | | 7113 | Administrations, Instituions | Ministère | | 7120 | Administrations, Instituions | Service central d&#39;un ministère | | 7150 | Administrations, Instituions | Service du ministère de la Défense | | 7160 | Administrations, Instituions | Service déconcentré à compétence nation . D&#39;un ministère (hors Défense) | | 7171 | Administrations, Instituions | Service déconcentré de l&#39;Etat à compétence (inter) régionale | | 7172 | Administrations, Instituions | Service déconcentré de l&#39;Etat à compétence (inter) départementale | | 7179 | Administrations, Instituions | (Autre) Service déconcentré de l&#39;Etat à compétence territoriale | | 7190 | Administrations, Instituions | Ecole nationale non dotée de la personnalité morale | | 7210 | Administrations, Instituions | Commune | | 7220 | Administrations, Instituions | Département | | 7225 | Administrations, Instituions | Territoire d&#39;Outre-Mer | | 7229 | Administrations, Instituions | (Autre) Collectivité territoriale | | 7230 | Administrations, Instituions | Région | | 7312 | Administrations, Instituions | Commune associée | | 7313 | Administrations, Instituions | Section de commune | | 7314 | Administrations, Instituions | Ensemble urbain | | 7321 | Administrations, Instituions | Association syndicale autorisée | | 7322 | Administrations, Instituions | Association foncière urbaine | | 7323 | Administrations, Instituions | Association foncière de remembrement | | 7331 | Administrations, Instituions | Etablissement public local d&#39;enseignement | | 7340 | Administrations, Instituions | Pôle métropolitain | | 7341 | Administrations, Instituions | Secteur de commune | | 7342 | Administrations, Instituions | District urbain | | 7343 | Administrations, Instituions | Communauté urbaine | | 7344 | Administrations, Instituions | Métropole | | 7345 | Administrations, Instituions | Syndicat intercommunal à vocation multiple (SIVOM) | | 7346 | Administrations, Instituions | Communauté de commune | | 7347 | Administrations, Instituions | Communauté de villes | | 7348 | Administrations, Instituions | Communauté d&#39;agglomération | | 7349 | Administrations, Instituions | Autre établissement public local de coopération non spécialisé ou entente | | 7351 | Administrations, Instituions | Institution interdépartementale ou entente | | 7352 | Administrations, Instituions | Institution interrégionale ou entente | | 7353 | Administrations, Instituions | Syndicat intercommunal à vocation unique (SIVU) | | 7354 | Administrations, Instituions | Syndicat mixte communal | | 7355 | Administrations, Instituions | Autre syndicat mixte | | 7356 | Administrations, Instituions | Commission syndicale pour la gestion des biens indivis des communes | | 7361 | Administrations, Instituions | Centre communal d&#39;action sociale | | 7362 | Administrations, Instituions | Caisse des écoles | | 7363 | Administrations, Instituions | Caisse de crédit municipal | | 7364 | Administrations, Instituions | Etablissement d&#39;hospitalisation | | 7365 | Administrations, Instituions | Syndicat inter hospitalier | | 7366 | Administrations, Instituions | Etablissement public local social et médico-social | | 7371 | Administrations, Instituions | Office public d&#39;habitation à loyer modéré (OPHLM) | | 7372 | Administrations, Instituions | Service départemental d&#39;incendie | | 7373 | Administrations, Instituions | Etablissement public local culturel | | 7378 | Administrations, Instituions | Régie d&#39;une collectivité locale à caractère administratif | | 7379 | Administrations, Instituions | (Autre) Etablissement public administratif local | | 7381 | Administrations, Instituions | Organisme consulaire | | 7382 | Administrations, Instituions | Etablissement public national ayant fonction d&#39;administration centrale | | 7383 | Administrations, Instituions | Etablissement public national à caractère scientifique  culturel et professionnel | | 7384 | Administrations, Instituions | Autre établissement public national d&#39;enseignement | | 7385 | Administrations, Instituions | Autre établissement public national administratif à compétence territoriale limitée | | 7389 | Administrations, Instituions | Etablissement public national à caractère administratif | | 7410 | Administrations, Instituions | Groupement d&#39;intérêt public (GIP) | | 7430 | Administrations, Instituions | Etablissement public des cultes d&#39;Alsace-Lorraine | | 7450 | Administrations, Instituions | Etablissement public, cercle et foyer dans les armées | | 7470 | Administrations, Instituions | Groupement de coopération sanitaire à gestion publique | | 7490 | Administrations, Instituions | Autre personne morale de droit administratif | | 8110 | Administrations, Instituions | Régime général de la sécurité sociale | | 8120 | Administrations, Instituions | Régime spécial de sécurité sociale | | 8130 | Administrations, Instituions | Institution de retraite complémentaire | | 8140 | Administrations, Instituions | Mutualité sociale agricole | | 8150 | Administrations, Instituions | Régime maladie des non-salariés non agricoles | | 8160 | Administrations, Instituions | Régime vieillesse ne dépendant pas du régime général de la sécurité sociale | | 8170 | Administrations, Instituions | Régime d&#39;assurance chômage | | 8190 | Administrations, Instituions | Autre régime de prévoyance sociale | | 8210 | De facto undivided ownership company | Mutuelle | | 8250 | De facto undivided ownership company | Assurance mutuelle agricole | | 8290 | De facto undivided ownership company | Autre organisme mutualiste | | 8310 | Association fondation | Comité central d&#39;entreprise | | 8311 | Association fondation | Comité d&#39;établissement | | 8410 | Association fondation | Syndicat de salariés | | 8420 | Association fondation | Syndicat patronal | | 8450 | Association fondation | Ordre professionnel ou assimilé | | 8470 | Association fondation | Centre technique industriel ou comité professionnel du développement économique | | 8490 | Association fondation | Autre organisme professionnel | | 8510 | Administrations, Instituions | Institution de prévoyance | | 8520 | Administrations, Instituions | Institution de retraite supplémentaire | | 9110 | Condominium syndicate | Syndicat de copropriété | | 9150 | Association fondation | Association syndicale libre | | 9210 | Association fondation | Association non déclarée | | 9220 | Association fondation | Association déclarée | | 9221 | Association fondation | Association déclarée \&quot;entreprises d&#39;insertion par l&#39;économique\&quot; | | 9222 | Association fondation | Association intermédiaire | | 9223 | Association fondation | Groupement d&#39;employeurs | | 9224 | Association fondation | Association d&#39;avocats à responsabilité professionnelle individuelle | | 9230 | Association fondation | Association déclarée  reconnue d&#39;utilité publique | | 9240 | Association fondation | Congrégation | | 9260 | Association fondation | Association de droit local | | 9300 | Association fondation | Fondation | | 9900 | Diverse | Autre personne morale de droit privé | | 9970 | Diverse | Groupement de coopération sanitaire à gestion privée |  (optional)
     * @param legalShareCapital Business share capital (optional)
     * @param legalSector Business sector. NAF code in France (optional)
     * @param legalAnnualTurnOver Business annual turnover (in k€) (optional)
     * @param legalNetIncomeRange Business net income range (in k€) (optional)
     * @param legalNumberOfEmployeeRange Business number of employees range (optional)
     * @param effectiveBeneficiary Business effective beneficiary (optional)
     * @param language User&#39;s prefered language (ISO 639-1) (optional)
     * @param taxNumber User&#39;s tax identification number. If the taxResidence is set to another country than France, the field is mandatory. (deprecated, you must use the TaxResidence endpoint)  (optional)
     * @param taxResidence User&#39;s tax residence country code (2 char code following ISO 3166 norm). (deprecated, you must use the TaxResidence endpoint)  (optional)
     * @param position User&#39;s position (deprecated, you must use the parameter occupation). (optional)
     * @param personalAssets User&#39;s personal assets range exprimed in K€. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void putUsers(Integer specifiedUSPerson, String email, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer userTypeId, String userTag, Integer parentUserId, String parentType, Integer controllingPersonType, Integer employeeType, Integer entityType, String title, String firstname, String lastname, String middleNames, String birthday, String address1, String address2, String postcode, String city, String state, String country, String phone, String mobile, String nationality, String nationalityOther, String placeOfBirth, String birthCountry, String occupation, String incomeRange, String legalName, String legalRegistrationNumber, String legalTvaNumber, LocalDate legalRegistrationDate, String legalForm, Integer legalShareCapital, String legalSector, String legalAnnualTurnOver, String legalNetIncomeRange, String legalNumberOfEmployeeRange, Integer effectiveBeneficiary, String language, String taxNumber, String taxResidence, String position, String personalAssets, Handler<AsyncResult<TreezorInlineResponse20026>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'specifiedUSPerson' is set
        if (specifiedUSPerson == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'specifiedUSPerson' when calling putUsers"));
            return;
        }
        
        // verify the required parameter 'email' is set
        if (email == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'email' when calling putUsers"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/users";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userTypeId", userTypeId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userTag", userTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "parentUserId", parentUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "parentType", parentType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "specifiedUSPerson", specifiedUSPerson));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "controllingPersonType", controllingPersonType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "employeeType", employeeType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityType", entityType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstname", firstname));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastname", lastname));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "middleNames", middleNames));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "birthday", birthday));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address1", address1));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address2", address2));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "postcode", postcode));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "city", city));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "phone", phone));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "mobile", mobile));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nationality", nationality));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nationalityOther", nationalityOther));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "placeOfBirth", placeOfBirth));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "birthCountry", birthCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "occupation", occupation));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "incomeRange", incomeRange));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalName", legalName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalRegistrationNumber", legalRegistrationNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalTvaNumber", legalTvaNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalRegistrationDate", legalRegistrationDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalForm", legalForm));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalShareCapital", legalShareCapital));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalSector", legalSector));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalAnnualTurnOver", legalAnnualTurnOver));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalNetIncomeRange", legalNetIncomeRange));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "legalNumberOfEmployeeRange", legalNumberOfEmployeeRange));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "effectiveBeneficiary", effectiveBeneficiary));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxNumber", taxNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxResidence", taxResidence));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "position", position));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "personalAssets", personalAssets));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20026> localVarReturnType = new TypeReference<TreezorInlineResponse20026>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * review user information
     * Perform a KYC review for given user.
     * @param id User&#39;s id. (required)
     * @param accessToken Access token must be defined here or in Authorization HTTP header. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void usersIdKycreviewPut(Integer id, String accessToken, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse20026>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling usersIdKycreviewPut"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/users/{id}/Kycreview/".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessToken", accessToken));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20026> localVarReturnType = new TypeReference<TreezorInlineResponse20026>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
