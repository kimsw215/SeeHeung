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
        SearchGManager = GridLayoutManager(requireContext(), 2)

        binding.rvSearchItem.apply {
            layoutManager = SearchGManager
            adapter = SearchAdapter
            setHasFixedSize(true)
        }
    }

    // SearchDataVo 에 데이터 넣고 class 에 데이터 갱신
    fun tempData(): ArrayList<SearchDataVo> {
        var tempData = ArrayList<SearchDataVo>()
        tempData.add(SearchDataVo("등대", "오이도", "등대", R.drawable.icon_lighthouse))
        tempData.add(SearchDataVo("등대", "오이도", "등대", R.drawable.icon_lighthouse))
        tempData.add(SearchDataVo("등대", "오이도", "등대", R.drawable.icon_lighthouse))
        tempData.add(SearchDataVo("등대", "오이도", "등대", R.drawable.icon_lighthouse))


        return tempData
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}