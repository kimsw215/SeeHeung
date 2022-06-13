package kr.ac.kpu.ce2019152012.seeheung.CenterFragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kr.ac.kpu.ce2019152012.seeheung.databinding.FragmentCenterDetailBinding

class CenterDetailFragment : Fragment() {
    private var _binding : FragmentCenterDetailBinding?= null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCenterDetailBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireNotNull(arguments).apply {
            val data = CenterDetailFragmentArgs.fromBundle(this).detail
            binding.getIcon.setImageResource(data.photo)
            binding.getTitle.text = data.name
            binding.getInfo.text = data.tag1
            val dataS = data.toString()
            Log.e("data",dataS)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}