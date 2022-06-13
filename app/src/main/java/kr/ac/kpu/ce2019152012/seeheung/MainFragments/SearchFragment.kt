package kr.ac.kpu.ce2019152012.seeheung.MainFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import kr.ac.kpu.ce2019152012.seeheung.Adapter.SearchAdapter
import kr.ac.kpu.ce2019152012.seeheung.ClassFile.SearchDataVo
import kr.ac.kpu.ce2019152012.seeheung.R
import kr.ac.kpu.ce2019152012.seeheung.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    // Adapter 변수 선언
    private lateinit var SearchAdapter: SearchAdapter

    // gridManager
    private lateinit var SearchGManager: GridLayoutManager

    // 검색 정보 변수 선언
    private lateinit var datas: ArrayList<SearchDataVo>

    // 화면 구성
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.rvSearchView.setOnQueryTextListener(searchViewTextListener)

        datas = tempData()
        setAdapter()

        return view
    }
    var searchViewTextListener: SearchView.OnQueryTextListener  =
        object : SearchView.OnQueryTextListener {
            // 검색버튼 입력 시 호출, 검색 버튼이 없으므로 사용하지 않음
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }

            // 텍스트 입력/수정시에 호출출
            override fun onQueryTextChange(p0: String?): Boolean {
                SearchAdapter.filter.filter(p0)
                return false
            }
        }
    // 기능 넣는 곳
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    // 어댑터 부착
    private fun setAdapter() {
        SearchAdapter = SearchAdapter(datas)
        SearchGManager = GridLayoutManager(requireContext(), 1)

        binding.rvSearchItem.apply {
            layoutManager = SearchGManager
            adapter = SearchAdapter
            setHasFixedSize(true)
        }
    }

    // SearchDataVo 에 데이터 넣고 class 에 데이터 갱신
    fun tempData(): ArrayList<SearchDataVo> {
        var tempData = ArrayList<SearchDataVo>()
//북부
        tempData.add(SearchDataVo("호조벌", "#대규모 간척지", "#조선시대 농경지", R.drawable.icon_farm))
        tempData.add(SearchDataVo("용도수목원", "#아름다운 풍경", "#시흥유적", R.drawable.icon_lighthouse))
        tempData.add(SearchDataVo("소래산 산림욕장", "#해발 299.6m", "#각종 체육시설", R.drawable.icon_camping))
        tempData.add(SearchDataVo("소래산 마애보살입상", "#고려 초기 마애불", "#근엄", R.drawable.icon_buddha))
        tempData.add(SearchDataVo("방산동 청자와 백자 요지","#고려 초기", "#청자백자", R.drawable.icon_ceramic))
        tempData.add(SearchDataVo("삼미시장", "#포장마차거리", "#정기공연행사", R.drawable.icon_market))
        tempData.add(SearchDataVo("모랫골만지작 스튜디오", "#창작공간", "#예술가와의 만남", R.drawable.icon_palette))
        tempData.add(SearchDataVo("소전미술관", "#도자기 테마 예술관", "#야외정원까지", R.drawable.icon_parchment))
//중부
        tempData.add(SearchDataVo("물왕 저수지", "#카페", "#시흥시 최대 담수호", R.drawable.icon_park))
        tempData.add(SearchDataVo("능곡선사유적공원", "#아름다운 풍경", "#시흥유적", R.drawable.icon_camping))
        tempData.add(SearchDataVo("영모재", "#한옥", "#공원", R.drawable.icon_hanok))
        tempData.add(SearchDataVo("관곡지", "#국내 최초 연꽃지", "#연성 문화제", R.drawable.icon_lotus))
        tempData.add(SearchDataVo("군자봉", "#군자봉성황제", "#등산로", R.drawable.icon_tree))
        tempData.add(SearchDataVo("문화두리기 아지트", "#시흥문화메이커", "#랜드마크", R.drawable.icon_landmark))
        tempData.add(SearchDataVo("하늘 휴게소", "#수요미식회맛집", "#브릿지 스퀘어", R.drawable.icon_shopping_mall))
        tempData.add(SearchDataVo("농업기술센터 천문관", "#천체 투영관", "#관측실", R.drawable.icon_parchment))
        tempData.add(SearchDataVo("갯골 캠핑장", "#캠핑장", "#매우 넓은부지", R.drawable.icon_camping))
        tempData.add(SearchDataVo("Art Dock", "#문화예술", "#창작활동 공간", R.drawable.icon_museum))
        tempData.add(SearchDataVo("물왕숲캠핑파크", "#캠핑장", "#최상의 접근성", R.drawable.icon_camping))
//남부
        tempData.add(SearchDataVo("오이도 박물관", "#그해우리는 촬영지", "#체험박물관연", R.drawable.icon_museum))
        tempData.add(SearchDataVo("빨강 등대", "#오이도랜드마크", "#전망대", R.drawable.icon_lighthouse))
        tempData.add(SearchDataVo("웨이브 파크", "#최대규모서핑", "#4계절가능", R.drawable.icon_surfing))
        tempData.add(SearchDataVo("함상 전망대", "#수목원", "#문화예술자연", R.drawable.icon_ship))
        tempData.add(SearchDataVo("생금집", "#시흥유적", "#전통가옥", R.drawable.icon_hanok))
        tempData.add(SearchDataVo("배곧한울공원", "#생명도시", "#자연을 품은도시", R.drawable.icon_buddha))
        tempData.add(SearchDataVo("옥구공원", "#서해일몰", "#환경친화적공원", R.drawable.icon_park))
        tempData.add(SearchDataVo("오이도선사유적공원", "#공예품 제작", "#생태탐방체험", R.drawable.icon_ruins))
        tempData.add(SearchDataVo("시흥에코센터", "#문화 휴식 공간", "#어린이 체험 놀이터", R.drawable.icon_landmark))
        tempData.add(SearchDataVo("맑은물상상누리", "#재활용도시랜드마크", "#자연친화적", R.drawable.icon_sewage))
        tempData.add(SearchDataVo("신세계프리미엄아울렛", "#스페린 건축", "#반려견산책", R.drawable.icon_shoppingmall))
        tempData.add(SearchDataVo("월곶포구", "#로맨틱 데이트", "#아름다운석양", R.drawable.icon_port))
        tempData.add(SearchDataVo("시흥정왕시장", "#전통시장", "#전통음식", R.drawable.icon_market))
        tempData.add(SearchDataVo("도일시장", "#5일장", "#재래시장", R.drawable.icon_market))


        return tempData
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}