------------------- fcy_type_for_map -----------------------
INSERT into fcy_type_for_map (id, type_name)  values (1, 'type contract');
INSERT into fcy_type_for_map (id, type_name)  values (2, 'category contract');
INSERT into fcy_type_for_map (id, type_name)  values (3, 'commission contract');
INSERT into fcy_type_for_map (id, type_name)  values (4, 'contract');
INSERT into fcy_type_for_map (id, type_name)  values (5, 'payment terms');
INSERT into fcy_type_for_map (id, type_name)  values (6, 'terms of recalculation');
INSERT INTO fcy_type_for_map (id, type_name) VALUES (7, 'contract status');

------------------- fcy_map --------------------------------
INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (1, 1, 'Імпортний', 1);
INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (2, 2, 'Експортний', 1);
INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (3, 3, 'Імпортно-експортний', 1);

INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (4, 1, 'ЗЕД', 2);
INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (5, 2, 'Кредит від нерезидента', 2);
INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (6, 3, 'Протокол', 2);
INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (7, 4, 'Капітальнй', 2);

INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id, default_value) VALUES (8, 1, 'Так', 3, 0);
INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id, default_value) VALUES (9, 2, 'Ні', 3, 1);

INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id, default_value) VALUES (10, 1, 'Новий договір', 4, 1);
INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id, default_value) VALUES (11, 2, 'Передача договору  з іншого банку', 4, 1);
INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id, default_value) VALUES (12, 3, 'Додаткова угода', 4, 0);

INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (13, 1, 'По факту', 5);
INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (14, 2, 'Передоплата', 5);
INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (15, 3, 'Змішанний', 5);

INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (16, 1, 'Фіксований курс', 6);
INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (17, 2, 'Курс НБУ', 6);

INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (19, 1, 'Draft', 7);
INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (20, 2, 'Active', 7);
INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (21, 3, 'Inactive', 7);
INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (22, 4, 'Deleted', 7);
INSERT INTO fcy_map (id, sub_type, sub_type_name, type_id) VALUES (23, 5, 'Completed', 7);

------------------- client_cmd ------------------------------

------------------- client------------------------------
INSERT INTO client (address, address_lat, address_russ, contact_person_fio, contact_person_phone, edrpou, client_name, name_lat, name_russ, passport_data, resident, risk_level) VALUES ('м.Бiла Церква, вул.Некрасова 46 кв.15', null, null, 'Глав.бух. Степаненко', '+380991112233', '00333893', 'ПРИВАТНЕ АКЦІОНЕРНЕ ТОВАРИСТВО "ВЕТРО"', 'LTD PLATAN SYSTEM TRADE Ukraine', 'ФЛП Гусько Иван Федорович', '001563589', 'Резидент', '3 Середній');
INSERT INTO client (address, address_lat, address_russ, contact_person_fio, contact_person_phone, edrpou, client_name, name_lat, name_russ, passport_data, resident, risk_level) VALUES ('UKR, СМТ Гостомель ПЛ. Рекунова/буд. 2 р-н Ірпінь', 'UKR, Village town of Gostomel, Rekunova Square,  2,  Irpin city', null, 'Іванов Іван Іванович', '+380991112233', '00333888', 'ПРИВАТНЕ АКЦІОНЕРНЕ ТОВАРИСТВО "ВЕТРО"', null, null, 'СН 562358', 'Резидент', '2 Низький');
INSERT INTO client (address, address_lat, address_russ, contact_person_fio, contact_person_phone, edrpou, client_name, name_lat, name_russ, passport_data, resident, risk_level) VALUES ('02095, UKR , м. Київ, вул. Кібальчича/21, кв. 131', null, '02095, Украина, г. Киев, ул. Кибальчича/21, кв. 131', null, '+3809611472533', '2426845123', 'ПРИВАТНЕ АКЦІОНЕРНЕ ТОВАРИСТВО "ПЛАСКЕ"', null, 'ФЛП Петровський Петр Геннадиевич', 'СН 562358', 'Резидент', '2 Низький');
INSERT INTO client (address, address_lat, address_russ, contact_person_fio, contact_person_phone, edrpou, client_name, name_lat, name_russ, passport_data, resident, risk_level) VALUES ('86156  Донецька обл,  м. Макiївка м-н Зелений', 'UKR, Village town of Gostomel, Rekunova Square,  2,  Irpin city', '86156  Донецькая обл,  г. Макеевка м-н Зеленый', null, null, '2596846823', 'ПРИВАТНЕ АКЦІОНЕРНЕ ТОВАРИСТВО "ВЕТРО"', null, null, '001563589', 'Резидент', '2 Низький');
INSERT INTO client (address, address_lat, address_russ, contact_person_fio, contact_person_phone, edrpou, client_name, name_lat, name_russ, passport_data, resident, risk_level) VALUES ('71100   UKR, М. БЕРДЯНСЬК ВУЛ. МЕЛІТОПОЛЬСЬКЕ ШОСЕ/буд. 84   /1 ОБЛАСТЬ ЗАПОРІЗЬКА', null, null, null, null, '00333891', 'ФОП Гусько Іван Федорович', null, null, '001563589', 'Резидент', '1 Високий');
INSERT INTO client (address, address_lat, address_russ, contact_person_fio, contact_person_phone, edrpou, client_name, name_lat, name_russ, passport_data, resident, risk_level) VALUES (' UKR, М. Калуш ВУЛ. СІВЕЦЬКА/буд. 6 КВ. 33 ОБЛАСТЬ  ІВАНО-ФРАНКІВСЬКА ', null, null, 'Ганна Іванівна', '+380991112233', '00333897', '"ПОЛІПЛАСТ" ПРИВАТНЕ АКЦІОНЕРНЕ ТОВАРИСТВО', 'PRIVATE JOINT STOCK COMPANY "PLASKE"', null, 'СН 562358', 'Резидент', '4 Неприйнятно високий');
INSERT INTO client (address, address_lat, address_russ, contact_person_fio, contact_person_phone, edrpou, client_name, name_lat, name_russ, passport_data, resident, risk_level) VALUES ('UKR, М. КИЇВ ВУЛ. ВОЛОДИМИРСЬКА/буд. 61/11 ОФ.43', 'UKR, KYIV City, VLADIMIRSKI street, 61/11, office 43', null, 'Cідоренко', '+380991112233', '32845689', 'ФОП Петровський Петро Геннадійович', 'PRIVATE JOINT STOCK COMPANY "VETRO"', null, 'СН 562358', 'Резидент', '3 Середній');
INSERT INTO client (address, address_lat, address_russ, contact_person_fio, contact_person_phone, edrpou, client_name, name_lat, name_russ, passport_data, resident, risk_level) VALUES ('г.Антрацит,ул.Петровского,22', 'Antratsit city, Petrovskogo street, 22', null, 'Хотянів І.Б.', '+380991112233', '00333895', '"АДВОКАТСЬКА ФІРМА"БІЗНЕС"', 'Gusko Ivan Fedorovich', null, '001563589', 'Резидент', '3 Середній');
INSERT INTO client (address, address_lat, address_russ, contact_person_fio, contact_person_phone, edrpou, client_name, name_lat, name_russ, passport_data, resident, risk_level) VALUES ('36028, UKR, Полтава вул. Великотирнівська/буд. 1 обл. Полтавська', '86156, Makiyivka city, md Zeleny', '36028, Украина, г. Полтава, ул. Большеторновская/1', 'директор Івасько', '+380991112233', '00333892', 'ТОВ ПЛАТАН СІСТЕМ ТРЕЙД Україна', null, null, '001563589', 'Резидент', '2 Низький');
INSERT INTO client (address, address_lat, address_russ, contact_person_fio, contact_person_phone, edrpou, client_name, name_lat, name_russ, passport_data, resident, risk_level) VALUES ('61046 UKR, М. ХАРКІВ ПРОСП. МОСКОВСЬКИЙ/буд. 273 ОФ.3/5  ОБЛАСТЬ ХАРКІВСЬКА ', null, null, 'Стеценко А.Г.', '+380991112233', '00333896', '"ЛІСО-ДАР" ПРИВАТНЕ ПІДПРИЕМСТВО', null, 'Частное Акционерное Общество "ПЛАСКЕ"', 'СН 562358', 'Резидент', '2 Низький');


-------------------- counterparty-----------------------------
INSERT INTO counterparty (address, country_k040, name, tax_code, country_k030) VALUES ('463-808 Rep. of Korea, Gyeonggi-do, Seongnam-si, Bundang-gu, Dolma-ro, Gumi-Dong, 46, KwangChon Plaza 422-28', '410', 'DURAMARIN', null, 'Резидент');
INSERT INTO counterparty (address, country_k040, name, tax_code, country_k030) VALUES ('226016,МИНСКАЯ ОБЛ.,МИНСК.Р-Н,НОВОДВОРСКИЙ СЕЛЬСОВЕТ,АГРОГОРОДОК НОВЫЙ ДВОР,УЛ.ПАРКОВАЯ,Д.8,АДМИН.ЗДАНИЕ,КАБ.№4', '112', 'КОММУН.УНИТАР.ПРЕД."МИНОБЛМЯСОМОЛПРОМ"- УПРАВ.КОМПАНИЯ ХОЛДИНГА "МЯСОМОЛПРОМ"', '278956383', 'Резидент');
INSERT INTO counterparty (address, country_k040, name, tax_code, country_k030) VALUES ('Deutschland .20095,Hamburg.Schopenstehl 20', '276', 'KATEX Warenhandel GmbH', null, 'Резидент');
INSERT INTO counterparty (address, country_k040, name, tax_code, country_k030) VALUES ('Via Banchina Dell`Azoto.15 300175 Vnice.Italy.', '380', 'ILTA ALIMENTARE SPA', '1576561321guftgn', 'Резидент');
INSERT INTO counterparty (address, country_k040, name, tax_code, country_k030) VALUES ('ул. С. Шимкаус 13, LT-92126 Клайпеда', '440', 'ЗАО "Балтийос первежимай"', null, 'Резидент');
INSERT INTO counterparty (address, country_k040, name, tax_code, country_k030) VALUES ('675 44th Street, MARION IA 52302, USA', '840', 'FREUND-VECTOR CORPORATION', null, 'Резидент');

-------------------- bank-------------------------------------
INSERT INTO bank (address, clearing_code, country_k040, name, swift_code) VALUES ('ALGIERS, HOTEL EL-AURASSI BOULEVARD FRANTZ FANON', null, '012', 'CITIBANK N.A. ALGERIA', 'CITIDZAL');
INSERT INTO bank (address, clearing_code, country_k040, name, swift_code) VALUES ('BRUSSELS, CHAUSSEE DE LA HULPE 166', null, '056', 'CREDIT AGRICOLE CIB BELGIUM', 'CRLYBEBB');
INSERT INTO bank (address, clearing_code, country_k040, name, swift_code) VALUES ('WIESBADEN, KARL-BOSCH-STRASSE 10A', 'BL59413765', '276', 'Nassauische Sparkasse', 'NASSDE55');
INSERT INTO bank (address, clearing_code, country_k040, name, swift_code) VALUES ('TOKYO, MARUNOUCHI TRUST TOWER MAIN 1-8-3 MARUNOUCHI', null, '392', 'THE BANK OF NEW YORK MELLON, TOKYO BRANCH', 'IRVTJPJX');
INSERT INTO bank (address, clearing_code, country_k040, name, swift_code) VALUES ('LINYI, 37 BEIJING ROAD', null, '156', 'LINSHANG BANK CO. LTD (FORMERLY LINYI CITY COMMERCIAL BANK C', 'LYCBCNBL');
INSERT INTO bank (address, clearing_code, country_k040, name, swift_code) VALUES ('BUCHAREST, BULEVARDUL TIMISOARA 26Z', null, '642', 'CREDIT EUROPE BANK (ROMANIA) S.A.', 'FNNBROBU');
INSERT INTO bank (address, clearing_code, country_k040, name, swift_code) VALUES ('TEL-AVIV, PLATINUM BUILDING 21 HARBAAH STREET', null, '376', 'CITIBANK N.A.', 'CITIILIT');
INSERT INTO bank (address, clearing_code, country_k040, name, swift_code) VALUES ('NICOSIA (LEFKOSIA), HEAD OFFICE CORNER LIMASSOL AVE.', null, '196', 'HELLENIC BANK PUBLIC COMPANY LTD.', 'HEBACY2N');
INSERT INTO bank (address, clearing_code, country_k040, name, swift_code) VALUES ('GENEVA, RUE DU RHONE 8', null, '756', 'SOCIETE GENERALE PRIVATE BANKING (SUISSE) SA', 'RUEGCHZZ');
INSERT INTO bank (address, clearing_code, country_k040, name, swift_code) VALUES ('HONG KONG, 161 QUEEN''S ROAD CENTRAL', 'HK156', '344', 'OCBC WING HANG BANK LIMITED', 'WIHBHKHH');
INSERT INTO bank (address, clearing_code, country_k040, name, swift_code) VALUES ('MOSCOW, KVARTAL 2 MIKRORAJON, LYTKARINO 13, 5', 'RU862597634', '643', 'JOINT-STOCK COMMERCIAL BANK AGROPROMCREDIT', 'AGCORUMM');
INSERT INTO bank (address, clearing_code, country_k040, name, swift_code) VALUES ('FRANKFURT AM MAIN, RUESTERSTRASSE 7-9', null, '276', 'VTB Bank (Deutschland) AG', 'OWHBDEFF');

------------------- payment_details---------------------------
INSERT INTO payment_details (bank_id, counter_party_iban, correspondent_account) VALUES (3, 'DE89370400440532013000', null);
INSERT INTO payment_details (bank_id, counter_party_iban, correspondent_account) VALUES (8, 'CY17002001280000001200527600', '104229398');
INSERT INTO payment_details (bank_id, counter_party_iban, correspondent_account) VALUES (2, 'BE68539007547034', null);

INSERT INTO association_bank (fk_payment_details, fk_bank) VALUES (2, 12);


