package kr.ac.kpu.ce2019152012.seeheung.SearchFragments

//class SearchAdapter (private val context: Context, private val excelList: MutableList<Searchlist>, private val listener: ItemClickListener) : RecyclerView.Adapter<SearchAdapter.SearchViewHolder>(), Filterable{

    //검색기능을 위해서 별도의 List를 하나더 만들어주겠습니다.
    //private var excelSearchList: List<SearchList>? = null

    //이너 클래스
    //inner class SearchViewHolder(view: View) : RecyclerView.ViewHolder(view){
        //TextView 선언
        //val info: TextView
        //val quiz: TextView

        //init{
            //info = view.findViewById(R.id.search_info)
            //quiz = view.findViewById(R.id.search_quiz)

            //view.setOnClickListener{
                //여기서 !!의 의미는 nullable이면 오류가 발생하게 해줍니다. (?는 null)
                //listener.onItemClicked(excelSearchList!![adapterPosition]) } }}
    //초기화 구문 init
    //init {
        //this.excelSearchList = excelList }

    //override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        //리스트 아이템 인플레이터
        //val view = LayoutInflater.from(context).inflate(R.layout.search_list_item, parent, false)
        //return SearchViewHolder(view) }

    //item 사이즈
    //override fun getItemCount(): Int = excelSearchList!!.size

    //필터를 위한 코드
    //override fun getFilter(): Filter {
        //return object : Filter() {
            //override fun performFiltering(charSequence: CharSequence): FilterResults {
                //al charString = charSequence.toString()
                //if (charString.isEmpty()) {
                    //excelSearchList = excelList
                //} else {
                    //val filteredList = ArrayList<SearchData>()
                    //이부분에서 원하는 데이터를 검색할 수 있음
                    //for (row in excelList) {
                       // if (row.fullname.toLowerCase().contains(charString.toLowerCase()) || row.quiz.toLowerCase().contains(charString.toLowerCase())
                            //|| row.cate2.toLowerCase().contains(charString.toLowerCase()) || row.source.toLowerCase().contains(charString.toLowerCase())) {
                            //filteredList.add(row) }}
                    //excelSearchList = filteredList }
                //val filterResults = FilterResults()
                //filterResults.values = excelSearchList
                //return filterResults}
            //override fun publishResults(charSequence: CharSequence, filterResults: FilterResults) {
               // excelSearchList = filterResults.values as ArrayList<SearchData>
                //notifyDataSetChanged() }}}

    //interface ItemClickListener {
        //fun onItemClicked(item : SearchData) }}