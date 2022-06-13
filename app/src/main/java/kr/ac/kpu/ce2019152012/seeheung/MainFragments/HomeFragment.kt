package kr.ac.kpu.ce2019152012.seeheung.MainFragments



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kr.ac.kpu.ce2019152012.seeheung.R
import kr.ac.kpu.ce2019152012.seeheung.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    // 화면 구성
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        val view = binding.root

        return view
    }

    // 기능 넣는 곳
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 북부
        binding.NBtn.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_northClassifyFragment)
        }
        // 중부
        binding.CBtn.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_centerClassifyFragment)
        }

        // 남부
        binding.SBtn.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_southClassifyFragment)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}