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
    private val fragmentB = CenterClassifyFragment()
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
            Toast.makeText(requireContext(),"아직 안만들었음",Toast.LENGTH_SHORT).show()
        }

        // 중부
        binding.CBtn.setOnClickListener {
            fragTofrag(fragmentB)
        }

        // 남부코드로 바꿔야됨
        // 남부
        binding.NBtn.setOnClickListener {
            Toast.makeText(requireContext(),"아직 안만들었음",Toast.LENGTH_SHORT).show()
        }

    }

    fun fragTofrag(fragment: Fragment){
        val transaction = requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer,fragment)
        transaction.commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}