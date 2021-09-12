USE personal_projects_db;

-- CREATE TABLE collegestudenttable(
-- studentid VARCHAR(5) PRIMARY KEY,
-- studentbatch VARCHAR(20),
-- studentcontact VARCHAR(20),
-- studentfullname VARCHAR(20)
-- );

INSERT INTO collegestudenttable (studentid, studentbatch, studentcontact, studentfullname)
VALUES ('00010', '2019', '1234567890', 'Rashmika Mandanna');

INSERT INTO collegestudenttable (studentid, studentbatch, studentcontact, studentfullname)
VALUES ('00011', '2019', '1234567890', 'Sid Sriram');

INSERT INTO collegestudenttable (studentid, studentbatch, studentcontact, studentfullname)
VALUES ('00012', '2019', '1234567890', 'Allu Arjun');

INSERT INTO collegestudenttable (studentid, studentbatch, studentcontact, studentfullname)
VALUES ('00013', '2018', '1234567890', 'Manoj Vajpayee');

INSERT INTO collegestudenttable (studentid, studentbatch, studentcontact, studentfullname)
VALUES ('00014', '2017', '1234567890', 'Pankaj Tripathi');

SELECT * FROM collegestudenttable;