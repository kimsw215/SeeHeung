package kr.ac.kpu.ce2019152012.seeheung.CenterFragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestoreSettings
import kr.ac.kpu.ce2019152012.seeheung.Adapter.ListAdapterGrid
import kr.ac.kpu.ce2019152012.seeheung.ClassFile.HashDataVo
import kr.ac.kpu.ce2019152012.seeheung.R
import kr.ac.kpu.ce2019152012.seeheung.databinding.CenterClassifyBinding
import kr.ac.kpu.ce2019152012.seeheung.databinding.NorthClassifyBinding
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
            add(HashDataVo("연꽃테마파크","다양한 연과 수생식물 등을 심어 조성한 테마파크로 가족들과 나들이 하기 좋은 곳 입니다", R.drawable.icon_lotus))
            add(HashDataVo("갯골생태공원", "자연 생태가 온전히 보존되어 있어 염생식물과 각종 어류 및 양서류가 서식하고 있습니다.",  R.drawable.icon_park))
            add(HashDataVo("배곧생명공원", "바로 앞 바다가 보이는 공원으로 바다를 보며 산책해보세요.",  R.drawable.icon_park))
            add(HashDataVo("빨간등대", "지금은 오이도를 상징하는 랜드마크로, 전망대로 이용되고있으며, 탁 트인 서해를 즐겨보세요",  R.drawable.icon_lighthouse))
            add(HashDataVo("웨이브파크", "세계 최대규모의 인공서핑 파크로 4계절 내내 서핑을 즐길 수 있는 곳이며 서핑도 배워볼 수 있습니다.", R.drawable.icon_surfing))
            add(HashDataVo("시흥오이도박물관", "바다와 한발짝 거리에 있는 박물관으로도 유명하며 로비에서 아름다운 서해낙조를 즐겨보세요.",  R.drawable.icon_museum))
            add(HashDataVo("곰솔누리숲", "4코스 바람길로 바로 앞에 바다와 자연을 느껴보세요",  R.drawable.icon_park))
            add(HashDataVo("정왕시장", "자연스럽게 다문화가 많이 형성된 지역 특성인 정왕동에서 다양한 국가의 음식도 만나보세요!",  R.drawable.icon_market))
            add(HashDataVo("도일시장", "1959년에 개설 된 이래 시흥에서 유일하게 5일장이 열리는 재래시장입니다.",  R.drawable.icon_market))
            add(HashDataVo("마을박물관", "기존 마을회관으로 이용되던 공간을 리모델링하여 문화예술기반의 공간으로 조성되었습니다.",  R.drawable.icon_palette))


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