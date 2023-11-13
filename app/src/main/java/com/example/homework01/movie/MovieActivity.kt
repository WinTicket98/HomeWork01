package com.example.homework01.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.homework01.R

class MovieActivity : AppCompatActivity() {

    val poster = arrayOf(R.drawable.movie1, R.drawable.movie2
            ,R.drawable.movie3, R.drawable.movie4
            ,R.drawable.movie5,R.drawable.movie6
            ,R.drawable.movie7,R.drawable.movie8)
    val details = arrayOf(arrayOf("아이캔스피크", "20년간 8천 건에 달하는 민원을 넣은 할머니 옥분은 공무원들이 제일 두려워하는 민원인이다. 마을에 대한 열정만큼 영어를 열심히 공부하지만 실력이 늘지 않아 실망하던 옥분은 영어를 잘하는 공무원 민재에게 선생님이 되어달라고 부탁한다. " +
            "옥분의 영어 선생님이 된 민재는 수업을 하면서 불편하게만 생각했던 옥분에 대해 좀 더 이해하게 되고, 옥분이 영어 공부에 매달릴 수밖에 없었던 특별한 이유를 알게 된다.", "2017년 9월 21일 개봉", poster[0]),
        arrayOf("살인자의 기억법", "예전에는 연쇄살인범이었지만 지금은 알츠하이머에 걸린 병수(설경구). 우연히 접촉사고로 만나게 된 남자 태주(김남길)에게서 자신과 같은 눈빛을 발견하고 그 역시 살인범임을 직감한다. " +
                "병수는 경찰에 그를 연쇄살인범으로 신고하지만 태주가 그 경찰이었고, 아무도 치매노인 병수의 말을 믿지 않는다. 태주는 은희(김설현) 주위를 맴돌며 계속 병수의 주변을 떠나지 않고, 병수는 혼자 태주를 잡기 위해 필사적으로 기록하고 쫓지만 기억은 자꾸 끊기고, " +
                "오히려 살인 습관들이 되살아나며 병수는 망상과 실제 사이에서 혼란스러워진다. 다시 시작된 연쇄 살인사건, 놈의 짓이 맞을까! 네 기억은 믿지 마라! 그 놈은 살인자다!", "2017년 9월 6일 개봉", poster[1]),
        arrayOf("베이비 드라이버","애틀랜타의 은행과 공공기관들을 연쇄적으로 털고 있는 어느 강도단. 그 강도단의 계획 수립자인 박사(Doc)(케빈 스페이시) 밑에서 전속 도주 운전수로 일하고 있는 베이비(안셀 엘고트). " +
                "어릴적 사고로 생긴 청각 장애 때문에 생기는 이명을 없애기 위해 항상 아이팟과 이어폰을 가지고 다니며 음악에 심취해 있는 베이비는, 청각이 봉쇄된 핸디캡에도 불구하고 타의 추종을 불허하는 최고의 드라이버다.","2017년 9월 14일 개봉",poster[2]),
        arrayOf("킬러의 보디가드","킬러 다리우스의 경호원으로 고군분투하던 마이클은 불안한 심리상태로 인해 잠시 일을 쉬며 평화로운 휴양지에서 휴식을 취한다. 그러던 중, 다리우스의 아내 소니아가 갑작스럽게 나타나 다리우스가 위험에 처했음을 알린다. " +
                "엎친 데 덮친 격으로 마이클에게 인류에게 큰 위협을 가하는 테러를 저지하는 임무가 주어지고, 예측 불가능한 이들의 이야기가 펼쳐진다.","2017년 8월 30일 개봉", poster[3]),
        arrayOf("아메리칸 메이드","파일럿 배리는 어느 날 CIA 요원 몬티를 만나 무기 밀반출을 도와주게 된다. 그는 거액의 돈을 맛보며 점차 더 큰 범죄에 가담하고, 곧 각종 정보기관과 세계 최대 마약 조직까지 넘보기 시작한다.","2017년 9월 14일 개봉", poster[4]),
        arrayOf("인비저블 게스트","의문의 습격으로 살해 당한 ‘로라’, ‘아드리안’은 연인의 죽음에 절망하고, 범인은 흔적도 없이 사라졌다. 유력한 용의자로 누명을 쓴 ‘아드리안’은 승률 100%의 변호사 ‘버지니아’를 선임한다. 그리고 자신의 무죄를 입증하기 위해 고군분투하던 중 과거 그와 ‘로라’가 은폐한 교통사고와 숨겨진 연관성을 찾게 되는데… " +
                "남은 시간은 단 3시간, 사건을 재구성해 무죄를 입증해야 한다!","2017년 9월 21일 개봉", poster[5]),
        arrayOf("그것","아이들이 사라지는 마을, '그것'이 나타났다. 살인과 실종사건이 이상하게 많이 생기는 데리라는 마을 비오는 어느 날 종이배를 들고나간 동생이 사라졌다. 형 빌은 동생을 찾아 나서고," +
                "27년마다 가장 무서워하는 것의 모습을 한 채 아이들을 잡아먹는다는 '그것'이 빨간 풍선을 든 피에로의 모습으로 그들 앞에 나타나는데...","2017년 9월 6일 개봉", poster[6]),
        arrayOf("택시운전사","택시운전사 만섭은 거금 10만원을 준다는 독일 기자 피터를 태우고 광주로 향한다. 곧 그들은 광주에서 벌어지는 말도 안 되는 일들과 무참한 현장을 목격하고, 피터는 위험을 감수하고 사람들과 함께 현장을 촬영한다.","2017년 8월 2일 개봉", poster[7])
    )

    private lateinit var data: MutableList<Movie>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        setMovie()

        val adapter = MovieAdapter(this, data)
        val rv = findViewById<RecyclerView>(R.id.rv_movie)

        val manager = LinearLayoutManager(this)
        rv.layoutManager = manager
        manager.orientation = LinearLayoutManager.VERTICAL
        rv.adapter = adapter
    }

    fun setMovie(){
        data = mutableListOf()
        data.add(Movie(details[0][0] as String, details[0][1] as String, details[0][2] as String, details[0][3] as Int))
        data.add(Movie(details[1][0] as String, details[1][1] as String, details[1][2] as String, details[1][3] as Int))
        data.add(Movie(details[2][0] as String, details[2][1] as String, details[2][2] as String, details[2][3] as Int))
        data.add(Movie(details[3][0] as String, details[3][1] as String, details[3][2] as String, details[3][3] as Int))
        data.add(Movie(details[4][0] as String, details[4][1] as String, details[4][2] as String, details[4][3] as Int))
        data.add(Movie(details[5][0] as String, details[5][1] as String, details[5][2] as String, details[5][3] as Int))
        data.add(Movie(details[6][0] as String, details[6][1] as String, details[6][2] as String, details[6][3] as Int))
        data.add(Movie(details[7][0] as String, details[7][1] as String, details[7][2] as String, details[7][3] as Int))
    }
}