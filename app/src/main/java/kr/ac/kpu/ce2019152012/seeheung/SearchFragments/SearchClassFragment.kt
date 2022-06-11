package kr.ac.kpu.ce2019152012.seeheung.SearchFragments

//class SearchClassFragment :AppCompatActivity() {
    //private val viewModel: SearchViewModel by viewModel()
    //private lateinit var adapter:SearchAdapter

    //override fun onCreate(savedInstanceState: Bundle?) {
        //super.onCreate(savedInstanceState)
        //etContentView(R.layout.activity_main)

        //init()

        // 검색 결과를 observe하여 Adapter에 등록
        //viewModel.searchResult.observe(this, Observer {
           // adapter.submitList(it)})

       // et_search.setText("")}

    //private fun init() {
        //adapter = SearchAdapter()
        // RecyclerView 설정
        //rv_result.adapter = adapter
        //rv_result.setHasFixedSize(true)
        //rv_result.layoutManager = LinearLayoutManager(this)
        // EditText 입력 값에 변화가 있으면 BroadcastChannel로 값 전송
        //et_search.onTextChanged { s, start, before, count ->
                //val queryText = s.toString()
            // Channel에 queryText 전송, Channel 용량을 침범하지 않았다면 true 아니면 false 리턴
            //viewModel.queryChannel.offer(queryText)}}