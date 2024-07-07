WITH CTE AS (
    SELECT
        DISTINCT EMP_NO
        ,CASE
            WHEN AVG(SCORE) OVER(PARTITION BY EMP_NO) >= 96
                THEN 'S'
            WHEN AVG(SCORE) OVER(PARTITION BY EMP_NO) >= 90
                THEN 'A'
            WHEN AVG(SCORE) OVER(PARTITION BY EMP_NO) >= 80
                THEN 'B'
            ELSE 'C'
        END AS 'GRADE'
    FROM
        HR_GRADE
)

SELECT CTE.EMP_NO
    ,EMP_NAME
    ,GRADE
    ,CASE GRADE
        WHEN 'S'
            THEN SAL * 0.2
        WHEN 'A'
            THEN SAL * 0.15
        WHEN 'B'
            THEN SAL * 0.10
        WHEN 'C'
            THEN SAL * 0
        ELSE NULL
    END AS BONUS
FROM CTE
    INNER JOIN HR_EMPLOYEES AS e
        ON CTE.EMP_NO = e.EMP_NO
ORDER BY CTE.EMP_NO ASC
