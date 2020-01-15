BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "bankAcc" (
	"Username"	TEXT,
	"Password"	TEXT,
	"Name"	TEXT
);
INSERT INTO "bankAcc" VALUES ('eappen1456','rainbowstar56','Alan Eappen');
INSERT INTO "bankAcc" VALUES ('jacob234','horse456','Jacob Donte');
INSERT INTO "bankAcc" VALUES ('samfore345','duskstar90','Samfore Luis');
COMMIT;
