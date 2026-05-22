package Day0320.핸드폰.인터페이스예제짝궁.김태준;

public class GaemFetcher implements Newsfetcher{
	
	private String[] gameNewsArr = new String[] {
	        "[e스포츠] 2026 리그 오브 레전드(LoL) 월드 챔피언십, 한국 팀 결승 진출 확정",
	        "[콘솔 게임] 플레이스테이션 6(PS6) 발매 일정 유출? 게이머들 기대감 고조",
	        "[스팀 동향] 최신 오픈월드 RPG 대작, 출시 하루 만에 스팀 동시접속자 100만 명 돌파",
	        "[게임 업데이트] 오버워치 3, 신규 영웅 '블레이드' 스킬 세트 및 배경 스토리 공개",
	        "[업계 소식] 주요 게임사, 생성형 AI 도입으로 NPC 상호작용 및 스토리 라인 혁신",
	        "[모바일 게임] 방치형 RPG의 진화, 2026년 상반기 모바일 게임 시장 매출 1위 달성",
	        "[e스포츠] 발로란트 챔피언스 투어(VCT) 퍼시픽, 역대 최고 시청자 수 갱신",
	        "[인디 게임] 1인 개발자가 만든 도트 그래픽 힐링 게임, 글로벌 누적 판매 50만 장 돌파",
	        "[가상현실] 차세대 VR 기기 전용 공포 게임 출시, 현실감 넘치는 그래픽으로 화제",
	        "[MMORPG] 대규모 공성전 시스템 개편, 유저 피드백 반영하여 밸런스 조정 완료"
	    };
	
	
	@Override
	public String searchNews(String keyword) {
		String result = "";
        
        for(int i = 0; i < gameNewsArr.length; i++) {
            if(gameNewsArr[i].contains(keyword)) {
                result += gameNewsArr[i] + "\n";
            }
        }
        
        if(result.length() == 0) {
            return "일치하는 게임 기사가 없습니다.";
        }
        
        return result;
	}
}
