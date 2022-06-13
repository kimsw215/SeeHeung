package kr.ac.kpu.ce2019152012.seeheung.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kr.ac.kpu.ce2019152012.seeheung.ClassFile.HashDataVo
import kr.ac.kpu.ce2019152012.seeheung.R

class ListAdapter:
    RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    var datas = mutableListOf<HashDataVo>()

    interface OnItemClickListener {
        fun onItemClick(v: View, data: HashDataVo, post:Int)
    }

    private var listener : OnItemClickListener? = null
    fun setOnItemClickListener(listener: OnItemClickListener){
        this.listener = listener
    }

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

        fun bind(item: HashDataVo) {
            // TextView에 데이터 셋팅
            name.text = item.name
            tag1.text = item.tag1
            Glide.with(itemView).load(item.photo).into(Photo)

            val pos = adapterPosition
            if( pos != RecyclerView.NO_POSITION){
                itemView.setOnClickListener {
                    listener?.onItemClick(itemView,item,pos)
                }
            }

            }
        }
    }