package kr.ac.kpu.ce2019152012.seeheung.SearchFragments

//class SearchViewModel(
//    application: Application,
//    repository: SearchList
//): AndroidViewModel(application){
//    private val SEARCH_TIMEOUT = 300L
//    val queryChannel = BroadcastChannel<String>(Channel.CONFLATED)

//    val searchResult = queryChannel
//       .asFlow() // BroadcastChannel을 hot flow로 바꿈
        // search() 호출 속도를 조절할 수 있음.
// 해당 ms동안 새로운 텍스트를 입력하지 않으면 search() 호출
 //       .debounce(SEARCH_TIMEOUT)
 //       .mapLatest { text ->
 //           // 여기에 실제 Api를 호출하는 코드를 적어주시면 됩니다.
 //           withContext(Dispatchers.IO) {
 //               repository.search(text) }}
 //       .catch { e: Throwable ->
            // 에러 핸들링은 여기서!
 //           e.printStackTrace() }
 //       .asLiveData() }