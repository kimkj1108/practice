DROP SEQUENCE HOMESEQ;
DROP TABLE HOME;

CREATE SEQUENCE HOMESEQ;

--회원가입
--번호, 이름, 직업
CREATE TABLE HOME(
H_NUM NUMBER PRIMARY KEY,
H_NAME VARCHAR2(50) NOT NULL,
H_JOB VARCHAR2(100) NOT NULL
);

INSERT INTO HOME
VALUES (HOMESEQ.NEXTVAL, '김똥구', '모름');

INSERT INTO HOME
VALUES (HOMESEQ.NEXTVAL, '박우공', '왕');

SELECT H_NUM, H_NAME, H_JOB
FROM HOME
ORDER BY H_NUM DESC;