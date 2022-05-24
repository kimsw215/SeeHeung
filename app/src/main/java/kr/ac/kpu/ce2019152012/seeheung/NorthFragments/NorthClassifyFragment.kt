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
            add(HashDataVo("호조벌", "#대규모 간척지 ", "#조선시대 농경지", R.drawable.icon_farm))
            add(HashDataVo("용도수목원", "#수목원", "#문화예술자연", R.drawable.icon_park))
            add(HashDataVo("소래산 산림욕장", "#해발 299.6m", "#각종 체육시설", R.drawable.icon_camping))
            add(HashDataVo("소래산 마애보살입상", "#고려 초기 마애불", "#근엄", R.drawable.icon_buddha))
            add(HashDataVo("방산동 청자와 백자 요지", "#고려 초기", "#청자백자", R.drawable.icon_ceramic))
            add(HashDataVo("삼미시장", "#포장마차거리", "#정기공연행사", R.drawable.icon_market))
            add(HashDataVo("모랫골만지작 스튜디오", "#창작공간", "#예술가와의 만남", R.drawable.icon_palette))
            add(HashDataVo("소전미술관", "#도자기 테마 예술관", "#야외정원까지", R.drawable.icon_parchment))

            listAdapter.datas = datas
            listAdapter.notifyDataSetChanged()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object{
        const val RawCount = 2
    }
}