-- CREATE DATABASE personal_projects_db;

USE personal_projects_db;

CREATE TABLE eventstable (
                             eventid VARCHAR(10) PRIMARY KEY,
                             eventcategory VARCHAR(40),
                             eventname VARCHAR(40),
                             eventdesc VARCHAR(100),
                             eventdate DATE,
                             eventtime TIME,
                             eventvenue VARCHAR(20),
                             eventorganiser VARCHAR(20),
                             eventorganisercontact VARCHAR(10)
);

INSERT INTO eventstable (eventid, eventcategory,eventname,eventdesc,eventdate,eventtime,eventvenue,eventorganiser,eventorganisercontact)
VALUES ('fri1600', 'Gaming', 'game with me', 'A gaming Competition', '2020-11-13', '12:00', 'Clubhouse','Darshil Dutta', '9595995852');

INSERT INTO eventstable (eventid, eventcategory, eventname, eventdesc, eventdate, eventtime, eventvenue, eventorganiser, eventorganisercontact)
VALUES ('mon1400', 'Poetry writing and recitation','Write a poem', 'A poetry Competition', '2020-11-14', '03:00','Clubhouse', 'Rimjhim Dutta', '9595995852');

INSERT INTO eventstable (eventid, eventcategory,eventname,eventdesc,eventdate, eventtime,eventvenue,eventorganiser,eventorganisercontact)
VALUES ('tue1500', 'Story Writing','Write a story', 'A story writing Competition', '2020-11-15', '06:00','Clubhouse','Sanjeev Dutta', '9595995852');

INSERT INTO eventstable (eventid, eventcategory, eventname, eventdesc, eventdate, eventtime, eventvenue, eventorganiser, eventorganisercontact)
VALUES ('fri1400', 'Short Film Making','Filmmaking', 'A shortfilm making Competition', '2020-11-16', '08:00','Clubhouse','Piyali Dutta', '9595995852');

SELECT
    *
FROM
    eventstable;


-- DROP TABLE eventstable;