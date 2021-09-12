USE personal_projects_db;

-- CREATE TABLE eventstable(
-- eventid VARCHAR(10) PRIMARY KEY,
-- eventcategory VARCHAR(40)
-- );

INSERT INTO eventstable (eventid, eventcategory)
VALUES ('fri1600', 'Gaming');

INSERT INTO eventstable (eventid, eventcategory)
VALUES ('mon1400', 'Poetry writing and recitation');

INSERT INTO eventstable (eventid, eventcategory)
VALUES ('tue1500', 'Story Writing');

INSERT INTO eventstable (eventid, eventcategory)
VALUES ('fri1400', 'Short Film Making');

SELECT * FROM eventstable;