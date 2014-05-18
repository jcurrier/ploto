DELIMITER //

#DECLARE TBL_CHK TINYINT DEFAULT 0;

CREATE PROCEDURE CreateJobTable()
BEGIN
	CREATE TABLE Job (
		id INT UNSIGNED PRIMARY KEY
	); 
END

CREATE PROCEDURE ModifyJobTable()
BEGIN
	CREATE TABLE Job2 (
		id INT UNSIGNED PRIMARY KEY
	);
END

SET @TBL_CHK = SELECT count('id')
               FROM information_schema.tables
               WHERE table_schema='plotodb' AND table_name = 'test';

IF @TBL_CHK <> 0 THEN
    PRINT 'TABLE EXISTS';
ELSE IF THEN
    CALL CreateJobTable();
END IF


DELIMITER ;
