package kr.ac.kpu.ce2019152012.seeheung.CenterFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import kr.ac.kpu.ce2019152012.seeheung.Adapter.ListAdapter
import kr.ac.kpu.ce2019152012.seeheung.ClassFile.HashDataVo
import kr.ac.kpu.ce2019152012.seeheung.R
import kr.ac.kpu.ce2019152012.seeheung.databinding.CenterClassifyBinding

class CenterClassifyFragment : Fragment() {
    // 뷰 바인딩
    private var _binding: CenterClassifyBinding? = null
    private val binding get() = _binding!!

    // Adapter 변수 선언
    private lateinit var listAdapter : ListAdapter

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
        listAdapter = ListAdapter()

        Gmanager = GridLayoutManager(requireContext(), RawCount)

        binding.rvList.apply {
            layoutManager = Gmanager
            adapter = listAdapter
            setHasFixedSize(true)
        }

        datas.apply{
            add(HashDataVo("물왕 저수지", "아름다운 각종 카페와 레스토랑 등이 들어서 있는 멋진 경치의 명소입니다.",  R.drawable.icon_park))
            add(HashDataVo("능곡선사유적공원", "신석기시대 토기와 움집부터 조선시대 무덤까지 여러 유적들과 서해안 지역 문화재를 보존하고 있습니다. ",  R.drawable.icon_camping))
            add(HashDataVo("영모재", "조선 제 15대 왕 광해군의 장인인 류자신의 재실로 시흥시에서 가장 오래된 목조 건물입니다.",  R.drawable.icon_hanok))
            add(HashDataVo("관곡지", "조선시대 강희맹 선생이 우리나라에서 재배되지 않던 전당연의 씨앗을 최초로 시험재배에 성공한 곳입니다.",  R.drawable.icon_lotus))
            add(HashDataVo("군자봉", "산봉이 흡사 꽃 중의 군자인 연꽃처럼 생긴 군자봉에선 매년 10월 3일 500년 전통의 군자봉 성황제가 개최됩니다.", R.drawable.icon_tree))
            add(HashDataVo("문화두리기 아지트", "시흥시의 시민, 전문가, 행정이 협력하여 담론을 만들어가는 문화거버넌스인 '문화두리기'의 활동공간입니다.",  R.drawable.icon_landmark))
            add(HashDataVo("하늘 휴게소", "경기도 일산과 판교에서 모두 진입 가능한 Bridge Square(브릿지 스퀘어)라고 쓰여진 시흥 하늘 휴게소입니다.",  R.drawable.icon_shopping_mall))
            add(HashDataVo("농업기술센터 천문관", "우주의 경이로움을 체험할 수 있는 주 관측실, 가상의 별자리를 볼 수 있는 돔스크린 천체투영관 등이 있습니다.",  R.drawable.icon_parchment))
            add(HashDataVo("갯골 캠핑장", "도심 속의 갯골, 옛 염전체험장, 80년된 소금창고와 연안습지 보호구역의 다양한 동식물이 있습니다.",  R.drawable.icon_camping))
            add(HashDataVo("Art Dock", "문화예술 창작활동, 지역특화 프로그램을 통해 주민들에게 생활 문화예술 기반을 제공하는 공간입니다.",  R.drawable.icon_museum))
            add(HashDataVo("물왕숲캠핑파크", "물왕저수지 근처에 위치한 소규모 야영장에선 동화에 나올법한 풍경속에서 잊지 못할 캠핑이 가능합니다.",  R.drawable.icon_camping))

            listAdapter.datas = datas
            listAdapter.notifyDataSetChanged()
        }

        listAdapter.setOnItemClickListener(object : ListAdapter.OnItemClickListener{
            override fun onItemClick(v: View, data: HashDataVo, post: Int) {


                var action = CenterClassifyFragmentDirections.actionCenterClassifyFragmentToCenterDetailFragment(data)
                v.findNavController().navigate(action)
            }
        })

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object{
        const val RawCount = 1
    }
}