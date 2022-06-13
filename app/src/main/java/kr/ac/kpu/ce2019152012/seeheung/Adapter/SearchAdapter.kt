package kr.ac.kpu.ce2019152012.seeheung.Adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kr.ac.kpu.ce2019152012.seeheung.ClassFile.SearchDataVo
import kr.ac.kpu.ce2019152012.seeheung.R
import java.nio.file.Files.size

class SearchAdapter(var searchs: ArrayList<SearchDataVo>) :
    RecyclerView.Adapter<SearchAdapter.ViewHolder>(), Filterable {

    var searchList = ArrayList<SearchDataVo>()

    var itemFilter = ItemFilter()

    init {
        searchList.addAll(searchs)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.searh_listview, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = searchList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(searchList[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val Searchname = itemView.findViewById<TextView>(R.id.rv_text_name)
        private val Searchtag1 = itemView.findViewById<TextView>(R.id.rv_text_tag1)
        private val Searchtag2 = itemView.findViewById<TextView>(R.id.rv_text_tag2)
        private val Searchphoto = itemView.findViewById<ImageView>(R.id.rv_img_photo)

        fun bind(item: SearchDataVo) {
            Searchname.text = item.name
            Searchtag1.text = item.tag1
            Searchtag2.text = item.tag2
            Glide.with(itemView).load(item.photo).into(Searchphoto)
        }
    }

    // -- filter
    override fun getFilter(): Filter {
        return itemFilter
    }

    inner class ItemFilter : Filter() {
        override fun performFiltering(charSequence: CharSequence?): FilterResults {
            val filterString = charSequence.toString()
            val results = FilterResults()

            //검색이 필요없을 경우를 위해 원본 배열을 복제
            val filteredList: ArrayList<SearchDataVo> = ArrayList<SearchDataVo>()
            //공백제외 아무런 값이 없을 경우 -> 원본 배열
            if (filterString.trim { it <= ' ' }.isEmpty()) {
                results.values = searchs
                results.count = searchs.size

                return results
                // 공백제외 2글자 이하인 경우 -> 이름으로만 검색
            } else if (filterString.trim { it <= ' ' }.length <= 2) {
                for (data in searchs){
                    if (data.name.contains(filterString)){
                        filteredList.add(data)
                    }
                }
                // 그 외의 경우(공백 제외 2글자 초과) -> 이름/ 해쉬태그로 검색
            } else {
                for( data in searchs){
                    if ( data.name.contains(filterString) || data.tag1.contains(filterString)|| data.tag2.contains(filterString)) {
                        filteredList.add(data)
                    }
                }
            }
            results.values = filteredList
            results.count = filteredList.size

            return results
        }
        @SuppressLint("NotifyDataSetChanged")
        override fun publishResults(charSequence: CharSequence?, filterResults: FilterResults?) {
            searchList.clear()
            searchList.addAll(filterResults?.values as ArrayList<SearchDataVo>)
            notifyDataSetChanged()
        }
    }
}