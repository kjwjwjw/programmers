-- 코드를 작성해주세요
SELECT COUNT(ID) FISH_COUNT, MONTH(TIME) MONTH
FROM FISH_INFO
GROUP BY MONTH
HAVING FISH_COUNT > 0
ORDER BY MONTH;