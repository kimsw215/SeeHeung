package kr.ac.kpu.ce2019152012.seeheung.NorthFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kr.ac.kpu.ce2019152012.seeheung.databinding.FragmentNorthBinding
import kr.ac.kpu.ce2019152012.seeheung.databinding.FragmentSouthBinding

class NorthInfoFragment:Fragment(){


        private var _binding : FragmentNorthBinding?= null
        private val binding get() = _binding!!

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
        }

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            _binding = FragmentNorthBinding.inflate(inflater,container,false)
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