package kr.ac.kpu.ce2019152012.seeheung.MainFragments


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestoreSettings
import kr.ac.kpu.ce2019152012.seeheung.CenterFragments.CenterClassifyFragment
import kr.ac.kpu.ce2019152012.seeheung.MainActivity
import kr.ac.kpu.ce2019152012.seeheung.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    val db = FirebaseFirestore.getInstance()

    lateinit var mainActivity : MainActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as MainActivity
    }

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
            val intent = Intent(mainActivity,CenterClassifyFragment::class.java)
            startActivity(intent)
        }

        // 중부
        binding.EBtn.setOnClickListener {
            val intent = Intent(mainActivity,CenterClassifyFragment::class.java)
            startActivity(intent)
        }

        // 남부코드로 바꿔야됨
        // 남부
        binding.NBtn.setOnClickListener {
            val intent = Intent(mainActivity,CenterClassifyFragment::class.java)
            startActivity(intent)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}