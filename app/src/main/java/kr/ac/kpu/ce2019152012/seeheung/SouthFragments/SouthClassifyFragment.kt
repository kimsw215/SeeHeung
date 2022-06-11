package kr.ac.kpu.ce2019152012.seeheung.CenterFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import kr.ac.kpu.ce2019152012.seeheung.Adapter.ListAdapterGrid
import kr.ac.kpu.ce2019152012.seeheung.ClassFile.HashDataVo
import kr.ac.kpu.ce2019152012.seeheung.R
import kr.ac.kpu.ce2019152012.seeheung.databinding.SouthClassifyBinding

class SouthClassifyFragment : Fragment() {
    // 뷰 바인딩
    private var _binding: SouthClassifyBinding? = null
    private val binding get() = _binding!!

    // Adapter 변수 선언
    lateinit var listAdapter : ListAdapterGrid

    // gridManager
    lateinit var Gmanager : GridLayoutManager

    // 남부 테마 정보 변수 선언
    val datas = mutableListOf<HashDataVo>()

    // 화면 구성
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = SouthClassifyBinding.inflate(inflater,container,false)
        val view = binding.root

        initRecycler()

        return view
    }

    // 기능 넣는 곳
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun initRecycler(){
        listAdapter = ListAdapterGrid()

        Gmanager = GridLayoutManager(requireContext(), RawCount)

        binding.rvList.apply {
            layoutManager = Gmanager
            adapter = listAdapter
            setHasFixedSize(true)
        }

        datas.apply{
            add(HashDataVo("오이도 박물관", "서해안 최대 패총유적지인 제441호 보존 체험,행사를 운영합니다.",  R.drawable.icon_museum))
            add(HashDataVo("빨강 등대", "조성사업의 일환으로 건립된 해양관광시설 오이도를 상징하는 랜드마크입니다.",  R.drawable.icon_landmark))
            add(HashDataVo("웨이브 파크", "2020년7월에 개장한 세계최대의 인공서핑파크입니다. 레벨에 맞는 서핑을 즐길 수 있는 두가지 구역으로 구성되었습니다.",  R.drawable.icon_surfing))
            add(HashDataVo("함상 전망대", "250톤급 퇴역 해경 경비함을 활용해서 만든 전시관 오이도 독특한 생태와 역사,전시물을 경험",  R.drawable.icon_ship))
            add(HashDataVo("생금집", "1913년에 개축한 가옥으로 2005년 전면적으로 개축 전통가옥의 생활모습을 잘 살펴볼 수 있습니다.", R.drawable.icon_hanok))
            add(HashDataVo("배곧한울공원", "해안가를 배경으로 만들어진 공원은 시흥이라는 정신 아래 인간과 자연을 품은 목표에 부합되게 만들어졌습니다. ",  R.drawable.icon_park))
            add(HashDataVo("옥구공원", "고향 동산,무궁화 동산,습지원과 연꽃단지 등으로 구성된 환경친화적 공원입니다.",  R.drawable.icon_park))
            add(HashDataVo("오이도선사유적공원", "약33만제곱미터 규모의 유적공원 하룻밤 보내기 좋은캠프부터 조가비 공예품 제작,생태 탐방등의 체험이 가능합니다.",  R.drawable.icon_ruins))
            add(HashDataVo("시흥에코센터", "문화재생사업을 통해 산업단지에 휴식공간을 특성화한 문화공간입니다.",  R.drawable.icon_landmark))
            add(HashDataVo("맑은물상상누리", "주민참여 문화,예술,전시,생태를 기반으로 한 장착공간으로 프로그램 개발을 통해 랜드마크 조형적 가치를 보존하고 있습니다.",  R.drawable.icon_sewage))
            add(HashDataVo("신세계프리미엄아울렛", "220여개의 유명 패션브랜드숍, 자연친화적 조경의 센트럴 가든, 반려견과 산책 가능한 펫파크등 여가를 같이 즐길 수 있습니다.",  R.drawable.icon_shoppingmall))
            add(HashDataVo("월곶포구", "석양이 아름다운 서해안의 산책로로, 로맨틱한 데이트 장소로 제격입니다.길게 늘어진 횟집에서 신선한 회를 즐길 수 있습니다.",  R.drawable.icon_port))
            add(HashDataVo("시흥정왕시장", "2016년 7월에 전통시장으로 인정받아 2개동 63개 점포가 등록되어 있습니다.국가 전통 음식을 접하기 쉽습니다.",  R.drawable.icon_market))
            add(HashDataVo("도일시장", "5일장이 열리는 재래시장입니다. 새마을운동으로 조성돼 한때는 우시장도 있었고 중심지 역활을 했습니다.",  R.drawable.icon_market))

            listAdapter.datas = datas
            listAdapter.notifyDataSetChanged()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object{
        const val RawCount = 1
    }
}