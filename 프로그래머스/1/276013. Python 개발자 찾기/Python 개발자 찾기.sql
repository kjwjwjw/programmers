-- 코드를 작성해주세요
select ID,EMAIL,FIRST_NAME,LAST_NAME
from DEVELOPER_INFOS

where SKILL_3 in("Python") or
SKILL_2 in("Python") or
SKILL_1 in("Python")
order by ID asc