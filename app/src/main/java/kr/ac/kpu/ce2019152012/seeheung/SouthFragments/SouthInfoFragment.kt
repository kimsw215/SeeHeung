package kr.ac.kpu.ce2019152012.seeheung.SouthFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SouthPark : Fragment() {

        private var _binding : FragmentSouthParkBinding?= null
        private val binding get() = _binding!!

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
        }

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            _binding = FragmentSouthParkBinding.inflate(inflater,container,false)
            val view = binding.root
            return view
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
        }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }


}