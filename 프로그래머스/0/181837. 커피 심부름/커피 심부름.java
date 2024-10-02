class Solution {
    public int solution(String[] orders) {
        // 주문에 따른 총 가격을 저장할 변수 초기화
        int result = 0;
        
        // 주어진 주문 배열을 순회
        for (String order : orders) {
            // 만약 주문이 "latte"를 포함하고 있다면
            if (order.contains("latte")) {
                result += 5000; // "latte"의 가격 5000원 추가
            } else {
                result += 4500; // 그 외의 경우, 아메리카노 또는 다른 메뉴의 가격 4500원 추가
            }
        }
        
        // 계산된 총 가격을 반환
        return result;
    }
}
