package kr.ac.kpu.ce2019152012.seeheung.SouthFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat.requireContext
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
    private lateinit var listAdapter: ListAdapterGrid

    // gridManager
    private lateinit var Gmanager: GridLayoutManager

    // 남부 테마 정보 변수 선언
    private val datas = mutableListOf<HashDataVo>()

    // 화면 구성
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = SouthClassifyBinding.inflate(inflater, container, false)
        val view = binding.root

        initRecycler()

        return view
    }

    // 기능 넣는 곳
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun initRecycler() {
        listAdapter = ListAdapterGrid()

        Gmanager = GridLayoutManager(requireContext(), RawCount)

        binding.rvList.apply {
            layoutManager = Gmanager
            adapter = listAdapter
            setHasFixedSize(true)
        }

        datas.apply {
            add(HashDataVo("오이도 빨간 등대", "#오이도 랜드마크 ", "#전망대", R.drawable.icon_lighthouse))
            (HashDataVo("옥구공원", "#서해일몰", "#환경친화적공원", R.drawable.icon_park))
            add(HashDataVo("오이도 전통 수산시장", "#시흥대표광광지", "#싱싱한해산물", R.drawable.icon_fish_market))
            add(HashDataVo("생금집", "#시흥유적", "#전통가옥", R.drawable.icon_parchment))
            add(HashDataVo("맑은물상상누리", "#재활용도시랜드마크", "#자연친화적", R.drawable.icon_museum))
            add(HashDataVo("웨이브파크", "최대규모서핑", "#4계절가능", R.drawable.icon_surfing))
            add(HashDataVo("오이도박물관", "#그해우리는", "#체험박물관", R.drawable.icon_museum))
            add(HashDataVo("시흥 도일시장", "#5일장", "#재래시장", R.drawable.icon_market))
            add(HashDataVo("도일 아지다트", "#마을카페", "#플리마켓", R.drawable.icon_placeholder))
            add(HashDataVo("배곧 한울 공원", "#생명도시", "#자연을 품은도시", R.drawable.icon_park))

            listAdapter.datas = datas
            listAdapter.notifyDataSetChanged()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val RawCount = 2

    }

}