package kr.ac.kpu.ce2019152012.seeheung.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kr.ac.kpu.ce2019152012.seeheung.ClassFile.HashDataVo
import kr.ac.kpu.ce2019152012.seeheung.R

class ListAdapterGrid:
    RecyclerView.Adapter<ListAdapterGrid.ViewHolder>() {

    var datas = mutableListOf<HashDataVo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.center_item_recycler,parent,false)
        return ViewHolder(view)
    }



    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val Photo = itemView.findViewById<ImageView>(R.id.img_rv_photo)
        private val name = itemView.findViewById<TextView>(R.id.text_rv_name)
        private val tag1 = itemView.findViewById<TextView>(R.id.text_rv_tag_1)
        private val tag2 = itemView.findViewById<TextView>(R.id.text_rv_tag_2)

        fun bind(item: HashDataVo) {
            // TextView에 데이터 셋팅
            name.text = item.name
            tag1.text = item.tag1
            tag2.text = item.tag2
            Glide.with(itemView).load(item.photo).into(Photo)
            }
        }
    }