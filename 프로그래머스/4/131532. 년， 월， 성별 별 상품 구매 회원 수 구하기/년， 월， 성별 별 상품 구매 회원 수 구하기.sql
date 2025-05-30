SELECT  TO_NUMBER(TO_CHAR(SALES_DATE, 'YYYY'))YEAR, TO_NUMBER(TO_CHAR(SALES_DATE, 'MM'))MONTH, GENDER, COUNT(DISTINCT u.USER_ID )USERS
FROM USER_INFO u
JOIN ONLINE_SALE o ON u.USER_ID = o.USER_ID
WHERE GENDER IS NOT NULL
GROUP BY TO_CHAR(SALES_DATE, 'YYYY'), TO_CHAR(SALES_DATE, 'MM'), GENDER
ORDER BY YEAR, MONTH, GENDER;