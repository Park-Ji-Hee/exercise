SELECT c.CAR_ID
FROM CAR_RENTAL_COMPANY_CAR c
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY h ON c.CAR_ID = h.CAR_ID 
WHERE CAR_TYPE = '세단' AND TO_CHAR(START_DATE, 'MM') = '10'
GROUP BY c.CAR_ID
ORDER BY c.CAR_ID DESC;