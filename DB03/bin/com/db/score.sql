DROP TABLE SCORE;
CTEATE TABLE(
	S_NAME PRIMARY KEY,
	S_KOR NUMBER NOT NULL,
	S_ENG NUMBER NOT NULL,
	S_MATH NUMBER NOT NULL,
	S_SUM NUMBER,
	S_AVG NUMBER,
	S_GRADE VARCHAR2(2) CHECK (S_GREDE IN('A','B','C','D','E','F'))
);



INSERT INTO SCORE
VLAUES('LEE',100, 100, 100, 300, 100.0, 'A');

SELECT S_NAME, S_KOR, S_ENG, S_MATH, S_SUM, S_AVG, S_GRADE
FROM SCORE
ORDER BY S_AVG DESC;
