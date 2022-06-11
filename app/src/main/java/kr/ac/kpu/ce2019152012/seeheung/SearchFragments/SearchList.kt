package kr.ac.kpu.ce2019152012.seeheung.SearchFragments

import kotlinx.coroutines.delay

class SearchList {
    private val list: `val` = arrayListOf(
        "호조벌",
        "용도수목원",
        "소래산 산림욕장",
        "소래산 마애보살입상",
        "방산동 청자와 백자 요지",
        "삼미시장",
        "모랫골만지작 스튜디오",
        "소전미술관",
        "물왕 저수지",
        "능곡선사유적공원",
        "영모재",
        "관곡지",
        "군자봉",
        "문화두리기 아지트",
        "하늘 휴게소",
        "농업기술센터 천문관",
        "갯골 캠핑장",
        "Art Dock",
        "물왕숲캠핑파크",
        "오이도 박물관",
        "빨강 등대",
        "웨이브 파크",
        "함상 전망대",
        "생금집",
        "배곧한울공원",
        "옥구공원",
        "고향 동산",
        "오이도선사유적공원",
        "시흥에코센터",
        "맑은물상상누리",
        "신세계프리미엄아울렛",
        "월곶포구",
        "시흥정왕시장",
        "도일시장"
    )

    var `fun`: ? = null open fun search(): List<String> {
        delay(100) // 실제 Api 호출인것처럼 하기위해 딜레이 넣음
        return list.filter { it.contains(text ?: "") }
    }

}