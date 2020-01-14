package com.example.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.databinding.DataBindingUtil
import com.example.menu.GlobalVariable.gDescription
import com.example.menu.databinding.FragmentGarbageListViewBinding

/**
 * A simple [Fragment] subclass.
 */
class GarbageListView : Fragment() {

    lateinit var listView: ListView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGarbageListViewBinding>(inflater,
            R.layout.fragment_garbage_list_view,container,false)

        listView = binding.root.findViewById(R.id.listView)

        if(gDescription == "Hazardous")
        {
            var list = mutableListOf<Model>()

            list.add(Model("Battery", "Hazardous", R.drawable.battery))
            list.add(Model("Band aid", "Hazardous", R.drawable.bandaid))
            list.add(Model("Expired cosmetic", "Hazardous", R.drawable.expired_cosmetic))
            list.add(Model("Expired capsule drug", "Hazardous", R.drawable.expired_capsule_drug))
            list.add(Model("Gas tank", "Hazardous", R.drawable.gas))
            list.add(Model("Lighter", "Hazardous", R.drawable.lighter))
            list.add(Model("Medical gauze", "Hazardous", R.drawable.medical_gauze))
            list.add(Model("Chemical", "Hazardous", R.drawable.chemical))
            list.add(Model("Hair Gel", "Hazardous", R.drawable.hairgel))
            list.add(Model("Light Bulb", "Hazardous", R.drawable.lightbulb))
            list.add(Model("Medical Glove", "Hazardous", R.drawable.medicalglove))
            list.add(Model("Nail Polish", "Hazardous", R.drawable.nailpolish))
            list.add(Model("Paint", "Hazardous", R.drawable.paint))
            list.add(Model("Perfume Bottle", "Hazardous", R.drawable.perfume_bottle))
            list.add(Model("Pesticide Bottle", "Hazardous", R.drawable.pesticide_bottle))

            listView.adapter = MyListAdapter(binding.root.context, R.layout.show_list_item, list)

        }
        else if(gDescription == "Household Waste") {
            var listHHW = mutableListOf<Model>()

            listHHW.add(Model("Apple", "Household Waste", R.drawable.apple))
            listHHW.add(Model("Bread", "Household Waste", R.drawable.bread))
            listHHW.add(Model("Cake", "Household Waste", R.drawable.cake))
            listHHW.add(Model("Chili", "Household Waste", R.drawable.chilli))
            listHHW.add(Model("Chocolate", "Household Waste", R.drawable.chocolate))
            listHHW.add(Model("Corn", "Household Waste", R.drawable.corn))
            listHHW.add(Model("Crab", "Household Waste", R.drawable.crab))
            listHHW.add(Model("Dry Leaf", "Household Waste", R.drawable.dryleaf))
            listHHW.add(Model("Egg Shell", "Household Waste", R.drawable.eggshell))
            listHHW.add(Model("Fish Bone", "Household Waste", R.drawable.fishbone))
            listHHW.add(Model("Shrimp", "Household Waste", R.drawable.shrimp))
            listHHW.add(Model("Strawberry", "Household Waste", R.drawable.strawberry))
            listHHW.add(Model("Tomato Sauce", "Household Waste", R.drawable.tomatosauce))
            listHHW.add(Model("Vegetable", "Household Waste", R.drawable.vegetable))
            listHHW.add(Model("Watermelon", "Household Waste", R.drawable.watermelon))

            listView.adapter = MyListAdapter(binding.root.context, R.layout.show_list_item, listHHW)

        }
        else if(gDescription =="Recyclable Waste") {
            var listRCW = mutableListOf<Model>()

            listRCW.add(Model("Bag", "Recyclable Waste", R.drawable.bag))
            listRCW.add(Model("Cap", "Recyclable Waste", R.drawable.cap))
            listRCW.add(Model("Glass Bottle", "Recyclable Waste", R.drawable.glassbottle))
            listRCW.add(Model("Handbag", "Recyclable Waste", R.drawable.handbag))
            listRCW.add(Model("Lock pad", "Recyclable Waste", R.drawable.lockpad))
            listRCW.add(Model("Milk Box", "Recyclable Waste", R.drawable.milkbox))
            listRCW.add(Model("Mirror", "Recyclable Waste", R.drawable.mirror))
            listRCW.add(Model("Plastic Bottle", "Recyclable Waste", R.drawable.plasticbottle))
            listRCW.add(Model("Plastic Comb", "Recyclable Waste", R.drawable.plasticcomb))
            listRCW.add(Model("Safety Pin", "Recyclable Waste", R.drawable.safetypin))
            listRCW.add(Model("Shoe", "Recyclable Waste", R.drawable.shoe))
            listRCW.add(Model("Tin", "Recyclable Waste", R.drawable.tin))
            listRCW.add(Model("Tooth Paste", "Recyclable Waste", R.drawable.toothpaste))
            listRCW.add(Model("Toys", "Recyclable Waste", R.drawable.toys))


            listView.adapter = MyListAdapter(binding.root.context, R.layout.show_list_item, listRCW)

        }
        else if(gDescription == "Residual Waste")
        {
            var listRSW = mutableListOf<Model>()

            listRSW.add(Model("Basketball", "Residual Waste", R.drawable.basketball))
            listRSW.add(Model("Wooden Comb", "Residual Waste", R.drawable.woodencomb))
            listRSW.add(Model("Bowl", "Residual Waste", R.drawable.bowl))
            listRSW.add(Model("Broom", "Residual Waste", R.drawable.broom))
            listRSW.add(Model("Chopstick", "Residual Waste", R.drawable.chopstick))
            listRSW.add(Model("Cigarette", "Residual Waste", R.drawable.cigarette))
            listRSW.add(Model("Cloths", "Residual Waste", R.drawable.cloths))
            listRSW.add(Model("Cup", "Residual Waste", R.drawable.cup))
            listRSW.add(Model("Flower Pot", "Residual Waste", R.drawable.flowerpot))
            listRSW.add(Model("Peanut", "Residual Waste", R.drawable.peanut))
            listRSW.add(Model("Root Tiles", "Residual Waste", R.drawable.rooftiles))
            listRSW.add(Model("Seashell", "Residual Waste", R.drawable.seashell))
            listRSW.add(Model("Sponge", "Residual Waste", R.drawable.sponge))
            listRSW.add(Model("Toilet Bowl", "Residual Waste", R.drawable.toiletbowl))
            listRSW.add(Model("Toilet Paper", "Residual Waste", R.drawable.toiletpaper))

            listView.adapter = MyListAdapter(binding.root.context, R.layout.show_list_item, listRSW)
        }

        return binding.root
    }


}
