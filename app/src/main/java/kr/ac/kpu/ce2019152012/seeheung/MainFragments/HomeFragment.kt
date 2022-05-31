package kr.ac.kpu.ce2019152012.seeheung.MainFragments


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.replace
import androidx.navigation.findNavController
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestoreSettings
import kr.ac.kpu.ce2019152012.seeheung.CenterFragments.CenterClassifyFragment
import kr.ac.kpu.ce2019152012.seeheung.MainActivity
import kr.ac.kpu.ce2019152012.seeheung.R
import kr.ac.kpu.ce2019152012.seeheung.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    val db = FirebaseFirestore.getInstance()

    private var transaction : FragmentManager? = null

    //북부
    //private val fragmentA
    //중부

    //남부
    //private val fragmentC



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

        // 북부코드로 바꿔야됨
        // 북부
        binding.NBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_northClassifyFragment)
        }

        // 중부
        binding.CBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_centerClassifyFragment)
        }

        // 남부코드로 바꿔야됨
        // 남부
        binding.SBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_southClassifyFragment)
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}