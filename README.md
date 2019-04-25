## MartianGame
화성에서 엔지니어, 농식물학자되어 구조선이 올때까지 생존하는 자바 콘솔 게임입니다.

## 작품 상세 설명
1. 두가지 직업을 선택할 수 있으며, 직업의 능력치는 각자 다르다.
- 엔지니어 : 수리에 강점을 보이는 직업. 수리 성공확률과 수리시 올라가는 수리도가 높다.
- 농식물학자 : 농사에 강점을 보이는 직업. 농사 성공확률과 농사시 올라가는 농사도가 높다.  
- 직업숙련도를 일정이상 올릴 시 능력치는 강화된다.
2. 시간이 자동으로 흐르고, 이에 따라 기본생체활동으로인해 포만감, 체내수분, 집중도가 떨어진다.
- 포만감에 따라 적절하게 감자를먹고, 체내수분에따라 적절하게 물을 마셔야한다.
- 체력이 떨어지면 수리, 농사가 불가능하므로, 일반휴식이나 잠자기를 통해 체력을 회복해아 한다.
- 집중도가 떨어지면, 수리,농사의 기본성공확률이 감소하므로, 일반휴식이나 잠자기를 통해 집중력을 회복해아 한다.
- 포만도 혹은 체내수분이 일정 수치 이하가될시 체력이 빠른속도로 떨어진다.
- 일시정지를 통해, 시간을 멈추고 현재상태를 확인할 수 있다.
3. 수치별 설명 
- 체력 : 0이되면 사망. 일할 때마다 일정수치가 줄어든다. 일반휴식 혹은 잠자기로 회복가능
- 집중도 : 집중도에 따라 기본 행동성공확률이 달라진다. 집중도가 높을 때 행동하는 것이 좋다. 일반휴식 혹은 잠자기로 회복가능
- 포만감 : 일정 수치 이하로 떨어지면, 체력이 빠른속도로 떨어진다. 감자먹기로 회복가능
- 체내수분 : 일정 수치 이하로 떨어지면, 체력이 빠른속도로 떨어진다. 물마시기로 회복가능
- 숙면도 : 잠에들때 점점 숙면도가 변화한다. 높은 숙면도일 수록 높은 체력, 집중도 회복률을 가진다. 잠에서 깨면 일정시간동안 집중도가 떨어졌다가, 일정시간이 지나면 조금씩 회복된다.
- 남은감자수 : 농사-감자심기-수확을 통해 획득할 수 있다. 포만감을 올려준다.
- 남은물리터 : 추가로 획득할 수 없기 때문에 아껴서 사용해야한다. 체내수분을 올려준다. 거름주기에도 사용할 수 있다.
- 산소공급장치현재수리도 : 0이되면 사망. 화성 기후의 영향으로 계속해서 손상된다.
- 통신기기현재수리도 : 100이되면 구조선을 호출할 수 있고, 5.통신을 이용할 수 있다. 화성기후의 영향으로 계속해서 손상된다.생존시간이 낮을 때 구조신호를 보내면 구조선이 더 일찍 도착한다. 통신기기가 손상되면, 구조선의 현재위치를 확인할 수 없다.
- 수리능력 : 수리에 성공했을때 올라가는 수리도이다.
- 농사능력 : 농사-거름과물주기에 성공했을때 감자의 성장확률이 올라가는 정도이다.
- 수리능력각성도 : 엔지니어가 수리에 성공할때마다 1씩 올라가며, 일정수치 이상시 엔지니어를 숙련된 엔지니어로 전직시킨다.
- 농사능력각성도 : 농식물학자가 농사에 성공할때마다 1씩 올라가며, 일정수치 이상시 엔지니어를 숙련된 농식물학자로 전직시킨다.
- 수리성공확률 : 기본성공확률 + 직업성공확률로 이루어진다. 직업성공확률은 전직이아니면 변하지 않지만, 기본성공확률은 집중도에따라 계속해서 변한다.
- 농사성공확률 : 기본성공확률 + 직업성공확률로 이루어진다. 직업성공확률은 전직이아니면 변하지 않지만, 기본성공확률은 집중도에따라 계속해서 변한다.
- 심은감자수 : 농사에 심은감자수를 나타낸다. 감자를 심으면 심은감자수의 성장정도가 100이 될때마다 다자란감자수가 늘어난다.
- 심은감자수의 성장정도 : 심은감자수가 0이상이면 작동하고, 30이상시에는 감자를 추가로 심을 수 없다. 감자를 수확하지 않으면 감자의수를 계속해서 늘린다.
- 다자란감자수 : 심은감자수에 따라 늘어나는 감자수이다. 감자를 수확하면, 다자란감자수가 남은감자수에 +된다.
- 현재감자의성장확률 : 땅의 비옥도이다. 거름을 많이줄수록 감자가 빠르게 성장하며, 수확시 비옥도가 줄어든다.
- 생존시간 : 생존자가 된이후로 계속해서 시간이 늘어난다. 생존시간에 따라 진행할 수 있는 이벤트가 다르다. (외계생물체 구조엔딩은 생존시간이 30일 넘어야가능)
4. 가능행동 : 
일시정지 
- 현재상태보기 : 일시정지후 현재상태를 볼 수 있다.
- 게임규칙 : 일시정지후 게임규칙을 다시 확인할 수 있다.
수리 
- 산소공급장치수리 : 산소공급장치 수리 시도를 할 수 있다.
- 통신기기수리 : 통신기기 수리 시도를 할 수 있다.
농사 
- 감자수확하기 : 다자란 감자를 수확할 수 있다. 
- 감자심기 :  감자농사를 위한 감자를 심을 수 있다.
- 물과 거름주기 : 감자의 성장도를 증가시킬 수 있다.
먹고마시기 
- 감자먹기 : 감자를 먹어 포만감을 올릴 수 있다.
- 물마시기 : 물을 마셔 체내수분을 올릴 수 있다.
휴식 
- 일반휴식 : 일반 휴식을 취해 체력과 집중도를 올릴 수 있다. 짧게 휴식을 취할때 유리하다.
- 잠자기 : 일반 휴식을 취해 체력과 집중도를 올릴 수 있다. 길게 휴식을 취할때 유리하다.
통신 
- 지구와통신 : 지구와 통신해 생존에 도움을 얻거나, 외계신호탐지를 위한 코드를 얻고, 외계신호를 지구에 전달할 수 있다.
- 외계신호탐지 : 외계신호를 받거나, 외계에 신호를 보내 구조시간을 단축할 수 있다.
5. 엔딩종류 :
- 산소공급장치 수치 0 : 사망 (미션실패)
- 낮은 포만감,체내수분으로 인한 체력저하 : 사망 (미션실패)
- 통신기기로 구조선 호출 : 구조선구출 엔딩(미션성공)
- 특수미션 : 지구 및 외계와의 통신을 통해, 외계생물체의 도움을 받아 구출가능
6. 이벤트 : 
- 전직을하거나 통신을 활성화하면 이벤트가 진행된다.
- 전직이벤트종류 : 숙련된 엔지니어전직, 숙련된 농식물학자 전직
- 통신이벤트종류 : 창고의 위치와 비밀번호를 알려주고, 이를 입력하면 감자와 물 획득가능, 지구와의 소통을 통해  외계신호를 받을 수 있고, 외계로 신호를 보낼 수 있는 코드를 알 수 있다.

## 사용 쓰레드 
1. 기본
- 인트로 : 게임시작시 스토리를 천천히 프린트합니다.
- 시간 : 생존일과 시간이 흐르게합니다. 일시정지를 하면, 현재 시간을 저장하고, 게임재개를하면 다시 시간이 흐릅니다.
- 배경음악 : 게임 내내 화성환경에 맞는 음악이 재생됩니다.
- 효과음 : 각 행동에 맞는 소리를 재생합니다. (수리, 농사, 휴식, 먹고마시기, 통신 + 선택, 성공, 실패)
- 엔딩 : 엔딩 조건을 계속해서 감지합니다. 엔딩조건이 충족될시, 자동으로 게임을 종료합니다. (체력저하사망,산소공급장치고장사망,구조선도착)
- 기계고장 : 화성의 악조건에의해 기계가 계속해서 손상됩니다. 통신기기가 손상될경우, 구조선의 현재위치를 알 수 없습니다.(산소공급장치, 통신기기)
- 집중도 : 생존자의 집중도에 따라 행동의 기본성공확률이 계속해서 변합니다.
- 생명유지 : 생존자의 포만감과, 체내수분, 집중도가 지속적으로 떨어집니다.
- 특수생명유지 : 생존자의 포만감 혹은 체내수분이 일정수치 이하가되면, 경고음을 발생시키고, 생존자의 체력과 집중력을 빠른속도로 감소시킵니다.
- 감자자라기 : 토양의 비옥도, 심어진 감자 유무에따라 일정확률(풍년,흉년)로다자란감자가됩니다. 심어진감자와 다자란 감자는 생존자가 수확에 성공하면 초기화됩니다.
2. 행동
- 수리 : 수리를 할때 생존자의 체력,집중도,포만감,체내수분을 나눠서 천천히 감소시키고, 성공 실패에따른 결과를 수치에 반영시킵니다.
- 농사 : 농사를 할때 생존자의 체력,집중도,포만감,체내수분을 나눠서 천천히 감소시킵니다. 성공 실패에따른 결과를 생존수치에 반영시킵니다. (수확하기, 감자심기, 거름주기)
- 감자먹기 : 감자먹기를 할때 생존자의 체력,집중도,포만감,체내수분을 나눠서 천천히 감소시킵니다. 결과를 생존수치에 반영시킵니다.
- 물마시기 : 물마시기를 할때 생존자의 체력,집중도,포만감,체내수분을 나눠서 천천히 감소시킵니다. 결과를 생존수치에  반영시킵니다.
- 일반휴식 : 지속적으로 생존자의 체력과 집중도를 올려줍니다.
- 잠자기 : 지속적으로 생존자의 숙면도를 올리고, 숙면도에 따라 다른확률로 생존자의 체력과 집중도가 올라갑니다.
- 잠자고난후 : 잠자기를 그만둘경우 생존자의 현재 숙면도에따라 집중도가 차감되며, 숙면도가 줄어듬에따라 집중도가 천천히 회복됩니다.
- 지구와의통신 : 생존자의 상태에 따라 메시지를 보냅니다. (통신을 잘 이용하면, 구조선이 빨리도착하게해 미션을 일찍 성공할 수 있습니다.)
- 화성생명체와의통신 : 생존자의 상태에 따라 메시지를 보냅니다. (통신을 잘 이용하면, 구조선이 빨리도착하게해  미션을 일찍 성공할 수 있습니다.)

 
## 스스로 피드백-부족한점
1. 엔딩조건이 완료되었을때 아무메시지도 나오게하면 안됬는데, 행동을 빠르게하다가 엔딩이나버리면, 게임종료메시지이후에 행동의 결과가 나와버린다.
2. 기간에 맞게 만들 프로그램의 규모를 정해야했는데, 난이도를 고려하지 않고, 너무 큰 규모의 프로그램으로 설계해서 팀노바 학원의 발표날 게임 퀄리티가 아주 안 좋았다.
3. 시간이 더 주어진다면, 통신탭에서 지구,외계생명체와의 외교와 전쟁에 따라 다른 엔딩을 추가할 수 있을 것 같다. 
4. 게임의 속도가 빠르고 텍스트가 많아서, 처음게임을 접하는 사람은 익숙해지는데 오랜시간이 걸린다. 만약에, 게임의 속도를 느리게 만들면, 일시정지했을때, 쓰레드가 바로 종료되지 않기 때문에, 게임속도를 빠르게 만드는 결정을 했다.

## 작품 플레이 영상
<img src="videos/play_video1.gif" height="500">
<br>
<img src="videos/play_video2.gif" height="500"> 
<br>
<img src="videos/play_video3.gif" height="500">
<br>