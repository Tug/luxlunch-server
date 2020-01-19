
# InlineResponse2004Businessinformations

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**legalName** | **String** | Business commercial name. |  [optional]
**legalRegistrationNumber** | **String** | Business registration number. |  [optional]
**legalRegistrationDate** | **String** | Business registration date. |  [optional]
**legalForm** | [**LegalFormEnum**](#LegalFormEnum) | | Code | Category | Details (in french) | | ---- | ----- | ---- | | 1000 | Individual company | Entrepreneur Individuel a Responsabilité Limitée (EIRL) | | 1100 | Individual company | Artisan-Commerçant | | 1200 | Individual company | Commerçant | | 1300 | Individual company | Artisan | | 1400 | Liberal profession | Officier public ou ministériel | | 1500 | Liberal profession | Profession libérale | | 1600 | Farm operator  | Exploitant agricole | | 1700 | Liberal profession | Agent commercial | | 1800 | Partner Director | Associé-gérant | | 1900 | Individual company | Personne physique | | 2110 | Indivision and others | Indivision entre personnes physiques | | 2120 | Indivision and others | Indivision avec personne morale | | 2210 | Indivision and others | Société créée de fait entre personnes physiques | | 2220 | Indivision and others | Société créée de fait avec personne morale | | 2310 | Indivision and others | Société en participation entre personnes physiques | | 2320 | Indivision and others | Société en participation avec personne morale | | 2385 | Indivision and others | Société en participation de professions libérales | | 2400 | Indivision and others | Fiducie | | 2700 | Diverse | Paroisse hors zone concordataire | | 2900 | Economic Interest Grouping | Autre groupement de droit privé non doté de la personnalité morale | | 3110 | Foreign company | Représentation ou agence commerciale d&#39;état ou organisme public étranger  immatriculé au RCS | | 3120 | Foreign company | Société étrangère immatriculée au RCS | | 3205 | Foreign company | Organisation internationale | | 3210 | Foreign company | Etat collectivité ou établissement public étranger | | 3220 | Foreign company | Société étrangère non immatriculée au RCS | | 3290 | Foreign company | (Autre) personne morale de droit étranger | | 4110 | Administrations, Instituions | Etablissement public national à caractère industriel ou commercial doté d&#39;un comptable public | | 4120 | Administrations, Instituions | Etablissement public national à caractère industriel ou commercial non doté d&#39;un comptable public | | 4130 | Administrations, Instituions | Exploitant public | | 4140 | Administrations, Instituions | Etablissement public local à caractère industriel ou commercial | | 4150 | Administrations, Instituions | Régie d&#39;une collectivité locale à caractère industriel ou commercial | | 4160 | Administrations, Instituions | Institution Banque de France | | 5191 | De facto undivided ownership company | Société de caution mutuelle | | 5192 | Diverse | Société coopérative de banque populaire | | 5193 | De facto undivided ownership company | Caisse de crédit maritime mutuel | | 5194 | De facto undivided ownership company | Caisse (fédérale) de crédit mutuel | | 5195 | Association fondation | Association coopérative inscrite (droit local Alsace Moselle) | | 5196 | De facto undivided ownership company | Caisse d&#39;épargne et de prévoyance à forme coopérative | | 5202 | General partnership | Société en nom collectif | | 5203 | General partnership | Société en nom collectif coopérative | | 5306 | Limited company | Société en commandite simple | | 5307 | Limited company | Société en commandite simple coopérative | | 5308 | Limited company | Société en commandite par actions | | 5309 | Limited company | Société en commandite par actions coopérative | | 5385 | Limited company | Société d&#39;exercice libéral en commandite par action | | 5410 | Limited Liability Company  | SARL nationale | | 5415 | Limited Liability Company  | SARL d&#39;économie mixte | | 5422 | Limited Liability Company  | SARL immobilière pour le commerce et l&#39;industrie (SICOMI) | | 5426 | Limited Liability Company  | Société immobilière de gestion | | 5430 | Limited Liability Company  | Safer en SARL | | 5431 | Limited Liability Company  | SARL mixte d&#39;intérêt agricole (SIMA) | | 5432 | Limited Liability Company  | SARL d&#39;intérêt collectif agricole (SICA) | | 5442 | Limited Liability Company  | SARL d&#39;attribution | | 5443 | Limited Liability Company  | SARL coopérative de construction | | 5451 | Limited Liability Company  | SARL coopérative de consommation | | 5453 | Limited Liability Company  | SARL coopérative artisanale | | 5454 | Limited Liability Company  | SARL coopérative d&#39;intérêt maritime | | 5455 | Limited Liability Company  | SARL coopérative de transports | | 5458 | Limited Liability Company  | SARL coopérative ouvrière de production et de crédit (SCOP) | | 5459 | Limited Liability Company  | SARL union de sociétés coopératives | | 5460 | Limited Liability Company  | SARL coopérative | | 5485 | Limited Liability Company  | Société d&#39;exercice libéral à responsabilité limitée | | 5498 | Limited Liability Company  | SARL unipersonnelle | | 5499 | Limited Liability Company  | SARL | | 5505 | Limited company | SA à participation ouvrière à conseil d&#39;administration | | 5510 | Limited company | SA nationale à conseil d&#39;administration | | 5515 | Limited company | SA d&#39;économie mixte à conseil d&#39;administration | | 5520 | Limited company | Société d&#39;investissement à capital variable (SICAV) à conseil d&#39;administration | | 5522 | Limited company | Société anonyme immobilière pour le commerce et l&#39;industrie (SICOMI)  à conseil d&#39;administration | | 5525 | Limited company | Société anonyme immobilière d&#39;investissement à conseil d&#39;administration | | 5530 | Limited company | Safer anonyme à conseil d&#39;administration | | 5531 | Limited company | Société anonyme mixte d&#39;intérêt agricole (SMIA) à conseil d&#39;administration | | 5532 | Limited company | Société anonyme mixte d&#39;intérêt collectif agricole (SICA) à conseil d&#39;administration | | 5542 | Limited company | Société anonyme d&#39;attribution à conseil d&#39;administration | | 5543 | Limited company | Société anonyme coopérative de construction à conseil d&#39;administration | | 5546 | Limited company | SA de HLM à conseil d&#39;administration | | 5547 | Limited company | SA coopérative de production de HLM à conseil d&#39;administration | | 5548 | Limited company | SA de crédit immobilier à conseil d&#39;administration | | 5551 | Limited company | SA coopérative de consommation à conseil d&#39;administration | | 5552 | Limited company | SA coopérative de commerçants détaillants à conseil d&#39;administration | | 5553 | Limited company | SA coopérative artisanale à conseil d&#39;administration | | 5554 | Limited company | SA coopérative (d&#39;intérêt) maritime à conseil d&#39;administration | | 5555 | Limited company | SA coopérative de transports à conseil d&#39;administration | | 5558 | Limited company | SCOP à conseil d&#39;administration | | 5559 | Limited company | SA union de sociétés coopératives à conseil d&#39;administration | | 5560 | Limited company | SA coopérative à conseil d&#39;administration | | 5585 | Limited company | Société d&#39;exercice libéral à forme anonyme à conseil d&#39;administration | | 5599 | Limited company | SA à conseil d&#39;administration | | 5605 | Limited company | SA à participation ouvrière à directoire | | 5610 | Limited company | SA nationale à directoire | | 5615 | Limited company | SA d&#39;économie mixte à directoire | | 5620 | Limited company | SICAV | | 5622 | Limited company | SICOMI | | 5625 | Limited company | Société immobilière d&#39;investissement anonyme à directoire | | 5630 | Limited company | Safer anonyme à directoire | | 5631 | Limited company | Société anonyme mixte d&#39;intérêt agricole (SMIA) | | 5632 | Limited company | SICA | | 5642 | Limited company | Société anonyme d&#39;attribution à directoire | | 5643 | Limited company | Société anonyme coopérative de construction à directoire | | 5646 | Limited company | S.A. HLM à directoire | | 5647 | Limited company | Société coopérative de production de HLM anonyme à directoire | | 5648 | Limited company | SA de crédit immobilier à directoire | | 5651 | Limited company | SA coopérative de consommation à directoire | | 5652 | Limited company | SA coopérative de commerçants détaillants à directoire | | 5653 | Limited company | SA coopérative artisanale à directoire | | 5654 | Limited company | SA coopérative (d&#39;intérêt) maritime à directoire | | 5655 | Limited company | SA coopérative de transport à directoire | | 5658 | Limited company | SCOP | | 5659 | Limited company | SA union de sociétés coopératives à directoire | | 5660 | Limited company | SA coopérative à directoire | | 5685 | Limited company | Société d&#39;exercice libéral à forme anonyme à directoire | | 5699 | Limited company | (Autre) SA à directoire | | 5710 | Limited company | SAS | | 5720 | Limited company | SASU | | 5785 | Limited company | Société d&#39;exercice libéral par action simplifiée | | 5800 | Diverse | Société européenne | | 6100 | De facto undivided ownership company | Caisse d&#39;épargne et de prévoyance | | 6210 | Economic Interest Grouping | GEIE | | 6220 | Economic Interest Grouping | GIE | | 6316 | Diverse | CUMA | | 6317 | Diverse | Société coopérative agricole | | 6318 | Diverse | Union de sociétés coopératives agricoles | | 6411 | De facto undivided ownership company | Société d&#39;assurance mutuelle | | 6521 | Civils companies (without SCI) | SCPI | | 6532 | Civils companies (without SCI) | SICA | | 6533 | Civils companies (without SCI) | GAEC | | 6534 | Civils companies (without SCI) | Groupement foncier agricole | | 6535 | Civils companies (without SCI) | Groupement agricole foncier | | 6536 | Civils companies (without SCI) | Groupement forestier | | 6537 | Civils companies (without SCI) | Groupement pastoral | | 6538 | Civils companies (without SCI) | Groupement foncier rural | | 6539 | Civils companies (without SCI) | Société civile foncière | | 6540 | Civils companies | SCI | | 6541 | Civils companies | SCI de construction vente | | 6542 | Civils companies (without SCI) | Société civile d&#39;attribution | | 6543 | Civils companies (without SCI) | Société civile coopérative de construction | | 6544 | Civils companies | Société civile d&#39;accession progressive à la propriété | | 6551 | Civils companies (without SCI) | Société civile coopérative de consommation | | 6554 | Civils companies (without SCI) | Société civile coopérative (d&#39;intérêt) maritime | | 6558 | Civils companies (without SCI) | Société civile coopérative entre médecins | | 6560 | Civils companies (without SCI) | SCP | | 6561 | Civils companies (without SCI) | SCP d&#39;avocats | | 6562 | Civils companies (without SCI) | SCP d&#39;avocats aux conseil | | 6563 | Civils companies (without SCI) | SCP d&#39;avoués d&#39;appel | | 6564 | Civils companies (without SCI) | SCP d&#39;huissiers | | 6565 | Civils companies (without SCI) | SCP de notaires | | 6566 | Civils companies (without SCI) | SCP de commissaires-priseurs | | 6567 | Civils companies (without SCI) | SCP de greffiers de tribunal de commerce | | 6568 | Civils companies (without SCI) | SCP de conseils juridiques | | 6569 | Civils companies (without SCI) | SCP de commissaires aux comptes | | 6571 | Civils companies (without SCI) | SCP de médecins | | 6572 | Civils companies (without SCI) | SCP de dentistes | | 6573 | Civils companies (without SCI) | SCP d&#39;infirmiers | | 6574 | Civils companies (without SCI) | SCP de masseurs kinésithérapeutes | | 6575 | Civils companies (without SCI) | SCP de directeurs de laboratoire d&#39;analyse médicale | | 6576 | Civils companies (without SCI) | SCP de vétérinaires | | 6577 | Civils companies (without SCI) | SCP de géomètres-experts | | 6578 | Civils companies (without SCI) | SCP d&#39;architectes | | 6585 | Civils companies (without SCI) | SCP | | 6588 | Civils companies (without SCI) | Société civile laitière | | 6589 | Civils companies (without SCI) | Société civile de moyens | | 6595 | Civils companies (without SCI) | Caisse (locale) de crédit mutuel | | 6596 | Civils companies (without SCI) | Caisse de crédit agricole mutuel | | 6597 | Civils companies (without SCI) | Société civile d&#39;exploitation agricole | | 6598 | Farm operator  | Exploitation agricole à responsabilité limitée | | 6599 | Civils companies (without SCI) | Autre société civile | | 6901 | Diverse | Autres personnes de droit privé inscrites au registre du commerce et des sociétés | | 7111 | Administrations, Instituions | Autorité constitutionnelle | | 7112 | Administrations, Instituions | Autorité administrative indépendante | | 7113 | Administrations, Instituions | Ministère | | 7120 | Administrations, Instituions | Service central d&#39;un ministère | | 7150 | Administrations, Instituions | Service du ministère de la Défense | | 7160 | Administrations, Instituions | Service déconcentré à compétence nation . D&#39;un ministère (hors Défense) | | 7171 | Administrations, Instituions | Service déconcentré de l&#39;Etat à compétence (inter) régionale | | 7172 | Administrations, Instituions | Service déconcentré de l&#39;Etat à compétence (inter) départementale | | 7179 | Administrations, Instituions | (Autre) Service déconcentré de l&#39;Etat à compétence territoriale | | 7190 | Administrations, Instituions | Ecole nationale non dotée de la personnalité morale | | 7210 | Administrations, Instituions | Commune | | 7220 | Administrations, Instituions | Département | | 7225 | Administrations, Instituions | Territoire d&#39;Outre-Mer | | 7229 | Administrations, Instituions | (Autre) Collectivité territoriale | | 7230 | Administrations, Instituions | Région | | 7312 | Administrations, Instituions | Commune associée | | 7313 | Administrations, Instituions | Section de commune | | 7314 | Administrations, Instituions | Ensemble urbain | | 7321 | Administrations, Instituions | Association syndicale autorisée | | 7322 | Administrations, Instituions | Association foncière urbaine | | 7323 | Administrations, Instituions | Association foncière de remembrement | | 7331 | Administrations, Instituions | Etablissement public local d&#39;enseignement | | 7340 | Administrations, Instituions | Pôle métropolitain | | 7341 | Administrations, Instituions | Secteur de commune | | 7342 | Administrations, Instituions | District urbain | | 7343 | Administrations, Instituions | Communauté urbaine | | 7344 | Administrations, Instituions | Métropole | | 7345 | Administrations, Instituions | Syndicat intercommunal à vocation multiple (SIVOM) | | 7346 | Administrations, Instituions | Communauté de commune | | 7347 | Administrations, Instituions | Communauté de villes | | 7348 | Administrations, Instituions | Communauté d&#39;agglomération | | 7349 | Administrations, Instituions | Autre établissement public local de coopération non spécialisé ou entente | | 7351 | Administrations, Instituions | Institution interdépartementale ou entente | | 7352 | Administrations, Instituions | Institution interrégionale ou entente | | 7353 | Administrations, Instituions | Syndicat intercommunal à vocation unique (SIVU) | | 7354 | Administrations, Instituions | Syndicat mixte communal | | 7355 | Administrations, Instituions | Autre syndicat mixte | | 7356 | Administrations, Instituions | Commission syndicale pour la gestion des biens indivis des communes | | 7361 | Administrations, Instituions | Centre communal d&#39;action sociale | | 7362 | Administrations, Instituions | Caisse des écoles | | 7363 | Administrations, Instituions | Caisse de crédit municipal | | 7364 | Administrations, Instituions | Etablissement d&#39;hospitalisation | | 7365 | Administrations, Instituions | Syndicat inter hospitalier | | 7366 | Administrations, Instituions | Etablissement public local social et médico-social | | 7371 | Administrations, Instituions | Office public d&#39;habitation à loyer modéré (OPHLM) | | 7372 | Administrations, Instituions | Service départemental d&#39;incendie | | 7373 | Administrations, Instituions | Etablissement public local culturel | | 7378 | Administrations, Instituions | Régie d&#39;une collectivité locale à caractère administratif | | 7379 | Administrations, Instituions | (Autre) Etablissement public administratif local | | 7381 | Administrations, Instituions | Organisme consulaire | | 7382 | Administrations, Instituions | Etablissement public national ayant fonction d&#39;administration centrale | | 7383 | Administrations, Instituions | Etablissement public national à caractère scientifique  culturel et professionnel | | 7384 | Administrations, Instituions | Autre établissement public national d&#39;enseignement | | 7385 | Administrations, Instituions | Autre établissement public national administratif à compétence territoriale limitée | | 7389 | Administrations, Instituions | Etablissement public national à caractère administratif | | 7410 | Administrations, Instituions | Groupement d&#39;intérêt public (GIP) | | 7430 | Administrations, Instituions | Etablissement public des cultes d&#39;Alsace-Lorraine | | 7450 | Administrations, Instituions | Etablissement public, cercle et foyer dans les armées | | 7470 | Administrations, Instituions | Groupement de coopération sanitaire à gestion publique | | 7490 | Administrations, Instituions | Autre personne morale de droit administratif | | 8110 | Administrations, Instituions | Régime général de la sécurité sociale | | 8120 | Administrations, Instituions | Régime spécial de sécurité sociale | | 8130 | Administrations, Instituions | Institution de retraite complémentaire | | 8140 | Administrations, Instituions | Mutualité sociale agricole | | 8150 | Administrations, Instituions | Régime maladie des non-salariés non agricoles | | 8160 | Administrations, Instituions | Régime vieillesse ne dépendant pas du régime général de la sécurité sociale | | 8170 | Administrations, Instituions | Régime d&#39;assurance chômage | | 8190 | Administrations, Instituions | Autre régime de prévoyance sociale | | 8210 | De facto undivided ownership company | Mutuelle | | 8250 | De facto undivided ownership company | Assurance mutuelle agricole | | 8290 | De facto undivided ownership company | Autre organisme mutualiste | | 8310 | Association fondation | Comité central d&#39;entreprise | | 8311 | Association fondation | Comité d&#39;établissement | | 8410 | Association fondation | Syndicat de salariés | | 8420 | Association fondation | Syndicat patronal | | 8450 | Association fondation | Ordre professionnel ou assimilé | | 8470 | Association fondation | Centre technique industriel ou comité professionnel du développement économique | | 8490 | Association fondation | Autre organisme professionnel | | 8510 | Administrations, Instituions | Institution de prévoyance | | 8520 | Administrations, Instituions | Institution de retraite supplémentaire | | 9110 | Condominium syndicate | Syndicat de copropriété | | 9150 | Association fondation | Association syndicale libre | | 9210 | Association fondation | Association non déclarée | | 9220 | Association fondation | Association déclarée | | 9221 | Association fondation | Association déclarée \&quot;entreprises d&#39;insertion par l&#39;économique\&quot; | | 9222 | Association fondation | Association intermédiaire | | 9223 | Association fondation | Groupement d&#39;employeurs | | 9224 | Association fondation | Association d&#39;avocats à responsabilité professionnelle individuelle | | 9230 | Association fondation | Association déclarée  reconnue d&#39;utilité publique | | 9240 | Association fondation | Congrégation | | 9260 | Association fondation | Association de droit local | | 9300 | Association fondation | Fondation | | 9900 | Diverse | Autre personne morale de droit privé | | 9970 | Diverse | Groupement de coopération sanitaire à gestion privée |  |  [optional]
**legalShareCapital** | [**BigDecimal**](BigDecimal.md) | Business share capital. |  [optional]
**legalSector** | **String** | Business sector code. NAF code in France |  [optional]
**legalAnnualTurnOver** | [**LegalAnnualTurnOverEnum**](#LegalAnnualTurnOverEnum) | Business annual turnover range in k€.  |  [optional]
**legalNetIncomeRange** | [**LegalNetIncomeRangeEnum**](#LegalNetIncomeRangeEnum) | Business annual netincome in k€.  |  [optional]
**legalNumberOfEmployeeRange** | [**LegalNumberOfEmployeeRangeEnum**](#LegalNumberOfEmployeeRangeEnum) | Business workforce.  |  [optional]
**phone** | **String** | Business phone number. |  [optional]
**email** | **String** | Business generic email. |  [optional]
**address1** | **String** | Business&#39; street |  [optional]
**postcode** | **String** | Business&#39; postal code |  [optional]
**city** | **String** | Business&#39; city |  [optional]
**state** | **String** | Business&#39; province |  [optional]
**country** | **String** | Business&#39; country |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | | Code | Description | | ---- | ----------- | |  D   | Deleted     | |  N   | Company non diffusible (Insee) | |  I   | Inactive (Insee) | |  A   | Economically active | |  C   | Closed | |  T   | Transfered | |  S   | Economically stopped (Insee) | |  L   | Liquidation | |  O   | Dormant company |  |  [optional]
**tradename** | **String** | Business trade name |  [optional]
**users** | [**List&lt;InlineResponse2004Users&gt;**](InlineResponse2004Users.md) |  |  [optional]


<a name="LegalFormEnum"></a>
## Enum: LegalFormEnum
Name | Value
---- | -----
_1000 | &quot;1000&quot;
_1100 | &quot;1100&quot;
_1200 | &quot;1200&quot;
_1300 | &quot;1300&quot;
_1400 | &quot;1400&quot;
_1500 | &quot;1500&quot;
_1600 | &quot;1600&quot;
_1700 | &quot;1700&quot;
_1800 | &quot;1800&quot;
_1900 | &quot;1900&quot;
_2110 | &quot;2110&quot;
_2120 | &quot;2120&quot;
_2210 | &quot;2210&quot;
_2220 | &quot;2220&quot;
_2310 | &quot;2310&quot;
_2320 | &quot;2320&quot;
_2385 | &quot;2385&quot;
_2400 | &quot;2400&quot;
_2700 | &quot;2700&quot;
_2900 | &quot;2900&quot;
_3110 | &quot;3110&quot;
_3120 | &quot;3120&quot;
_3205 | &quot;3205&quot;
_3210 | &quot;3210&quot;
_3220 | &quot;3220&quot;
_3290 | &quot;3290&quot;
_4110 | &quot;4110&quot;
_4120 | &quot;4120&quot;
_4130 | &quot;4130&quot;
_4140 | &quot;4140&quot;
_4150 | &quot;4150&quot;
_4160 | &quot;4160&quot;
_5191 | &quot;5191&quot;
_5192 | &quot;5192&quot;
_5193 | &quot;5193&quot;
_5194 | &quot;5194&quot;
_5195 | &quot;5195&quot;
_5196 | &quot;5196&quot;
_5202 | &quot;5202&quot;
_5203 | &quot;5203&quot;
_5306 | &quot;5306&quot;
_5307 | &quot;5307&quot;
_5308 | &quot;5308&quot;
_5309 | &quot;5309&quot;
_5385 | &quot;5385&quot;
_5410 | &quot;5410&quot;
_5415 | &quot;5415&quot;
_5422 | &quot;5422&quot;
_5426 | &quot;5426&quot;
_5430 | &quot;5430&quot;
_5431 | &quot;5431&quot;
_5432 | &quot;5432&quot;
_5442 | &quot;5442&quot;
_5443 | &quot;5443&quot;
_5451 | &quot;5451&quot;
_5453 | &quot;5453&quot;
_5454 | &quot;5454&quot;
_5455 | &quot;5455&quot;
_5458 | &quot;5458&quot;
_5459 | &quot;5459&quot;
_5460 | &quot;5460&quot;
_5485 | &quot;5485&quot;
_5498 | &quot;5498&quot;
_5499 | &quot;5499&quot;
_5505 | &quot;5505&quot;
_5510 | &quot;5510&quot;
_5515 | &quot;5515&quot;
_5520 | &quot;5520&quot;
_5522 | &quot;5522&quot;
_5525 | &quot;5525&quot;
_5530 | &quot;5530&quot;
_5531 | &quot;5531&quot;
_5532 | &quot;5532&quot;
_5542 | &quot;5542&quot;
_5543 | &quot;5543&quot;
_5546 | &quot;5546&quot;
_5547 | &quot;5547&quot;
_5548 | &quot;5548&quot;
_5551 | &quot;5551&quot;
_5552 | &quot;5552&quot;
_5553 | &quot;5553&quot;
_5554 | &quot;5554&quot;
_5555 | &quot;5555&quot;
_5558 | &quot;5558&quot;
_5559 | &quot;5559&quot;
_5560 | &quot;5560&quot;
_5585 | &quot;5585&quot;
_5599 | &quot;5599&quot;
_5605 | &quot;5605&quot;
_5610 | &quot;5610&quot;
_5615 | &quot;5615&quot;
_5620 | &quot;5620&quot;
_5622 | &quot;5622&quot;
_5625 | &quot;5625&quot;
_5630 | &quot;5630&quot;
_5631 | &quot;5631&quot;
_5632 | &quot;5632&quot;
_5642 | &quot;5642&quot;
_5643 | &quot;5643&quot;
_5646 | &quot;5646&quot;
_5647 | &quot;5647&quot;
_5648 | &quot;5648&quot;
_5651 | &quot;5651&quot;
_5652 | &quot;5652&quot;
_5653 | &quot;5653&quot;
_5654 | &quot;5654&quot;
_5655 | &quot;5655&quot;
_5658 | &quot;5658&quot;
_5659 | &quot;5659&quot;
_5660 | &quot;5660&quot;
_5685 | &quot;5685&quot;
_5699 | &quot;5699&quot;
_5710 | &quot;5710&quot;
_5720 | &quot;5720&quot;
_5785 | &quot;5785&quot;
_5800 | &quot;5800&quot;
_6100 | &quot;6100&quot;
_6210 | &quot;6210&quot;
_6220 | &quot;6220&quot;
_6316 | &quot;6316&quot;
_6317 | &quot;6317&quot;
_6318 | &quot;6318&quot;
_6411 | &quot;6411&quot;
_6521 | &quot;6521&quot;
_6532 | &quot;6532&quot;
_6533 | &quot;6533&quot;
_6534 | &quot;6534&quot;
_6535 | &quot;6535&quot;
_6536 | &quot;6536&quot;
_6537 | &quot;6537&quot;
_6538 | &quot;6538&quot;
_6539 | &quot;6539&quot;
_6540 | &quot;6540&quot;
_6541 | &quot;6541&quot;
_6542 | &quot;6542&quot;
_6543 | &quot;6543&quot;
_6544 | &quot;6544&quot;
_6551 | &quot;6551&quot;
_6554 | &quot;6554&quot;
_6558 | &quot;6558&quot;
_6560 | &quot;6560&quot;
_6561 | &quot;6561&quot;
_6562 | &quot;6562&quot;
_6563 | &quot;6563&quot;
_6564 | &quot;6564&quot;
_6565 | &quot;6565&quot;
_6566 | &quot;6566&quot;
_6567 | &quot;6567&quot;
_6568 | &quot;6568&quot;
_6569 | &quot;6569&quot;
_6571 | &quot;6571&quot;
_6572 | &quot;6572&quot;
_6573 | &quot;6573&quot;
_6574 | &quot;6574&quot;
_6575 | &quot;6575&quot;
_6576 | &quot;6576&quot;
_6577 | &quot;6577&quot;
_6578 | &quot;6578&quot;
_6585 | &quot;6585&quot;
_6588 | &quot;6588&quot;
_6589 | &quot;6589&quot;
_6595 | &quot;6595&quot;
_6596 | &quot;6596&quot;
_6597 | &quot;6597&quot;
_6598 | &quot;6598&quot;
_6599 | &quot;6599&quot;
_6901 | &quot;6901&quot;
_7111 | &quot;7111&quot;
_7112 | &quot;7112&quot;
_7113 | &quot;7113&quot;
_7120 | &quot;7120&quot;
_7150 | &quot;7150&quot;
_7160 | &quot;7160&quot;
_7171 | &quot;7171&quot;
_7172 | &quot;7172&quot;
_7179 | &quot;7179&quot;
_7190 | &quot;7190&quot;
_7210 | &quot;7210&quot;
_7220 | &quot;7220&quot;
_7225 | &quot;7225&quot;
_7229 | &quot;7229&quot;
_7230 | &quot;7230&quot;
_7312 | &quot;7312&quot;
_7313 | &quot;7313&quot;
_7314 | &quot;7314&quot;
_7321 | &quot;7321&quot;
_7322 | &quot;7322&quot;
_7323 | &quot;7323&quot;
_7331 | &quot;7331&quot;
_7340 | &quot;7340&quot;
_7341 | &quot;7341&quot;
_7342 | &quot;7342&quot;
_7343 | &quot;7343&quot;
_7344 | &quot;7344&quot;
_7345 | &quot;7345&quot;
_7346 | &quot;7346&quot;
_7347 | &quot;7347&quot;
_7348 | &quot;7348&quot;
_7349 | &quot;7349&quot;
_7351 | &quot;7351&quot;
_7352 | &quot;7352&quot;
_7353 | &quot;7353&quot;
_7354 | &quot;7354&quot;
_7355 | &quot;7355&quot;
_7356 | &quot;7356&quot;
_7361 | &quot;7361&quot;
_7362 | &quot;7362&quot;
_7363 | &quot;7363&quot;
_7364 | &quot;7364&quot;
_7365 | &quot;7365&quot;
_7366 | &quot;7366&quot;
_7371 | &quot;7371&quot;
_7372 | &quot;7372&quot;
_7373 | &quot;7373&quot;
_7378 | &quot;7378&quot;
_7379 | &quot;7379&quot;
_7381 | &quot;7381&quot;
_7382 | &quot;7382&quot;
_7383 | &quot;7383&quot;
_7384 | &quot;7384&quot;
_7385 | &quot;7385&quot;
_7389 | &quot;7389&quot;
_7410 | &quot;7410&quot;
_7430 | &quot;7430&quot;
_7450 | &quot;7450&quot;
_7470 | &quot;7470&quot;
_7490 | &quot;7490&quot;
_8110 | &quot;8110&quot;
_8120 | &quot;8120&quot;
_8130 | &quot;8130&quot;
_8140 | &quot;8140&quot;
_8150 | &quot;8150&quot;
_8160 | &quot;8160&quot;
_8170 | &quot;8170&quot;
_8190 | &quot;8190&quot;
_8210 | &quot;8210&quot;
_8250 | &quot;8250&quot;
_8290 | &quot;8290&quot;
_8310 | &quot;8310&quot;
_8311 | &quot;8311&quot;
_8410 | &quot;8410&quot;
_8420 | &quot;8420&quot;
_8450 | &quot;8450&quot;
_8470 | &quot;8470&quot;
_8490 | &quot;8490&quot;
_8510 | &quot;8510&quot;
_8520 | &quot;8520&quot;
_9110 | &quot;9110&quot;
_9150 | &quot;9150&quot;
_9210 | &quot;9210&quot;
_9220 | &quot;9220&quot;
_9221 | &quot;9221&quot;
_9222 | &quot;9222&quot;
_9223 | &quot;9223&quot;
_9224 | &quot;9224&quot;
_9230 | &quot;9230&quot;
_9240 | &quot;9240&quot;
_9260 | &quot;9260&quot;
_9300 | &quot;9300&quot;
_9900 | &quot;9900&quot;
_9970 | &quot;9970&quot;


<a name="LegalAnnualTurnOverEnum"></a>
## Enum: LegalAnnualTurnOverEnum
Name | Value
---- | -----
EMPTY | &quot;&quot;
_0_39 | &quot;0-39&quot;
_40_99 | &quot;40-99&quot;
_100_249 | &quot;100-249&quot;
_250_999 | &quot;250-999&quot;
_1000_2999 | &quot;1000-2999&quot;
_3000_9999 | &quot;3000-9999&quot;
_10000_99999 | &quot;10000-99999&quot;
_100000_ | &quot;100000-*&quot;


<a name="LegalNetIncomeRangeEnum"></a>
## Enum: LegalNetIncomeRangeEnum
Name | Value
---- | -----
EMPTY | &quot;&quot;
_0_4 | &quot;0-4&quot;
_5_9 | &quot;5-9&quot;
_10_49 | &quot;10-49&quot;
_50_149 | &quot;50-149&quot;
_150_499 | &quot;150-499&quot;
_500_ | &quot;500-*&quot;


<a name="LegalNumberOfEmployeeRangeEnum"></a>
## Enum: LegalNumberOfEmployeeRangeEnum
Name | Value
---- | -----
EMPTY | &quot;&quot;
_0 | &quot;0&quot;
_1_9 | &quot;1-9&quot;
_10_99 | &quot;10-99&quot;
_100_249 | &quot;100-249&quot;
_250_ | &quot;250-*&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
D | &quot;D&quot;
N | &quot;N&quot;
I | &quot;I&quot;
A | &quot;A&quot;
C | &quot;C&quot;
T | &quot;T&quot;
S | &quot;S&quot;
L | &quot;L&quot;
O | &quot;O&quot;



