INSERT INTO global_configs (id, name, description)
VALUES ('52f01cbf-d77c-4ee2-8130-026753d92aab', 'base', 'Configuracion base para una empresa en El Salvador');

INSERT INTO companies (company_id, trade_name, email, address, phone_number)
VALUES ('97b33f1f-9874-43d4-893f-2a7f34e7eb41', 'NIRA de El Salvador', 'nira@nira.com.sv', 'Calle 1, #1, San Salvador',
        '+(503) 22222222');

INSERT INTO company_global_configs (company_id, global_config_id)
VALUES ('97b33f1f-9874-43d4-893f-2a7f34e7eb41', '52f01cbf-d77c-4ee2-8130-026753d92aab');

INSERT INTO countries (country_id, global_config_id, country_code, country_name, active)
VALUES ('f64f2d7f-f871-4e8b-8cb1-223655d277bf', '52f01cbf-d77c-4ee2-8130-026753d92aab', '9300', 'EL SALVADOR', true);

INSERT INTO states (state_id, country_id, state_code, state_name, active)
VALUES ('1dfff669-8a74-401d-9a3a-09f80bc0f3d2', 'f64f2d7f-f871-4e8b-8cb1-223655d277bf', '00', 'OTRO PAIS', true);
INSERT INTO states (state_id, country_id, state_code, state_name, active)
VALUES ('4abe02f2-b8a5-4e96-a165-fec1f4efa3a7', 'f64f2d7f-f871-4e8b-8cb1-223655d277bf', '01', 'AHUACHAPÁN', true);
INSERT INTO states (state_id, country_id, state_code, state_name, active)
VALUES ('4938f878-3ae3-429e-ada1-9c04b4124de8', 'f64f2d7f-f871-4e8b-8cb1-223655d277bf', '02', 'SANTA ANA', true);
INSERT INTO states (state_id, country_id, state_code, state_name, active)
VALUES ('a333a0f9-05ba-4a11-adee-20df7665984c', 'f64f2d7f-f871-4e8b-8cb1-223655d277bf', '03', 'SONSONATE', true);
INSERT INTO states (state_id, country_id, state_code, state_name, active)
VALUES ('cfe96c36-2687-4e36-877b-7483c71eeadb', 'f64f2d7f-f871-4e8b-8cb1-223655d277bf', '04', 'CHALATENANGO', true);
INSERT INTO states (state_id, country_id, state_code, state_name, active)
VALUES ('1fe3766d-a5d9-4fbd-affa-73393071285c', 'f64f2d7f-f871-4e8b-8cb1-223655d277bf', '05', 'LA LIBERTAD', true);
INSERT INTO states (state_id, country_id, state_code, state_name, active)
VALUES ('0463b173-a0cc-4ccd-8b90-e24ac83b59c3', 'f64f2d7f-f871-4e8b-8cb1-223655d277bf', '06', 'SAN SALVADOR', true);
INSERT INTO states (state_id, country_id, state_code, state_name, active)
VALUES ('18746a8a-1eaa-41c0-a65d-fecdce942c43', 'f64f2d7f-f871-4e8b-8cb1-223655d277bf', '07', 'CUSCATLÁN', true);
INSERT INTO states (state_id, country_id, state_code, state_name, active)
VALUES ('e5c3f519-5cc1-4c28-8ea2-f5bb408613fe', 'f64f2d7f-f871-4e8b-8cb1-223655d277bf', '08', 'LA PAZ', true);
INSERT INTO states (state_id, country_id, state_code, state_name, active)
VALUES ('106667b6-ddde-4517-9302-7712368ccaa8', 'f64f2d7f-f871-4e8b-8cb1-223655d277bf', '09', 'CABAÑAS', true);
INSERT INTO states (state_id, country_id, state_code, state_name, active)
VALUES ('86039eaa-1712-42cf-91b1-75f40dd24e47', 'f64f2d7f-f871-4e8b-8cb1-223655d277bf', '10', 'SAN VICENTE', true);
INSERT INTO states (state_id, country_id, state_code, state_name, active)
VALUES ('1583eb36-618c-4923-93ec-5282911e484d', 'f64f2d7f-f871-4e8b-8cb1-223655d277bf', '11', 'USULUTÁN', true);
INSERT INTO states (state_id, country_id, state_code, state_name, active)
VALUES ('e8b93322-2b2a-4502-9a93-99dda1593a6e', 'f64f2d7f-f871-4e8b-8cb1-223655d277bf', '12', 'SAN MIGUEL', true);
INSERT INTO states (state_id, country_id, state_code, state_name, active)
VALUES ('ea6e6ed6-ef2b-4f4a-8feb-c0dd27e70e4c', 'f64f2d7f-f871-4e8b-8cb1-223655d277bf', '13', 'MORAZÁN', true);
INSERT INTO states (state_id, country_id, state_code, state_name, active)
VALUES ('4eab519e-7b3d-4f1c-999d-e1689ddad90b', 'f64f2d7f-f871-4e8b-8cb1-223655d277bf', '14', 'LA UNIÓN', true);

INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('9cd911b0-4ed8-47da-86e6-64242ce11b75', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '01', 'AGUILARES', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('09cee124-7c21-4eb6-a80f-a410a32ea4d3', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '02', 'APOPA', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('ae59822e-23c5-4da6-bb38-dcb01ae0ae60', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '03', 'AYUTUXTEPEQUE', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('b9fe926a-fcbf-4d34-a95f-8533cad52670', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '04', 'CUSCATANCINGO', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('1395b1ec-e219-4fd1-b035-66d44efcf799', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '05', 'EL PAISNAL', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('c66a8acb-c404-4ba4-a0c3-b87aae2edc98', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '06', 'GUAZAPA', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('bd33ed7b-71c4-4e9b-9136-27b2d26fdee3', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '07', 'ILOPANGO', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('9e76759d-df27-4eb3-b5f3-4de8894d86c4', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '08', 'MEJICANOS', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('2a988c9d-7186-4188-9aa9-2d4981b8f610', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '09', 'NEJAPA', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('65151d75-b26f-4223-8590-c5231b110b7e', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '10', 'PANCHIMALCO', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('559aa17b-ded1-412e-af4d-41936ecc3aa2', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '11', 'ROSARIO DE MORA', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('0ae99f0b-a0b2-4da4-8177-0392b008ccb3', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '12', 'SAN MARCOS', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('9e5d6581-4c41-4081-8fe4-e65e181d52b3', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '13', 'SAN MARTIN', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('f02fabab-a4c3-4e61-b947-83f437a06709', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '14', 'SAN SALVADOR', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('f237306c-e126-45b5-bfb4-7cf9e28bc25f', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '15', 'STG TEXACUANGOS', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('c95c6e8f-eee2-4238-9c0e-0c40bbdc7dd4', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '16', 'SANTO TOMAS', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('08ed2f2e-904a-4872-8d0b-be1548c2a05f', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '17', 'SOYAPANGO', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('8066fa2a-caa7-4ca4-989c-fcec8bba29a2', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '18', 'TONACATEPEQUE', true);
INSERT INTO cities (city_id, state_id, city_code, city_name, active)
VALUES ('67a581ce-ad28-4354-a800-2303d017ab7c', '0463b173-a0cc-4ccd-8b90-e24ac83b59c3', '19', 'CIUDAD DELGADO', true);
