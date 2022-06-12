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
class NorthClassifyFragment : Fragment() {
    // 뷰 바인딩
    private var _binding: NorthClassifyBinding? = null
    private val binding get() = _binding!!

    // Adapter 변수 선언
    lateinit var listAdapter : ListAdapterGrid

    // gridManager
    lateinit var Gmanager : GridLayoutManager

    // 북부 테마 정보 변수 선언
    val datas = mutableListOf<HashDataVo>()

    // 화면 구성
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = NorthClassifyBinding.inflate(inflater,container,false)
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
            add(HashDataVo("호조벌", "조선시대 때 대규모 간척사업을 통해 농경지로 변화시킨 조상들의 경험과 지혜가 돋보입니다.",  R.drawable.icon_farm))
            add(HashDataVo("용도수목원", "양지산 아래 자연의 순수함과 아름다움을 느낄 수 있는 경기도청 제 3호로 등록된 수목원입니다.",  R.drawable.icon_park))
            add(HashDataVo("소래산 산림욕장", "해발 299.6m 높이의 소래산은 빼어난 자연경관과 각종 체육시설 등으로 피로와 긴장을 풀어주는 휴식처입니다.", R.drawable.icon_camping))
            add(HashDataVo("소래산 마애보살입상", "고려시대 때 소래산 중턱 병풍바위 암벽에 새겨진 마애불입니다.",  R.drawable.icon_buddha))
            add(HashDataVo("방산동 청자와 백자 요지", "신라 말기 도입된 벽돌가마에서 고려 초기의 청자와 백자를 생산했던 흔적을 보여줍니다.",  R.drawable.icon_ceramic))
            add(HashDataVo("삼미시장", "시흥 최대의 전통시장으로 정기적 문화공연과 행사를 통해 시민들과 함께 흥겨운 시장 분위기를 만들어냅니다.",  R.drawable.icon_market))
            add(HashDataVo("모랫골만지작 스튜디오", "문화특화지역 조성사업의 일환으로 조성된 모랫골 만지작스튜디오는 시민-문화예술인의 창작공간입니다.",  R.drawable.icon_palette))
            add(HashDataVo("소전미술관", "도자기 명품들과 불교미술, 회화, 공예 등을 마주하는 상설전시실과 각종 거장들의 조각품이 전시된 야외 정원으로 이루어진 미술관입니다.",  R.drawable.icon_parchment))

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