SELECT P.PRODUCT_CODE, SUM(P.PRICE * OS.SALES_AMOUNT) AS SALES
FROM PRODUCT P INNER JOIN OFFLINE_SALE OS 
ON P.PRODUCT_ID = OS.PRODUCT_ID
GROUP BY P.PRODUCT_CODE
ORDER BY SALES DESC , P.PRODUCT_CODE ASC;