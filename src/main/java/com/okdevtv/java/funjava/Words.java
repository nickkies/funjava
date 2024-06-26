package com.okdevtv.java.funjava;

import java.util.Random;

public class Words {
  private Words() {
  }

  public static String getString() {
    String[] array = {
        "프로그램은 내가 원하는대로 움직이지 않는다. 타이핑대로 움직인다.",
        "요구 사양은 프로그램을 완성한 후에 추가된다.",
        "어차피 코딩할꺼 행복하게 코딩하자",
        "기본 사양은 완성품을 고객이 보고 나서 결정된다.",
        "상세 사양은 사용자가 프로그램을 사용해 본 이후에 결정된다.",
        "분명한 결함을 눈치채기 어려울 정도로 복잡하게 만드는 것이 답이다.",
        "디버그는 납기일까지 하는 것이 아니라, 납품된 이후에 하는 것이다.",
        "프로그래머를 죽이기 위해서는 칼이 필요없다. 프로그램의 요구조건을 3번만 바꾸면 된다.",
        "다른 사람을 믿으라. 그 사람이 해결해줄지도 모른다.",
        "개발에 마지막은 없다. 출시만이 있을 뿐이다.",
        "요구사항이 아무리 뒤늦게 추가되어도 마감 일은 변하지 않는다. 이것을 ”마감 불변의 법칙”이라고 한다.",
        "우리의 고객들은 물과 기능추가를 공짜라고 생각하고 있다.",
        "주머니가 짠 고객일수록 잔소리가 많다.",
        "개발 스케줄은 산수를 무시하며 짜여진다. 영업팀은 1＋1=2를 이해하지 못하는 사람의 모임이다.",
        "한 명이 쓰러지면 모두가 쓰러진다.",
        "버그가 너무 심하다? 걱정마라. 어느 순간 그것은 기본 사양이 된다.",
        "프로그래머에게 고객은 보이지 않는 악성 바이러스다.",
        "돈과 시간이 있으면, 그 어떤 시스템이라도 만들 수 있다. 하지만 그 기회는 영원히 주어지지 않는다.",
        "영업팀은 공상이 실현된다고 생각하는 몽상가 집단이다.",
        "시스템 엔지니어는 넘을 수 없는 벽이 없다고 믿는 모험가이다.",
        "프로그래머와는 몽상가와 모험가에 의해 칠흑의 바다에 내던져진 표류자이다.",
        "프로그램이란, 운과 감에 의해서 작성되는 기적이다.",
        "정시에 퇴근하면, 일이 늘어난다.",
        "완벽한 프로그램은 완벽한 시간과 돈을 필요로 한다.",
        "프로그램은 머리로 기억하지 않는다. 몸으로 기억한다.",
        "내일 쉴 수 있다면 오늘 죽어도 괜찮다.",
        "고객은 거짓말을 하고 영업은 꿈을 말한다.",
        "“네, 할 수 있습니다”라고 말하기 전에 10초만 곰곰히 다시 생각해보라.",
        "프로그래머는 1분 생각하고 1일을 코딩에 소비한다.",
        "납품 이후의 디버그는 버그를 부른다.",
        "세 개의 디버그는 하나의 버그를 낳는다. 이것을 버그의 엔드리스 루프라고 한다.",
        "안 좋은 예감은 반드시 적중한다.",
        "아수라장을 해결할 수 있는 방법은 오직, 고객이 돈을 지불하는 것 뿐이다.",
        "아마추어는 버그발견의 천재이다.",
        "아, 그건 마이크로소프트에서만 가능한 주문입니다.",
        "건강하기 때문에, 건강을 해친다.",
        "개발실의 창문은 안 열린다. 그 이유는 옛날에 한 프로그래머가 그 창문에서···",
        "고객은 최악의 사태를 믿지 않으며, 그 사태에 대한 준비를 악질적인 비용청구라고 생각한다.",
        "프로그래머는 최악의 사태를 누구보다 잘 예상하지만, 무시한다.",
        "만약 다른 직업을 갖게 된다면, 정시 퇴근을 “도망”이라고 부르지 않는 직업이 좋을 것 같다.",
        "최소한 자기가 쓴 시방서는 읽어주세요.",
        "납기일이란, 작업 현장이 우리 회사에서 고객의 회사로 바뀌는 날을 의미한다.",
        "가끔 일어나는 버그는 버그가 아니다. 스펙이다.",
        "걸레는 빨아도 행주가 되지 않는다.",
        "Simple is simple, not best.",
        "좋은 개발자는 도구를 탓하지 않는다. 키보드만 가릴뿐.",
        "최적화는 미루자. 하드웨어가 곧 빨라진다.",
        "안될 땐 안된다.",
        "프로그래밍이 늦어지는 것은 타자가 늦어서가 아니다.",
        "아닌건 갈아엎고 다시하자.",
        "뻘짓은 끝없는 루프다",
        "버그를 고치려고 하다가 더 많은 버그를 만들어낸다면, 당신은 프로그래밍을 하고 있는 것이다.",
        "프로그래머는 자신의 코드가 완벽하다고 생각하지만, 컴파일러가 항상 다른 의견을 가지고 있다.",
        "코드 리뷰: 내 코드가 완벽하다고 생각했던 나의 환상을 깨주는 과정.",
        "프로그래머의 최대 비밀: '구글링을 얼마나 잘하느냐'가 실제 기술력의 90%를 차지한다.",
        "2024 프로그래머의 최대 비밀: 'AI 활용을 얼마나 잘하느냐'가 실제 기술력의 90%를 차지한다.",
        "코드에서 '임시'로 붙인 이름이 결국 영구적인 것이 되는 경우가 많다. 'temp'가 결국 10년 동안 그 자리를 지킨다.",
        "버그를 고치는 가장 빠른 방법은 다른 사람에게 내 코드를 보여주는 것이다.",
        "프로젝트의 마지막 10%에 프로젝트 시간의 90%가 소요된다.",
        "코드는 한 번 작성하고, 여러 번 읽힌다.",
        "기술 부채🪭는 이자와 함께 돌아온다.",
        "좋은 프로그래머는 자신이 무엇을 하는지 알고 있지만, 더 좋은 프로그래머는 자신이 무엇을 하지 않아야 하는지 안다.",
        "요구사항의 변화는 프로젝트의 유일한 상수다.",
        "늦게 배운 안전보다 빨리 배운 출시가 낫다.",
        "유지보수 가능한 코드를 작성하는 것은 예술이다. 유지보수하기 어려운 코드를 작성하는 것은 아주 쉽다.",
        "실수는 배움의 일부다. 그러나 모든 배움이 실수에서 오는 것은 아니다.",
        "복잡성은 증가한다. 단순성은 공들여야 얻는다.",
        "최고의 성능 최적화는 처음부터 쓰지 않는 것이다.",
        // https://m.blog.naver.com/sangjununi/20182141440
        "소스도 먼저 코딩하는 놈이 낫다.\n-사실임",
        "믿는 팀장에 발등 찍힌다.\n-팀장도 모르는게 있다. 팀장이라고 모든걸 다알진 않아.",
        "개발실 청소 아줌마 삼 년에 디버깅 한다.\n-빗자루로 코딩좀 해주세요.",
        "보기 좋은 코드가 디버깅 하기 좋다.\n-빠른 코딩을 원한다면 보기나빠도 이해해라",
        "소스 잃고 백업장치 구입한다.\n-공감하십니까?",
        "아니 코딩한 소스에 버그 날까?\n-버그 난다고요. 빌드만 해도 버그남. 재수없는 경우 코딩툴 다시 설치해야됨",
        "안 되는 코더는 엔터를 쳐도 PC가 다운된다.\n-아아.... 응답없음...... 멘붕",
        "잘되면 프로그래머 탓, 못되면 시스템 탓.\n-시스템보다 당신의 코드한줄에 문제가 있을지도 몰라",
        "야한 화일도 위아래가 있다.\n-우선순위란 어디에나 존재하지",
        "하룻 프로그래머 정품단속반 무서울줄 모른다.\n-정품단속? 그게 머더라? 하다가 뒤통수 맞음",
        "백업을 안하면 삼대가 내리 흉하다.\n-한달내내 작업하고 날라가봐야 정신차리지",
        "잘 키운 개발자 한명 열 코더 안부럽다.\n-그냥 짜논대로 치느냐 그걸 짜느냐",
        "멀쩡한 프로그램에 날 세그먼트폴트\n-왜 세그먼트폴트가 생겼을까 뭘 빼먹은거냐? 메모리가 거지인거냐?",
        "안에서 새는 메모리 밖에서도 샌다…\n-테스트할때 다운 안되다가 앱스토어 올리면 댓글에 자꾸 죽어요 엄청 올라옴.",
        "프로그램은 개발자가 짜고, 보너스는 영업이 받는다.\n-좋은데?",
        "프로그래밍에 정답은 없습니다.\n하지만 오답은 있단다.",
        "내가 유일하게 믿는 사람은, 오늘 미룬 일을 해낼 내일의 나."
    };

    Random random = new Random(System.currentTimeMillis());
    int index = random.nextInt(array.length);
    return array[index];
  }
}
