package com.example.menu


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.menu.databinding.FragmentTutorialBinding

/**
 * A simple [Fragment] subclass.
 */
class Tutorial: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentTutorialBinding>(inflater,
            R.layout.fragment_tutorial,container,false)

        binding.imageView18.setOnClickListener(){
            GlobalVariable.gDescription = "Hazardous"
            view?.findNavController()?.navigate(R.id.action_tutorial_to_garbageListView)
            mutableListOf<Model>().clear()
        }

        binding.imageView17.setOnClickListener(){
            GlobalVariable.gDescription = "Household Waste"
            view?.findNavController()?.navigate(R.id.action_tutorial_to_garbageListView)
            mutableListOf<Model>().clear()
        }

        binding.imageView16.setOnClickListener(){
            GlobalVariable.gDescription = "Recyclable Waste"
            view?.findNavController()?.navigate(R.id.action_tutorial_to_garbageListView)
            mutableListOf<Model>().clear()
        }

        binding.imageView15.setOnClickListener(){
            GlobalVariable.gDescription = "Residual Waste"
            view?.findNavController()?.navigate(R.id.action_tutorial_to_garbageListView)
            mutableListOf<Model>().clear()
        }

        return binding.root

    }


}
