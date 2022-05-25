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
import kr.ac.kpu.ce2019152012.seeheung.SouthFragments.SouthClassifyFragment.Companion.RawCount
import kr.ac.kpu.ce2019152012.seeheung.databinding.CenterClassifyBinding

class CenterClassifyFragment : Fragment() {
    // 뷰 바인딩
    private var _binding: CenterClassifyBinding? = null
    private val binding get() = _binding!!

    // Adapter 변수 선언
    lateinit var listAdapter: ListAdapterGrid

    // gridManager
    lateinit var Gmanager: GridLayoutManager

    // 중부 테마 정보 변수 선언
    val datas = mutableListOf<HashDataVo>()

    // 화면 구성
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CenterClassifyBinding.inflate(inflater, container, false)
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
            add(HashDataVo("물왕 저수지", "#카페", "#레스토랑", R.drawable.icon_park))
            add(HashDataVo("능곡선사유적공원", "#아름다운 풍경", "#최대 4인 숙박", R.drawable.icon_camping))
            add(HashDataVo("영모재", "#한옥", "#고요", R.drawable.icon_hanok))
            add(HashDataVo("관곡지", "#연꽃", "#연꽃테마파크", R.drawable.icon_water_drop))
            add(HashDataVo("문화두리기 아지트", "#시흥문화메이커", "#생태문화도시", R.drawable.icon_landmark))
            add(HashDataVo("하늘 휴게소", "#수요미식회맛집", "#JMT", R.drawable.icon_shopping_mall))
            add(HashDataVo("농업기술센터 천문관", "#별자리", "#천문과학", R.drawable.icon_parchment))
            add(HashDataVo("갯골 캠핑장", "#캠핑", "#반려견 입장가능", R.drawable.icon_camping))
            add(HashDataVo("Art Dock", "#문화예술", "#체험문화", R.drawable.icon_museum))
            add(HashDataVo("능곡선사유적공원", "#체험교육", "#선사유적", R.drawable.icon_park))

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