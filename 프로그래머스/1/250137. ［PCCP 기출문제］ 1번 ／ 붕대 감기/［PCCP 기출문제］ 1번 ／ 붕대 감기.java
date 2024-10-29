class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int last_time = 0;
        int pre_health = health;

        for (int i = 0; i < attacks.length; i++){
            int total_time = attacks[i][0] - last_time - 1;
            // 총 회복 시간
            pre_health += total_time * bandage[1];
            // 초당 회복량
            pre_health += total_time / bandage[0] * bandage[2];
            // 추가 회복량
            pre_health = Math.min(pre_health, health);
            // 최대 체력까지만 회복

            pre_health -= attacks[i][1];
            // 회복된 체력에서 공격력만큼 차감

            last_time = attacks[i][0];
            // 마지막 공격 시간 저장

            if (pre_health <= 0) {
                pre_health = -1;
                break;
            }

        }


        return pre_health;
    }
}