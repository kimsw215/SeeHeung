package kr.ac.kpu.ce2019152012.seeheung.CenterFragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestoreSettings
import kr.ac.kpu.ce2019152012.seeheung.Adapter.ListAdapterGrid
import kr.ac.kpu.ce2019152012.seeheung.ClassFile.HashDataVo
import kr.ac.kpu.ce2019152012.seeheung.MainActivity
import kr.ac.kpu.ce2019152012.seeheung.R
import kr.ac.kpu.ce2019152012.seeheung.databinding.CenterClassifyBinding

class CenterClassifyFragment : Fragment() {
    // 뷰 바인딩
    private var _binding: CenterClassifyBinding? = null
    private val binding get() = _binding!!

    // Adapter 변수 선언
    private lateinit var listAdapter : ListAdapterGrid

    // gridManager
    private lateinit var Gmanager : GridLayoutManager

    // 중부 테마 정보 변수 선언
    val datas = mutableListOf<HashDataVo>()

    // 화면 구성
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CenterClassifyBinding.inflate(inflater,container,false)
        val view = binding.root

        initRecycler()
        val bottomNavigationView = requireActivity().findViewById<BottomNavigationView>(R.id.bottom_nav)
        val navHostUserFragment = requireActivity().supportFragmentManager
            .findFragmentById(R.id.fragmentContainer) as NavHostFragment
        val navController = navHostUserFragment.navController
        NavigationUI.setupWithNavController(bottomNavigationView, navController)

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
            add(HashDataVo("물왕 저수지", "#카페",  R.drawable.icon_park))
            add(HashDataVo("능곡선사유적공원", "#아름다운 풍경",  R.drawable.icon_camping))
            add(HashDataVo("영모재", "#한옥",  R.drawable.icon_hanok))
            add(HashDataVo("관곡지", "#연꽃",  R.drawable.icon_water_drop))
            add(HashDataVo("문화두리기 아지트", "#시흥문화메이커",  R.drawable.icon_landmark))
            add(HashDataVo("하늘 휴게소", "#수요미식회맛집",  R.drawable.icon_shopping_mall))
            add(HashDataVo("농업기술센터 천문관", "#별자리",  R.drawable.icon_parchment))
            add(HashDataVo("갯골 캠핑장", "#캠핑",  R.drawable.icon_camping))
            add(HashDataVo("Art Dock", "#문화예술",  R.drawable.icon_museum))
            add(HashDataVo("능곡선사유적공원", "#체험교육",  R.drawable.icon_park))
            add(HashDataVo("월곶포구", "#로맨틱 데이트",  R.drawable.icon_placeholder))
            add(HashDataVo("신세계 프리미엄 아울렛", "#스페린 건축",  R.drawable.icon_market))

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